package gui;

import dao.alteracoesDAO;
import dao.BackupDAO;
import dao.conexoesDAO;
import model.alteracoesMODEL;
import model.backupMODEL;
import outros.Letras;
import util.Util;
import vo.alteracoesVO;
import vo.BackupVO;
import vo.conexoesVO;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Windows
 */
public class newCadConexoes extends javax.swing.JInternalFrame {

    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private JDesktopPane desktop;
    private cadconexoes conexao;
    private buscarVersao versao;
    public static String urlCliente = "";

    public newCadConexoes(int codConex, JDesktopPane desktop, int i, cadconexoes d) {
        this.desktop = desktop;
        conexao = d;
        initComponents();
        filtroLetras();
        Esc();
        atualizaTabela();
        listaInicialAlteracoes();
        versao = new buscarVersao();
        if (i == 1) {
            consultar(codConex);
            consultarInfoBackup(codConex);
        }

    }
    List<alteracoesVO> lista = new ArrayList<alteracoesVO>();

    List<BackupVO> lista1 = new ArrayList<BackupVO>();

    private void filtroLetras() {
        txt_cidade.setDocument(new Letras());
        txt_tecnico.setDocument(new Letras());
        txt_filtrar.setDocument(new Letras());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_cidade = new javax.swing.JLabel();
        txt_cidade = new javax.swing.JTextField();
        lb_codigo = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        bt_cancelar = new javax.swing.JButton();
        bt_salvar = new javax.swing.JButton();
        bt_conectar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txt_ip = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        lb_usuario = new javax.swing.JLabel();
        lb_senha = new javax.swing.JLabel();
        cb_conexao = new javax.swing.JComboBox<>();
        lb_tpConexao = new javax.swing.JLabel();
        txt_febraban = new javax.swing.JTextField();
        lb_febraban = new javax.swing.JLabel();
        txt_senha = new javax.swing.JTextField();
        txt_versao = new javax.swing.JTextField();
        bt_buscarVersao = new javax.swing.JButton();
        lb_tecResp = new javax.swing.JLabel();
        txt_TecResp = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_alteracoes = new javax.swing.JTable();
        lb_tecnico = new javax.swing.JLabel();
        txt_tecnico = new javax.swing.JTextField();
        lb_alteracao = new javax.swing.JLabel();
        txt_alteracao = new javax.swing.JTextField();
        bt_dataatual = new javax.swing.JButton();
        bt_adicionar = new javax.swing.JButton();
        bt_remover = new javax.swing.JButton();
        txt_data = new javax.swing.JTextField();
        txt_filtrar = new javax.swing.JTextField();
        bt_filtrar = new javax.swing.JButton();
        bt_visualizarAlteracao = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lb_contato = new javax.swing.JLabel();
        txt_contato = new javax.swing.JTextField();
        lb_telefone = new javax.swing.JLabel();
        txt_telefone = new javax.swing.JTextField();
        lb_email = new javax.swing.JLabel();
        txt_email1 = new javax.swing.JTextField();
        txt_email2 = new javax.swing.JTextField();
        txt_telefone1 = new javax.swing.JTextField();
        txt_email3 = new javax.swing.JTextField();
        txt_email4 = new javax.swing.JTextField();
        txt_email5 = new javax.swing.JTextField();
        txt_email6 = new javax.swing.JTextField();
        txt_email7 = new javax.swing.JTextField();
        txt_email8 = new javax.swing.JTextField();
        txt_telefone2 = new javax.swing.JTextField();
        txt_telefone3 = new javax.swing.JTextField();
        txt_telefone4 = new javax.swing.JTextField();
        txt_telefone5 = new javax.swing.JTextField();
        txt_telefone6 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        gsan_IeExterno = new javax.swing.JButton();
        gsan_IeInterno = new javax.swing.JButton();
        txt_gsanInterno = new javax.swing.JTextField();
        txt_gsanExterno = new javax.swing.JTextField();
        lb_gsan = new javax.swing.JLabel();
        lb_gestor = new javax.swing.JLabel();
        txt_gestorInterno = new javax.swing.JTextField();
        txt_gestorExterno = new javax.swing.JTextField();
        gestor_IeExterno = new javax.swing.JButton();
        gestor_IeInterno = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txt_buscarConfigBackup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfUsuarioBackup = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfSenhaBackup = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfDatabaseBackup = new javax.swing.JTextField();
        tfHostComputadorBackup = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfPortaBackup = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfCaminhoBackup = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfCaminhoJavaBackup = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfCaminhoPGDUMPBackup = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfCaminhoJarBackup = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfHostNameNuvemBackup = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfNomeDiretorioNuvemBackup = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbTipoServidorBackup = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        tfHoraExecucaoBackup = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        tfQtdDiasBackupNuvem = new javax.swing.JTextField();
        txt_buscarConfigBackup1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Cidades");

        lb_cidade.setText("Cidade: ");

        lb_codigo.setText("Código: ");

        txt_codigo.setEditable(false);
        txt_codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        bt_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cancel_16x16.png"))); // NOI18N
        bt_cancelar.setText("Cancelar");
        bt_cancelar.setPreferredSize(new java.awt.Dimension(95, 30));
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarActionPerformed(evt);
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

        bt_conectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Picture_16x16.png"))); // NOI18N
        bt_conectar.setText("Conectar");
        bt_conectar.setPreferredSize(new java.awt.Dimension(97, 30));
        bt_conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_conectarActionPerformed(evt);
            }
        });

        jLabel10.setText("IP: ");

        lb_usuario.setText("Usuário: ");

        lb_senha.setText("Senha: ");

        cb_conexao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Team Viewer", "Windows" }));

        lb_tpConexao.setText("Tipo de Conexão: ");

        lb_febraban.setText("Febraban: ");

        txt_versao.setEditable(false);

        bt_buscarVersao.setText("Buscar Versão");
        bt_buscarVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_buscarVersaoActionPerformed(evt);
            }
        });

        lb_tecResp.setText("Téc. Resp.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lb_tpConexao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_conexao, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(lb_senha)
                            .addComponent(lb_usuario)
                            .addComponent(lb_febraban)
                            .addComponent(lb_tecResp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_senha)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(txt_ip)
                            .addComponent(txt_febraban)
                            .addComponent(txt_TecResp))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(bt_buscarVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_versao, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_tpConexao)
                    .addComponent(cb_conexao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_versao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_buscarVersao))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_febraban)
                    .addComponent(txt_febraban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_usuario)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_tecResp)
                    .addComponent(txt_TecResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(363, 363, 363)
                .addComponent(lb_senha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Principal", jPanel1);

        tb_alteracoes.setModel(new alteracoesMODEL(lista));
        jScrollPane2.setViewportView(tb_alteracoes);

        lb_tecnico.setText("Técnico: ");

        lb_alteracao.setText("Alteração: ");

        txt_alteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alteracaoActionPerformed(evt);
            }
        });

        bt_dataatual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Calendar_16x16.png"))); // NOI18N
        bt_dataatual.setText("Agora");
        bt_dataatual.setPreferredSize(new java.awt.Dimension(61, 30));
        bt_dataatual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dataatualActionPerformed(evt);
            }
        });

        bt_adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Add_16x16.png"))); // NOI18N
        bt_adicionar.setText("Adicionar");
        bt_adicionar.setPreferredSize(new java.awt.Dimension(73, 30));
        bt_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_adicionarActionPerformed(evt);
            }
        });

        bt_remover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Remove_16x16.png"))); // NOI18N
        bt_remover.setText("Remover");
        bt_remover.setPreferredSize(new java.awt.Dimension(73, 30));
        bt_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_removerActionPerformed(evt);
            }
        });

        txt_data.setEditable(false);
        txt_data.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        bt_filtrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search_16x16.png"))); // NOI18N
        bt_filtrar.setText("Filtrar");
        bt_filtrar.setPreferredSize(new java.awt.Dimension(73, 30));
        bt_filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_filtrarActionPerformed(evt);
            }
        });

        bt_visualizarAlteracao.setText("Visualizar");
        bt_visualizarAlteracao.setPreferredSize(new java.awt.Dimension(73, 30));
        bt_visualizarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_visualizarAlteracaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lb_alteracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_alteracao))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lb_tecnico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_filtrar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_data, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_dataatual, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(bt_filtrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_remover, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(bt_visualizarAlteracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_tecnico)
                    .addComponent(txt_tecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_alteracao)
                    .addComponent(txt_alteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_dataatual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_remover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_visualizarAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ultimas Alterações ", jPanel2);

        lb_contato.setText("Contato: ");

        lb_telefone.setText("Telefone: ");

        lb_email.setText("E-mail: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_email1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_email2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_email5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_email6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lb_email)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_contato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_contato, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_telefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefone3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefone5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefone6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefone4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_email3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_email4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_email7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_email8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_contato)
                    .addComponent(txt_contato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_telefone)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_telefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_telefone3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_telefone4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_telefone5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_telefone6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(lb_email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_email2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_email5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_email6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_email3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_email4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_email7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_email8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Contatos", jPanel3);

        gsan_IeExterno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Globe_16x16.png"))); // NOI18N
        gsan_IeExterno.setPreferredSize(new java.awt.Dimension(37, 30));
        gsan_IeExterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gsan_IeExternoActionPerformed(evt);
            }
        });

        gsan_IeInterno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Globe_16x16.png"))); // NOI18N
        gsan_IeInterno.setPreferredSize(new java.awt.Dimension(37, 30));
        gsan_IeInterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gsan_IeInternoActionPerformed(evt);
            }
        });

        txt_gsanInterno.setToolTipText("Link Interno");

        txt_gsanExterno.setToolTipText("Link Externo");

        lb_gsan.setText("Gsan: ");

        lb_gestor.setText("Gestor: ");

        txt_gestorInterno.setToolTipText("Link Interno");

        txt_gestorExterno.setToolTipText("Link Externo");

        gestor_IeExterno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Globe_16x16.png"))); // NOI18N
        gestor_IeExterno.setPreferredSize(new java.awt.Dimension(37, 30));
        gestor_IeExterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestor_IeExternoActionPerformed(evt);
            }
        });

        gestor_IeInterno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Globe_16x16.png"))); // NOI18N
        gestor_IeInterno.setPreferredSize(new java.awt.Dimension(37, 30));
        gestor_IeInterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestor_IeInternoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_gsanExterno, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_gsan)
                            .addComponent(txt_gsanInterno, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gsan_IeExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gsan_IeInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lb_gestor)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_gestorExterno, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_gestorInterno, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gestor_IeExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gestor_IeInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_gsan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gsan_IeInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_gsanInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gsan_IeExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_gsanExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(lb_gestor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gestor_IeInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_gestorInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(gestor_IeExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_gestorExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Observações", jPanel4);

        txt_buscarConfigBackup.setText("Buscar Informações Remotas");
        txt_buscarConfigBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarConfigBackupActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuário:");

        jLabel2.setText("Senha:");

        jLabel3.setText("Database:");

        jLabel5.setText("Host:");

        jLabel6.setText("Porta:");

        jLabel4.setText("Caminho Backup:");

        jLabel7.setText("Caminho Java:");

        jLabel8.setText("Caminho PGDUMP:");

        jLabel9.setText("Caminho JAR:");

        jLabel11.setText("Hostname Nuvem:");

        jLabel12.setText("Diretório Nuvem:");

        jLabel13.setText("Tipo:");

        cbTipoServidorBackup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "DreamHost", "FTP" }));

        jLabel14.setText("Hora Execução:");

        tfHoraExecucaoBackup.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance())));
        tfHoraExecucaoBackup.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel15.setText("Qtd Dias:");

        txt_buscarConfigBackup1.setText("Atualizar Informações Remotamente");
        txt_buscarConfigBackup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarConfigBackup1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel14)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(tfUsuarioBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)
                                        .addGap(28, 28, 28))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(tfHostComputadorBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addGap(12, 12, 12)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfSenhaBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDatabaseBackup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(tfHoraExecucaoBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(tfQtdDiasBackupNuvem)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPortaBackup)
                            .addComponent(cbTipoServidorBackup, 0, 115, Short.MAX_VALUE))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txt_buscarConfigBackup1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_buscarConfigBackup))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfCaminhoBackup, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                                .addComponent(tfHostNameNuvemBackup)
                                .addComponent(tfCaminhoPGDUMPBackup)
                                .addComponent(tfCaminhoJavaBackup)
                                .addComponent(tfCaminhoJarBackup)
                                .addComponent(tfNomeDiretorioNuvemBackup)))
                        .addContainerGap(47, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUsuarioBackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfSenhaBackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfPortaBackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfDatabaseBackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(cbTipoServidorBackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfHostComputadorBackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tfHoraExecucaoBackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(tfQtdDiasBackupNuvem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(tfCaminhoBackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(tfCaminhoJavaBackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCaminhoPGDUMPBackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCaminhoJarBackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfHostNameNuvemBackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNomeDiretorioNuvemBackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscarConfigBackup)
                    .addComponent(txt_buscarConfigBackup1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Backup", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_cidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_codigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bt_conectar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cidade)
                    .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_codigo)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_conectar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarActionPerformed
        salvar();
        limparCampos();
        ultimoCodigo();
        conexao.atualizaTabela();
        conexao.listaInicial();

        this.dispose();
    }//GEN-LAST:event_bt_salvarActionPerformed

    private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bt_cancelarActionPerformed

    private void bt_conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_conectarActionPerformed
        conexao.conexao();

    }//GEN-LAST:event_bt_conectarActionPerformed

    private void gsan_IeInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gsan_IeInternoActionPerformed
        gsan_Interno();
    }//GEN-LAST:event_gsan_IeInternoActionPerformed

    private void gsan_IeExternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gsan_IeExternoActionPerformed
        gsan_Externo();
    }//GEN-LAST:event_gsan_IeExternoActionPerformed

    private void gestor_IeInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestor_IeInternoActionPerformed
        gestorInterno();
    }//GEN-LAST:event_gestor_IeInternoActionPerformed

    private void gestor_IeExternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestor_IeExternoActionPerformed
        gestorExterno();
    }//GEN-LAST:event_gestor_IeExternoActionPerformed

    private void bt_dataatualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dataatualActionPerformed
        run();
    }//GEN-LAST:event_bt_dataatualActionPerformed

    private void bt_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_adicionarActionPerformed
        salvarAlteracoes();
    }//GEN-LAST:event_bt_adicionarActionPerformed

    private void bt_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_removerActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Tem Certeza Que Deseja Excluir o Cadastro? ", " Exclusão ",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (i == JOptionPane.YES_OPTION) {

            int linha = tb_alteracoes.getSelectedRow();

            if (!tb_alteracoes.isRowSelected(linha)) {
                JOptionPane.showMessageDialog(this, " Nenhum cadastro foi selecionado. Selecione "
                        + "um cadastro primeiro para fazer a exclusão ");
            } else {

                excluirAlteracao();
                listaInicialAlteracoes();
                atualizaTabela();
            }
        }
    }//GEN-LAST:event_bt_removerActionPerformed

    private void bt_filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_filtrarActionPerformed
        atualizaTabela();
        listaInicialAlteracoes();
        listaFiltrada();
        txt_filtrar.setText("");
    }//GEN-LAST:event_bt_filtrarActionPerformed

    private void bt_visualizarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_visualizarAlteracaoActionPerformed
        visualizarAlteracao();
    }//GEN-LAST:event_bt_visualizarAlteracaoActionPerformed

    private void txt_alteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alteracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alteracaoActionPerformed

    private void bt_buscarVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_buscarVersaoActionPerformed
        AtualizarVersao();
    }//GEN-LAST:event_bt_buscarVersaoActionPerformed

    private void txt_buscarConfigBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarConfigBackupActionPerformed
        listaBackup();
    }//GEN-LAST:event_txt_buscarConfigBackupActionPerformed

    private void txt_buscarConfigBackup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarConfigBackup1ActionPerformed
        salvaInformacoesRemotamente();
    }//GEN-LAST:event_txt_buscarConfigBackup1ActionPerformed

    private void salvaInformacoesRemotamente(){
        BackupDAO backupDAO = new BackupDAO();
        BackupVO backup = fillBackup();
        try {
            backupDAO.saveOrUpdateRemotamente(backup, retornaIP());
            JOptionPane.showMessageDialog(null, "Informações remotas atualizadas com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar informações do backup remotamente! Detalhe: "+ex.getLocalizedMessage(), "Erro ao salvar", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void atualizaTabelaBackup() {
        //((AbstractTableModel) tb_backup.getModel()).fireTableDataChanged();

    }

    public void listaBackup() {        
        String ip = retornaIP();
        BackupDAO backupDAO = new BackupDAO();
        BackupVO backup = backupDAO.consultarDadosBackup(ip);
        if (backup != null){
            fillInformacoesBackup(backup);
        }
    }
    
    private String retornaIP(){
        String ip = null;
        if (txt_gsanInterno.getText().isEmpty()) {
            String valor = txt_gsanExterno.getText();
            ip = valor.substring(7, valor.indexOf(Matcher.quoteReplacement(":"), 7));
        } else {
            String valor = txt_gsanInterno.getText();
            ip = valor.substring(7, valor.indexOf(Matcher.quoteReplacement(":"), 7));
        }
        return ip;
    }
    
    private void fillInformacoesBackup(BackupVO backup){
        tfUsuarioBackup.setText(backup.getUsuarioBD());
        tfSenhaBackup.setText(backup.getSenhaBD());
        if (backup.getPort() == null){
            tfPortaBackup.setText("5432");
        }else{
            tfPortaBackup.setText(String.valueOf(backup.getPort()));
        }
        tfHostComputadorBackup.setText(backup.getHost());
        tfDatabaseBackup.setText(backup.getDatabase());
        if (backup.getTpServidor() == null){
            cbTipoServidorBackup.setSelectedItem(1);
        }else{
            cbTipoServidorBackup.setSelectedIndex(backup.getTpServidor());
        }
        tfHoraExecucaoBackup.setText(new SimpleDateFormat("HH:mm:ss").format(backup.getHoraExecucaoBackup()));
        if (backup.getQtdDiasBackupNuvem() == null || backup.getQtdDiasBackupNuvem() == 0){
            tfQtdDiasBackupNuvem.setText("9999");
        }else{
            tfQtdDiasBackupNuvem.setText(String.valueOf(backup.getQtdDiasBackupNuvem()));
        }
        tfHostNameNuvemBackup.setText(backup.getHostNameNuvem());
        tfCaminhoBackup.setText(backup.getPathCaminho());
        tfCaminhoJarBackup.setText(backup.getCaminhoJar());
        tfCaminhoJavaBackup.setText(backup.getCaminhoJava());
        tfCaminhoPGDUMPBackup.setText(backup.getCaminhoPGDUMP());
        tfNomeDiretorioNuvemBackup.setText(backup.getNomeDiretorioNuvem());
       
    }
    
//    public void redimensionarColunasBackup(){
//        tb_backup.getColumnModel().getColumn(0).setPreferredWidth(80);   //dbcfg_id
//        tb_backup.getColumnModel().getColumn(1).setPreferredWidth(120);   //dbcfg_usuariobd
//        tb_backup.getColumnModel().getColumn(2).setPreferredWidth(120);   //dbcfg_senhabd
//        tb_backup.getColumnModel().getColumn(3).setPreferredWidth(120);   //dbcfg_database
//        tb_backup.getColumnModel().getColumn(4).setPreferredWidth(120);   //dbcfg_host
//        tb_backup.getColumnModel().getColumn(5).setPreferredWidth(120);   //dbcfg_port
//        tb_backup.getColumnModel().getColumn(6).setPreferredWidth(200);   //dbcfg_pathcaminho
//        tb_backup.getColumnModel().getColumn(7).setPreferredWidth(350);   //dbcfg_caminhojava
//        tb_backup.getColumnModel().getColumn(8).setPreferredWidth(350);   //dbcfg_caminhopgdump
//        tb_backup.getColumnModel().getColumn(9).setPreferredWidth(350);   //dbcfg_caminhosendhostjar
//        tb_backup.getColumnModel().getColumn(10).setPreferredWidth(120);   //dbcfg_horaexecucaobackup
//        tb_backup.getColumnModel().getColumn(11).setPreferredWidth(120);   //dbcfg_tpservidor
//        tb_backup.getColumnModel().getColumn(12).setPreferredWidth(250);   //dbcfg_hostnamenuvem
//        tb_backup.getColumnModel().getColumn(13).setPreferredWidth(250);   //dbcfg_nomediretorionuvem
//        tb_backup.getColumnModel().getColumn(14).setPreferredWidth(200);   //dbcfg_qtdiasbackupnuvem
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_adicionar;
    private javax.swing.JButton bt_buscarVersao;
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_conectar;
    private javax.swing.JButton bt_dataatual;
    private javax.swing.JButton bt_filtrar;
    private javax.swing.JButton bt_remover;
    private javax.swing.JButton bt_salvar;
    private javax.swing.JButton bt_visualizarAlteracao;
    private javax.swing.JComboBox<String> cbTipoServidorBackup;
    private javax.swing.JComboBox<String> cb_conexao;
    private javax.swing.JButton gestor_IeExterno;
    private javax.swing.JButton gestor_IeInterno;
    private javax.swing.JButton gsan_IeExterno;
    private javax.swing.JButton gsan_IeInterno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lb_alteracao;
    private javax.swing.JLabel lb_cidade;
    private javax.swing.JLabel lb_codigo;
    private javax.swing.JLabel lb_contato;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_febraban;
    private javax.swing.JLabel lb_gestor;
    private javax.swing.JLabel lb_gsan;
    private javax.swing.JLabel lb_senha;
    private javax.swing.JLabel lb_tecResp;
    private javax.swing.JLabel lb_tecnico;
    private javax.swing.JLabel lb_telefone;
    private javax.swing.JLabel lb_tpConexao;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JTable tb_alteracoes;
    private javax.swing.JTextField tfCaminhoBackup;
    private javax.swing.JTextField tfCaminhoJarBackup;
    private javax.swing.JTextField tfCaminhoJavaBackup;
    private javax.swing.JTextField tfCaminhoPGDUMPBackup;
    private javax.swing.JTextField tfDatabaseBackup;
    private javax.swing.JFormattedTextField tfHoraExecucaoBackup;
    private javax.swing.JTextField tfHostComputadorBackup;
    private javax.swing.JTextField tfHostNameNuvemBackup;
    private javax.swing.JTextField tfNomeDiretorioNuvemBackup;
    private javax.swing.JTextField tfPortaBackup;
    private javax.swing.JTextField tfQtdDiasBackupNuvem;
    private javax.swing.JTextField tfSenhaBackup;
    private javax.swing.JTextField tfUsuarioBackup;
    private javax.swing.JTextField txt_TecResp;
    private javax.swing.JTextField txt_alteracao;
    private javax.swing.JButton txt_buscarConfigBackup;
    private javax.swing.JButton txt_buscarConfigBackup1;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_contato;
    private javax.swing.JTextField txt_data;
    private javax.swing.JTextField txt_email1;
    private javax.swing.JTextField txt_email2;
    private javax.swing.JTextField txt_email3;
    private javax.swing.JTextField txt_email4;
    private javax.swing.JTextField txt_email5;
    private javax.swing.JTextField txt_email6;
    private javax.swing.JTextField txt_email7;
    private javax.swing.JTextField txt_email8;
    private javax.swing.JTextField txt_febraban;
    private javax.swing.JTextField txt_filtrar;
    private javax.swing.JTextField txt_gestorExterno;
    private javax.swing.JTextField txt_gestorInterno;
    private javax.swing.JTextField txt_gsanExterno;
    private javax.swing.JTextField txt_gsanInterno;
    private javax.swing.JTextField txt_ip;
    private javax.swing.JTextField txt_senha;
    private javax.swing.JTextField txt_tecnico;
    private javax.swing.JTextField txt_telefone;
    private javax.swing.JTextField txt_telefone1;
    private javax.swing.JTextField txt_telefone2;
    private javax.swing.JTextField txt_telefone3;
    private javax.swing.JTextField txt_telefone4;
    private javax.swing.JTextField txt_telefone5;
    private javax.swing.JTextField txt_telefone6;
    private javax.swing.JTextField txt_usuario;
    private javax.swing.JTextField txt_versao;
    // End of variables declaration//GEN-END:variables

    public void salvar() {
        conexoesVO conexVO = new conexoesVO();

        /*1*/ conexVO.setCd_codigo(Integer.parseInt(txt_codigo.getText()));
        /*2*/ conexVO.setCt_contato(txt_contato.getText());
        /*3*/ conexVO.setE_email1((String) txt_email1.getText());
        /*4*/ conexVO.setE_email2((String) txt_email2.getText());
        /*5*/ conexVO.setE_email3((String) txt_email3.getText());
        /*6*/ conexVO.setE_email4((String) txt_email4.getText());
        /*7*/ conexVO.setE_email5((String) txt_email5.getText());
        /*8*/ conexVO.setE_email6((String) txt_email6.getText());
        /*9*/ conexVO.setE_email7((String) txt_email7.getText());
        /*10*/ conexVO.setE_email8((String) txt_email8.getText());
        /*11*/ conexVO.setFb_febraban((String) txt_febraban.getText());
        /*12*/ conexVO.setGestor_externo((String) txt_gestorExterno.getText());
        /*13*/ conexVO.setGestor_interno((String) txt_gestorInterno.getText());
        /*14*/ conexVO.setGsan_externo((String) txt_gsanExterno.getText());
        /*15*/ conexVO.setGsan_interno((String) txt_gsanInterno.getText());
        /*16*/ conexVO.setIp_ip((String) txt_ip.getText());
        /*17*/ conexVO.setNm_cidade((String) txt_cidade.getText());
        /*18*/ conexVO.setSn_senha((String) txt_senha.getText());
        /*19*/ conexVO.setTf_telefone((String) txt_telefone.getText());
        /*20*/ conexVO.setTf_telefone1((String) txt_telefone1.getText());
        /*21*/ conexVO.setTf_telefone2((String) txt_telefone2.getText());
        /*22*/ conexVO.setTf_telefone3((String) txt_telefone3.getText());
        /*23*/ conexVO.setTf_telefone4((String) txt_telefone4.getText());
        /*24*/ conexVO.setTf_telefone5((String) txt_telefone5.getText());
        /*25*/ conexVO.setTf_telefone6((String) txt_telefone6.getText());
        /*26*/
        conexVO.setTec_resp((String) txt_TecResp.getText());
        /*27*/ conexVO.setUs_usuario((String) txt_usuario.getText());

        if (cb_conexao.getSelectedIndex() == 0) {
            conexVO.setTp_conexao("Team Viewer");
        } else if (cb_conexao.getSelectedIndex() == 1) {
            conexVO.setTp_conexao("Windows");
        }
       
        BackupVO backup = fillBackup();        
        conexoesDAO conexao = new conexoesDAO();
        if (conexao.salvar(conexVO)){
            BackupDAO backupDAO = new BackupDAO();
            try {
                backupDAO.saveOrUpdate(backup);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível salvar informações do backup! Detalhe: "+ex.getLocalizedMessage(), "Erro ao salvar", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private BackupVO fillBackup(){
        BackupVO backup = new BackupVO();
        backup.setIdConexao(Integer.parseInt(txt_codigo.getText()));
        backup.setUsuarioBD(tfUsuarioBackup.getText().trim());
        backup.setSenhaBD(tfSenhaBackup.getText());
        backup.setPort(Integer.parseInt(tfPortaBackup.getText()));
        backup.setHost(tfHostComputadorBackup.getText().trim());
        backup.setDatabase(tfDatabaseBackup.getText());
        backup.setTpServidor(cbTipoServidorBackup.getSelectedIndex());
        backup.setHoraExecucaoBackup(Util.converteHoraParaDate(tfHoraExecucaoBackup.getText()));
        backup.setQtdDiasBackupNuvem(Integer.parseInt(tfQtdDiasBackupNuvem.getText()));
        backup.setNomeDiretorioNuvem(tfNomeDiretorioNuvemBackup.getText());
        backup.setHostNameNuvem(tfHostNameNuvemBackup.getText());
        backup.setPathCaminho(tfCaminhoBackup.getText());
        backup.setCaminhoJar(tfCaminhoJarBackup.getText());
        backup.setCaminhoJava(tfCaminhoJavaBackup.getText());
        backup.setCaminhoPGDUMP(tfCaminhoPGDUMPBackup.getText());
        return backup;
    }
            

    public void ultimoCodigo() {
        int retornaUltimocodigo = new conexoesDAO().retornaProximo();

        txt_codigo.setText(Integer.toString(retornaUltimocodigo));
    }

    public void limparCampos() {
        txt_cidade.setText("");
        txt_contato.setText("");
        txt_email1.setText("");
        txt_email2.setText("");
        txt_email3.setText("");
        txt_email4.setText("");
        txt_email5.setText("");
        txt_email6.setText("");
        txt_email7.setText("");
        txt_email8.setText("");
        txt_febraban.setText("");
        txt_gestorExterno.setText("");
        txt_gestorInterno.setText("");
        txt_gsanExterno.setText("");
        txt_gsanInterno.setText("");
        txt_ip.setText("");
        txt_senha.setText("");
        txt_telefone.setText("");
        txt_telefone1.setText("");
        txt_telefone2.setText("");
        txt_telefone3.setText("");
        txt_telefone4.setText("");
        txt_telefone5.setText("");
        txt_telefone6.setText("");
        txt_usuario.setText("");
        txt_TecResp.setText("");

    }

    public void atualizarLista() {
        cadconexoes cc = new cadconexoes(desktop, this);
        cc.atualizaTabela();
        cc.listaInicial();

    }

    private void consultar(int codProdu) {
        conexoesVO pVO = new conexoesDAO().consultar(codProdu);

        txt_codigo.setText(Integer.toString(pVO.getCd_codigo()));
        txt_cidade.setText(pVO.getNm_cidade());
        txt_contato.setText(pVO.getCt_contato());
        txt_email1.setText(pVO.getE_email1());
        txt_email2.setText(pVO.getE_email2());
        txt_email3.setText(pVO.getE_email3());
        txt_email4.setText(pVO.getE_email4());
        txt_email5.setText(pVO.getE_email5());
        txt_email6.setText(pVO.getE_email6());
        txt_email7.setText(pVO.getE_email7());
        txt_email8.setText(pVO.getE_email8());
        txt_febraban.setText(pVO.getFb_febraban());
        txt_gestorExterno.setText(pVO.getGestor_externo());
        txt_gestorInterno.setText(pVO.getGestor_interno());
        txt_gsanExterno.setText(pVO.getGsan_externo());
        txt_gsanInterno.setText(pVO.getGsan_interno());
        txt_ip.setText(pVO.getIp_ip());
        txt_senha.setText(pVO.getSn_senha());
        txt_usuario.setText(pVO.getUs_usuario());
        txt_telefone.setText(pVO.getTf_telefone());
        txt_telefone1.setText(pVO.getTf_telefone1());
        txt_telefone2.setText(pVO.getTf_telefone2());
        txt_telefone3.setText(pVO.getTf_telefone3());
        txt_telefone4.setText(pVO.getTf_telefone4());
        txt_telefone5.setText(pVO.getTf_telefone5());
        txt_telefone6.setText(pVO.getTf_telefone6());
        txt_TecResp.setText(pVO.getTec_resp());
        if (pVO.getTp_conexao().equals((String) "Team Viewer")) {
            cb_conexao.setSelectedIndex(0);
        } else if (pVO.getTp_conexao().equals((String) "Windows")) {
            cb_conexao.setSelectedIndex(1);
        }
    }
    
    private void consultarInfoBackup(Integer codigoConexao){
        BackupDAO backupDAO = new BackupDAO();
        try {
            BackupVO  backup = backupDAO.find(codigoConexao);
            if (backup != null){
                fillInformacoesBackup(backup);
            }
        } catch (SQLException ex) {
        }
    }

    public void gsan_Interno() {
        Desktop desktop = null;
        desktop = Desktop.getDesktop();
        URI uri = null;

        if (txt_gsanInterno.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Link inválido ");
        } else {
            try {
                uri = new URI(txt_gsanInterno.getText().trim());
                desktop.browse(uri);
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
        }
    }

    public void gsan_Externo() {
        Desktop desktop = null;
        desktop = Desktop.getDesktop();
        URI uri = null;

        if (txt_gsanExterno.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Link inválido ");
        } else {
            try {
                uri = new URI(txt_gsanExterno.getText().trim());
                desktop.browse(uri);
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
        }
    }

    public void gestorInterno() {
        Desktop desktop = null;
        desktop = Desktop.getDesktop();
        URI uri = null;
        if (txt_gestorInterno.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Link inválido ");
        } else {
            try {
                uri = new URI(txt_gestorInterno.getText().trim());
                desktop.browse(uri);
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
        }
    }

    public void gestorExterno() {
        Desktop desktop = null;
        desktop = Desktop.getDesktop();
        URI uri = null;
        if (txt_gestorExterno.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Link inválido ");
        } else {
            try {
                uri = new URI(txt_gestorExterno.getText().trim());
                desktop.browse(uri);
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
        }
    }
//-------------------------------------------------------------------------------------------------------------------

    public void salvarAlteracoes() {
        if (txt_alteracao.getText() == ""
                || txt_alteracao.getText().isEmpty()
                || txt_data.getText() == ""
                || txt_data.getText().isEmpty()
                || txt_tecnico.getText() == ""
                || txt_tecnico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por Favor, preencha todas as informações acima.");
        } else {
            alteracoesVO alterVO = new alteracoesVO();

            /*1*/ alterVO.setCd_cadastro(Integer.parseInt(txt_codigo.getText()));
            /*2*/ alterVO.setDs_alteracao(txt_alteracao.getText());
            /*3*/ alterVO.setNm_tecnico(txt_tecnico.getText());

            int retornaUltimocodigo = new alteracoesDAO().retornaProximo();

            /*4*/ alterVO.setCd_alteracao(retornaUltimocodigo);

            try {
                alterVO.setDt_data(df.parse(txt_data.getText()));
            } catch (ParseException p) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                txt_data.setText(sdf.format(new Date()));
                p.printStackTrace();

            } catch (Exception e) {
                e.printStackTrace();
            }

            new alteracoesDAO().salvar(alterVO);
            LimparCamposAlteracoes();
            atualizaTabela();
            listaInicialAlteracoes();
        }
    }
//------------------------------------------------------------------------------------------------------------

    public void LimparCamposAlteracoes() {
        txt_alteracao.setText("");
        txt_tecnico.setText("");
        txt_data.setText("");
    }

//----------------------------------------------------------------------------------------------------------
    public void listaInicialAlteracoes() {
        lista.clear();
        lista.addAll(new alteracoesDAO().exibirBanco(txt_codigo.getText()));

    }
//-------------------------------------------------------------------------------------------------------------

    public void listaFiltrada() {
        lista.clear();
        lista.addAll(new alteracoesDAO().filtrarBanco(txt_codigo.getText(), txt_filtrar.getText()));

    }
//-------------------------------------------------------------------------------------------------------------    

    public void atualizaTabela() {
        ((AbstractTableModel) tb_alteracoes.getModel()).fireTableDataChanged();

    }
//-------------------------------------------------------------------------------------------------------------

    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        txt_data.setText(sdf.format(new Date()));
    }
//---------------------------------------------------------------------------------------------------------

    public void Esc() {

        bt_cancelar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Esc");
        bt_cancelar.getActionMap().put("Esc", new AbstractAction() {

            @Override

            public void actionPerformed(ActionEvent e) {
                fecharTela();
            }
        });
    }
//--------------------------------------------------------------------------------------------------------

    public void fecharTela() {
        this.dispose();
    }

    int codigo;
//-----------------------------------------------------------------------------------------------------------------

    public void excluirAlteracao() {
        //int codigo = Integer.parseInt(txt_codigo.getText());
        int linha = tb_alteracoes.getSelectedRow();
        alteracoesVO p = lista.get(linha);

        if (!new alteracoesDAO().excluir(p.getCd_alteracao())) {
            // mensagem de erro para o usuario
            JOptionPane.showMessageDialog(null, "Impossível excluir cadastro!");
            return;
        } else {

            // mensagem de OK para o usuario
            JOptionPane.showMessageDialog(null, "Cadastro excluido com sucesso!");

        }
    }
//-----------------------------------------------------------------------------------------------------------

    public void visualizarAlteracao() {

        int linha = tb_alteracoes.getSelectedRow();

        if (!tb_alteracoes.isRowSelected(linha)) {
            JOptionPane.showMessageDialog(null, " Nenhum cadastro foi selecionado.");
        } else {
            //       int linha = tbConsulta.getSelectedRow();
            alteracoesVO p = lista.get(linha);

            codigo = p.getCd_alteracao();

            visualizarAlteracao visuAlt = new visualizarAlteracao(codigo, 1);
            desktop.add(visuAlt);
            visuAlt.setVisible(true);
            Util.centralizarTela(desktop, visuAlt);

        }
    }

    public void AtualizarVersao() {

        String interno = txt_gsanInterno.getText().trim();
        String externo = txt_gsanExterno.getText().trim();

        if (interno != null && interno.length() > 0) {
            //usar valor do campo 1
            urlCliente = interno;
            String versaoGsan = versao.Versao(urlCliente);
            txt_versao.setText(versaoGsan);
        } else {
            if (externo != null && externo.length() > 0) {
                urlCliente = externo;
                String versaoGsan = versao.Versao(urlCliente);
                txt_versao.setText(versaoGsan);
            }
        }

        System.out.println(urlCliente);
    }

}
