package com.condominiox.condominioxweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AssembleiaController {

    @GetMapping("/assembleia")
    public String exibirAssembleia() {
        // Aqui você pode adicionar a lógica para carregar datas e atas de assembleias.
        return "assembleia"; // Retorna o template assembleia.html
    }
}