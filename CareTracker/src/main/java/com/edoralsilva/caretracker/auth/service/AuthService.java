package com.edoralsilva.caretracker.auth.service;

import com.edoralsilva.caretracker.auth.controller.AuthResponse;
import com.edoralsilva.caretracker.user.model.User;
import com.edoralsilva.caretracker.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author efren
 */
// service/AuthService.java
@Service
public class AuthService {

    @Autowired
    private UserRepository usuarioRepository;

    public AuthResponse login(String username, String password) {
        User user = usuarioRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        if (!user.getPassword().equals(password)) {
            throw new RuntimeException("Contraseña incorrecta");
        }

        return new AuthResponse(user.getUsername(), user.getRol());
    }
}
