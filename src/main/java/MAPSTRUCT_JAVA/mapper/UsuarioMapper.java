package MAPSTRUCT_JAVA.mapper;

import MAPSTRUCT_JAVA.dto.UsuarioRequest;
import MAPSTRUCT_JAVA.dto.UsuarioResponse;
import MAPSTRUCT_JAVA.entity.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface UsuarioMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dataCriacao", ignore = true)
    UsuarioEntity map(UsuarioRequest usuearioRequest);

    UsuarioResponse map(UsuarioEntity usuarioEntity);

}
