package com.ma.springdoc.web;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

public interface CrearUsuario {
 
    @Operation(
        summary = "Crear usuario",
        description = "Se crea un nuevo usuario con los datos que se ingresan",
        tags = {"usuarios"}
    )
    @ApiResponses(
        value = {
            @ApiResponse(responseCode = "201", description = "Usuario creado"),
            @ApiResponse(responseCode = "400", description = "Datos de usuario no válido"),
            @ApiResponse(responseCode = "409", description = "Usuario ya existe")
        }
    )
    @PostMapping("/usuarios")
    @ResponseStatus(value = HttpStatus.CREATED)
    void crear(
        @RequestBody @Valid UsuarioRequest request
    );
    

}
