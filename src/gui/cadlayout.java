/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author Windows
 */
public class cadlayout extends javax.swing.JInternalFrame {

    public cadlayout() {
        initComponents();
        Esc();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_fechar = new javax.swing.JButton();
        lb_linha = new javax.swing.JLabel();
        txt_linha = new javax.swing.JTextField();
        bt_identar = new javax.swing.JButton();
        lb_campos = new javax.swing.JLabel();
        lb_de = new javax.swing.JLabel();
        lb_até = new javax.swing.JLabel();
        lb_tamanho = new javax.swing.JLabel();
        lb_conteudo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_1 = new javax.swing.JTextField();
        txt_2 = new javax.swing.JTextField();
        txt_3 = new javax.swing.JTextField();
        txt_4 = new javax.swing.JTextField();
        txt_5 = new javax.swing.JTextField();
        txt_6 = new javax.swing.JTextField();
        txt_7 = new javax.swing.JTextField();
        txt_8 = new javax.swing.JTextField();
        txt_9 = new javax.swing.JTextField();
        txt_10 = new javax.swing.JTextField();
        txt_11 = new javax.swing.JTextField();
        txt_12 = new javax.swing.JTextField();
        txt_13 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        bt_limparCampos = new javax.swing.JButton();
        lb_identado = new javax.swing.JLabel();
        lb_original = new javax.swing.JLabel();
        lb_txtoriginal = new javax.swing.JLabel();
        bt_comparar = new javax.swing.JButton();
        txt_identado = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Layout de Código de Barras");

        bt_fechar.setText("Fechar");
        bt_fechar.setPreferredSize(new java.awt.Dimension(65, 30));
        bt_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_fecharActionPerformed(evt);
            }
        });

        lb_linha.setText("Linha: ");

        bt_identar.setText("Identar");
        bt_identar.setPreferredSize(new java.awt.Dimension(69, 30));
        bt_identar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_identarActionPerformed(evt);
            }
        });

        lb_campos.setText("Campos");

        lb_de.setText("De:");

        lb_até.setText("Até:");

        lb_tamanho.setText("Tamanho: ");

        lb_conteudo.setText("Conteúdo: ");

        jLabel1.setText("Retorno: ");

        jLabel2.setText("Código do registro = “G” ");

        jLabel3.setText("Identificação da agência/conta/dígito creditada ");

        jLabel4.setText("Data de pagamento (AAAA/MM/DD)");

        jLabel5.setText("Data de crédito (AAAA/MM/DD) ");

        jLabel6.setText("Código de Barras");

        jLabel7.setText("Valor recebido");

        jLabel8.setText("Valor da tarifa");

        jLabel9.setText("NSR - Número Seqüencial de Registro");

        jLabel10.setText("Código da agência arrecadadora");

        jLabel11.setText("Forma de arrecadação/captura ");

        jLabel12.setText("Número de autenticação caixa ou código de transação ");

        jLabel13.setText("Forma de Pagamento");

        jLabel14.setText("Reservado para o futuro ");

        jLabel15.setText("G. 01");

        jLabel16.setText("G. 02");

        jLabel17.setText("G. 03");

        jLabel18.setText("G. 04");

        jLabel19.setText("G. 05");

        jLabel20.setText("G. 06");

        jLabel21.setText("G. 07");

        jLabel22.setText("G. 08");

        jLabel23.setText("G. 09");

        jLabel24.setText("G. 10");

        jLabel25.setText("G. 11");

        jLabel26.setText("G. 12");

        jLabel27.setText("G. 13");

        jLabel28.setText("1");

        jLabel29.setText("1");

        jLabel30.setText("1");

        jLabel31.setText("2");

        jLabel32.setText("21");

        jLabel33.setText("20");

        jLabel34.setText("22");

        jLabel35.setText("29");

        jLabel36.setText("8");

        jLabel37.setText("30");

        jLabel38.setText("37");

        jLabel39.setText("8");

        jLabel40.setText("38");

        jLabel41.setText("81");

        jLabel42.setText("44");

        jLabel43.setText("82");

        jLabel44.setText("93");

        jLabel45.setText("10");

        jLabel46.setText("94");

        jLabel47.setText("100");

        jLabel48.setText("5");

        jLabel49.setText("101");

        jLabel50.setText("108");

        jLabel51.setText("8");

        jLabel52.setText("109");

        jLabel53.setText("116");

        jLabel54.setText("8");

        jLabel55.setText("117");

        jLabel56.setText("117");

        jLabel57.setText("1");

        jLabel58.setText("118");

        jLabel59.setText("140");

        jLabel60.setText("23");

        jLabel61.setText("141");

        jLabel62.setText("141");

        jLabel63.setText("1");

        jLabel64.setText("142");

        jLabel65.setText("150");

        jLabel66.setText("9");

        bt_limparCampos.setText("Limpar Campos");
        bt_limparCampos.setPreferredSize(new java.awt.Dimension(105, 30));
        bt_limparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limparCamposActionPerformed(evt);
            }
        });

        lb_identado.setText("Identado: ");

        lb_original.setText("Original: ");

        bt_comparar.setText("Comparar");
        bt_comparar.setPreferredSize(new java.awt.Dimension(73, 30));
        bt_comparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_compararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lb_linha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_linha))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_comparar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_identar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_limparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(lb_campos)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_de)
                            .addComponent(jLabel28)
                            .addComponent(jLabel31)
                            .addComponent(jLabel34)
                            .addComponent(jLabel37)
                            .addComponent(jLabel40)
                            .addComponent(jLabel43)
                            .addComponent(jLabel46)
                            .addComponent(jLabel49)
                            .addComponent(jLabel52)
                            .addComponent(jLabel55)
                            .addComponent(jLabel58)
                            .addComponent(jLabel61)
                            .addComponent(jLabel64))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_até)
                            .addComponent(jLabel29)
                            .addComponent(jLabel32)
                            .addComponent(jLabel35)
                            .addComponent(jLabel38)
                            .addComponent(jLabel41)
                            .addComponent(jLabel44)
                            .addComponent(jLabel47)
                            .addComponent(jLabel50)
                            .addComponent(jLabel53)
                            .addComponent(jLabel56)
                            .addComponent(jLabel59)
                            .addComponent(jLabel62)
                            .addComponent(jLabel65))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66)
                            .addComponent(jLabel63)
                            .addComponent(jLabel60)
                            .addComponent(jLabel57)
                            .addComponent(jLabel54)
                            .addComponent(jLabel51)
                            .addComponent(jLabel48)
                            .addComponent(jLabel45)
                            .addComponent(jLabel42)
                            .addComponent(jLabel39)
                            .addComponent(jLabel36)
                            .addComponent(jLabel33)
                            .addComponent(jLabel30)
                            .addComponent(lb_tamanho))
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_conteudo)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(171, 171, 171))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_1)
                                    .addComponent(txt_3)
                                    .addComponent(txt_2)
                                    .addComponent(txt_4)
                                    .addComponent(txt_5)
                                    .addComponent(txt_6)
                                    .addComponent(txt_7)
                                    .addComponent(txt_8)
                                    .addComponent(txt_9)
                                    .addComponent(txt_10)
                                    .addComponent(txt_11)
                                    .addComponent(txt_12)
                                    .addComponent(txt_13, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_original)
                            .addComponent(lb_identado))
                        .addGap(18, 18, 18)
                        .addComponent(txt_identado, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_txtoriginal)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_linha)
                    .addComponent(txt_linha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_campos)
                    .addComponent(lb_de)
                    .addComponent(lb_até)
                    .addComponent(lb_tamanho)
                    .addComponent(lb_conteudo)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel55)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel58)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel61)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel64)
                    .addComponent(jLabel65)
                    .addComponent(jLabel66))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_original)
                    .addComponent(lb_txtoriginal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_identado)
                    .addComponent(txt_identado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_identar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_limparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_comparar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_identarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_identarActionPerformed
        g1();
        g2();
        g3();
        g4();
        g5();
        g6();
        g7();
        g8();
        g9();
        g10();
        g11();
        g12();
        g13();

    }//GEN-LAST:event_bt_identarActionPerformed

    private void bt_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_fecharActionPerformed
        FecharTela();
    }//GEN-LAST:event_bt_fecharActionPerformed

    private void bt_limparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limparCamposActionPerformed
        LimparCampos();

    }//GEN-LAST:event_bt_limparCamposActionPerformed

    private void bt_compararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_compararActionPerformed
        Comparacao();
    }//GEN-LAST:event_bt_compararActionPerformed

    public void FecharTela() {
        this.dispose();
    }

    public void Esc() {

        bt_fechar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Esc");
        bt_fechar.getActionMap().put("Esc", new AbstractAction() {

            @Override

            public void actionPerformed(ActionEvent e) {
                FecharTela();
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_comparar;
    private javax.swing.JButton bt_fechar;
    private javax.swing.JButton bt_identar;
    private javax.swing.JButton bt_limparCampos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_até;
    private javax.swing.JLabel lb_campos;
    private javax.swing.JLabel lb_conteudo;
    private javax.swing.JLabel lb_de;
    private javax.swing.JLabel lb_identado;
    private javax.swing.JLabel lb_linha;
    private javax.swing.JLabel lb_original;
    private javax.swing.JLabel lb_tamanho;
    private javax.swing.JLabel lb_txtoriginal;
    private javax.swing.JTextField txt_1;
    private javax.swing.JTextField txt_10;
    private javax.swing.JTextField txt_11;
    private javax.swing.JTextField txt_12;
    private javax.swing.JTextField txt_13;
    private javax.swing.JTextField txt_2;
    private javax.swing.JTextField txt_3;
    private javax.swing.JTextField txt_4;
    private javax.swing.JTextField txt_5;
    private javax.swing.JTextField txt_6;
    private javax.swing.JTextField txt_7;
    private javax.swing.JTextField txt_8;
    private javax.swing.JTextField txt_9;
    private javax.swing.JTextField txt_identado;
    private javax.swing.JTextField txt_linha;
    // End of variables declaration//GEN-END:variables

    public void g1() {
        String valor1 = txt_linha.getText();
        if (valor1 == null || valor1.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Posição G1 está nula");
        } else {
            txt_1.setText(valor1.substring(0, 1));
        }

    }

    public void g2() {
        String valor2 = txt_linha.getText();
        if (valor2 == null || valor2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Posição G2 está nula");
        } else {
            txt_2.setText(valor2.substring(1, 21));
        }

    }

    public void g3() {
        String valor3 = txt_linha.getText();
        if (valor3 == null || valor3.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Posição G3 está nula");
        } else {
            txt_3.setText(valor3.substring(21, 29));
        }

    }

    public void g4() {
        String valor4 = txt_linha.getText();
        if (valor4 == null || valor4.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Posição G4 está nula");
        } else {
            txt_4.setText(valor4.substring(29, 37));
        }

    }

    public void g5() {
        String valor5 = txt_linha.getText();
        if (valor5 == null || valor5.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Posição G5 está nula");
        } else {
            txt_5.setText(valor5.substring(37, 82));
        }

    }

    public void g6() {
        String valor6 = txt_linha.getText();
        if (valor6 == null || valor6.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Posição G6 está nula");
        } else {
            txt_6.setText(valor6.substring(82, 93));
        }

    }

    public void g7() {
        String valor7 = txt_linha.getText();
        if (valor7 == null || valor7.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Posição G7 está nula");
        } else {
            txt_7.setText(valor7.substring(93, 99));
        }

    }

    public void g8() {
        String valor8 = txt_linha.getText();
        if (valor8 == null || valor8.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Posição G8 está nula");
        } else {
            txt_8.setText(valor8.substring(99, 107));
        }

    }

    public void g9() {
        String valor9 = txt_linha.getText();
        if (valor9 == null || valor9.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Posição G9 está nula");
        } else {
            txt_9.setText(valor9.substring(107, 116));
        }

    }

    public void g10() {
        String valor10 = txt_linha.getText();
        if (valor10 == null || valor10.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Posição G10 está nula");
        } else {
            txt_10.setText(valor10.substring(116, 117));
        }

    }

    public void g11() {
        String valor11 = txt_linha.getText();
        if (valor11 == null || valor11.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Posição G11 está nula");
        } else {
            txt_11.setText(valor11.substring(117, 140));
        }

    }

    public void g12() {
        String valor12 = txt_linha.getText();
        if (valor12 == null || valor12.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Posição G12 está nula");
        } else {
            txt_12.setText(valor12.substring(140, 141));
        }

    }

    public void g13() {
        String valor13 = txt_linha.getText();
        if (valor13 == null || valor13.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Posição G13 está nula");
        } else {
            txt_13.setText(valor13.substring(141, 150));
        }

    }

    public void LimparCampos() {
        txt_linha.setText("");
        txt_1.setText("");
        txt_2.setText("");
        txt_3.setText("");
        txt_4.setText("");
        txt_5.setText("");
        txt_6.setText("");
        txt_7.setText("");
        txt_8.setText("");
        txt_9.setText("");
        txt_10.setText("");
        txt_11.setText("");
        txt_12.setText("");
        txt_13.setText("");
        txt_identado.setText("");
        lb_txtoriginal.setText("");
    }

    public void Comparacao() {
        lb_txtoriginal.setText(txt_linha.getText());
        txt_identado.setText(txt_1.getText() + txt_2.getText() + txt_3.getText() + txt_4.getText() + txt_5.getText()
                + txt_6.getText() + txt_7.getText() + txt_8.getText() + txt_9.getText() + txt_10.getText() + txt_11.getText() + txt_12.getText() + txt_13.getText());

    }

}
