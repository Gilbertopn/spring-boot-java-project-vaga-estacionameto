package com.emiballem.demoparkapi.service;

import com.emiballem.demoparkapi.entity.Usuario;
import com.emiballem.demoparkapi.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Transactional
    public Usuario salvar(Usuario usuario){

        return usuarioRepository.save(usuario);
    }
    @Transactional(readOnly = true)
    public Usuario buscarPorId(Long id){
        return usuarioRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuario não encontrado.")
        );
    }

}
