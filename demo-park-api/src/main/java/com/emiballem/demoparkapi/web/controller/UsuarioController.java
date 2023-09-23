package com.emiballem.demoparkapi.web.controller;

import com.emiballem.demoparkapi.entity.Usuario;
import com.emiballem.demoparkapi.service.UsuarioService;
import com.emiballem.demoparkapi.web.dto.UsuarioCreateDto;
import com.emiballem.demoparkapi.web.dto.UsuarioReponseDto;
import com.emiballem.demoparkapi.web.dto.UsuarioSenhaDto;
import com.emiballem.demoparkapi.web.dto.mapper.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioReponseDto> create(@RequestBody UsuarioCreateDto createDto){
        Usuario user = usuarioService.salvar(UsuarioMapper.toUsuario(createDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(UsuarioMapper.toDto(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioReponseDto> getById(@PathVariable Long id){
        Usuario user = usuarioService.buscarPorId(id);
        return ResponseEntity.ok(UsuarioMapper.toDto(user));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id,@RequestBody UsuarioSenhaDto dto){
        Usuario user = usuarioService.editarSenha(id, dto.getSenhaAtual(), dto.getNovaSenha(), dto.getConfirmaSenha());
        return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public ResponseEntity<List<UsuarioReponseDto>> getAll(){
        List<Usuario> users = usuarioService.buscarTodos();
        return ResponseEntity.ok(UsuarioMapper.toListDto(users));
    }
}
