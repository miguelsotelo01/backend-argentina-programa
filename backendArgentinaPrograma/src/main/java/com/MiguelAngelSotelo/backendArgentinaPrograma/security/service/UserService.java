package com.MiguelAngelSotelo.backendArgentinaPrograma.security.service;

import com.MiguelAngelSotelo.backendArgentinaPrograma.security.entity.User;
import com.MiguelAngelSotelo.backendArgentinaPrograma.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UserService {
    @Autowired
    UserRepository userRepository;

    public Optional<User> getByNombreUsuario(String nombreUsuario) {
        return userRepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean existsByNombreUsuario(String nombreUsuario){
        return userRepository.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existsByEmail(String email){
        return userRepository.existsByEmail(email);
    }

    public void save(User user) {
        userRepository.save(user);
    }
}
