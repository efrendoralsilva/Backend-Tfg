package com.edoralsilva.caretracker.auth.controller;


import lombok.Data;

/**
 *
 * @author efren
 */
@Data
public class AuthRequest {

    private String username;
    private String password;

}
