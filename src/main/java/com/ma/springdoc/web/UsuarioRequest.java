package com.ma.springdoc.web;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;

public class UsuarioRequest {

    @Schema(description = "Identificador de usuario", example = "123")
    @NotEmpty(message = "Ingresar el id de usuario")
    @Size(min = 1, max = 16)
    private String id;

    @Schema(description = "Nombre de usuario", example = "user")
    @NotEmpty(message = "Ingresar el nombre de usuario")
    @Size(min = 1, max = 100)
    private String nombre;

    @Schema(description = "Correo electrónico", example = "user@mail.com", format = "email")
    @Email
    @NotEmpty(message = "Ingresar el email de usuario")
    @Size(min = 1, max = 120)
    private String email;

    @Schema(description = "Indica si el usuario está activo", example = "true")
    @NotNull
    private boolean activo;

    public UsuarioRequest() {}

    public UsuarioRequest(String id, String nombre, String email, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.activo = activo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "UsuarioRequest [activo=" + activo + ", email=" + email + ", id=" + id + ", nombre=" + nombre + "]";
    }
    
}
