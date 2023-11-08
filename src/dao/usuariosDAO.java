package dao;

import bd.ConnectionManager;
import vo.usuarioVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class usuariosDAO {
    
    
    public List<usuarioVO> exibirBanco(String status) {
        List<usuarioVO> lista = new ArrayList<usuarioVO>();
        usuarioVO usarVO;
        try {
            
            String sql = "";
            
            if(!status.equals("Todos"))
                sql = "select * From usuarios where st_situacao = '"+status+"' order by cd_codigo";
           
             if(status.equals("Todos"))
                sql = "select * From usuarios where st_situacao = 'Ativo' or st_situacao = 'Inativo' order by cd_codigo";
             

            Connection con = new ConnectionManager().getConexao();

            PreparedStatement st;
            st = con.prepareStatement(sql);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                usarVO = new usuarioVO();
                usarVO.setCd_codigo(rs.getInt("cd_codigo"));
                usarVO.setNm_nome(rs.getString("nm_usuario"));
                usarVO.setSn_senha(rs.getString("sn_senha"));
                usarVO.setSt_situacao(rs.getString("st_situacao"));
                usarVO.setTp_usuario(rs.getString("tp_usuario"));
                
                lista.add(usarVO);


            }
            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar Banco! Erro: " + e.toString(), "Atenção",
                    JOptionPane.INFORMATION_MESSAGE);
            return lista;
        }
        return lista;

    }
//-------------------------------------------------------------------------------------------------

    public boolean salvar(usuarioVO usuarVO) {

        try {

            Connection con = new ConnectionManager().getConexao();
            PreparedStatement st = null;
            if (consultar(usuarVO.getCd_codigo()).getCd_codigo()> 0) {
                st = con.prepareStatement("update usuarios set cd_codigo = ?, nm_usuario = ?, sn_senha = ?, tp_usuario = ?, st_situacao = ? "
                       + " where cd_codigo = " + usuarVO.getCd_codigo());
            } else {
                st = con.prepareStatement("insert into usuarios(cd_codigo, nm_usuario, sn_senha, tp_usuario, st_situacao )  "
                        + " values (?, ?, ?, ?, ?) ");
            }
            st.setInt(1, usuarVO.getCd_codigo());
            st.setString(2, usuarVO.getNm_nome());
            st.setString(3, usuarVO.getSn_senha());
            st.setString(4, usuarVO.getTp_usuario());
            st.setString(5, usuarVO.getSt_situacao());

            
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

    public usuarioVO consultar(int conexao) {
        usuarioVO conexRetornar = new usuarioVO();

        try {
            Connection con = new ConnectionManager().getConexao();

            PreparedStatement st;
            st = con.prepareStatement("select cd_codigo, nm_usuario, sn_senha, tp_usuario, st_situacao "
                    + " from usuarios where cd_codigo = " + conexao );

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                conexRetornar.setCd_codigo(rs.getInt("cd_codigo"));
                conexRetornar.setNm_nome(rs.getString("nm_usuario"));
                conexRetornar.setSn_senha(rs.getString("sn_senha"));
                conexRetornar.setTp_usuario(rs.getString("tp_usuario"));
                conexRetornar.setSt_situacao(rs.getString("st_situacao"));



            } else {
                conexRetornar.setCd_codigo(-1);

            }
            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar Usuário! Erro: " + e.toString(), "Atenção",
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

            st = con.prepareStatement("select max(cd_codigo)from usuarios");

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

            st = con.prepareStatement("delete from usuarios "
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