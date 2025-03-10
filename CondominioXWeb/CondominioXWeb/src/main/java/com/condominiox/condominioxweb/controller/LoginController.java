package com.condominiox.condominioxweb.controller;

import com.condominiox.condominioxweb.model.Usuario;
import com.condominiox.condominioxweb.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String exibirLogin() {
        return "login";  // exibe login.html
    }

    @PostMapping("/efetuarLogin")
    public String efetuarLogin(@RequestParam("login") String login,
                               @RequestParam("senha") String senha,
                               HttpSession session,
                               Model model) {
        // Logs para debug
        System.out.println("Login recebido: '" + login + "'");
        System.out.println("Senha recebida: '" + senha + "'");

        // Busca o usuário utilizando o nome de usuário (nomeUsuario)
        Usuario usuario = usuarioService.buscarPorNome(login);
        System.out.println("Usuario encontrado: " + usuario);

        if (usuario != null) {
            // Mostra a senha armazenada para debug (remova em produção)
            System.out.println("Senha armazenada: '" + usuario.getSenha() + "'");
        }

        // Comparação da senha (pode usar trim() ou equalsIgnoreCase se necessário)
        if (usuario != null && usuario.getSenha().trim().equals(senha.trim())) {
            session.setAttribute("usuarioLogado", usuario);
    
            String mensagem;
            if (usuario.getTipoUsuario().equalsIgnoreCase("Morador")) {
                mensagem = "Bem-vindo " + usuario.getNomeUsuario() + ", você tem a permissão de Morador.";
            } else if (usuario.getTipoUsuario().equalsIgnoreCase("Síndico")) {
                mensagem = "Bem-vindo " + usuario.getNomeUsuario() + ", você tem a permissão de Síndico.";
            } else if (usuario.getTipoUsuario().equalsIgnoreCase("Administrador")) {
                mensagem = "Bem-vindo " + usuario.getNomeUsuario() + ", você tem a permissão de Administrador.";
            } else {
                mensagem = "Bem-vindo " + usuario.getNomeUsuario() + ".";
            }
            // Armazena a mensagem de boas-vindas na sessão
            session.setAttribute("mensagemBoasVindas", mensagem);

            return "boasVindas"; // nova view que mostra o modal
        } else {
            model.addAttribute("erro", "Usuário ou senha inválidos.");
            return "login";
        }
    }
}