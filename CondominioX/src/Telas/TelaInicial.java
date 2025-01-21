package Telas;

import Telas.TelaSelecao;
import java.sql.Connection;
import java.sql.SQLException;
import condominiox.CondominioX;
import condominiox.Usuario;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
        
         // Adiciona um KeyListener ao campo de senha para capturar o pressionamento da tecla ENTER
        txtSenha.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    btnENTRAR.doClick(); // Simula um clique no botão "ENTRAR"
                }
            }
        });

        // Adiciona um KeyListener ao campo de login para capturar o pressionamento da tecla ENTER
        txtLogin.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    btnENTRAR.doClick(); // Simula um clique no botão "ENTRAR"
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCondominioX = new javax.swing.JLabel();
        lblAcesse = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtLogin = new javax.swing.JTextField();
        btnENTRAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCondominioX.setFont(new java.awt.Font("Segoe UI Light", 1, 78)); // NOI18N
        lblCondominioX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCondominioX.setText("Condomínio X");

        lblAcesse.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        lblAcesse.setForeground(new java.awt.Color(153, 51, 0));
        lblAcesse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcesse.setText("ACESSE SUA CONTA");

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblUsuario.setText("USUARIO");
        lblUsuario.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSenha.setText("SENHA");
        lblSenha.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblSenha.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });

        txtLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoginKeyPressed(evt);
            }
        });

        btnENTRAR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnENTRAR.setText("ENTRAR");
        btnENTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnENTRARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCondominioX, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
            .addComponent(lblAcesse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSenha)
                            .addComponent(txtLogin))
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnENTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCondominioX, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAcesse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnENTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed

    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnENTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnENTRARActionPerformed
                                         
    String Login = txtLogin.getText();
    String senha = new String(txtSenha.getPassword());

    // Cria uma instância de CondominioX e conecta ao banco de dados
    CondominioX condominioX = new CondominioX();
    if (condominioX.conectar()) {
        try (Connection conn = condominioX.getConnection()) {
            // Busca o usuário pelo nome de usuário fornecido no campo de login
            Usuario usuario = Usuario.buscarUsuarioPorNome(conn, Login);

            // Verifica se o usuário foi encontrado e se a senha está correta
            if (usuario == null || !usuario.getSenha().equals(senha)) {
                javax.swing.JOptionPane.showMessageDialog(this, "Usuário ou senha inválidos.");
            } else {
                // Define o usuário logado
                Usuario.setUsuarioLogado(usuario); // Define o usuário logado

                String tipoUsuario = usuario.getTipoUsuario();
                if (tipoUsuario.equals("Síndico") || tipoUsuario.equals("Administrador") || tipoUsuario.equals("Morador")) {
                    // Ajuste no tamanho da mensagem
                    String mensagem = String.format("<html><span style='font-size:16px'>Olá %s, sua permissão é de %s. Seja bem-vindo!</span></html>", usuario.getNomeUsuario(), tipoUsuario);
                    javax.swing.JOptionPane.showMessageDialog(this, mensagem);

                    // Fecha a tela atual e abre a nova tela de seleção
                    this.dispose();
                    TelaSelecao telaSelecao = new TelaSelecao();
                    telaSelecao.setVisible(true);
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Tipo de usuário não reconhecido. Acesso negado.");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Erro de conexão com o banco de dados.");
        }
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Falha na conexão com o banco de dados.");
    }                         
    }//GEN-LAST:event_btnENTRARActionPerformed

    private void txtLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginKeyPressed

    }//GEN-LAST:event_txtLoginKeyPressed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed

    }//GEN-LAST:event_txtSenhaKeyPressed
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnENTRAR;
    private javax.swing.JLabel lblAcesse;
    private javax.swing.JLabel lblCondominioX;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}