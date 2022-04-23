package com.senaiFit.senaiFit.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Instrutor extends Usuario {
    @Column
    private int numeroRegistro;

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    @Override
    public String toString() {
        return "Instrutor{" +
                "numeroRegistro=" + numeroRegistro +
                '}';
    }
}
