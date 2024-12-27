package MAPSTRUCT_JAVA.dto;

import lombok.*;
@Builder
@Data
public class UsuarioRequest {


    private String nome;
    private String email;
    private String senha;


}
