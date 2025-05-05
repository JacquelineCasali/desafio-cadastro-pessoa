package com.cadastropessoa.dao;

import com.cadastropessoa.model.Endereco;

import javax.ejb.Stateless;

@Stateless
public class EnderecoDAO extends GenericDAO<Endereco> {

    public EnderecoDAO() {
        super(Endereco.class);
    }
}