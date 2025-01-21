package Telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaAssembleia extends javax.swing.JFrame {

    public TelaAssembleia() {
        initComponents();
        carregarDatasAssembleias(); // Carrega as datas das assembleias
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCondominioX = new javax.swing.JLabel();
        btnRetorna = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataAta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAtaAssembleia = new javax.swing.JTable();
        btnSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCondominioX.setFont(new java.awt.Font("Segoe UI Light", 1, 78)); // NOI18N
        lblCondominioX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCondominioX.setText("Condomínio x");

        btnRetorna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/retorna.png"))); // NOI18N
        btnRetorna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornaActionPerformed(evt);
            }
        });

        tblDataAta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblDataAta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDataAta);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATAS DA ASSEMBLEIA ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ATA DA ASSEMBLEIA ");

        tblAtaAssembleia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblAtaAssembleia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Morador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAtaAssembleia);

        btnSelecionar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCondominioX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSelecionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRetorna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 4, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(464, 464, 464)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCondominioX, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRetorna, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSelecionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(141, 141, 141)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(403, Short.MAX_VALUE)))
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

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        // Obtém a data selecionada na tabela tblDataAta
        int selectedRow = tblDataAta.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma data na tabela para continuar.");
            return;
        }
        
        String dataSelecionada = (String) tblDataAta.getValueAt(selectedRow, 0);
        carregarMoradoresPorData(dataSelecionada); // Carrega os moradores para a data selecionada
    }//GEN-LAST:event_btnSelecionarActionPerformed
    private void carregarMoradoresPorData(String data) {
    DefaultTableModel model = (DefaultTableModel) tblAtaAssembleia.getModel();
    model.setRowCount(0); // Limpa a tabela antes de adicionar novos dados

    String url = "jdbc:mysql://localhost:3306/CONDOMINIOX"; 
    String user = "root"; 
    String password = "Senha1234";

    try (Connection conn = DriverManager.getConnection(url, user, password);
         Statement stmt = conn.createStatement()) {
        
        // Consulta para buscar os moradores associados à data selecionada
        String query = "SELECT ids_usuarios, nomes_usuarios FROM Assembleia " +
                       "WHERE data_assembleia = '" + data + "'";
        ResultSet rs = stmt.executeQuery(query);

        // Adiciona os moradores ao modelo da tabela
        if (rs.next()) {
            String idsMoradores = rs.getString("ids_usuarios");
            String nomesMoradores = rs.getString("nomes_usuarios");

            // Divide as strings em arrays
            String[] idsArray = idsMoradores.split(",");
            String[] nomesArray = nomesMoradores.split(",");

            // Adiciona os dados na tabela
            for (int i = 0; i < idsArray.length; i++) {
                String idMorador = idsArray[i].trim();
                String nomeMorador = nomesArray[i].trim();
                model.addRow(new Object[]{idMorador, nomeMorador});
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum morador encontrado para a data selecionada.");
        }
    } catch (Exception e) {
        e.printStackTrace(); // Imprime qualquer erro que ocorrer
    }
}

    
    private void carregarDatasAssembleias() {
        // Define o modelo da tabela para adicionar as linhas
        DefaultTableModel model = (DefaultTableModel) tblDataAta.getModel();
        model.setRowCount(0); // Limpa a tabela antes de adicionar novos dados

        // Conexão com o banco de dados
        String url = "jdbc:mysql://localhost:3306/CONDOMINIOX"; // Ajuste conforme sua configuração
        String user = "root"; 
        String password = "Senha1234";

        try (Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement()) {
        
            // Consulta para buscar as datas das assembleias
            String query = "SELECT data_assembleia FROM Assembleia";
            ResultSet rs = stmt.executeQuery(query);

            // Adiciona as datas ao modelo da tabela
            while (rs.next()) {
                String dataAssembleia = rs.getString("data_assembleia");
                model.addRow(new Object[]{dataAssembleia});
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime qualquer erro que ocorrer
        }
    }

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAssembleia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetorna;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCondominioX;
    private javax.swing.JTable tblAtaAssembleia;
    private javax.swing.JTable tblDataAta;
    // End of variables declaration//GEN-END:variables
}