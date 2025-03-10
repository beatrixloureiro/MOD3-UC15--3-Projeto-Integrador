package com.condominiox.condominioxweb.controller;

import com.condominiox.condominioxweb.model.Reserva;
import com.condominiox.condominioxweb.model.Usuario;
import com.condominiox.condominioxweb.model.AreaComum;
import com.condominiox.condominioxweb.service.ReservaService;
import com.condominiox.condominioxweb.service.UsuarioService;
import com.condominiox.condominioxweb.service.AreaComumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.sql.Date;
import java.util.List;

@Controller
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @Autowired
    private UsuarioService usuarioService;
    
    @Autowired
    private AreaComumService areaComumService;

    @GetMapping("/reserva")
    public String exibirReserva(Model model) {
        List<Reserva> reservas = reservaService.listarReservas();
        model.addAttribute("reservas", reservas);
        return "reserva"; // exibe reserva.html
    }

    @PostMapping("/salvarReserva")
    public String salvarReserva(@RequestParam("usuarioId") Long usuarioId,
                                @RequestParam("nomeAreaComum") String nomeAreaComum,
                                @RequestParam("bloco") String bloco,
                                @RequestParam("dataReserva") String dataReserva, // formato yyyy-MM-dd
                                Model model) {
        Date sqlDate = Date.valueOf(dataReserva);
        
        // Buscar o usuário
        Usuario usuario = usuarioService.buscarPorId(usuarioId);
        if (usuario == null) {
            model.addAttribute("erro", "Usuário não encontrado.");
            return "reserva";
        }
        
        // Buscar a área comum usando o nome e o bloco
        AreaComum area = areaComumService.buscarPorNomeEBloco(nomeAreaComum, bloco);
        if (area == null) {
            model.addAttribute("erro", "Área Comum não encontrada.");
            return "reserva";
        }
        
        Reserva reserva = new Reserva();
        reserva.setUsuario(usuario);
        reserva.setAreaComum(area);
        // Como a coluna no SQL se chama "nomeUsuario", usamos este atributo para armazenar o nome da área
        reserva.setNomeAreaComum(area.getNomeAreaComum());
        reserva.setDataReserva(sqlDate);
        
        reservaService.salvarReserva(reserva);
        
        return "redirect:/reserva";
    }
}