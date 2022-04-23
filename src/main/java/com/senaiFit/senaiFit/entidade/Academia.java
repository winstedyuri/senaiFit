package com.senaiFit.senaiFit.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Academia extends Parceiros {

    @Column
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

