/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.ListObjectsV2Request;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import dao.BackupDAO;
import dao.conexoesDAO;
import java.awt.Cursor;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import util.Util;
import vo.BackupVO;
import vo.conexoesVO;

/**
 *
 * @author Windows
 */
public class RelatorioBackup extends javax.swing.JDialog {

    private List<conexoesVO> listaConexoes = null;
    private static final String BUCKET_NAME = "backuplogpro";
    
    //private static final String LOGIN_KEY = "DHGFXTAVG7P96AM6SYTS";
    //private static final String SECRET_KEY = "hRxTaktcoVBbHFNjg9YUf7TZCM2tPrPpQRIcfNzi";
    
    private static final String LOGIN_KEY = "AKIAJUGI4BSB4DFZPDHA";
    private static final String SECRET_KEY = "8o3l6ZhINXOaDbJOVh54X0pLKdmT2wuh3HyU7KCbQknzpwksp1+G4xnMgSiq7uZo";
    
    private AWSCredentials credentials = null;
    private AmazonS3 service = null;

    public RelatorioBackup(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initComponent();
    }

    private void initComponent() {
        setLocationRelativeTo(null); //centraliza
        setTitle("Relatório de Backups"); //titulo da tela
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //ao clicar no X, apenas fecha a tela, não encerra a aplicação.
        setResizable(false); //não pode redimensionar
        getRootPane().setDefaultButton(btEmitir); //botão padrão da tela
        btEmitir.requestFocus(); //botão emitir começa com o foco
        radioBackupExistente.setSelected(true); //backup existente começa selecionado
        //data inicial
        Calendar data = Calendar.getInstance();
        data.set(Calendar.DAY_OF_MONTH, data.getActualMaximum(Calendar.DAY_OF_MONTH));
        tfDataFinal.setText(Util.converteDateParaString(data.getTime()));
        data.set(Calendar.DAY_OF_MONTH, data.getActualMinimum(Calendar.DAY_OF_MONTH));
        tfDataInicial.setText(Util.converteDateParaString(data.getTime()));
        //fim
        ButtonGroup group = new ButtonGroup();
        group.add(radioAmbos);
        group.add(radioBackupExistente);
        group.add(radioBackupInexistente);
        loadConexoes();

    }

    private void loadConexoes() {
        conexoesDAO conexoesDAO = new conexoesDAO();
        listaConexoes = conexoesDAO.exibirBanco(null);
        if (listaConexoes != null && !listaConexoes.isEmpty()) {
            cbConexoes.addItem("TODOS");
            for (conexoesVO item : listaConexoes) {
                cbConexoes.addItem(item.getCd_codigo() + " - " + item.getNm_cidade());
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfDataInicial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfDataFinal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbConexoes = new javax.swing.JComboBox<>();
        radioBackupExistente = new javax.swing.JRadioButton();
        radioBackupInexistente = new javax.swing.JRadioButton();
        radioAmbos = new javax.swing.JRadioButton();
        btEmitir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        jLabel1.setText("Data:");

        tfDataInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDataInicial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDataInicialFocusLost(evt);
            }
        });

        jLabel2.setText("Até");

        tfDataFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDataFinal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDataFinalFocusLost(evt);
            }
        });

        jLabel3.setText("Conexão:");

        radioBackupExistente.setText("Backups Existentes");

        radioBackupInexistente.setText("Backups Inexistentes");

        radioAmbos.setText("Ambos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(tfDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbConexoes, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radioBackupExistente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioBackupInexistente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioAmbos)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbConexoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBackupExistente)
                    .addComponent(radioBackupInexistente)
                    .addComponent(radioAmbos)))
        );

        btEmitir.setText("Emitir Relatório");
        btEmitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmitirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btEmitir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEmitir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDataInicialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDataInicialFocusLost
        tfDataInicial.setText(Util.formataData(tfDataInicial.getText()));
    }//GEN-LAST:event_tfDataInicialFocusLost

    private void tfDataFinalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDataFinalFocusLost
        tfDataFinal.setText(Util.formataData(tfDataFinal.getText()));
    }//GEN-LAST:event_tfDataFinalFocusLost

    private void btEmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmitirActionPerformed
        try {
            getRootPane().setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            emitir();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao emitir relatório. Detalhe: " + ex.getLocalizedMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            getRootPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_btEmitirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEmitir;
    private javax.swing.JComboBox<String> cbConexoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioAmbos;
    private javax.swing.JRadioButton radioBackupExistente;
    private javax.swing.JRadioButton radioBackupInexistente;
    private javax.swing.JTextField tfDataFinal;
    private javax.swing.JTextField tfDataInicial;
    // End of variables declaration//GEN-END:variables

    private void emitir() throws SQLException {
        List<Date> listaDatas = new ArrayList<Date>();
        Date dataInicial = Util.converteDate(tfDataInicial.getText());
        Date dataFinal = Util.converteDate(tfDataFinal.getText());
        Calendar calInicial = Calendar.getInstance();
        calInicial.setTime(dataInicial);
        Calendar calFinal = Calendar.getInstance();
        calFinal.setTime(dataFinal);
        
        if (calInicial.equals(calFinal)) {
            listaDatas.add(dataFinal);
        } else {
            listaDatas.add(dataInicial);
            boolean isBuscouTodasDatas = false;
            while (!isBuscouTodasDatas) {
                calInicial.add(Calendar.DAY_OF_MONTH, +1);
                if (calInicial.equals(calFinal)) {
                    isBuscouTodasDatas = true;
                    break;
                }
                listaDatas.add(calInicial.getTime());
            }
            listaDatas.add(dataFinal);
        }
        
        setEndPointConnect();
        Map<conexoesVO, List<Date>> backupsExistentes = new HashMap<>();
        Map<conexoesVO, List<Date>> backupsInexistente = new HashMap<>();
        BackupDAO backupDAO = new BackupDAO();
        List<conexoesVO> listaConexoesRelatorio = new ArrayList();
        
        if (listaConexoes != null && !listaConexoes.isEmpty()) {
            if (cbConexoes.getSelectedIndex() == 0) {
                for (conexoesVO conexao : listaConexoes) {
                    BackupVO backup = backupDAO.find(conexao.getCd_codigo());
                    verificaBackups(backupsExistentes, backupsInexistente, listaDatas, backup, conexao, dataInicial, dataFinal, listaConexoesRelatorio);
                }
            } else {
                conexoesVO conexao = listaConexoes.get(cbConexoes.getSelectedIndex() - 1);
                BackupVO backup = backupDAO.find(conexao.getCd_codigo());
                verificaBackups(backupsExistentes, backupsInexistente, listaDatas, backup, conexao, dataInicial, dataFinal, listaConexoesRelatorio);
            }
        }
        geraRelatorioTxt(backupsExistentes, backupsInexistente, listaConexoesRelatorio);
    }

    private void geraRelatorioTxt(Map<conexoesVO, List<Date>> backupsExistentes, Map<conexoesVO, List<Date>> backupsInexistente, List<conexoesVO> listaConexoes) {
        StringBuilder rel = new StringBuilder();
        String separator = System.getProperty("line.separator");
        Integer qtdExistentes = null;
        Integer qtdInexistentes = null;

        for (conexoesVO conexao : listaConexoes) {
            List<Date> listaDataExistente = backupsExistentes.get(conexao);
            List<Date> listaDataInexistente = backupsInexistente.get(conexao);

            if (listaDataExistente != null || listaDataInexistente != null) {
                rel.append("*").append(Util.preencherString("=", "=", 43, 1)).append("*").append(separator);
                rel.append("|").append(" CONEXÃO: ").append(Util.preencherString(conexao.getNm_cidade().toUpperCase(), " ", 33, 1)).append("|").append(separator);
                rel.append("|").append(" EMISSÃO: ").append(Util.preencherString(Util.converteDateParaString(new Date()), " ", 33, 1)).append("|").append(separator);
                rel.append("*").append(Util.preencherString("=", "=", 43, 1)).append("*").append(separator);
                rel.append("\n");
                rel.append("*").append(Util.preencherString("=", "=", 43, 1)).append("*").append(separator);
                rel.append("|").append("STATUS").append(Util.preencherString(" ", " ", 17, 1)).append("| DATA").append(Util.preencherString(" ", " ", 14, 1)).append("|").append(separator);
                rel.append("|").append(Util.preencherString("-", "-", 43, 1)).append("|").append(separator);

                if (radioBackupExistente.isSelected() || radioAmbos.isSelected()) {
                    if (listaDataExistente != null && !listaDataExistente.isEmpty()) {
                        qtdExistentes = listaDataExistente.size();

                        for (Date data : listaDataExistente) {
                            rel.append("|").append(Util.preencherString("EXISTENTE", " ", 23, 1)).append("|");
                            rel.append(Util.preencherString(Util.converteDateParaString(data), " ", 19, 3)).append("|").append(separator);
                        }
                    }
                }
                if (radioBackupInexistente.isSelected() || radioAmbos.isSelected()) {
                    if (listaDataInexistente != null && !listaDataInexistente.isEmpty()) {
                        qtdInexistentes = listaDataInexistente.size();

                        for (Date data : listaDataInexistente) {
                            rel.append("|").append(Util.preencherString("INEXISTENTE", " ", 23, 1)).append("|");
                            rel.append(Util.preencherString(Util.converteDateParaString(data), " ", 19, 3)).append("|").append(separator);
                        }
                    }
                }
                rel.append("*").append(Util.preencherString("=", "=", 43, 1)).append("*").append(separator);

                if (radioBackupExistente.isSelected() || radioAmbos.isSelected()) {
                    if (qtdExistentes == null) {
                        System.out.println("'qtdExistentes': É nulo");
                        qtdExistentes = 0;
                        rel.append(Util.preencherString("Qtd Existentes: " + qtdExistentes, " ", 45, 3)).append(separator);
                    } else {
                        rel.append(Util.preencherString("Qtd Existentes: " + qtdExistentes, " ", 45, 3)).append(separator);
                    }
                }

                if (radioBackupInexistente.isSelected() || radioAmbos.isSelected()) {
                    if (qtdInexistentes == null) {
                        System.out.println("'qtdInexistentes': É nulo");
                        qtdInexistentes = 0;
                        rel.append(Util.preencherString("Qtd Inexistentes: " + qtdInexistentes, " ", 45, 3)).append(separator);
                    } else {
                        rel.append(Util.preencherString("Qtd Inexistentes: " + qtdInexistentes, " ", 45, 3)).append(separator);
                    }
                }

                qtdExistentes = 0;
                qtdInexistentes = 0;

            }
        }

        System.out.println(rel.toString());
        try {
            String path = Util.saveFileBackup(rel.toString());
            Runtime.getRuntime().exec("notepad.exe " + path);
        } catch (IOException ex) {
        }

    }

    private void verificaBackups(Map<conexoesVO, List<Date>> backupsExistentes, Map<conexoesVO, List<Date>> backupsInexistente, List<Date> listaDatas, BackupVO backup, conexoesVO conexao, Date dataInicial, Date dataFinal, List<conexoesVO> listaConexao) {
        List<Date> listaDataExistente = null;
        List<Date> listaDataInexistente = null;
        
        if (backup != null) {
            listaConexao.add(conexao);
            List<Date> listaDatasBackup = recuperaDatasBackupsServidor(dataInicial, dataFinal, backup.getNomeDiretorioNuvem());
            if (listaDatasBackup != null) {
                for (Date date : listaDatas) {
                    if (listaDatasBackup.contains(date)) {
                        if (listaDataExistente == null) {
                            listaDataExistente = new ArrayList<>();
                        }
                        listaDataExistente.add(date);
                    } else {
                        if (listaDataInexistente == null) {
                            listaDataInexistente = new ArrayList<>();
                        }
                        listaDataInexistente.add(date);
                    }
                }
                backupsExistentes.put(conexao, listaDataExistente);
                backupsInexistente.put(conexao, listaDataInexistente);
            }
        }
    }

    private void setEndPointConnect() {
        System.out.println("Setando credenciais do servidor...");
        credentials = new BasicAWSCredentials(LOGIN_KEY, SECRET_KEY);
        service = new AmazonS3Client(credentials);
        System.out.println("Connectando ao servidor");
        service.setEndpoint("objects-us-east-1.dream.io");
        System.out.println("Conectado.");
    }

    private List<Date> recuperaDatasBackupsServidor(Date dataInicial, Date dataFinal, String prefix) {
        List<Date> listaDatasBackup = null;
        ListObjectsV2Request req = new ListObjectsV2Request().withBucketName(BUCKET_NAME).withPrefix(prefix + "/");
        ListObjectsV2Result result;
        do {
            result = service.listObjectsV2(req);
            for (S3ObjectSummary object : result.getObjectSummaries()) {
                String key = object.getKey();
                if (key.endsWith(".backup") || key.endsWith(".rar") || key.endsWith(".zip")) {
                    if (listaDatasBackup == null) {
                        listaDatasBackup = new ArrayList();
                    }
                    int index = key.indexOf(".");
                    boolean lastIndex = false;
                    while (!lastIndex) {
                        if (key.indexOf(".", index + 1) != -1) {
                            index = key.indexOf(".", index + 1);
                        } else {
                            lastIndex = true;
                        }
                    }
                    String dataString = key.substring(index - 16, index - 6).replace("_", "/"); //10 porque a data estÃ¡ formatada com 10 caracteres Ex: xx_xx_xxxx.
                    System.out.println("dataString " + dataString);
                    Date dataBackup = Util.converteDate(dataString);
                    
                    System.out.println("dataBackup: " + dataBackup);
                    System.out.println("dataInicial: " + dataInicial);
                    System.out.println("dataFinal: " + dataFinal);
                    
                    if ((dataBackup.equals(dataInicial) || dataBackup.equals(dataFinal)) || dataBackup.after(dataInicial) && dataBackup.before(dataFinal)) {
                        listaDatasBackup.add(Util.converteDate(dataString));
                    }
                }
            }
        } while (result.isTruncated());
        return listaDatasBackup;
    }
}
