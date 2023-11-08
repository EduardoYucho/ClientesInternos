package vo;

import java.util.Date;

public class BackupVO {

    private Integer id;
    private Integer idConexao;
    private String usuarioBD;
    private String senhaBD;
    private String database;
    private String host;
    private Integer port;
    private String pathCaminho;
    private String caminhoJava;
    private String caminhoPGDUMP;
    private String caminhoJar;
    private Date horaExecucaoBackup;
    private Integer tpServidor;
    private String hostNameNuvem;
    private String nomeDiretorioNuvem;
    private Integer qtdDiasBackupNuvem;

    public BackupVO() {
    }

    public BackupVO(Integer id, String usuarioBD, String senhaBD, String database, String host, Integer port, String pathCaminho, String caminhoJava, String caminhoPGDUMP, String caminhoJar, Date horaExecucaoBackup, Integer tpServidor, String hostNameNuvem, String nomeDiretorioNuvem, Integer qtdDiasBackupNuvem) {
        this.id = id;
        this.usuarioBD = usuarioBD;
        this.senhaBD = senhaBD;
        this.database = database;
        this.host = host;
        this.port = port;
        this.pathCaminho = pathCaminho;
        this.caminhoJava = caminhoJava;
        this.caminhoPGDUMP = caminhoPGDUMP;
        this.caminhoJar = caminhoJar;
        this.horaExecucaoBackup = horaExecucaoBackup;
        this.tpServidor = tpServidor;
        this.hostNameNuvem = hostNameNuvem;
        this.nomeDiretorioNuvem = nomeDiretorioNuvem;
        this.qtdDiasBackupNuvem = qtdDiasBackupNuvem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuarioBD() {
        return usuarioBD;
    }

    public void setUsuarioBD(String usuarioBD) {
        this.usuarioBD = usuarioBD;
    }

    public String getSenhaBD() {
        return senhaBD;
    }

    public void setSenhaBD(String senhaBD) {
        this.senhaBD = senhaBD;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getPathCaminho() {
        return pathCaminho;
    }

    public void setPathCaminho(String pathCaminho) {
        this.pathCaminho = pathCaminho;
    }

    public String getCaminhoJava() {
        return caminhoJava;
    }

    public void setCaminhoJava(String caminhoJava) {
        this.caminhoJava = caminhoJava;
    }

    public String getCaminhoPGDUMP() {
        return caminhoPGDUMP;
    }

    public void setCaminhoPGDUMP(String caminhoPGDUMP) {
        this.caminhoPGDUMP = caminhoPGDUMP;
    }

    public String getCaminhoJar() {
        return caminhoJar;
    }

    public void setCaminhoJar(String caminhoJar) {
        this.caminhoJar = caminhoJar;
    }

    public Date getHoraExecucaoBackup() {
        return horaExecucaoBackup;
    }

    public void setHoraExecucaoBackup(Date horaExecucaoBackup) {
        this.horaExecucaoBackup = horaExecucaoBackup;
    }

    public Integer getTpServidor() {
        return tpServidor;
    }

    public void setTpServidor(Integer tpServidor) {
        this.tpServidor = tpServidor;
    }

    public String getHostNameNuvem() {
        return hostNameNuvem;
    }

    public void setHostNameNuvem(String hostNameNuvem) {
        this.hostNameNuvem = hostNameNuvem;
    }

    public String getNomeDiretorioNuvem() {
        return nomeDiretorioNuvem;
    }

    public void setNomeDiretorioNuvem(String nomeDiretorioNuvem) {
        this.nomeDiretorioNuvem = nomeDiretorioNuvem;
    }

    public Integer getQtdDiasBackupNuvem() {
        return qtdDiasBackupNuvem;
    }

    public void setQtdDiasBackupNuvem(Integer qtdDiasBackupNuvem) {
        this.qtdDiasBackupNuvem = qtdDiasBackupNuvem;
    }

    public void setIdConexao(Integer idConexao) {
        this.idConexao = idConexao;
    }

    public Integer getIdConexao() {
        return idConexao;
    }
    
   
}
