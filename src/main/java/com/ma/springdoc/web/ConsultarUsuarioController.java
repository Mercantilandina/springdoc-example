package com.ma.springdoc.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultarUsuarioController implements ConsultarUsuario {

    @GetMapping("/usuarios/{id}")
    public UsuarioResponse consultar(@PathVariable String id) {
        return UsuarioResponse.ejemplo(id);
    }
   
}
