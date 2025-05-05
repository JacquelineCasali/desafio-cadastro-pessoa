package com.cadastropessoa.service;

import com.cadastropessoa.dao.EnderecoDAO;
import com.cadastropessoa.model.Endereco;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class EnderecoService {

    @EJB
    private EnderecoDAO enderecoDAO;

    public void salvar(Endereco endereco) {
        enderecoDAO.salvar(endereco);
    }

    public Endereco atualizar(Endereco endereco) {
        return enderecoDAO.atualizar(endereco);
    }

    public void remover(Endereco endereco) {
        enderecoDAO.remover(endereco);
    }

    public Endereco buscarPorId(Integer id) {
        return enderecoDAO.buscarPorId(id);
    }

    public List<Endereco> listarTodos() {
        return enderecoDAO.listarTodos();
    }
}
