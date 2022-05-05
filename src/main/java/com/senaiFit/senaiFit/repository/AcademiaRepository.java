package com.senaiFit.senaiFit.repository;

import com.senaiFit.senaiFit.entidade.Academia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademiaRepository extends JpaRepository<Academia, Long> {
}
