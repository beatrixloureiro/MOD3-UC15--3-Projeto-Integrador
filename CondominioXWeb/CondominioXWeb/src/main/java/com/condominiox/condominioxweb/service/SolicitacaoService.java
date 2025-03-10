package com.condominiox.condominioxweb.service;

import com.condominiox.condominioxweb.model.Solicitacao;
import com.condominiox.condominioxweb.model.Usuario;
import com.condominiox.condominioxweb.repository.SolicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SolicitacaoService {

    @Autowired
    private SolicitacaoRepository solicitacaoRepository;

    public List<Solicitacao> listarSolicitacoes() {
        return solicitacaoRepository.findAll();
    }

    public Solicitacao enviarSolicitacao(String tipoSolicitacao, String descricao, Usuario usuario) {
        Solicitacao sol = new Solicitacao();
        sol.setTitulo(tipoSolicitacao);
        sol.setDescricao(descricao);
        sol.setUsuario(usuario); // Define o morador que enviou a solicitação
        return solicitacaoRepository.save(sol);
    }
}