package gui;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.KeyStroke;

public class newCadTicket extends javax.swing.JInternalFrame {

    private JDesktopPane desktop;

    public newCadTicket(int codTicket, JDesktopPane desktop, int i) {
        this.desktop = desktop;
        initComponents();

        if (i == 1) {
            consultar(codTicket);
        }
        MetodosIniciadosComATela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_solicitante = new javax.swing.JLabel();
        lb_responsavel = new javax.swing.JLabel();
        lb_cidade = new javax.swing.JLabel();
        txt_cdsolicitante = new javax.swing.JTextField();
        txt_cdresponsavel = new javax.swing.JTextField();
        txt_cdcidade = new javax.swing.JTextField();
        txt_nmsolicitante = new javax.swing.JTextField();
        txt_nmresponsavel = new javax.swing.JTextField();
        txt_nmcidade = new javax.swing.JTextField();
        bt_selecionarsolicitante = new javax.swing.JButton();
        bt_selecionarresponsavel = new javax.swing.JButton();
        bt_selecionarcidade = new javax.swing.JButton();
        lb_codigo = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        cb_situacao = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_dssolicitacao = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_dsatualizacao = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_atualizacao = new javax.swing.JTable();
        bt_adicionar = new javax.swing.JButton();
        bt_editar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        bt_fechar = new javax.swing.JButton();
        bt_salvar = new javax.swing.JButton();
        bt_encerrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Ticket");
        setToolTipText("");

        lb_solicitante.setText("Solicitante: ");

        lb_responsavel.setText("Responsável: ");

        lb_cidade.setText("Cidade:");

        txt_nmsolicitante.setEditable(false);

        txt_nmresponsavel.setEditable(false);

        txt_nmcidade.setEditable(false);

        bt_selecionarsolicitante.setText("Selecionar");
        bt_selecionarsolicitante.setPreferredSize(new java.awt.Dimension(73, 30));

        bt_selecionarresponsavel.setText("Selecionar");
        bt_selecionarresponsavel.setPreferredSize(new java.awt.Dimension(73, 30));

        bt_selecionarcidade.setText("Selecionar");
        bt_selecionarcidade.setPreferredSize(new java.awt.Dimension(73, 30));

        lb_codigo.setText("Código: ");

        txt_codigo.setEditable(false);

        cb_situacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em Aberto", "Desenvolvimento", "Aguardando Usuário", "Encerrado" }));
        cb_situacao.setPreferredSize(new java.awt.Dimension(56, 30));

        txt_dssolicitacao.setColumns(20);
        txt_dssolicitacao.setRows(5);
        txt_dssolicitacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descrição da Solicitação", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jScrollPane1.setViewportView(txt_dssolicitacao);

        txt_dsatualizacao.setColumns(20);
        txt_dsatualizacao.setRows(5);
        jScrollPane2.setViewportView(txt_dsatualizacao);

        tb_atualizacao.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tb_atualizacao);

        bt_adicionar.setText("Adicionar");
        bt_adicionar.setPreferredSize(new java.awt.Dimension(73, 30));

        bt_editar.setText("Editar");
        bt_editar.setPreferredSize(new java.awt.Dimension(73, 30));

        bt_fechar.setText("Fechar");
        bt_fechar.setPreferredSize(new java.awt.Dimension(73, 30));
        bt_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_fecharActionPerformed(evt);
            }
        });

        bt_salvar.setText("Salvar");
        bt_salvar.setPreferredSize(new java.awt.Dimension(73, 30));

        bt_encerrar.setText("Encerrar");
        bt_encerrar.setPreferredSize(new java.awt.Dimension(73, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_solicitante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cdsolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nmsolicitante))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_responsavel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cdresponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nmresponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_cidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cdcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nmcidade)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_selecionarsolicitante, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(bt_selecionarresponsavel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_selecionarcidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lb_codigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cb_situacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bt_adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(bt_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bt_encerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_solicitante)
                    .addComponent(txt_cdsolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nmsolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_selecionarsolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_codigo)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_responsavel)
                    .addComponent(txt_cdresponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nmresponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_selecionarresponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_situacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_cidade)
                            .addComponent(txt_cdcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nmcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_selecionarcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 77, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_encerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_fecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_bt_fecharActionPerformed

    public void MetodosIniciadosComATela() {
        Esc();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_adicionar;
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_encerrar;
    private javax.swing.JButton bt_fechar;
    private javax.swing.JButton bt_salvar;
    private javax.swing.JButton bt_selecionarcidade;
    private javax.swing.JButton bt_selecionarresponsavel;
    private javax.swing.JButton bt_selecionarsolicitante;
    private javax.swing.JComboBox<String> cb_situacao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_cidade;
    private javax.swing.JLabel lb_codigo;
    private javax.swing.JLabel lb_responsavel;
    private javax.swing.JLabel lb_solicitante;
    private javax.swing.JTable tb_atualizacao;
    private javax.swing.JTextField txt_cdcidade;
    private javax.swing.JTextField txt_cdresponsavel;
    private javax.swing.JTextField txt_cdsolicitante;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextArea txt_dsatualizacao;
    private javax.swing.JTextArea txt_dssolicitacao;
    private javax.swing.JTextField txt_nmcidade;
    private javax.swing.JTextField txt_nmresponsavel;
    private javax.swing.JTextField txt_nmsolicitante;
    // End of variables declaration//GEN-END:variables

    private void consultar(int codTicket) {

    }

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
