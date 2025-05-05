package com.cadastropessoa.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String estado;
    private String cidade;
    private String logradouro;
    private Integer numero;
    private String cep;

    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa pessoa;

    // Getters e Setters

    public Endereco() {

    }

    public Endereco(Integer id, String estado, String cidade, String logradouro, Integer numero, String cep, Pessoa pessoa) {
        this.id = id;
        this.estado = estado;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.pessoa = pessoa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero=" + numero +
                ", cep='" + cep + '\'' +
                ", pessoa=" + pessoa +
                '}';
    }
}
