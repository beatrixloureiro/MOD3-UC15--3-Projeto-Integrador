package com.condominiox.condominioxweb.controller;

import com.condominiox.condominioxweb.model.Assembleia;
import com.condominiox.condominioxweb.service.AssembleiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/assembleia")
public class AssembleiaRestController {

    @Autowired
    private AssembleiaService assembleiaService;

    // Endpoint para obter a ata (lista de participantes) com base na data da assembleia
    @GetMapping("/ata")
    public ResponseEntity<List<MoradorAtaDTO>> obterAtaPorData(@RequestParam("data") String data) {
        Assembleia assembleia = assembleiaService.buscarPorData(data);
        List<MoradorAtaDTO> ata = new ArrayList<>();
        if (assembleia != null) {
            // Supondo que os IDs e nomes estejam armazenados em formato CSV
            String[] ids = assembleia.getIdsUsuarios().split(",");
            String[] nomes = assembleia.getNomesUsuarios().split(",");
            for (int i = 0; i < ids.length; i++) {
                MoradorAtaDTO dto = new MoradorAtaDTO();
                dto.setId(ids[i].trim());
                if (i < nomes.length) {
                    dto.setMorador(nomes[i].trim());
                } else {
                    dto.setMorador("");
                }
                ata.add(dto);
            }
        }
        return ResponseEntity.ok(ata);
    }
    
    // DTO (Data Transfer Object) para representar um morador na ata
    public static class MoradorAtaDTO {
        private String id;
        private String morador;

        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getMorador() {
            return morador;
        }
        public void setMorador(String morador) {
            this.morador = morador;
        }
    }
}