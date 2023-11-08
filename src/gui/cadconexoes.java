package gui;

import dao.conexoesDAO;
import outros.Letras;
import util.Util;
import vo.conexoesVO;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.table.AbstractTableModel;

public class cadconexoes extends javax.swing.JInternalFrame {

    Connection conecta;
    PreparedStatement pst;
    ResultSet rs;
    private newCadConexoes ncc;

    private JDesktopPane desktop;

    public cadconexoes(JDesktopPane desktop, newCadConexoes n) {

        this.desktop = desktop;
        ncc = n;
        initComponents();
        tamanho_colunas();
        Enter();
        Esc();
        barraRolagemHorizontal();

        txt_pesquisar.setDocument(new Letras());

        listaInicial();
//        tamanho_colunas();

        //centralizarDesktop();
    }

    List<conexoesVO> lista = new ArrayList<conexoesVO>();
    int codigo;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_lista = new javax.swing.JTable();
        bt_fechar = new javax.swing.JButton();
        bt_conectar = new javax.swing.JButton();
        bt_editar = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();
        bt_novo = new javax.swing.JButton();
        txt_pesquisar = new javax.swing.JTextField();
        bt_pesquisa = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de Clientes");

        tb_lista.setModel(new conexaoMODEL(lista));
        tb_lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_listaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_lista);

        bt_fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cancel_16x16.png"))); // NOI18N
        bt_fechar.setText("Fechar");
        bt_fechar.setPreferredSize(new java.awt.Dimension(85, 30));
        bt_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_fecharActionPerformed(evt);
            }
        });

        bt_conectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Picture_16x16.png"))); // NOI18N
        bt_conectar.setText("Conectar");
        bt_conectar.setPreferredSize(new java.awt.Dimension(97, 30));
        bt_conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_conectarActionPerformed(evt);
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

        bt_pesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search_16x16.png"))); // NOI18N
        bt_pesquisa.setText("Pesquisar");
        bt_pesquisa.setPreferredSize(new java.awt.Dimension(99, 30));
        bt_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bt_novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_conectar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_conectar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void bt_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoActionPerformed
        newCadConexoes np = new newCadConexoes(codigo, desktop, 2, this);
        desktop.add(np);
        np.setVisible(true);
        Util.centralizarTela(desktop, np);
        np.ultimoCodigo();
        np.limparCampos();
    }//GEN-LAST:event_bt_novoActionPerformed

    private void bt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editarActionPerformed
        editar();

    }//GEN-LAST:event_bt_editarActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Tem Certeza Que Deseja Excluir o Cadastro? ", " Exclusão ",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (i == JOptionPane.YES_OPTION) {

            int linha = tb_lista.getSelectedRow();

            if (!tb_lista.isRowSelected(linha)) {
                JOptionPane.showMessageDialog(this, " Nenhum cadastro foi selecionado. Selecione "
                        + "um cadastro primeiro para fazer a exclusão ");
            } else {

                excluir();
                listaInicial();
                atualizaTabela();
            }
        }
    }//GEN-LAST:event_bt_excluirActionPerformed

    private void bt_conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_conectarActionPerformed
        conexao();
    }//GEN-LAST:event_bt_conectarActionPerformed

    private void bt_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisaActionPerformed
        atualizaTabela();
        listaInicial();
    }//GEN-LAST:event_bt_pesquisaActionPerformed

    private void tb_listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_listaMouseClicked
        if (evt.getClickCount() == 2) {
            editar();
        }
    }//GEN-LAST:event_tb_listaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_conectar;
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_fechar;
    private javax.swing.JButton bt_novo;
    private javax.swing.JButton bt_pesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_lista;
    private javax.swing.JTextField txt_pesquisar;
    // End of variables declaration//GEN-END:variables

    public void listaInicial() {
        lista.clear();
        lista.addAll(new conexoesDAO().exibirBanco(txt_pesquisar.getText()));

    }

    public void atualizaTabela() {
        ((AbstractTableModel) tb_lista.getModel()).fireTableDataChanged();
    }

    public void editar() {

        int linha = tb_lista.getSelectedRow();

        if (!tb_lista.isRowSelected(linha)) {
            JOptionPane.showMessageDialog(null, " Nenhum cliente foi selecionado. Selecione "
                    + "um cliente primeiro para edita-lo ");
        } else {
            //       int linha = tbConsulta.getSelectedRow();
            conexoesVO p = lista.get(linha);

            codigo = p.getCd_codigo();

            newCadConexoes ncc = new newCadConexoes(codigo, desktop, 1, this);
            desktop.add(ncc);
            ncc.setVisible(true);
            Util.centralizarTela(desktop, ncc);
            //new produtoDAO().consultar(p.getCodigo());
            ncc.atualizaTabela();
            ncc.listaInicialAlteracoes();
            barraRolagemHorizontal();
        }
    }

    public void excluir() {
        //int codigo = Integer.parseInt(txt_codigo.getText());
        int linha = tb_lista.getSelectedRow();
        conexoesVO p = lista.get(linha);

        if (!new conexoesDAO().excluir(p.getCd_codigo())) {
            // mensagem de erro para o usuario
            JOptionPane.showMessageDialog(null, "Impossível excluir cadastro!");
            return;
        } else {

            // mensagem de OK para o usuario
            JOptionPane.showMessageDialog(null, "Cadastro excluido com sucesso!");

        }
    }

    public void conexao() {

        conexoesVO nw = new conexoesVO();
        //nw.setIp_ip(title);

        int linha = tb_lista.getSelectedRow();

        if (!tb_lista.isRowSelected(linha)) {
            JOptionPane.showMessageDialog(null, " Nenhum cliente foi selecionado. Selecione "
                    + "um cliente primeiro para conectar ");

        } else if (tb_lista.isRowSelected(linha)) /*F: FULL SCREEN*/ /*V: IP DE CONEXAO*/ {
            int posicaoLista = tb_lista.getSelectedRow();
            nw = lista.get(posicaoLista);
            if (nw.getTp_conexao().equals((String) "Team Viewer")) {
                JOptionPane.showMessageDialog(null, "Cliente utiliza Team Viewer");

            } else if (nw.getTp_conexao().equals((String) "Windows")) {
                try {
                    Process pro = Runtime.getRuntime().exec("cmd.exe /c  mstsc /f /v:" + nw.getIp_ip());
                    //pro.waitFor();
                } catch (IOException e1) {
                    JOptionPane.showMessageDialog(null, "DEU ERRO");
                    System.out.println(e1);
                }

            } //mstsc /v:192.168.0.150
        }
    }

    private void tamanho_colunas() {
        tb_lista.getColumnModel().getColumn(0).setPreferredWidth(80);   //codigo
        tb_lista.getColumnModel().getColumn(1).setPreferredWidth(350); //cidade
        tb_lista.getColumnModel().getColumn(2).setPreferredWidth(150); //contato
        tb_lista.getColumnModel().getColumn(3).setPreferredWidth(100); //telefone
        tb_lista.getColumnModel().getColumn(4).setPreferredWidth(135); //ip
        tb_lista.getColumnModel().getColumn(5).setPreferredWidth(120); //senha
        tb_lista.getColumnModel().getColumn(6).setPreferredWidth(120); //tipo de conexao
        
    }

    public void Enter() {

        bt_pesquisa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "Enter");
        bt_pesquisa.getActionMap().put("Enter", new AbstractAction() {

            @Override

            public void actionPerformed(ActionEvent e) {
                atualizaTabela();
                listaInicial();
            }
        });
    }

    public void Esc() {

        bt_pesquisa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Esc");
        bt_pesquisa.getActionMap().put("Esc", new AbstractAction() {

            @Override

            public void actionPerformed(ActionEvent e) {
                fecharTela();
            }
        });
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------

    public void fecharTela() {
        this.dispose();
    }
//--------------------------------------------------------------------------------------------------------------------------------------------------

    public void barraRolagemHorizontal() {
        tb_lista.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }

}
