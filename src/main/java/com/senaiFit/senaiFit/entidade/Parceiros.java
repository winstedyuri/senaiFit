package com.senaiFit.senaiFit.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Parceiros {
    @Id
    private long Id;
    @Column
    private String endereco;
    @Column
    private LocalDate dataIgressoPrograma;
    @OneToMany
    private List<Academia> academia;
    @OneToMany
    private List<Estudio> estudio;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public List<Academia> getAcademia() {
        return academia;
    }

    public void setAcademia(List<Academia> academia) {
        this.academia = academia;
    }

    public List<Estudio> getEstudio() {
        return estudio;
    }

    public void setEstudio(List<Estudio> estudio) {
        this.estudio = estudio;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataIgressoPrograma() {
        return dataIgressoPrograma;
    }

    public void setDataIgressoPrograma(LocalDate dataIgressoPrograma) {
        this.dataIgressoPrograma = dataIgressoPrograma;
    }
}
