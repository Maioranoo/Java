
package view;

import controller.UsuarioController;
import javax.swing.JOptionPane;



public class Login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());

    
    public Login() {

    initComponents();
    usuario_lbl.setForeground(java.awt.Color.WHITE);

    senha_lbl.setForeground(java.awt.Color.WHITE);

jLabel1.setForeground(java.awt.Color.WHITE);

    getContentPane().setBackground(new java.awt.Color(24,24,24));

    setLocationRelativeTo(null);

    setTitle("FEItv Login");

    setResizable(false);

    txtUsuario.setBackground(new java.awt.Color(40,40,40));
    txtUsuario.setForeground(java.awt.Color.WHITE);

    txtSenha.setBackground(new java.awt.Color(40,40,40));
    txtSenha.setForeground(java.awt.Color.WHITE);

    txtUsuario.setCaretColor(java.awt.Color.WHITE);
    txtSenha.setCaretColor(java.awt.Color.WHITE);

    estilizarBotao(btnLogin);
    estilizarBotao(btnAbrirCadastro);



jLabel1.setText("👤");
jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 50));
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario_lbl = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        senha_lbl = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnAbrirCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usuario_lbl.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        usuario_lbl.setText("Usuario:");

        txtUsuario.addActionListener(this::txtUsuarioActionPerformed);

        senha_lbl.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        senha_lbl.setText("Senha:");

        txtSenha.addActionListener(this::txtSenhaActionPerformed);

        btnLogin.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnLogin.setText("Logar!");
        btnLogin.addActionListener(this::btnLoginActionPerformed);

        btnAbrirCadastro.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnAbrirCadastro.setText("Cadastrar!");
        btnAbrirCadastro.addActionListener(this::btnAbrirCadastroActionPerformed);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(80, 80));
        jLabel1.setMinimumSize(new java.awt.Dimension(80, 80));
        jLabel1.setPreferredSize(new java.awt.Dimension(80, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usuario_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(senha_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenha)))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAbrirCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuario_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAbrirCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        UsuarioController controller = new UsuarioController();

String usuario = txtUsuario.getText();
String senha = txtSenha.getText();

boolean logado = controller.login(usuario, senha);

if(logado){

    JOptionPane.showMessageDialog(null, "Login realizado!");

    Inicio tela = new Inicio();

    tela.setVisible(true);

    dispose();

}else{

    JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");
}
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnAbrirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirCadastroActionPerformed
        Cadastro tela = new Cadastro();

tela.setVisible(true);
    }//GEN-LAST:event_btnAbrirCadastroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirCadastro;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel senha_lbl;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JLabel usuario_lbl;
    // End of variables declaration//GEN-END:variables

private void estilizarBotao(javax.swing.JButton botao){

    botao.setOpaque(true);

    botao.setBackground(new java.awt.Color(229,9,20));

    botao.setForeground(java.awt.Color.WHITE);

    botao.setFocusPainted(false);

    botao.setBorderPainted(false);

    botao.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));

    botao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
}
}
