package com.ma.springdoc.web;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrearUsuarioController implements CrearUsuario {

    private static final Logger logger = LogManager.getLogger(CrearUsuarioController.class);

    @PostMapping("/usuarios")
    @ResponseStatus(value = HttpStatus.CREATED)
    public void crear(@RequestBody @Valid UsuarioRequest request) {
        logger.info("Se crea el usuario {}", request);
    }
    
}
