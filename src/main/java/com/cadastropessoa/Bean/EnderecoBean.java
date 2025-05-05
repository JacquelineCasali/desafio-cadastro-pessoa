package com.cadastropessoa.Bean;

import com.cadastropessoa.model.Endereco;
import com.cadastropessoa.model.Pessoa;
import com.cadastropessoa.service.EnderecoService;
import com.cadastropessoa.service.PessoaService;


import javax.ejb.EJB;

import java.io.Serializable;
import java.util.List;


public class EnderecoBean implements Serializable {

    private Endereco endereco;
    private List<Endereco> enderecos;
    private List<Pessoa> pessoas;

    @EJB
    private EnderecoService enderecoService;

    @EJB
    private PessoaService pessoaService;


    public void init() {
        endereco = new Endereco();
        enderecos = enderecoService.listarTodos();
        pessoas = pessoaService.listarTodos();
    }

    public void salvar() {
        if (endereco.getId() == null) {
            enderecoService.salvar(endereco);
        } else {
            enderecoService.atualizar(endereco);
        }
        limpar();
        enderecos = enderecoService.listarTodos();
    }

    public void editar(Endereco e) {
        this.endereco = e;
    }

    public void remover(Endereco e) {
        enderecoService.remover(e);
        enderecos = enderecoService.listarTodos();
    }

    public void limpar() {
        endereco = new Endereco();
    }

    // Getters e Setters
    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }

    public List<Endereco> getEnderecos() { return enderecos; }
    public void setEnderecos(List<Endereco> enderecos) { this.enderecos = enderecos; }

    public List<Pessoa> getPessoas() { return pessoas; }
    public void setPessoas(List<Pessoa> pessoas) { this.pessoas = pessoas; }
}
