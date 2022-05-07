package com.senaiFit.senaiFit.repository;

import com.senaiFit.senaiFit.entidade.CheckIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface CheckInRepository extends JpaRepository<CheckIn, Long> {
    @Query(value = "SELECT count(*) FROM check_in WHERE usuario_id = ?3 AND data_check_in BETWEEN ?1 AND ?2", nativeQuery = true )
    public int buscaCheckInMes(LocalDate dataInicio, LocalDate dataFim, Long idUsuario);

    @Query(value = "SELECT count(*) FROM check_in WHERE parceiros_id = ?3 AND data_check_in BETWEEN ?1 AND ?2", nativeQuery = true)
    Integer buscaCheckInMesParceiros(LocalDate dataInicio, LocalDate dataFim, Long idParceiros);

    @Query(value = "SELECT COUNT(DISTINCT usu.id) FROM usuario usu\n" +
            "INNER JOIN check_in che ON che.usuario_id = usu.id\n" +
            "WHERE usu.superou_limite_semanal = 1 AND che.data_check_in BETWEEN ?1 AND ?2", nativeQuery = true)
    Integer buscaUsuariosQueSuperaramLimite(LocalDate dataInicio, LocalDate dataFim);
}
