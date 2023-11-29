package com.emiballem.demoparkapi.service;

import com.emiballem.demoparkapi.entity.Cliente;
import com.emiballem.demoparkapi.entity.ClienteVaga;
import com.emiballem.demoparkapi.entity.Vaga;
import com.emiballem.demoparkapi.util.EstacionamentoUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class EstacionamentoService {

    private final ClienteVagaService clienteVagaService;
    private final ClienteService clienteService;
    private final VagaService vagaService;
    
}
