package com.senaiFit.senaiFit.repository;

import com.senaiFit.senaiFit.entidade.CheckIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckInRepository extends JpaRepository<CheckIn, Long> {
}
