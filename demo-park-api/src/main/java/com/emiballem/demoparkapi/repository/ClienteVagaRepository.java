package com.emiballem.demoparkapi.repository;

import com.emiballem.demoparkapi.entity.ClienteVaga;;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteVagaRepository extends JpaRepository<ClienteVaga, Long> {

}
