package com.cadastropessoa.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public abstract class GenericDAO<T> {

    private Class<T> clazz;

    @PersistenceContext(unitName = "cadastroPU")
    protected EntityManager em;

    public GenericDAO(Class<T> clazz) {
        this.clazz = clazz;
    }

    public void salvar(T entity) {
        em.persist(entity);
    }

    public T atualizar(T entity) {
        return em.merge(entity);
    }

    public void remover(T entity) {
        em.remove(em.merge(entity));
    }

    public T buscarPorId(Integer id) {
        return em.find(clazz, id);
    }

    public List<T> listarTodos() {
        return em.createQuery("FROM " + clazz.getSimpleName(), clazz).getResultList();
    }
}
