package dao;

import bd.ConnectionManager;
import vo.alteracoesVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class alteracoesDAO {

    public List<alteracoesVO> exibirBanco(String nomeAlteracao) {
        List<alteracoesVO> lista = new ArrayList<alteracoesVO>();
        alteracoesVO alterVO;
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            con = new ConnectionManager().getConexao();

            String consulta = "";
            if (nomeAlteracao != null && !nomeAlteracao.isEmpty()) {
                consulta = "select * from alteracoes where cd_cadastro = " + nomeAlteracao;

                consulta += " order by dt_data desc";
                st = con.prepareStatement(consulta);
            } else {
                consulta = "select * from alteracoes order by dt_data desc";
                st = con.prepareStatement(consulta);
            }

            rs = st.executeQuery();

            while (rs.next()) {
                alterVO = new alteracoesVO();
                alterVO.setCd_cadastro(rs.getInt("cd_cadastro"));
                alterVO.setDs_alteracao(rs.getString("ds_alteracao"));
                alterVO.setDt_data(rs.getTimestamp("dt_data"));
                alterVO.setNm_tecnico(rs.getString("nm_tecnico"));
                alterVO.setCd_alteracao(rs.getInt("cd_alteracao"));

                lista.add(alterVO);

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

    public boolean salvar(alteracoesVO alterVO) {

        try {

            Connection con = new ConnectionManager().getConexao();
            PreparedStatement st = null;

            st = con.prepareStatement("insert into alteracoes (nm_tecnico, ds_alteracao, dt_data, cd_cadastro, cd_alteracao )"
                    + " values (?, ?, ?, ?, ?) ");

            st.setString(1, alterVO.getNm_tecnico());
            st.setString(2, alterVO.getDs_alteracao());
            //st.setDate(3, (Date) alterVO.getDt_data());
            st.setTimestamp(3, new java.sql.Timestamp(alterVO.getDt_data().getTime()));
            st.setInt(4, alterVO.getCd_cadastro());
            st.setInt(5, alterVO.getCd_alteracao());
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

    public alteracoesVO consultar(int alteracao) {
        alteracoesVO alterRet = new alteracoesVO();

        try {
            Connection con = new ConnectionManager().getConexao();

            PreparedStatement st;
            st = con.prepareStatement("select * from alteracoes where cd_alteracao = " + alteracao);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                alterRet.setCd_cadastro(rs.getInt("cd_cadastro"));
                alterRet.setDs_alteracao(rs.getString("ds_alteracao"));
                alterRet.setDt_data(rs.getDate("dt_data"));
                alterRet.setNm_tecnico(rs.getString("nm_tecnico"));
                alterRet.setCd_alteracao(rs.getInt("cd_alteracao"));

            } else {
                alterRet.setCd_cadastro(-1);

            }
            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar Cliente! Erro: " + e.toString(), "Atenção",
                    JOptionPane.INFORMATION_MESSAGE);
            alterRet.setCd_cadastro(-2);
        }
        return alterRet;

    }

    //-------------------------------//------------------------------//----------------------------------//---------
    public int retornaProximo() {
        int codigo = 0;
        try {
            Connection con = new ConnectionManager().getConexao();
            PreparedStatement st;

            st = con.prepareStatement("select max(cd_alteracao)from alteracoes");

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
//-----------------------------------------------------------------------------------------------------------

    public boolean excluir(int codCodigo) {
        try {
            Connection con = new ConnectionManager().getConexao();

            PreparedStatement st = null;

            st = con.prepareStatement("delete from alteracoes "
                    + " where cd_alteracao = " + codCodigo);

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
//------------------------------------------------------------------------------------------------------

    public List<alteracoesVO> filtrarBanco(String cdCadastro, String nmFiltro) {
        List<alteracoesVO> lista = new ArrayList<alteracoesVO>();
        alteracoesVO alterVO;
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            con = new ConnectionManager().getConexao();

            if (nmFiltro != null && !nmFiltro.isEmpty()) {
                st = con.prepareStatement("select * from alteracoes where cd_cadastro = "
                        + cdCadastro + "and ds_alteracao like '%"  + nmFiltro + "%'" + 
                        " order by dt_data desc");
            } else {
                st = con.prepareStatement("select * from alteracoes where cd_cadastro = "
                        + cdCadastro + " order by dt_data desc");
            }

            rs = st.executeQuery();

            while (rs.next()) {
                alterVO = new alteracoesVO();
                alterVO.setCd_cadastro(rs.getInt("cd_cadastro"));
                alterVO.setDs_alteracao(rs.getString("ds_alteracao"));
                alterVO.setDt_data(rs.getTimestamp("dt_data"));
                alterVO.setNm_tecnico(rs.getString("nm_tecnico"));
                alterVO.setCd_alteracao(rs.getInt("cd_alteracao"));

                lista.add(alterVO);

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

}
