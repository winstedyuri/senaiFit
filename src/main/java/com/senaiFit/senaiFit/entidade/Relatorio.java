package com.senaiFit.senaiFit.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Relatorio {
    @Id
    private long Id;
    @OneToMany
    private List<Checkin> checkin;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public List<Checkin> getCheckin() {
        return checkin;
    }

    public void setCheckin(List<Checkin> checkin) {
        this.checkin = checkin;
    }
}
