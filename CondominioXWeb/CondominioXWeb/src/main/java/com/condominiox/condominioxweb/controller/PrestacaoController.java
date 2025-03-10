package com.condominiox.condominioxweb.controller;

import com.condominiox.condominioxweb.service.PrestacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrestacaoController {

    @Autowired
    private PrestacaoService prestacaoService;
    
    @GetMapping("/prestacao")
    public String exibirPrestacao(Model model) {
        // A variável "financeiro" conterá a lista dos relatórios (entidade Prestacao)
        model.addAttribute("financeiro", prestacaoService.listarPrestacoes());
        return "prestacao"; // O template prestacao.html usará a variável "financeiro"
    }
}