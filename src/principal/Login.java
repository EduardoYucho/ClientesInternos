package principal;

import bd.ConnectionManager;
import outros.Letras;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Login extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public static String IP_SISTEMA = "";

    public Login() {
        initComponents();

        txt_nmUsuario.setDocument(new Letras());
        RequesTFocus();
        this.setLocationRelativeTo(null);
        Enter();
        Esc();
        SelecionarConexao();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_usuario = new javax.swing.JLabel();
        txt_cdUsuario = new javax.swing.JTextField();
        txt_nmUsuario = new javax.swing.JTextField();
        bt_cancelar = new javax.swing.JButton();
        bt_login = new javax.swing.JButton();
        lb_senha = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        lb_TpConexao = new javax.swing.JLabel();
        cb_tpconexao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lb_usuario.setText("Usuário: ");

        txt_nmUsuario.setEditable(false);

        bt_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cancel_16x16.png"))); // NOI18N
        bt_cancelar.setText("Cancelar");
        bt_cancelar.setPreferredSize(new java.awt.Dimension(95, 30));
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarActionPerformed(evt);
            }
        });

        bt_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Log Out_16x16.png"))); // NOI18N
        bt_login.setText("Login");
        bt_login.setPreferredSize(new java.awt.Dimension(77, 30));
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });

        lb_senha.setText("Senha: ");

        lb_TpConexao.setText("Tipo de Conexão: ");

        cb_tpconexao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Interno", "Externo" }));
        cb_tpconexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tpconexaoActionPerformed(evt);
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
                        .addGap(41, 335, Short.MAX_VALUE)
                        .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_TpConexao)
                            .addComponent(lb_usuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_cdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nmUsuario))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_tpconexao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_senha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_TpConexao)
                    .addComponent(cb_tpconexao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_usuario)
                    .addComponent(txt_cdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nmUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_senha)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_cancelarActionPerformed

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed
        logar();


    }//GEN-LAST:event_bt_loginActionPerformed

    private void cb_tpconexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tpconexaoActionPerformed
        SelecionarConexao();
        System.out.println(IP_SISTEMA.toString());
    }//GEN-LAST:event_cb_tpconexaoActionPerformed

    /**
     * @param args the command line arguments
     *
     *
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_login;
    private javax.swing.JComboBox<String> cb_tpconexao;
    private javax.swing.JLabel lb_TpConexao;
    private javax.swing.JLabel lb_senha;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JTextField txt_cdUsuario;
    private javax.swing.JTextField txt_nmUsuario;
    private javax.swing.JPasswordField txt_senha;
    // End of variables declaration//GEN-END:variables

    public void logar() {

        //String sql = "select * from usuarios where cd_codigo = '?' and sn_senha = '?'";
        String sql = "select * from usuarios where cd_codigo = ? and sn_senha = ?";

        try {

            con = new ConnectionManager().getConexao();
            pst = con.prepareStatement(sql);

            if (txt_cdUsuario.getText().isEmpty() || txt_senha.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Favor preencher todos os campos");

            } else {
                pst.setInt(1, Integer.parseInt(txt_cdUsuario.getText()));
                pst.setString(2, txt_senha.getText());

                rs = pst.executeQuery();

                if (rs.next()) {
                    Principal pcpl = new Principal(this);
                    pcpl.setLocationRelativeTo(null);
                    pcpl.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.");
                    txt_senha.setText("");
                }
            }

        } catch (SQLException error) {

            JOptionPane.showMessageDialog(null, "Erro " + error);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Enter() {

        bt_login.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "Enter");
        bt_login.getActionMap().put("Enter", new AbstractAction() {

            @Override

            public void actionPerformed(ActionEvent e) {
                logar();
            }
        });
    }

    public void Esc() {

        bt_login.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Esc");
        bt_login.getActionMap().put("Esc", new AbstractAction() {

            @Override

            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public void RequesTFocus() {

        txt_cdUsuario.setInputVerifier(new InputVerifier() {

            @Override
            public boolean verify(JComponent input) {
                if (txt_cdUsuario.getText().isEmpty()) {
                    return false;
                } else {

                    txt_nmUsuario.requestFocus(true);
                    buscarUsuario(Integer.parseInt(txt_cdUsuario.getText()));

                    return true;
                }
            }

        });
    }
    String usuarioLog;
    String tpUsuario;
    String stSituacao;
    int cdCodigo;

    public void buscarUsuario(int codigo) {
        try {
            Connection con = new ConnectionManager().getConexao();

            PreparedStatement st;
            PreparedStatement st1;
            PreparedStatement st2;
            PreparedStatement st3;

            st = con.prepareStatement("select nm_usuario as nome from usuarios where cd_codigo = " + codigo);
            st1 = con.prepareStatement("select tp_usuario as tipo from usuarios where cd_codigo = " + codigo);
            st2 = con.prepareStatement("select st_situacao as situacao from usuarios where cd_codigo = " + codigo);
            st3 = con.prepareStatement("select cd_codigo as codigo from usuarios where cd_codigo = " + codigo);

            ResultSet rs = st.executeQuery();
            ResultSet rs1 = st1.executeQuery();
            ResultSet rs2 = st2.executeQuery();
            ResultSet rs3 = st3.executeQuery();

            if (rs.next()) {
                txt_nmUsuario.setText(rs.getString("nome"));
                txt_nmUsuario.setFocusable(false);
                usuarioLog = txt_nmUsuario.getText();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
                return;

            }

            if (rs1.next()) {
                tpUsuario = rs1.getString("tipo");
            } else {
                JOptionPane.showMessageDialog(null, "Tipo de usuário não encontrado");
                return;
            }

            if (rs2.next()) {
                stSituacao = rs2.getString("situacao");
            } else {
                JOptionPane.showMessageDialog(null, "Situação Inválida");
                return;
            }
            if (rs3.next()) {
                cdCodigo = rs3.getInt("codigo");
            } else {
                JOptionPane.showMessageDialog(null, "Código Inválido");
                return;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void SelecionarConexao() {
        IP_SISTEMA = "";
        limparCampos();
        if (cb_tpconexao.getSelectedIndex() == 0) {
            IP_SISTEMA = "192.168.1.201";
        } else if (cb_tpconexao.getSelectedIndex() == 1) {
            IP_SISTEMA = "187.102.47.23";
        }
    }

//    public void progress() {
//
//        new Thread() {
//            public void run() {
//
//                for (int i = 0; i < 101; i++) {
//                    try {
//                        sleep(2);
//                        barraProgresso.setValue(i);
//
//                        if (barraProgresso.getValue() <= 40) {
//                            lb_progresso.setText("Carregando...");
//                        } else if (barraProgresso.getValue() <= 70) {
//                            lb_progresso.setText("Buscando conexão do banco de dados!");
//                        } else if (barraProgresso.getValue() <= 96) {
//                            lb_progresso.setText("Conexão Estabelecida!");
//
//                        }
//
//                    } catch (InterruptedException ex) {
//                        System.out.println("Erro Sleep!" + ex);
//                    }
//
//                }
//
//            }
//        }.start();
//
//    }
    public void limparCampos() {
        txt_cdUsuario.setText("");
        txt_nmUsuario.setText("");
        txt_senha.setText("");
    }

}
