package MAPSTRUCT_JAVA.mapper;

import MAPSTRUCT_JAVA.dto.UsuearioRequest;
import MAPSTRUCT_JAVA.entity.UsuarioEntity;
import org.mapstruct.Mapper;

@Mapper
public interface UsuarioMapper {

    UsuarioEntity maping(UsuearioRequest usuearioRequest);


}
