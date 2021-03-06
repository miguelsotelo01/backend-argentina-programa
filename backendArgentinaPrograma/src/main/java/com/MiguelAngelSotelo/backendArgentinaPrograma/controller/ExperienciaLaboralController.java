package com.MiguelAngelSotelo.backendArgentinaPrograma.controller;

import com.MiguelAngelSotelo.backendArgentinaPrograma.entity.ExperienciaLaboral;
import com.MiguelAngelSotelo.backendArgentinaPrograma.service.ExperienciaLaboralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/experiencia")
public class ExperienciaLaboralController {
    @Autowired
    ExperienciaLaboralService experienciaLaboralService;

    @GetMapping("/all")
    public ResponseEntity<List<ExperienciaLaboral>> getAllExperiencia() {
        List<ExperienciaLaboral> experienciaLaboral = experienciaLaboralService.findAllExperienciaLaboral();
        return new ResponseEntity<>(experienciaLaboral, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<ExperienciaLaboral> getExperienciaLaboralById(@PathVariable("id") Long id) {
        ExperienciaLaboral experienciaLaboral = experienciaLaboralService.findExperienciaLaboral(id);
        return new ResponseEntity<>(experienciaLaboral, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/
    @PostMapping("/add")
    public ResponseEntity<ExperienciaLaboral> addExperiencia (@RequestBody ExperienciaLaboral experienciaLaboral) {
        ExperienciaLaboral newExperiencia = experienciaLaboralService.addExperienciaLaboral(experienciaLaboral);
        return new ResponseEntity<>(newExperiencia, HttpStatus.CREATED);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/
    @PutMapping("/update")
    public ResponseEntity<ExperienciaLaboral> updateExperiencia (@RequestBody ExperienciaLaboral experienciaLaboral) {
        ExperienciaLaboral updateExperiencia = experienciaLaboralService.updateExperienciaLaboral(experienciaLaboral);
        return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteExperiencia (@PathVariable("id") Long id) {
        experienciaLaboralService.deleteExperienciaLaboral(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
