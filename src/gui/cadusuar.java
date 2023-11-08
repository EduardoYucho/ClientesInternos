package gui;

import dao.usuariosDAO;
import vo.usuarioVO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.table.AbstractTableModel;
import model.usuarioMODEL;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class cadusuar extends javax.swing.JInternalFrame {

    private JDesktopPane desktop;

    public cadusuar(JDesktopPane desktop) {
        this.desktop = desktop;
        initComponents();
        Esc();
        listaInicial();

    }

    List<usuarioVO> lista = new ArrayList<usuarioVO>();
    int codigo;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_usuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cb_listar = new javax.swing.JComboBox<>();
        bt_editar = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();
        bt_novo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Usuários");

        bt_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cancel_16x16.png"))); // NOI18N
        bt_cancelar.setText("Fechar");
        bt_cancelar.setPreferredSize(new java.awt.Dimension(85, 30));
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarActionPerformed(evt);
            }
        });

        tb_usuarios.setModel(new usuarioMODEL(lista));
        tb_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_usuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_usuarios);

        jLabel1.setText("Pesquisa: ");

        jLabel2.setText("Listar: ");

        cb_listar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Ativo", "Inativo" }));
        cb_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_listarActionPerformed(evt);
            }
        });

        bt_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Edit_16x16.png"))); // NOI18N
        bt_editar.setText("Editar");
        bt_editar.setPreferredSize(new java.awt.Dimension(81, 30));
        bt_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editarActionPerformed(evt);
            }
        });

        bt_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Remove_16x16.png"))); // NOI18N
        bt_excluir.setText("Excluir");
        bt_excluir.setPreferredSize(new java.awt.Dimension(83, 30));
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });

        bt_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/New_16x16.png"))); // NOI18N
        bt_novo.setText("Novo");
        bt_novo.setPreferredSize(new java.awt.Dimension(77, 30));
        bt_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novoActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bt_novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_listar, 0, 148, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cb_listar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editarActionPerformed
        editar();
    }//GEN-LAST:event_bt_editarActionPerformed

    private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bt_cancelarActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Tem Certeza Que Deseja Excluir o Cadastro? ", " Exclusão ",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (i == JOptionPane.YES_OPTION) {

            int linha = tb_usuarios.getSelectedRow();

            if (!tb_usuarios.isRowSelected(linha)) {
                JOptionPane.showMessageDialog(this, " Nenhum cadastro foi selecionado. Selecione "
                        + "um cadastro primeiro para fazer a exclusão ");
            } else {

                excluir();
                listaInicial();
                atualizaTabela();
            }
        }
    }//GEN-LAST:event_bt_excluirActionPerformed

    private void bt_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoActionPerformed
        newCadUsuar ncu = new newCadUsuar(codigo, 2, this);

        desktop.add(ncu);
        ncu.setVisible(true);
        ncu.setVisible(true);
        util.Util.centralizarTela(desktop, ncu);
        ncu.ultimoCodigo();
        ncu.limparCampos();
    }//GEN-LAST:event_bt_novoActionPerformed

    private void tb_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_usuariosMouseClicked
        if (evt.getClickCount() == 2) {
            int linha = tb_usuarios.getSelectedRow();
            usuarioVO p = lista.get(linha);

            codigo = p.getCd_codigo();

            newCadUsuar v = new newCadUsuar(codigo, 1, this);
            desktop.add(v);
            v.setVisible(true);
            util.Util.centralizarTela(desktop, v);
            new usuariosDAO().consultar(p.getCd_codigo());

        }
    }//GEN-LAST:event_tb_usuariosMouseClicked

    private void cb_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_listarActionPerformed
        atualizaTabela();
        listaInicial();
    }//GEN-LAST:event_cb_listarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_novo;
    private javax.swing.JComboBox<String> cb_listar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tb_usuarios;
    // End of variables declaration//GEN-END:variables

    public void atualizaTabela() {
        ((AbstractTableModel) tb_usuarios.getModel()).fireTableDataChanged();
    }

    public void editar() {

        int linha = tb_usuarios.getSelectedRow();

        if (!tb_usuarios.isRowSelected(linha)) {
            JOptionPane.showMessageDialog(null, " Nenhum cadastro foi selecionado. Selecione "
                    + "um cadastro primeiro para edita-lo ");
        } else {
            //       int linha = tbConsulta.getSelectedRow();
            usuarioVO p = lista.get(linha);

            codigo = p.getCd_codigo();

            newCadUsuar ncc = new newCadUsuar(codigo, 1, this);
            desktop.add(ncc);
            ncc.setVisible(true);
            util.Util.centralizarTela(desktop, ncc);
            new usuariosDAO().consultar(p.getCd_codigo());

        }
    }

    public void excluir() {
        //int codigo = Integer.parseInt(txt_codigo.getText());
        int linha = tb_usuarios.getSelectedRow();
        usuarioVO p = lista.get(linha);

        if (!new usuariosDAO().excluir(p.getCd_codigo())) {
            // mensagem de erro para o usuario
            JOptionPane.showMessageDialog(null, "Impossível excluir cadastro!");
            return;
        } else {

            // mensagem de OK para o usuario
            JOptionPane.showMessageDialog(null, "Cadastro excluido com sucesso!");

        }
    }

    public void listaInicial() {
        lista.clear();
        lista.addAll(new usuariosDAO().exibirBanco(cb_listar.getSelectedItem() + ""));
    }

    public void Esc() {

        bt_cancelar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Esc");
        bt_cancelar.getActionMap().put("Esc", new AbstractAction() {

            @Override

            public void actionPerformed(ActionEvent e) {
                fecharTela();
            }
        });
    }

    public void fecharTela() {
        this.dispose();
    }
    
    

}
