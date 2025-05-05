package com.cadastropessoa.service;

import com.cadastropessoa.dao.PessoaDAO;
import com.cadastropessoa.model.Pessoa;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class PessoaService {
    @EJB
    private PessoaDAO pessoaDAO;

    public void salvar(Pessoa pessoa) {
        pessoaDAO.salvar(pessoa);
    }

    public Pessoa atualizar(Pessoa pessoa) {
        return pessoaDAO.atualizar(pessoa);
    }

    public void remover(Pessoa pessoa) {
        pessoaDAO.remover(pessoa);
    }

    public Pessoa buscarPorId(Integer id) {
        return pessoaDAO.buscarPorId(id);
    }

    public List<Pessoa> listarTodos() {
        return pessoaDAO.listarTodos();
    }
}
