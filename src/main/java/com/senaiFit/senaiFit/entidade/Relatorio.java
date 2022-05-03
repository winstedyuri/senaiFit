package com.senaiFit.senaiFit.entidade;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Relatorio {
    @Id
    private long Id;
    @OneToMany
    private List<CheckIn> checkin;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public List<CheckIn> getCheckin() {
        return checkin;
    }

    public void setCheckin(List<CheckIn> checkin) {
        this.checkin = checkin;
    }
}
