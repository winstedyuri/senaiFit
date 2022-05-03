package com.senaiFit.senaiFit.entidade;

import javax.persistence.*;

@Entity
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @Column
    private int faixaEtaria;
    @Column
    private int duracao;

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}

