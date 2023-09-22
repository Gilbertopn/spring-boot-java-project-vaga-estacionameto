package com.emiballem.demoparkapi.web.dto;

import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class UsuarioReponseDto {

    private Long id;
    private String userName;
    private String role;

}
