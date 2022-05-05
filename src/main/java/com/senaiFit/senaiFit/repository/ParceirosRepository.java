package com.senaiFit.senaiFit.repository;

import com.senaiFit.senaiFit.entidade.Parceiros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParceirosRepository extends JpaRepository<Parceiros, Long> {
}
