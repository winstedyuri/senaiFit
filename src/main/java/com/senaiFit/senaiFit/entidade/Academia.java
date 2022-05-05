package com.senaiFit.senaiFit.entidade;

import javax.persistence.*;

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

