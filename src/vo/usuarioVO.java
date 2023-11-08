package vo;
public class usuarioVO {
    
    private String nm_nome;
    private int cd_codigo;
    private String sn_senha;
    private String tp_usuario;
    private String st_situacao;

    /**
     * @return the nm_nome
     */
    public String getNm_nome() {
        return nm_nome;
    }

    /**
     * @param nm_nome the nm_nome to set
     */
    public void setNm_nome(String nm_nome) {
        this.nm_nome = nm_nome;
    }

    /**
     * @return the cd_codigo
     */
    public int getCd_codigo() {
        return cd_codigo;
    }

    /**
     * @param cd_codigo the cd_codigo to set
     */
    public void setCd_codigo(int cd_codigo) {
        this.cd_codigo = cd_codigo;
    }

    /**
     * @return the sn_senha
     */
    public String getSn_senha() {
        return sn_senha;
    }

    /**
     * @param sn_senha the sn_senha to set
     */
    public void setSn_senha(String sn_senha) {
        this.sn_senha = sn_senha;
    }

    /**
     * @return the tp_usuario
     */
    public String getTp_usuario() {
        return tp_usuario;
    }

    /**
     * @param tp_usuario the tp_usuario to set
     */
    public void setTp_usuario(String tp_usuario) {
        this.tp_usuario = tp_usuario;
    }

    /**
     * @return the st_situacao
     */
    public String getSt_situacao() {
        return st_situacao;
    }

    /**
     * @param st_situacao the st_situacao to set
     */
    public void setSt_situacao(String st_situacao) {
        this.st_situacao = st_situacao;
    }
}
