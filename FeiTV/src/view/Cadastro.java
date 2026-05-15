package view;

import controller.UsuarioController;
import model.Usuario;
import javax.swing.JOptionPane;


public class Cadastro extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Cadastro.class.getName());

   
    public Cadastro() {

    initComponents();

    getContentPane().setBackground(new java.awt.Color(24,24,24));

    setLocationRelativeTo(null);

    setTitle("Cadastro FEItv");

    setResizable(false);

    txtNome.setBackground(new java.awt.Color(40,40,40));
    txtNome.setForeground(java.awt.Color.WHITE);

    txtUsuario.setBackground(new java.awt.Color(40,40,40));
    txtUsuario.setForeground(java.awt.Color.WHITE);

    txtSenha.setBackground(new java.awt.Color(40,40,40));
    txtSenha.setForeground(java.awt.Color.WHITE);

    txtNome.setCaretColor(java.awt.Color.WHITE);
    txtUsuario.setCaretColor(java.awt.Color.WHITE);
    txtSenha.setCaretColor(java.awt.Color.WHITE);

    txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14));
    txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14));
    txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 14));

    estilizarBotao(btnCadastrar);

    jLabel1.setText("🔒");

    jLabel1.setFont(
        new java.awt.Font("Segoe UI Emoji", 0, 50)
    );

    jLabel1.setForeground(java.awt.Color.WHITE);

    nome_lbl.setForeground(java.awt.Color.WHITE);

    usuario_lbl.setForeground(java.awt.Color.WHITE);

    senha_lbl.setForeground(java.awt.Color.WHITE);


}

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario_lbl = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        senha_lbl = new javax.swing.JLabel();
        nome_lbl = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usuario_lbl.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        usuario_lbl.setText("Usuario:");

        txtUsuario.addActionListener(this::txtUsuarioActionPerformed);

        senha_lbl.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        senha_lbl.setText("Senha:");

        nome_lbl.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        nome_lbl.setText("Nome:");

        txtNome.addActionListener(this::txtNomeActionPerformed);

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(this::btnCadastrarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nome_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(usuario_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(senha_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(txtUsuario)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(154, 154, 154)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(usuario_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(senha_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(158, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Usuario u = new Usuario();

u.setNome(txtNome.getText());
u.setUsuario(txtUsuario.getText());
u.setSenha(txtSenha.getText());

UsuarioController controller = new UsuarioController();

controller.cadastrarUsuario(u);

JOptionPane.showMessageDialog(null, "Usuário cadastrado!");
    }//GEN-LAST:event_btnCadastrarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nome_lbl;
    private javax.swing.JLabel senha_lbl;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
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
