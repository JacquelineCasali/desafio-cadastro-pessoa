package com.cadastropessoa.Bean;

import com.cadastropessoa.model.Pessoa;
import com.cadastropessoa.service.PessoaService;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean(name = "pessoaBean")
@ViewScoped
public class PessoaBean implements Serializable {

    private Pessoa pessoa;
    private List<Pessoa> pessoas;

    @EJB
    private PessoaService pessoaService;


    public void init() {
        pessoa = new Pessoa();
        pessoas = pessoaService.listarTodos();
    }

    public void salvar() {
        if (pessoa.getId() == null) {
            pessoaService.salvar(pessoa);
        } else {
            pessoaService.atualizar(pessoa);
        }
        limpar();
        pessoas = pessoaService.listarTodos();
    }

    public void editar(Pessoa p) {
        this.pessoa = p;
    }

    public void remover(Pessoa p) {
        pessoaService.remover(p);
        pessoas = pessoaService.listarTodos();
    }

    public void limpar() {
        pessoa = new Pessoa();
    }

    // Getters e Setters

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
}
