package com.MiguelAngelSotelo.backendArgentinaPrograma.repository;

import com.MiguelAngelSotelo.backendArgentinaPrograma.entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Long> {
    void deleteSkillById(Long id);

    Optional<Skills> findSkillById(Long id);
}
