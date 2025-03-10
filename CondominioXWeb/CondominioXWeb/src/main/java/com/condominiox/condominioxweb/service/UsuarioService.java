package com.condominiox.condominioxweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.condominiox.condominioxweb.model.Usuario;
import com.condominiox.condominioxweb.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    
    // Ou, se preferir, mantenha a busca por nome:
    public Usuario buscarPorNome(String nomeUsuario) {
        return usuarioRepository.findByNomeUsuario(nomeUsuario);
    }
    
    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }
}