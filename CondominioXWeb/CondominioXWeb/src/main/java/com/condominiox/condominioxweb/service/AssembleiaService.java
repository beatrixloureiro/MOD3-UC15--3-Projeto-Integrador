package com.condominiox.condominioxweb.service;

import com.condominiox.condominioxweb.model.Assembleia;
import com.condominiox.condominioxweb.repository.AssembleiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssembleiaService {

    @Autowired
    private AssembleiaRepository assembleiaRepository;
    
    // Busca uma assembleia com base na data fornecida
    public Assembleia buscarPorData(String data) {
        return assembleiaRepository.findByDataAssembleia(data);
    }
}