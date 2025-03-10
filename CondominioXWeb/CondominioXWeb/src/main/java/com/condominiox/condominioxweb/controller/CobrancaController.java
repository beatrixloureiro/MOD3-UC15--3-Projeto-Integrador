package com.condominiox.condominioxweb.controller;

import com.condominiox.condominioxweb.model.Cobranca;
import com.condominiox.condominioxweb.model.Usuario;
import com.condominiox.condominioxweb.service.CobrancaService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cobrancas") // novo endpoint para cobranças
public class CobrancaController {

    @Autowired
    private CobrancaService cobrancaService;

    @GetMapping("/cobrancas")
public String exibirCobrancas(Model model, HttpSession session) {
    Usuario usuarioLogado = (Usuario) session.getAttribute("usuarioLogado");
    
    List<Cobranca> cobrancas;
    // Se for morador, filtra apenas as cobranças dele
    if (usuarioLogado.getTipoUsuario().equalsIgnoreCase("Morador")) {
        cobrancas = cobrancaService.listarCobrancasPorUsuario(usuarioLogado);
    } else {
        // Se for síndico ou administrador, mostra todas
        cobrancas = cobrancaService.listarCobrancas();
    }
    
    model.addAttribute("cobrancas", cobrancas);
    return "cobranca";  // nome da view que exibe as cobranças
}
}