package com.senaiFit.senaiFit.repository;

import com.senaiFit.senaiFit.entidade.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
}
