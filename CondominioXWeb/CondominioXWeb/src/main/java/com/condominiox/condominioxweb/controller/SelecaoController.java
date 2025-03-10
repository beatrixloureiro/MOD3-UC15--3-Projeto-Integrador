package com.condominiox.condominioxweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/selecao") // endpoint para seleção
public class SelecaoController {

    @GetMapping
    public String exibirSelecao() {
        return "selecao"; // exibe seleciona.html
    }
}