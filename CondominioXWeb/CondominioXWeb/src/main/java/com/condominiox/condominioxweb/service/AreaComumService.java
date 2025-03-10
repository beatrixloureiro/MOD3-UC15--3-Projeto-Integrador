package com.condominiox.condominioxweb.service;

import com.condominiox.condominioxweb.model.AreaComum;
import com.condominiox.condominioxweb.repository.AreaComumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaComumService {

    @Autowired
    private AreaComumRepository areaComumRepository;

    public AreaComum buscarPorNomeEBloco(String nomeAreaComum, String bloco) {
        return areaComumRepository.findByNomeAreaComumAndBloco(nomeAreaComum, bloco);
    }
    
    // Se precisar listar todas as áreas, por exemplo:
    // public List<AreaComum> listarAreas() { return areaComumRepository.findAll(); }
}