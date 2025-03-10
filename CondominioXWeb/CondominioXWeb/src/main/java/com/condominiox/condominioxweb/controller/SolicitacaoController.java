package com.condominiox.condominioxweb.controller;

import com.condominiox.condominioxweb.model.Solicitacao;
import com.condominiox.condominioxweb.model.Usuario;
import com.condominiox.condominioxweb.service.SolicitacaoService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SolicitacaoController {

    @Autowired
    private SolicitacaoService solicitacaoService;

    @GetMapping("/solicitacao")
    public String exibirSolicitacao(Model model) {
        model.addAttribute("solicitacoes", solicitacaoService.listarSolicitacoes());
        return "solicitacao";
    }

    @PostMapping("/solicitacao/enviar")
    public String enviarSolicitacao(@RequestParam("tipoSolicitacao") String tipoSolicitacao,
                                    @RequestParam("descricao") String descricao,
                                    HttpSession session,
                                    Model model) {
        // Obter o usuário logado da sessão (assegure que o LoginController salva em "usuarioLogado")
        Usuario usuario = (Usuario) session.getAttribute("usuarioLogado");
        if (usuario == null) {
            model.addAttribute("erro", "Usuário não logado. Faça login novamente.");
            return "login";
        }
        try {
            solicitacaoService.enviarSolicitacao(tipoSolicitacao, descricao, usuario);
        } catch (Exception e) {
            model.addAttribute("erro", "Erro ao enviar solicitação.");
            return "solicitacao";
        }
        return "redirect:/solicitacao";
    }
}