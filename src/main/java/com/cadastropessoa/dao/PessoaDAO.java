package com.cadastropessoa.dao;

import com.cadastropessoa.model.Pessoa;

import javax.ejb.Stateless;

@Stateless
public class PessoaDAO extends GenericDAO<Pessoa> {

    public PessoaDAO() {
        super(Pessoa.class);
    }


}

