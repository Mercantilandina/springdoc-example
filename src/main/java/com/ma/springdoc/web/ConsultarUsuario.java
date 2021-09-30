package com.ma.springdoc.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

public interface ConsultarUsuario {

    @Operation(
        summary = "Consulta un usuario",
        description = "Consultar los datos de un usuario " +
                      " ingresando como parámetro el identificador",
        tags = {"usuarios"}
    )
    @ApiResponses(
        value = {
            @ApiResponse(
                description = "Datos del usuario",
                responseCode = "200",
                content = {
                    @Content(
                        mediaType = "application/json",
                        schema = @Schema(implementation = UsuarioResponse.class),
                        examples = {
                            @ExampleObject(
                                name = "Usuario activo",
                                value = "{\"id\": \"23\", " + 
                                        "\"nombre\": \"user\", " + 
                                        "\"email\": \"user@mail.com\", "+ 
                                        " \"activo\": true}"
                            ),
                            @ExampleObject(
                                name = "Usuario INACTIVO",
                                value = "{\"id\": \"24\", " + 
                                        "\"nombre\": \"user\", " + 
                                        "\"email\": \"user@mail.com\", "+ 
                                        " \"activo\": true}"
                            )
                        }    
                    )
                }
            ),
            @ApiResponse(
                description = "Usuario no existe",
                responseCode = "404",
                content = @Content
            )
        }
    )
    @GetMapping("/usuarios/{id}")
    UsuarioResponse consultar(
        @Parameter(
            description = "Identificador de usuario",
            example = "123",
            required = true
        )
        @PathVariable String id
    );

}