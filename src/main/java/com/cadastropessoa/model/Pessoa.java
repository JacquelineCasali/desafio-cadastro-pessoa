package com.cadastropessoa.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Pessoa implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @Temporal(TemporalType.DATE)
    private Date idade;

    private String sexo;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Endereco> enderecos;
    public Pessoa() {
    }

    public Pessoa(Integer id, String nome, Date idade, String sexo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getIdade() {
        return idade;
    }

    public void setIdade(Date idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }


}
