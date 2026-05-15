package view;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controller.VideoController;
import controller.ListaController;


public class Inicio extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Inicio.class.getName());

    
   public Inicio() {
    initComponents();
    txtBusca.setBackground(new java.awt.Color(40,40,40));

    txtBusca.setForeground(java.awt.Color.WHITE);

    txtBusca.setCaretColor(java.awt.Color.WHITE);

    txtBusca.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 16));

    txtBusca.setBorder(
        javax.swing.BorderFactory.createEmptyBorder(10,10,10,10)
);
    setLocationRelativeTo(null);

setTitle("FEItv");

setResizable(false);
    estilizarBotao(btnBuscar);
    estilizarBotao(btnCurtir);
    estilizarBotao(btnDescurtir);
    estilizarBotao(btnFavorito);
    estilizarBotao(btnCriarLista);
    estilizarBotao(btnEditarLista);
    

    getContentPane().setBackground(new java.awt.Color(24,24,24));

    tabelaVideos.setBackground(new java.awt.Color(35,35,35));
    tabelaVideos.setForeground(java.awt.Color.WHITE);

    tabelaVideos.setGridColor(new java.awt.Color(60,60,60));

    tabelaVideos.setSelectionBackground(new java.awt.Color(229,9,20));

    tabelaVideos.getTableHeader().setBackground(new java.awt.Color(229,9,20));

    tabelaVideos.getTableHeader().setForeground(java.awt.Color.WHITE);

    tabelaVideos.getTableHeader().setFont(
        new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14)
    );
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVideos = new javax.swing.JTable();
        btnDescurtir = new javax.swing.JButton();
        btnCurtir = new javax.swing.JButton();
        btnFavorito = new javax.swing.JButton();
        btnCriarLista = new javax.swing.JButton();
        btnEditarLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        tabelaVideos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Titulo", "Descrição", "Tipo", "Curtidas"
            }
        ));
        jScrollPane1.setViewportView(tabelaVideos);

        btnDescurtir.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnDescurtir.setText("Descurtir");
        btnDescurtir.addActionListener(this::btnDescurtirActionPerformed);

        btnCurtir.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnCurtir.setText("Curtir");
        btnCurtir.addActionListener(this::btnCurtirActionPerformed);

        btnFavorito.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnFavorito.setText("Favoritar");
        btnFavorito.addActionListener(this::btnFavoritoActionPerformed);

        btnCriarLista.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCriarLista.setText("CRIAR LISTA");
        btnCriarLista.addActionListener(this::btnCriarListaActionPerformed);

        btnEditarLista.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnEditarLista.setText("EDITAR LISTA");
        btnEditarLista.addActionListener(this::btnEditarListaActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnDescurtir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCriarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(btnCurtir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(648, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDescurtir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCriarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(441, Short.MAX_VALUE)
                    .addComponent(btnCurtir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(67, 67, 67)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{

    VideoController controller = new VideoController();

    ResultSet rs = controller.buscarVideos(txtBusca.getText());

    DefaultTableModel modelo = (DefaultTableModel) tabelaVideos.getModel();

    modelo.setRowCount(0);

    while(rs.next()){

        modelo.addRow(new Object[]{

            rs.getInt("id_video"),
            rs.getString("titulo"),
            rs.getString("descricao"),
            rs.getString("tipo"),
            rs.getInt("curtidas")
        });
    }

}catch(SQLException e){

    System.out.println(e);
}
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCurtirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurtirActionPerformed
      int linha = tabelaVideos.getSelectedRow();

int id = Integer.parseInt(
    tabelaVideos.getValueAt(linha, 0).toString()
);

VideoController controller = new VideoController();

controller.curtirVideo(id);

JOptionPane.showMessageDialog(null, "Vídeo curtido!");
    }//GEN-LAST:event_btnCurtirActionPerformed

    private void btnDescurtirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescurtirActionPerformed
       int linha = tabelaVideos.getSelectedRow();

int id = Integer.parseInt(
    tabelaVideos.getValueAt(linha, 0).toString()
);

VideoController controller = new VideoController();

controller.descurtirVideo(id);

JOptionPane.showMessageDialog(null, "Vídeo descurtido!");
    }//GEN-LAST:event_btnDescurtirActionPerformed

    private void btnCriarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarListaActionPerformed
        String nome = JOptionPane.showInputDialog("Nome da lista:");

ListaController controller = new ListaController();

controller.criarLista(nome);

JOptionPane.showMessageDialog(null, "Lista criada!");
    }//GEN-LAST:event_btnCriarListaActionPerformed

    private void btnEditarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarListaActionPerformed
    String nomeLista = JOptionPane.showInputDialog("Nome da lista:");

ListaController controller = new ListaController();

if(!controller.listaExiste(nomeLista)){

    JOptionPane.showMessageDialog(null, "Lista não encontrada!");

    return;
}

String[] opcoes = {

    "Editar Nome",
    "Excluir Lista",
    "Adicionar Vídeo",
    "Remover Vídeo",
    "Ver Vídeos"
};

int escolha = JOptionPane.showOptionDialog(

        null,
        "Escolha uma opção",
        "Editar Lista",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        null,
        opcoes,
        opcoes[0]
);

if(escolha == 0){

    String novoNome = JOptionPane.showInputDialog("Novo nome:");

    boolean sucesso = controller.editarLista(nomeLista, novoNome);

    if(sucesso){

        JOptionPane.showMessageDialog(null, "Nome alterado!");

    }else{

        JOptionPane.showMessageDialog(null, "Lista não encontrada!");
    }
}

if(escolha == 1){

    boolean sucesso = controller.excluirLista(nomeLista);

    if(sucesso){

        JOptionPane.showMessageDialog(null, "Lista excluída!");

    }else{

        JOptionPane.showMessageDialog(null, "Lista não encontrada!");
    }
}

if(escolha == 2){

    String video = JOptionPane.showInputDialog("ID do vídeo:");

    boolean sucesso = controller.adicionarVideo(

        nomeLista,
        Integer.parseInt(video)
    );

    if(sucesso){

        JOptionPane.showMessageDialog(null, "Vídeo adicionado!");

    }else{

        JOptionPane.showMessageDialog(null, "Lista não encontrada!");
    }
}

if(escolha == 3){

    String video = JOptionPane.showInputDialog("ID do vídeo:");

    boolean sucesso = controller.removerVideo(

        nomeLista,
        Integer.parseInt(video)
    );

    if(sucesso){

        JOptionPane.showMessageDialog(null, "Vídeo removido!");

    }else{

        JOptionPane.showMessageDialog(null, "Lista não encontrada!");
    }
}

if(escolha == 4){

    try{

        ResultSet rs = controller.listarVideosDaLista(nomeLista);

        String texto = "";

        while(rs.next()){

            texto +=
                    "ID: " + rs.getInt("id_video") +
                    "\nTítulo: " + rs.getString("titulo") +
                    "\nTipo: " + rs.getString("tipo") +
                    "\nCurtidas: " + rs.getInt("curtidas") +
                    "\n\n";
        }

        if(texto.equals("")){

            texto = "Lista vazia!";
        }

        JOptionPane.showMessageDialog(null, texto);

    }catch(SQLException e){

        System.out.println(e);
    }
}
    }//GEN-LAST:event_btnEditarListaActionPerformed

    private void btnFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavoritoActionPerformed
        int linha = tabelaVideos.getSelectedRow();

if(linha == -1){

    JOptionPane.showMessageDialog(null, "Selecione um vídeo!");

    return;
}

int video_id = Integer.parseInt(

    tabelaVideos.getValueAt(linha, 0).toString()
);

String nomeLista = JOptionPane.showInputDialog("Nome da lista:");

ListaController controller = new ListaController();

if(!controller.listaExiste(nomeLista)){

    JOptionPane.showMessageDialog(null, "Lista não encontrada!");

    return;
}

boolean sucesso = controller.adicionarVideo(nomeLista, video_id);

if(sucesso){

    JOptionPane.showMessageDialog(null, "Vídeo favoritado!");

}else{

    JOptionPane.showMessageDialog(null, "Erro ao favoritar!");
}


    }//GEN-LAST:event_btnFavoritoActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCriarLista;
    private javax.swing.JButton btnCurtir;
    private javax.swing.JButton btnDescurtir;
    private javax.swing.JButton btnEditarLista;
    private javax.swing.JButton btnFavorito;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaVideos;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables

private void estilizarBotao(javax.swing.JButton botao){

    botao.setBackground(new java.awt.Color(229,9,20));

    botao.setForeground(java.awt.Color.WHITE);

    botao.setFocusPainted(false);

    botao.setBorderPainted(false);

    botao.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));

    botao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
}
}
