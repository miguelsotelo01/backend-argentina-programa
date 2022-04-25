package com.MiguelAngelSotelo.backendArgentinaPrograma.repository;

import com.MiguelAngelSotelo.backendArgentinaPrograma.entity.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExperienciaLaboralRepository extends JpaRepository<ExperienciaLaboral, Long> {
    void deleteExperienciaLaboralById(Long id);

    Optional<ExperienciaLaboral> findExperienciaLaboralById(Long id);
}
