package com.emiballem.demoparkapi.service;

import com.emiballem.demoparkapi.entity.ClienteVaga;
import com.emiballem.demoparkapi.exception.EntityNotFoundException;
import com.emiballem.demoparkapi.repository.ClienteVagaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class ClienteVagaService {

    private final ClienteVagaRepository repository;

    @Transactional
    public ClienteVaga salvar(ClienteVaga clienteVaga) {
        return repository.save(clienteVaga);

    }


}
