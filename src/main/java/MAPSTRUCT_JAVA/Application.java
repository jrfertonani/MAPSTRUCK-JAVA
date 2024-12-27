package MAPSTRUCT_JAVA;

import MAPSTRUCT_JAVA.dto.UsuarioRequest;
import MAPSTRUCT_JAVA.dto.UsuarioResponse;
import MAPSTRUCT_JAVA.entity.UsuarioEntity;
import MAPSTRUCT_JAVA.mapper.UsuarioMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UsuarioMapper usuarioMapper){
		return args -> {
			UsuarioRequest usuarioRequest = UsuarioRequest
					.builder()
					.nome("Junior")
					.email("email@email.com")
					.senha("123")
					.build();

			UsuarioEntity usuarioEntity = usuarioMapper.map(usuarioRequest);
			usuarioEntity.setId(1);
			usuarioEntity.setNome("Mestre");

			 UsuarioResponse usuarioResponse = usuarioMapper.map(usuarioEntity);
			 List<UsuarioResponse> map = usuarioMapper.map(Arrays.asList(new UsuarioEntity()));

			 System.out.println(usuarioResponse);
        };
	}
}
