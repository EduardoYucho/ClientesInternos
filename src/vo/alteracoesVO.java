package vo;

import java.util.Date;



public class alteracoesVO {
 
  private String nm_tecnico;
  private String ds_alteracao;
  private Date dt_data;
  private int cd_cadastro;
  private int cd_alteracao;

    /**
     * @return the nm_tecnico
     */
    public String getNm_tecnico() {
        return nm_tecnico;
    }

    /**
     * @param nm_tecnico the nm_tecnico to set
     */
    public void setNm_tecnico(String nm_tecnico) {
        this.nm_tecnico = nm_tecnico;
    }

    /**
     * @return the ds_alteracao
     */
    public String getDs_alteracao() {
        return ds_alteracao;
    }

    /**
     * @param ds_alteracao the ds_alteracao to set
     */
    public void setDs_alteracao(String ds_alteracao) {
        this.ds_alteracao = ds_alteracao;
    }

    /**
     * @return the dt_data
     */
    public Date getDt_data() {
        return dt_data;
    }

    /**
     * @param dt_data the dt_data to set
     */
    public void setDt_data(Date dt_data) {
        this.dt_data = dt_data;
    }

    /**
     * @return the cd_cadastro
     */
    public int getCd_cadastro() {
        return cd_cadastro;
    }

    /**
     * @param cd_cadastro the cd_cadastro to set
     */
    public void setCd_cadastro(int cd_cadastro) {
        this.cd_cadastro = cd_cadastro;
    }

    /**
     * @return the cd_alteracao
     */
    public int getCd_alteracao() {
        return cd_alteracao;
    }

    /**
     * @param cd_alteracao the cd_alteracao to set
     */
    public void setCd_alteracao(int cd_alteracao) {
        this.cd_alteracao = cd_alteracao;
    }
}