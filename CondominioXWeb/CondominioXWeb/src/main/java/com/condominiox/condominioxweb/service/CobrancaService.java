package com.condominiox.condominioxweb.service;

import com.condominiox.condominioxweb.model.Cobranca;
import com.condominiox.condominioxweb.model.Usuario;
import com.condominiox.condominioxweb.repository.CobrancaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CobrancaService {

    @Autowired
    private CobrancaRepository cobrancaRepository;

    public List<Cobranca> listarCobrancas() {
        return cobrancaRepository.findAll();
    }
    
    public List<Cobranca> listarCobrancasPorUsuario(Usuario usuario) {
        return cobrancaRepository.findByMorador(usuario);
    }
}