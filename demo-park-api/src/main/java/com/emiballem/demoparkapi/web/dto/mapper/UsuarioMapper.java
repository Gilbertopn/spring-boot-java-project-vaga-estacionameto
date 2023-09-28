package com.emiballem.demoparkapi.web.dto.mapper;

import com.emiballem.demoparkapi.entity.Usuario;
import com.emiballem.demoparkapi.web.dto.UsuarioCreateDto;
import com.emiballem.demoparkapi.web.dto.UsuarioReponseDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioMapper {

    public static Usuario toUsuario(UsuarioCreateDto createDto) {
        return new ModelMapper().map(createDto, Usuario.class);
    }

    public static UsuarioReponseDto toDto(Usuario usuario) {
        String role = usuario.getRole().name().substring("Role_".length());
        PropertyMap<Usuario, UsuarioReponseDto> props = new PropertyMap<Usuario, UsuarioReponseDto>() {
            @Override
            protected void configure() {
            map().setRole(role);
            }
        };
       ModelMapper mapper = new ModelMapper();
       mapper.addMappings(props);
       return mapper.map(usuario, UsuarioReponseDto.class);
    }

    public static List<UsuarioReponseDto> toListDto(List<Usuario> usuarios){
        return usuarios.stream().map(user ->toDto(user)).collect(Collectors.toList());
    }
}
