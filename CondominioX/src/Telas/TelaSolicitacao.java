package Telas;

import condominiox.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class TelaSolicitacao extends javax.swing.JFrame {

    public TelaSolicitacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCondominioX = new javax.swing.JLabel();
        btnRetorna = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSolicitacao = new javax.swing.JTextArea();
        lblAcesse = new javax.swing.JLabel();
        cbxSolicitacao = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();

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

        txtSolicitacao.setColumns(20);
        txtSolicitacao.setRows(5);
        jScrollPane1.setViewportView(txtSolicitacao);

        lblAcesse.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        lblAcesse.setForeground(new java.awt.Color(153, 51, 0));
        lblAcesse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcesse.setText("Faça sua Solicitação ao Síndico");

        cbxSolicitacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbxSolicitacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manutenção", "Documentos", "Diversos" }));

        btnRegistrar.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCondominioX, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
            .addComponent(lblAcesse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbxSolicitacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)))
                .addComponent(btnRetorna, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCondominioX, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAcesse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(btnRetorna, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
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

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // Obtendo o tipo de solicitação e a descrição do campo de texto
        String tipoSolicitacao = (String) cbxSolicitacao.getSelectedItem();
        String descricao = txtSolicitacao.getText();

        // Obtém o ID do morador logado usando o método getUsuarioLogado()
        Usuario usuarioLogado = Usuario.getUsuarioLogado();

        // Verifica se um usuário está logado
        if (usuarioLogado == null) {
            JOptionPane.showMessageDialog(this, "Erro: Usuário não está logado.");
            return;
        }

        int idMorador = usuarioLogado.getId(); // Obtém o ID do morador logado

        if (descricao.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, insira uma descrição para a solicitação.");
            return;
        }

        // Conexão com o banco de dados
        String url = "jdbc:mysql://localhost:3306/CONDOMINIOX"; 
        String user = "root"; 
        String password = "Senha1234";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // Script de inserção da solicitação
            String sql = "INSERT INTO Solicitacao (id_morador, tipo_solicitacao, descricao, atendido) VALUES (?, ?, ?, ?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, idMorador);  // Usa o ID do morador logado
            pstmt.setString(2, tipoSolicitacao);
            pstmt.setString(3, descricao);
            pstmt.setBoolean(4, false);  // Define a solicitação como não atendida

            // Executa a inserção
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Solicitação registrada com sucesso!");

            // Limpa o campo de descrição após registro
            txtSolicitacao.setText("");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao registrar a solicitação: " + e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSolicitacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRetorna;
    private javax.swing.JComboBox<String> cbxSolicitacao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAcesse;
    private javax.swing.JLabel lblCondominioX;
    private javax.swing.JTextArea txtSolicitacao;
    // End of variables declaration//GEN-END:variables
}
