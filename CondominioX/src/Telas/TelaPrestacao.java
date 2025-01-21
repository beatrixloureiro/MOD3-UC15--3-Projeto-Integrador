package Telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.Map;

public class TelaPrestacao extends javax.swing.JFrame {

    public TelaPrestacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbmes = new javax.swing.JComboBox<>();
        lblCondominioX = new javax.swing.JLabel();
        btnRetorna = new javax.swing.JButton();
        lblSelecione = new javax.swing.JLabel();
        jcbmes1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbFinanceiro = new javax.swing.JTable();
        btnSelecionar = new javax.swing.JButton();

        jcbmes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jcbmes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        jcbmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbmesActionPerformed(evt);
            }
        });

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

        lblSelecione.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSelecione.setText("Selecione o mês:");
        lblSelecione.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jcbmes1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jcbmes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        jcbmes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbmes1ActionPerformed(evt);
            }
        });

        jtbFinanceiro.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jtbFinanceiro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTO", "VALOR DO CUSTO", "RENDIMENTOS", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbFinanceiro);

        btnSelecionar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSelecionar.setText("SELECIONAR");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCondominioX, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSelecione)
                    .addComponent(jcbmes1, 0, 186, Short.MAX_VALUE)
                    .addComponent(btnSelecionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRetorna, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCondominioX, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSelecione, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbmes1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRetorna, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE))))
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

    }//GEN-LAST:event_jcbmesActionPerformed

    private void jcbmes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbmes1ActionPerformed

    }//GEN-LAST:event_jcbmes1ActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        // Obtém o mês selecionado na combobox
        String mesSelecionado = (String) jcbmes1.getSelectedItem();
        carregarFinanceiroPorMes(mesSelecionado); // Carrega os dados financeiros do mês selecionado
    }//GEN-LAST:event_btnSelecionarActionPerformed
    
    private void carregarFinanceiroPorMes(String mes) {
        DefaultTableModel model = (DefaultTableModel) jtbFinanceiro.getModel();
        model.setRowCount(0); // Limpa a tabela antes de adicionar novos dados

        String url = "jdbc:mysql://localhost:3306/CONDOMINIOX"; 
        String user = "root"; 
        String password = "Senha1234";

        Map<String, Integer> mesMap = new HashMap<>();
        mesMap.put("Janeiro", 1);
        mesMap.put("Fevereiro", 2);
        mesMap.put("Março", 3);
        mesMap.put("Abril", 4);
        mesMap.put("Maio", 5);
        mesMap.put("Junho", 6);
        mesMap.put("Julho", 7);
        mesMap.put("Agosto", 8);
        mesMap.put("Setembro", 9);
        mesMap.put("Outubro", 10);
        mesMap.put("Novembro", 11);
        mesMap.put("Dezembro", 12);

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            // Ajustar o filtro para o mês selecionado
            String filtroMes = "";
            if (!mes.equals("Todos")) {
                int mesNumero = mesMap.get(mes);
                filtroMes = " WHERE MONTH(data_custo) = " + mesNumero;
            }

            // Consulta para buscar os dados financeiros
            String queryFinanceiro = "SELECT descricao, valor FROM Financeiro" + filtroMes;
            ResultSet rsFinanceiro = stmt.executeQuery(queryFinanceiro);

            double totalCustos = 0.0;
            while (rsFinanceiro.next()) {
                String custo = rsFinanceiro.getString("descricao");
                double valorCusto = rsFinanceiro.getDouble("valor");
                totalCustos += valorCusto;

                // Adiciona temporariamente valor de rendimento e total como 0.0
                model.addRow(new Object[]{custo, valorCusto, 0.0, 0.0});
            }

            // Consulta para buscar os rendimentos
            String queryRendimentos = "SELECT SUM(valor_total) AS total_rendimentos FROM Cobranca" + filtroMes.replace("data_custo", "mes_referencia");
            ResultSet rsRendimentos = stmt.executeQuery(queryRendimentos);

            double totalRendimentos = 0.0;
            if (rsRendimentos.next()) {
                totalRendimentos = rsRendimentos.getDouble("total_rendimentos");
            }

            // Atualizar os valores de rendimento e total para cada linha
            for (int i = 0; i < model.getRowCount(); i++) {
                double valorCusto = (double) model.getValueAt(i, 1);
                double total = valorCusto - totalRendimentos;
                model.setValueAt(totalRendimentos, i, 2);
                model.setValueAt(total, i, 3);
            }

        } catch (Exception e) {
            e.printStackTrace(); // Imprime qualquer erro que ocorrer
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrestacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetorna;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbmes;
    private javax.swing.JComboBox<String> jcbmes1;
    private javax.swing.JTable jtbFinanceiro;
    private javax.swing.JLabel lblCondominioX;
    private javax.swing.JLabel lblSelecione;
    // End of variables declaration//GEN-END:variables
}