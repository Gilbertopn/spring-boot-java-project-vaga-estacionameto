package com.emiballem.demoparkapi.repository;

import com.emiballem.demoparkapi.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
