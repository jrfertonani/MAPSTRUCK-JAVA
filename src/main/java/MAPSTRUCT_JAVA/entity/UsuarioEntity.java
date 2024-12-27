package MAPSTRUCT_JAVA.entity;

import MAPSTRUCT_JAVA.dto.UsuarioRequest;
import lombok.*;

@Data
@Builder
public class UsuarioEntity {

    private int id;
    private String nome;
    private String email;
    private String senha;



}
