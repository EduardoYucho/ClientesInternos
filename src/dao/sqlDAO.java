package dao;

import bd.ConnectionManager;
import vo.sqlVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class sqlDAO {

    public List<sqlVO> exibirBanco(String txtsql) {
        List<sqlVO> lista = new ArrayList<sqlVO>();
        sqlVO txtsqlVO;
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            con = new ConnectionManager().getConexao();

            if (txtsql != null && !txtsql.isEmpty()) {
                st = con.prepareStatement("select * from sql where ds_descricao"
                        + " like " + "'%" + txtsql + "%' order by cd_codigo");
            } else {
                st = con.prepareStatement("select * From sql order by cd_codigo");
            }

            rs = st.executeQuery();

            while (rs.next()) {
                txtsqlVO = new sqlVO();
                txtsqlVO.setCd_codigo(rs.getInt("cd_codigo"));
                txtsqlVO.setTxt_descricao(rs.getString("ds_descricao"));
                txtsqlVO.setTxt_sql(rs.getString("ds_sql"));

                lista.add(txtsqlVO);

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

    public boolean salvar(sqlVO txt_sqlVO) {

        try {

            Connection con = new ConnectionManager().getConexao();
            PreparedStatement st = null;
            if (consultar(txt_sqlVO.getCd_codigo()).getCd_codigo() > 0) {
                st = con.prepareStatement("update sql set cd_codigo = ?, ds_descricao = ?, ds_sql = ? "
                        + "where cd_codigo = " + txt_sqlVO.getCd_codigo());
            } else {
                st = con.prepareStatement("insert into sql(cd_codigo, ds_descricao, ds_sql) "
                        + " values (?, ?, ?) ");
            }
            st.setInt(1, txt_sqlVO.getCd_codigo());
            st.setString(2, txt_sqlVO.getTxt_descricao());
            st.setString(3, txt_sqlVO.getTxt_sql());

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

    public sqlVO consultar(int sql) {
        sqlVO conexRetornar = new sqlVO();
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = new ConnectionManager().getConexao();

            st = con.prepareStatement("select cd_codigo, ds_descricao, ds_sql "
                    + " from sql where cd_codigo = " + sql);

            rs = st.executeQuery();

            if (rs.next()) {
                conexRetornar.setCd_codigo(rs.getInt("cd_codigo"));
                conexRetornar.setTxt_descricao(rs.getString("ds_descricao"));
                conexRetornar.setTxt_sql(rs.getString("ds_sql"));

            } else {
                conexRetornar.setCd_codigo(-1);

            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar Cadastro! Erro: " + e.toString(), "Atenção",
                    JOptionPane.INFORMATION_MESSAGE);
            conexRetornar.setCd_codigo(-2);
        } finally {
            try {
                rs.close();
                st.close();
                con.close();
            } catch (SQLException r) {
                JOptionPane.showMessageDialog(null, r);
            }

        }
        return conexRetornar;

    }
//-------------------------------------------------------------------------------------------------------------

    public int retornaProximo() {
        int codigo = 0;
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = new ConnectionManager().getConexao();

            st = con.prepareStatement("select max(cd_codigo)from sql");

            rs = st.executeQuery();

            if (rs.next()) {
                codigo = rs.getInt(1) + 1;
            } else {
                codigo = 1;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar maior código! Erro: "
                    + ex.toString(), "Atenção", JOptionPane.INFORMATION_MESSAGE);

            return -1;
        } finally {
            try {
                rs.close();
                st.close();
                con.close();
            } catch (SQLException SQL) {
                JOptionPane.showMessageDialog(null, SQL);
            }
        }
        return codigo;

    }
//---------------------------------------------------------------------------------------------------------

    public boolean excluir(int codCodigo) {
        PreparedStatement st = null;
        Connection con = null;
        try {
            con = new ConnectionManager().getConexao();

            st = con.prepareStatement("delete from sql "
                    + " where cd_codigo = " + codCodigo);

            st.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Erro ao Excluir! Erro: " + e.toString(),
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } finally {
            try {

                st.close();
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return true;
    }
//---------------------------------//-------------------------------------///-----------------------------------//---------------------------------------------//

    public List<sqlVO> exibirBanco1(String txtsql) {
        List<sqlVO> lista = new ArrayList<sqlVO>();
        sqlVO txtsqlVO;
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            con = new ConnectionManager().getConexao();

            if (txtsql != null && !txtsql.isEmpty()) {
                st = con.prepareStatement("SELECT * FROM sql WHERE UPPER(ds_sql) LIKE '%" + txtsql.toUpperCase() + "%' ORDER BY cd_codigo");
            } else {
                st = con.prepareStatement("select * From sql order by cd_codigo");
            }

            rs = st.executeQuery();

            while (rs.next()) {
                txtsqlVO = new sqlVO();
                txtsqlVO.setCd_codigo(rs.getInt("cd_codigo"));
                txtsqlVO.setTxt_descricao(rs.getString("ds_descricao"));
                txtsqlVO.setTxt_sql(rs.getString("ds_sql"));

                lista.add(txtsqlVO);

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
//--------------------------------------------------------------------------------------------------------------------------------------
        public List<sqlVO> exibirBanco2(String txtsql) {
        List<sqlVO> lista = new ArrayList<sqlVO>();
        sqlVO txtsqlVO;
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            con = new ConnectionManager().getConexao();

            if (txtsql != null && !txtsql.isEmpty()) {
                st = con.prepareStatement("SELECT * FROM sql WHERE UPPER(ds_sql) LIKE '%" + txtsql.toUpperCase() + "%' ORDER BY cd_codigo");
            } else {
                st = con.prepareStatement("select * From sql order by ds_descricao");
            }

            rs = st.executeQuery();

            while (rs.next()) {
                txtsqlVO = new sqlVO();
                txtsqlVO.setCd_codigo(rs.getInt("cd_codigo"));
                txtsqlVO.setTxt_descricao(rs.getString("ds_descricao"));
                txtsqlVO.setTxt_sql(rs.getString("ds_sql"));

                lista.add(txtsqlVO);

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
