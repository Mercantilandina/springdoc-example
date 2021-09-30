package com.ma.springdoc.web;

import io.swagger.v3.oas.annotations.media.Schema;

public class UsuarioResponse {

    @Schema(description = "Identificador de usuario")
    private String id;

    @Schema(description = "Nombre de usuario")
    private String nombre;

    @Schema(description = "Correo electrónico")
    private String email;

    @Schema(description = "Indica si el usuario está activo")
    private boolean activo;

    public UsuarioResponse() {}

    public UsuarioResponse(String id, String nombre, String email, boolean activo) {
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

    public static UsuarioResponse ejemplo(String id) {
        return new UsuarioResponse(id, "user", "user@mail.com", true);
    } 
    
    
}
