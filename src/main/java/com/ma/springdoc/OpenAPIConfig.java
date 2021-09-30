package com.ma.springdoc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.tags.Tag;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI config() {
        return new OpenAPI()
            .info(new Info()
                    .title("API de usuarios")
                    .description("Servicios que permite la gestión y consulta de usuarios del sistema")
                    .version("1.0.5"))
            .addTagsItem(new Tag()
                    .name("usuarios")
                    .description("Servicios de usuario"))
            .addServersItem(new Server()
                                .description("Producción")
                                .url("https://users.acme.com"))
            .addServersItem(new Server()
                                .description("Servicio de QA")
                                .url("https://users.qa.acme.com"))
            .addServersItem(new Server()
                                .description("Servicio de dev")
                                .url("http://localhost:8080"));

    }
    
}
