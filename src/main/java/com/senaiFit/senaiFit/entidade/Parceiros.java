package com.senaiFit.senaiFit.entidade;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Parceiros {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @Column
    private String endereco;
    @Column
    private LocalDate dataIngressoPrograma;
    @OneToOne
    private Academia academia;
    @OneToOne
    private Estudio estudio;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Academia getAcademia() {
        return academia;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }

    public Estudio getEstudio() {
        return estudio;
    }

    public void setEstudio(Estudio estudio) {
        this.estudio = estudio;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataIngressoPrograma() {
        return dataIngressoPrograma;
    }

    public void setDataIngressoPrograma(LocalDate dataIngressoPrograma) {
        this.dataIngressoPrograma = dataIngressoPrograma;
    }
}
