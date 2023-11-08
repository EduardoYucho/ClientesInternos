package dao;

import bd.ConnectionManager;
import vo.ticketVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ticketDAO {

    public List<ticketVO> exibirBanco(String nomeTicket) {
        List<ticketVO> lista = new ArrayList<ticketVO>();
        ticketVO ticketvo;
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            con = new ConnectionManager().getConexao();

            if (nomeTicket != null && !nomeTicket.isEmpty()) {
                st = con.prepareStatement("select * from ticket where ds_solicitacao"
                        + " like " + "'%" + nomeTicket + "%' order by cd_codigo");
            } else {
                st = con.prepareStatement("select * From ticket order by cd_codigo");
            }

            rs = st.executeQuery();

            while (rs.next()) {
                ticketvo = new ticketVO();
                ticketvo.setCd_codigo(rs.getInt("cd_codigo"));
                ticketvo.setCd_cidade(rs.getInt("cd_cidade"));
                ticketvo.setCd_responsavel(0);
                lista.add(ticketvo);

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

    public boolean salvar(ticketVO conexVO) {

        try {

            Connection con = new ConnectionManager().getConexao();
            PreparedStatement st = null;
            if (consultar(conexVO.getCd_codigo()).getCd_codigo() > 0) {
                st = con.prepareStatement("update conexoes set cd_codigo = ?, ct_contato = ?, e_email1 = ?, "
                        + " e_email2 = ?, e_email3 = ?, e_email4 = ?, e_email5 = ?, e_email6 = ?, e_email7 = ?, e_email8 = ?, "
                        + " fb_febraban = ?, gestor_externo = ?, gestor_interno = ?, "
                        + " gsan_externo = ?, gsan_interno = ?, ip_ip = ?, nm_cidade = ?, sn_senha = ?, tf_telefone = ?, "
                        + " tf_telefone1 = ?, tf_telefone2 = ?, tf_telefone3 = ?, tf_telefone4 = ?, tf_telefone5 = ?, tf_telefone6 = ?, tp_conexao = ?, us_usuario = ? "
                        + "where cd_codigo = " + conexVO.getCd_codigo());
            } else {
                st = con.prepareStatement("insert into conexoes(cd_codigo, ct_contato, e_email1, e_email2,e_email3,e_email4,e_email5, "
                        + " e_email6, e_email7, e_email8, fb_febraban, gestor_externo, gestor_interno, "
                        + " gsan_externo, gsan_interno, ip_ip, nm_cidade, sn_senha, tf_telefone, tf_telefone1, tf_telefone2, tf_telefone3, "
                        + " tf_telefone4, tf_telefone5, tf_telefone6, tp_conexao, us_usuario) "
                        + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");
            }
            st.setInt(1, conexVO.getCd_codigo());


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

    public ticketVO consultar(int conexao) {
        ticketVO conexRetornar = new ticketVO();

        try {
            Connection con = new ConnectionManager().getConexao();

            PreparedStatement st;
            st = con.prepareStatement("select cd_codigo, ct_contato, e_email1, e_email2, e_email3, e_email4, e_email5, e_email6, e_email7, e_email8,  "
                    + " fb_febraban, gestor_externo, gestor_interno, "
                    + " gsan_externo, gsan_interno, ip_ip, nm_cidade, sn_senha, tf_telefone, "
                    + " tf_telefone1, tf_telefone2, tf_telefone3, tf_telefone4, tf_telefone5, tf_telefone6, tp_conexao, us_usuario "
                    + " from conexoes where cd_codigo = " + conexao);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                conexRetornar.setCd_codigo(rs.getInt("cd_codigo"));


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
