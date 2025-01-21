package Telas;

public class TelaSelecao extends javax.swing.JFrame {

    
    public TelaSelecao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCondominioX = new javax.swing.JLabel();
        btnCobranca = new javax.swing.JButton();
        btnPrestacao = new javax.swing.JButton();
        btnReserva = new javax.swing.JButton();
        btnAssembleia = new javax.swing.JButton();
        btnSolicitacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCondominioX.setFont(new java.awt.Font("Segoe UI Light", 1, 78)); // NOI18N
        lblCondominioX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCondominioX.setText("Condomínio X");

        btnCobranca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cobranças.png"))); // NOI18N
        btnCobranca.setText("COBRANÇA");
        btnCobranca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCobranca.setIconTextGap(10);
        btnCobranca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCobranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrancaActionPerformed(evt);
            }
        });

        btnPrestacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/contas.png"))); // NOI18N
        btnPrestacao.setText("<html><center>PRESTAÇÃO<br>DE CONTAS</center></html>");
        btnPrestacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrestacao.setIconTextGap(10);
        btnPrestacao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPrestacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestacaoActionPerformed(evt);
            }
        });

        btnReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reserva.png"))); // NOI18N
        btnReserva.setText("<html><center>RESERVA DE<br>AREA COMUM</center></html>");
        btnReserva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReserva.setIconTextGap(10);
        btnReserva.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaActionPerformed(evt);
            }
        });

        btnAssembleia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/assembleia.png"))); // NOI18N
        btnAssembleia.setText("ASSEMBLEIA");
        btnAssembleia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAssembleia.setIconTextGap(10);
        btnAssembleia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAssembleia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssembleiaActionPerformed(evt);
            }
        });

        btnSolicitacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/solicitaçoes.png"))); // NOI18N
        btnSolicitacao.setText("SOLICITAÇÕES");
        btnSolicitacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSolicitacao.setIconTextGap(10);
        btnSolicitacao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSolicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCondominioX, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(btnCobranca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrestacao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAssembleia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCondominioX, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCobranca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrestacao, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssembleia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrestacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestacaoActionPerformed
    // Cria uma nova instância da TelaPrestação
    TelaPrestacao telaPrestacao = new TelaPrestacao();
    
    // Exibe a nova tela
    telaPrestacao.setVisible(true);
    
    // Opcional: Fecha a tela atual, se necessário
    this.dispose();
    }//GEN-LAST:event_btnPrestacaoActionPerformed

    private void btnReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaActionPerformed
    // Cria uma nova instância da TelaReserva
    TelaReserva telaReserva = new TelaReserva();
    
    // Exibe a nova tela
    telaReserva.setVisible(true);
    
    // Opcional: Fecha a tela atual, se necessário
    this.dispose();
    }//GEN-LAST:event_btnReservaActionPerformed

    private void btnAssembleiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssembleiaActionPerformed
        // Cria uma nova instância da TelaAssembleia
        TelaAssembleia telaAssembleia = new TelaAssembleia();
    
        // Exibe a nova tela
        telaAssembleia.setVisible(true);
    
        // Opcional: Fecha a tela atual, se necessário
        this.dispose();
    }//GEN-LAST:event_btnAssembleiaActionPerformed

    private void btnCobrancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrancaActionPerformed
        // Cria uma nova instância da TelaCobrança
        TelaCobranca telaCobranca = new TelaCobranca();
    
        // Exibe a nova tela
        telaCobranca.setVisible(true);
    
        // Opcional: Fecha a tela atual, se necessário
        this.dispose();
    }//GEN-LAST:event_btnCobrancaActionPerformed

    private void btnSolicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitacaoActionPerformed
        // Cria uma nova instância da TelaCobrança
        TelaSolicitacao telaSolicitacao = new TelaSolicitacao();
    
        // Exibe a nova tela
        telaSolicitacao.setVisible(true);
    
        // Opcional: Fecha a tela atual, se necessário
        this.dispose();
    }//GEN-LAST:event_btnSolicitacaoActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSelecao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssembleia;
    private javax.swing.JButton btnCobranca;
    private javax.swing.JButton btnPrestacao;
    private javax.swing.JButton btnReserva;
    private javax.swing.JButton btnSolicitacao;
    private javax.swing.JLabel lblCondominioX;
    // End of variables declaration//GEN-END:variables
}