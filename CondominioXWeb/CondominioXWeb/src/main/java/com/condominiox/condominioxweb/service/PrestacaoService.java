package com.condominiox.condominioxweb.service;

import com.condominiox.condominioxweb.model.Prestacao;
import com.condominiox.condominioxweb.repository.PrestacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PrestacaoService {

    @Autowired
    private PrestacaoRepository prestacaoRepository;
    
    public List<Prestacao> listarPrestacoes() {
        return prestacaoRepository.findAll();
    }
}