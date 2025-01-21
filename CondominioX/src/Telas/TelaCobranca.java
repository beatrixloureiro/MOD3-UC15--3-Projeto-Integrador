package Telas;

import condominiox.CondominioX;
import condominiox.Usuario;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.SQLException;

public class TelaCobranca extends javax.swing.JFrame {

    public TelaCobranca() {
        initComponents();
        carregarMeses();  // Chama o método para carregar os meses na JComboBox
    }      

    private void carregarMeses() {
        String[] meses = {"Todos", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
            for (String mes : meses) {
            jcbmes.addItem(mes);
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCondominioX = new javax.swing.JLabel();
        btnRetorna = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbCobranca = new javax.swing.JTable();
        lblSelecione = new javax.swing.JLabel();
        jcbmes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCondominioX.setFont(new java.awt.Font("Segoe UI Light", 1, 78)); // NOI18N
        lblCondominioX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCondominioX.setText("Condomínio X");

        btnRetorna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/retorna.png"))); // NOI18N
        btnRetorna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornaActionPerformed(evt);
            }
        });

        jtbCobranca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtbCobranca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Taxa de Condominio", "Taxa de Água", "Taxa de Gás", "Toltal", "Status Pagamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtbCobranca.setRowHeight(40);
        jScrollPane1.setViewportView(jtbCobranca);

        lblSelecione.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSelecione.setText("Selecione o mês:");
        lblSelecione.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jcbmes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jcbmes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        jcbmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbmesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCondominioX, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSelecione, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jcbmes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRetorna, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCondominioX, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblSelecione, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbmes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(btnRetorna, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetornaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornaActionPerformed
        // Cria uma nova instância da TelaSeleção
        TelaSelecao telaSelecao = new TelaSelecao();
    
        // Exibe a nova tela
        telaSelecao.setVisible(true);
    
        // Opcional: Fecha a tela atual, se necessário
        this.dispose();
    }//GEN-LAST:event_btnRetornaActionPerformed

    private void jcbmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbmesActionPerformed
        String mesSelecionado = (String) jcbmes.getSelectedItem();
        carregarCobrancas(mesSelecionado);
    }//GEN-LAST:event_jcbmesActionPerformed

    private void carregarCobrancas(String mesSelecionado) {
        
        DefaultTableModel model = (DefaultTableModel) jtbCobranca.getModel();
        model.setRowCount(0); // Limpa a tabela

        // Verifica se o usuário selecionou "Todos" para mostrar todas as cobranças
        String query;
        if ("Todos".equals(mesSelecionado)) {
            query = "SELECT taxa_condominio, taxa_agua, taxa_gas, valor_total, status_pagamento FROM Cobranca "
                  + "INNER JOIN Morador ON Cobranca.id_morador = Morador.id "
                  + "WHERE Morador.nomeUsuario = ?";
        } else {
            query = "SELECT taxa_condominio, taxa_agua, taxa_gas, valor_total, status_pagamento FROM Cobranca "
                  + "INNER JOIN Morador ON Cobranca.id_morador = Morador.id "
                  + "WHERE Morador.nomeUsuario = ? AND MONTH(mes_referencia) = ?";
        }

        try (Connection conn = new CondominioX().getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)) {
        
            // Define o nome do usuário logado
            stmt.setString(1, Usuario.getUsuarioLogado().getNomeUsuario());
            
            // Se não for "Todos", define o mês no segundo parâmetro da consulta
            if (!"Todos".equals(mesSelecionado)) {
                stmt.setInt(2, obterNumeroMes(mesSelecionado));
            }

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    double taxaCondominio = rs.getDouble("taxa_condominio");
                    double taxaAgua = rs.getDouble("taxa_agua");
                    double taxaGas = rs.getDouble("taxa_gas");
                    double total = rs.getDouble("valor_total");
                    boolean statusPagamento = rs.getBoolean("status_pagamento");
                
                    model.addRow(new Object[]{taxaCondominio, taxaAgua, taxaGas, total, statusPagamento});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

private int obterNumeroMes(String mes) {
    switch (mes) {
        case "Janeiro": return 1;
        case "Fevereiro": return 2;
        case "Março": return 3;
        case "Abril": return 4;
        case "Maio": return 5;
        case "Junho": return 6;
        case "Julho": return 7;
        case "Agosto": return 8;
        case "Setembro": return 9;
        case "Outubro": return 10;
        case "Novembro": return 11;
        case "Dezembro": return 12;
        default: return 0;
    }
}
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCobranca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetorna;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbmes;
    private javax.swing.JTable jtbCobranca;
    private javax.swing.JLabel lblCondominioX;
    private javax.swing.JLabel lblSelecione;
    // End of variables declaration//GEN-END:variables
}