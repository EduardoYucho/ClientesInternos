package gui;

import dao.usuariosDAO;
import outros.Letras;
import vo.usuarioVO;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.KeyStroke;

public class newCadUsuar extends javax.swing.JInternalFrame {

    private JDesktopPane desktop;
    private cadusuar usuar;

    public newCadUsuar(int codConex, int i, cadusuar d) {
        this.desktop = desktop;
        usuar = d;

        initComponents();
        Esc();
        
        txt_nome.setDocument(new Letras());

        if (i == 1) {
            consultar(codConex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        lb_senha = new javax.swing.JLabel();
        lb_codigo = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        lb_situacao = new javax.swing.JLabel();
        cb_situacao = new javax.swing.JComboBox<>();
        bt_fechar = new javax.swing.JButton();
        bt_salvar = new javax.swing.JButton();
        lb_tpUsuario = new javax.swing.JLabel();
        cb_usuario = new javax.swing.JComboBox<>();
        txt_senha = new javax.swing.JPasswordField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Usuário");
        setToolTipText("");

        lb_nome.setText("Nome: ");

        lb_senha.setText("Senha:");

        lb_codigo.setText("Código: ");

        txt_codigo.setEditable(false);
        txt_codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_codigo.setText("                  ");

        lb_situacao.setText("Situação: ");

        cb_situacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        bt_fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cancel_16x16.png"))); // NOI18N
        bt_fechar.setText("Fechar");
        bt_fechar.setPreferredSize(new java.awt.Dimension(85, 30));
        bt_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_fecharActionPerformed(evt);
            }
        });

        bt_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Save_16x16.png"))); // NOI18N
        bt_salvar.setText("Salvar");
        bt_salvar.setPreferredSize(new java.awt.Dimension(83, 30));
        bt_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvarActionPerformed(evt);
            }
        });

        lb_tpUsuario.setText("Tipo de Usuário: ");

        cb_usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuário" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_senha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_codigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_situacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_tpUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_usuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_senha)
                    .addComponent(lb_codigo)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_situacao)
                            .addComponent(cb_situacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_tpUsuario)
                            .addComponent(cb_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_fecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_bt_fecharActionPerformed

    private void bt_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarActionPerformed
        salvar();
        limparCampos();
        ultimoCodigo();
        usuar.atualizaTabela();
        usuar.listaInicial();
        limparCampos();
        ultimoCodigo();
        this.dispose();
    }//GEN-LAST:event_bt_salvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_fechar;
    private javax.swing.JButton bt_salvar;
    private javax.swing.JComboBox<String> cb_situacao;
    private javax.swing.JComboBox<String> cb_usuario;
    private javax.swing.JLabel lb_codigo;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_senha;
    private javax.swing.JLabel lb_situacao;
    private javax.swing.JLabel lb_tpUsuario;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JPasswordField txt_senha;
    // End of variables declaration//GEN-END:variables

    public void salvar() {
        usuarioVO usuarVO = new usuarioVO();

        /*1*/ usuarVO.setCd_codigo(Integer.parseInt(txt_codigo.getText()));
        /*2*/ usuarVO.setNm_nome(txt_nome.getText());
        /*3*/ usuarVO.setSn_senha((String) txt_senha.getText());

        if (cb_usuario.getSelectedIndex() == 0) {
            usuarVO.setTp_usuario("Administrador");
        } else if (cb_usuario.getSelectedIndex() == 1) {
            usuarVO.setTp_usuario("Usuário");
        }

        if (cb_situacao.getSelectedIndex() == 0) {
            usuarVO.setSt_situacao("Ativo");
        } else if (cb_situacao.getSelectedIndex() == 1) {
            usuarVO.setSt_situacao("Inativo");
        }

        new usuariosDAO().salvar(usuarVO);

    }

    public void ultimoCodigo() {
        int retornaUltimocodigo = new usuariosDAO().retornaProximo();

        txt_codigo.setText(Integer.toString(retornaUltimocodigo));
    }

    public void limparCampos() {
        txt_nome.setText("");
        txt_senha.setText("");
    }

    private void consultar(int codUsuar) {

        usuarioVO pVO = new usuariosDAO().consultar(codUsuar);

        txt_codigo.setText(Integer.toString(pVO.getCd_codigo()));
        txt_nome.setText(pVO.getNm_nome());
        txt_senha.setText(pVO.getSn_senha());

        if (pVO.getTp_usuario().equals((String) "Administrador")) {
            cb_usuario.setSelectedIndex(0);

        } else if (pVO.getTp_usuario().equals((String) "Usuário")) {
            cb_usuario.setSelectedIndex(1);
        }

        if (pVO.getSt_situacao().equals((String) "Ativo")) {
            cb_situacao.setSelectedIndex(0);

        } else if (pVO.getSt_situacao().equals((String) "Inativo")) {
            cb_situacao.setSelectedIndex(1);
        }

    }
    public void Esc() {

        bt_fechar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Esc");
        bt_fechar.getActionMap().put("Esc", new AbstractAction() {

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
