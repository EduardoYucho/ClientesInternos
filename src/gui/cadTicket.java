package gui;

import util.Util;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.KeyStroke;

public class cadTicket extends javax.swing.JInternalFrame {

    private JDesktopPane desktop;

    public cadTicket(JDesktopPane desktop) {
        this.desktop = desktop;
        initComponents();
        MetodosIniciadosComATela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_ticket = new javax.swing.JTable();
        bt_fechar = new javax.swing.JButton();
        bt_editar = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();
        bt_novo = new javax.swing.JButton();
        txt_pesquisar = new javax.swing.JTextField();
        bt_pesquisar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        txt_cdcidade = new javax.swing.JTextField();
        txt_nmcidade = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Ticket");

        tb_ticket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_ticket);

        bt_fechar.setText("Fechar");
        bt_fechar.setPreferredSize(new java.awt.Dimension(65, 30));
        bt_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_fecharActionPerformed(evt);
            }
        });

        bt_editar.setText("Editar");
        bt_editar.setPreferredSize(new java.awt.Dimension(61, 30));

        bt_excluir.setText("Excluir");
        bt_excluir.setPreferredSize(new java.awt.Dimension(63, 30));

        bt_novo.setText("Novo");
        bt_novo.setPreferredSize(new java.awt.Dimension(57, 30));
        bt_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novoActionPerformed(evt);
            }
        });

        bt_pesquisar.setText("Pesquisar");
        bt_pesquisar.setPreferredSize(new java.awt.Dimension(73, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Em Aberto", "Desenvolvimento", "Aguardando Usuário", "Encerrado" }));
        jComboBox1.setMinimumSize(new java.awt.Dimension(56, 30));

        txt_cdcidade.setText("                                ");

        txt_nmcidade.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bt_novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_cdcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nmcidade, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cdcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nmcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_fecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_bt_fecharActionPerformed

    int codigo;
    private void bt_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoActionPerformed
        newCadTicket nc = new newCadTicket(codigo, desktop, 2);
        desktop.add(nc);
        nc.setVisible(true);
        Util.centralizarTela(desktop, nc);


    }//GEN-LAST:event_bt_novoActionPerformed

    public void MetodosIniciadosComATela() {
        Esc();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_fechar;
    private javax.swing.JButton bt_novo;
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_ticket;
    private javax.swing.JTextField txt_cdcidade;
    private javax.swing.JTextField txt_nmcidade;
    private javax.swing.JTextField txt_pesquisar;
    // End of variables declaration//GEN-END:variables

    public void Esc() {

        bt_fechar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Esc");
        bt_fechar.getActionMap().put("Esc", new AbstractAction() {

            @Override

            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

}
