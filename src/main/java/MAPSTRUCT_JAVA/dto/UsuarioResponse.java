package MAPSTRUCT_JAVA.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class UsuarioResponse {

    private int id;
    private String nome;
    private String email;
    private LocalDateTime dataCriacao;

}
