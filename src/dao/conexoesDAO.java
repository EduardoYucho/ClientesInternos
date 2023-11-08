package dao;

import bd.ConnectionManager;
import vo.conexoesVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class conexoesDAO {

    public List<conexoesVO> exibirBanco(String nomeCidade) {
        List<conexoesVO> lista = new ArrayList<conexoesVO>();
        conexoesVO conexVO;
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            con = new ConnectionManager().getConexao();

            if (nomeCidade != null && !nomeCidade.isEmpty()) {
                st = con.prepareStatement("select * from conexoes where nm_cidade"
                        + " like " + "'%" + nomeCidade + "%' order by nm_cidade");
            } else {
                st = con.prepareStatement("select * From conexoes order by nm_cidade");
            }

            rs = st.executeQuery();

            while (rs.next()) {
                conexVO = new conexoesVO();
                conexVO.setCd_codigo(rs.getInt("cd_codigo"));
                conexVO.setCt_contato(rs.getString("ct_contato"));
                conexVO.setE_email1(rs.getString("e_email1"));
                conexVO.setE_email2(rs.getString("e_email2"));
                conexVO.setE_email3(rs.getString("e_email3"));
                conexVO.setE_email4(rs.getString("e_email4"));
                conexVO.setE_email5(rs.getString("e_email5"));
                conexVO.setE_email6(rs.getString("e_email6"));
                conexVO.setE_email7(rs.getString("e_email7"));
                conexVO.setE_email8(rs.getString("e_email8"));
                conexVO.setFb_febraban(rs.getString("fb_febraban"));
                conexVO.setGestor_externo(rs.getString("gestor_externo"));
                conexVO.setGestor_interno(rs.getString("gestor_interno"));
                conexVO.setGsan_externo(rs.getString("gsan_externo"));
                conexVO.setGsan_interno(rs.getString("gsan_interno"));
                conexVO.setIp_ip(rs.getString("ip_ip"));
                conexVO.setNm_cidade(rs.getString("nm_cidade"));
                conexVO.setSn_senha(rs.getString("sn_senha"));
                conexVO.setTf_telefone(rs.getString("tf_telefone"));
                conexVO.setTf_telefone1(rs.getString("tf_telefone1"));
                conexVO.setTf_telefone2(rs.getString("tf_telefone2"));
                conexVO.setTf_telefone3(rs.getString("tf_telefone3"));
                conexVO.setTf_telefone4(rs.getString("tf_telefone4"));
                conexVO.setTf_telefone5(rs.getString("tf_telefone5"));
                conexVO.setTf_telefone6(rs.getString("tf_telefone6"));
                conexVO.setTp_conexao(rs.getString("tp_conexao"));
                conexVO.setUs_usuario(rs.getString("us_usuario"));
                conexVO.setTec_resp(rs.getString("tec_resp"));
                lista.add(conexVO);

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar Banco! Erro: " + e.toString(), "Atenção",
                    JOptionPane.INFORMATION_MESSAGE);
            return lista;
        } finally {
            try {
                rs.close();
                st.close();
                con.close();
            } catch (Exception e) {

            }

        }
        return lista;

    }
//-------------------------------------------------------------------------------------------------

    public boolean salvar(conexoesVO conexVO) {
        try {
            Connection con = new ConnectionManager().getConexao();
            PreparedStatement st = null;
            if (consultar(conexVO.getCd_codigo()).getCd_codigo() > 0) {
                st = con.prepareStatement("update conexoes set cd_codigo = ?, ct_contato = ?, e_email1 = ?, "
                        + " e_email2 = ?, e_email3 = ?, e_email4 = ?, e_email5 = ?, e_email6 = ?, e_email7 = ?, e_email8 = ?, "
                        + " fb_febraban = ?, gestor_externo = ?, gestor_interno = ?, "
                        + " gsan_externo = ?, gsan_interno = ?, ip_ip = ?, nm_cidade = ?, sn_senha = ?, tf_telefone = ?, "
                        + " tf_telefone1 = ?, tf_telefone2 = ?, tf_telefone3 = ?, tf_telefone4 = ?, tf_telefone5 = ?, tf_telefone6 = ?, tp_conexao = ?, us_usuario = ?, tec_resp = ? "
                        + "where cd_codigo = " + conexVO.getCd_codigo());
            } else {
                st = con.prepareStatement("insert into conexoes(cd_codigo, ct_contato, e_email1, e_email2,e_email3,e_email4,e_email5, "
                        + " e_email6, e_email7, e_email8, fb_febraban, gestor_externo, gestor_interno, "
                        + " gsan_externo, gsan_interno, ip_ip, nm_cidade, sn_senha, tf_telefone, tf_telefone1, tf_telefone2, tf_telefone3, "
                        + " tf_telefone4, tf_telefone5, tf_telefone6, tp_conexao, us_usuario, tec_resp) "
                        + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");
            }
            st.setInt(1, conexVO.getCd_codigo());
            st.setString(2, conexVO.getCt_contato());
            st.setString(3, conexVO.getE_email1());
            st.setString(4, conexVO.getE_email2());
            st.setString(5, conexVO.getE_email3());
            st.setString(6, conexVO.getE_email4());
            st.setString(7, conexVO.getE_email5());
            st.setString(8, conexVO.getE_email6());
            st.setString(9, conexVO.getE_email7());
            st.setString(10, conexVO.getE_email8());
            st.setString(11, conexVO.getFb_febraban());
            st.setString(12, conexVO.getGestor_externo());
            st.setString(13, conexVO.getGestor_interno());
            st.setString(14, conexVO.getGsan_externo());
            st.setString(15, conexVO.getGsan_interno());
            st.setString(16, conexVO.getIp_ip());
            st.setString(17, conexVO.getNm_cidade());
            st.setString(18, conexVO.getSn_senha());
            st.setString(19, conexVO.getTf_telefone());
            st.setString(20, conexVO.getTf_telefone1());
            st.setString(21, conexVO.getTf_telefone2());
            st.setString(22, conexVO.getTf_telefone3());
            st.setString(23, conexVO.getTf_telefone4());
            st.setString(24, conexVO.getTf_telefone5());
            st.setString(25, conexVO.getTf_telefone6());
            st.setString(26, conexVO.getTp_conexao());
            st.setString(27, conexVO.getUs_usuario());
            st.setString(28, conexVO.getTec_resp());
            

            st.executeUpdate();
            st.close();
            con.close();

            ConnectionManager.closeAll(con);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
        return true;
    }
//------------------------------------------------------------------------------------------------

    public conexoesVO consultar(int conexao) {
        conexoesVO conexRetornar = new conexoesVO();

        try {
            Connection con = new ConnectionManager().getConexao();

            PreparedStatement st;
            st = con.prepareStatement("select cd_codigo, ct_contato, e_email1, e_email2, e_email3, e_email4, e_email5, e_email6, e_email7, e_email8,  "
                    + " fb_febraban, gestor_externo, gestor_interno, "
                    + " gsan_externo, gsan_interno, ip_ip, nm_cidade, sn_senha, tf_telefone, "
                    + " tf_telefone1, tf_telefone2, tf_telefone3, tf_telefone4, tf_telefone5, tf_telefone6, tp_conexao, us_usuario, tec_resp "
                    + " from conexoes where cd_codigo = " + conexao);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                conexRetornar.setCd_codigo(rs.getInt("cd_codigo"));
                conexRetornar.setCt_contato(rs.getString("ct_contato"));
                conexRetornar.setE_email1(rs.getString("e_email1"));
                conexRetornar.setE_email2(rs.getString("e_email2"));
                conexRetornar.setE_email3(rs.getString("e_email3"));
                conexRetornar.setE_email4(rs.getString("e_email4"));
                conexRetornar.setE_email5(rs.getString("e_email5"));
                conexRetornar.setE_email6(rs.getString("e_email6"));
                conexRetornar.setE_email7(rs.getString("e_email7"));
                conexRetornar.setE_email8(rs.getString("e_email8"));
                conexRetornar.setFb_febraban(rs.getString("fb_febraban"));
                conexRetornar.setGestor_externo(rs.getString("gestor_externo"));
                conexRetornar.setGestor_interno(rs.getString("gestor_interno"));
                conexRetornar.setGsan_externo(rs.getString("gsan_externo"));
                conexRetornar.setGsan_interno(rs.getString("gsan_interno"));
                conexRetornar.setIp_ip(rs.getString("ip_ip"));
                conexRetornar.setNm_cidade(rs.getString("nm_cidade"));
                conexRetornar.setSn_senha(rs.getString("sn_senha"));
                conexRetornar.setTf_telefone(rs.getString("tf_telefone"));
                conexRetornar.setTf_telefone1(rs.getString("tf_telefone1"));
                conexRetornar.setTf_telefone2(rs.getString("tf_telefone2"));
                conexRetornar.setTf_telefone3(rs.getString("tf_telefone3"));
                conexRetornar.setTf_telefone4(rs.getString("tf_telefone4"));
                conexRetornar.setTf_telefone5(rs.getString("tf_telefone5"));
                conexRetornar.setTf_telefone6(rs.getString("tf_telefone6"));
                conexRetornar.setTp_conexao(rs.getString("tp_conexao"));
                conexRetornar.setUs_usuario(rs.getString("us_usuario"));
                conexRetornar.setTec_resp(rs.getString("tec_resp"));

            } else {
                conexRetornar.setCd_codigo(-1);

            }
            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar Cadastro! Erro: " + e.toString(), "Atenção",
                    JOptionPane.INFORMATION_MESSAGE);
            conexRetornar.setCd_codigo(-2);
        }
        return conexRetornar;

    }
//-------------------------------------------------------------------------------------------------------------

    public int retornaProximo() {
        int codigo = 0;
        try {
            Connection con = new ConnectionManager().getConexao();
            PreparedStatement st;

            st = con.prepareStatement("select max(cd_codigo)from conexoes");

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                codigo = rs.getInt(1) + 1;
            } else {
                codigo = 1;
            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar maior código! Erro: "
                    + ex.toString(), "Atenção", JOptionPane.INFORMATION_MESSAGE);

            return -1;
        }
        return codigo;

    }
//---------------------------------------------------------------------------------------------------------

    public boolean excluir(int codCodigo) {
        try {
            Connection con = new ConnectionManager().getConexao();

            PreparedStatement st = null;

            st = con.prepareStatement("delete from conexoes "
                    + " where cd_codigo = " + codCodigo);

            st.executeUpdate();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Erro ao Excluir! Erro: " + e.toString(),
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

}
