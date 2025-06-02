package com.edoralsilva.caretracker.auth.controller;

import com.edoralsilva.caretracker.user.model.Rol;
import lombok.Data;

/**
 *
 * @author efren
 */
@Data
public class AuthResponse {

    private String username;
    private Rol rol;

    public AuthResponse(String username, Rol rol) {
        this.username = username;
        this.rol = rol;
    }

}
