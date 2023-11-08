package dao;

import bd.ConnectionManager;
import java.io.IOException;
import vo.BackupVO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import vo.BackupVO;

public class BackupDAO {
    
    
    public boolean saveOrUpdate(BackupVO backup) throws SQLException{
        StringBuilder     sql      = new StringBuilder();
        Connection        conn     = null;
        PreparedStatement st       = null;
        ResultSet         rs       = null;
        boolean           isUpdate = false;
        conn = ConnectionManager.getConexao();
        sql.append("SELECT * FROM backup_config WHERE id_conexao = "+backup.getIdConexao());
        st = conn.prepareStatement(sql.toString());
        rs = st.executeQuery();
        if (rs.next()){
            isUpdate = true;
            sql = new StringBuilder();
            sql.append("UPDATE backup_config");
            sql.append("   SET id_conexao         = ?,");
            sql.append("       usuariobd          = ?,");
            sql.append("       senhabd            = ?,");
            sql.append("       database           = ?,");
            sql.append("       host               = ?,");
            sql.append("       port               = ?,");
            sql.append("       pathcaminho        = ?,");
            sql.append("       caminhojava        = ?,");
            sql.append("       caminhopgdump      = ?,");
            sql.append("       caminhosendhostjar = ?,");
            sql.append("       horaexecucaobackup = ?,");
            sql.append("       tpservidor         = ?,");
            sql.append("       hostnamenuvem      = ?,");
            sql.append("       nomediretorionuvem = ?,");
            sql.append("       qtdiasbackupnuvem  = ?");
            sql.append( "WHERE id_conexao = ?");
        }else{
            sql = new StringBuilder();
            sql.append("INSERT INTO backup_config(id_conexao, usuariobd, senhabd, database, host, port, pathcaminho, ");
            sql.append("                          caminhojava, caminhopgdump, caminhosendhostjar, horaexecucaobackup, ");
            sql.append("                          tpservidor, hostnamenuvem, nomediretorionuvem, qtdiasbackupnuvem) ");
            sql.append("     VALUES (?, ?, ?, ?, ?, ?, ?, ");
            sql.append("            ?, ?, ?, ?,");
            sql.append("            ?, ?, ?, ?);");
        }
        st = conn.prepareStatement(sql.toString());
        st.setInt(1, backup.getIdConexao());
        st.setString(2, backup.getUsuarioBD());
        st.setString(3, backup.getSenhaBD());
        st.setString(4, backup.getDatabase());
        st.setString(5, backup.getHost());
        st.setInt(6, backup.getPort());
        st.setString(7, backup.getPathCaminho());
        st.setString(8, backup.getCaminhoJava());
        st.setString(9, backup.getCaminhoPGDUMP());
        st.setString(10, backup.getCaminhoJar());
        st.setTime(11, new Time(backup.getHoraExecucaoBackup().getTime()));
        st.setInt(12, backup.getTpServidor());
        st.setString(13, backup.getHostNameNuvem());
        st.setString(14, backup.getNomeDiretorioNuvem());
        st.setInt(15, backup.getQtdDiasBackupNuvem());
        if (isUpdate){
            st.setInt(16, backup.getIdConexao());
        }
        int result = st.executeUpdate();
        ConnectionManager.closeAll(conn, st, rs);
        return result == 1;
    }
    
    public BackupVO find(Integer idConexao) throws SQLException{
        StringBuilder     sql      = new StringBuilder();
        Connection        conn     = ConnectionManager.getConexao();
        PreparedStatement st       = null;
        ResultSet         rs       = null;
        BackupVO          backup   = null;
        sql.append("SELECT * FROM backup_config WHERE id_conexao = "+idConexao);
        st = conn.prepareStatement(sql.toString());
        rs = st.executeQuery();
        if (rs.next()){
            backup = new BackupVO();
            backup.setIdConexao(idConexao);
            backup.setId(rs.getInt("id"));
            backup.setUsuarioBD(rs.getString("usuariobd"));
            backup.setSenhaBD(rs.getString("senhabd"));
            backup.setDatabase(rs.getString("database"));
            backup.setHost(rs.getString("host"));
            backup.setPort(rs.getInt("port"));
            backup.setPathCaminho(rs.getString("pathcaminho"));
            backup.setCaminhoJava(rs.getString("caminhojava"));
            backup.setCaminhoPGDUMP(rs.getString("caminhopgdump"));
            backup.setCaminhoJar(rs.getString("caminhosendhostjar"));
            backup.setHoraExecucaoBackup(rs.getTime("horaexecucaobackup"));
            backup.setTpServidor(rs.getInt("tpservidor"));
            backup.setHostNameNuvem(rs.getString("hostnamenuvem"));
            backup.setNomeDiretorioNuvem(rs.getString("nomediretorionuvem"));
            backup.setQtdDiasBackupNuvem(rs.getInt("qtdiasbackupnuvem"));     
        }
        ConnectionManager.closeAll(conn, st, rs);
        return backup;
    }

    public BackupVO consultarDadosBackup(String ip) {
        BackupVO backup = null;
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT * FROM admindb.db_backup_config ";
            conn = conectaAgora(ip);
            if (conn != null) {
                System.out.println("Conexão efetuada com sucesso!");
                System.out.println(consulta);
            } else {
                System.out.println("Problemas!");
                JOptionPane.showMessageDialog(null, "Conexão negada. Verifique se o nome da máquina e a porta estão corretos e se o postmaster está aceitando conexões TCP/IP.");
                return null;
            }
            stm = conn.prepareStatement(consulta);
            rs = stm.executeQuery();

            if(rs.next()) {
                backup = new BackupVO();
                backup.setId(rs.getInt("dbcfg_id"));
                backup.setUsuarioBD(rs.getString("dbcfg_usuariobd"));
                backup.setSenhaBD(rs.getString("dbcfg_senhabd"));
                backup.setDatabase(rs.getString("dbcfg_database"));
                backup.setHost(rs.getString("dbcfg_host"));
                backup.setPort(rs.getInt("dbcfg_port"));
                backup.setPathCaminho(rs.getString("dbcfg_pathcaminho"));
                backup.setCaminhoJava(rs.getString("dbcfg_caminhojava"));
                backup.setCaminhoPGDUMP(rs.getString("dbcfg_caminhopgdump"));
                backup.setCaminhoJar(rs.getString("dbcfg_caminhosendhostjar"));
                backup.setHoraExecucaoBackup(rs.getTime("dbcfg_horaexecucaobackup"));
                backup.setTpServidor(rs.getInt("dbcfg_tpservidor"));
                backup.setHostNameNuvem(rs.getString("dbcfg_hostnamenuvem"));
                backup.setNomeDiretorioNuvem(rs.getString("dbcfg_nomediretorionuvem"));
                backup.setQtdDiasBackupNuvem(rs.getInt("dbcfg_qtdiasbackupnuvem"));                
            }
            return backup;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        } finally {
            ConnectionManager.closeAll(conn, stm, rs);
        }
    }
    
     public boolean saveOrUpdateRemotamente(BackupVO backup, String ip) throws SQLException{
        StringBuilder     sql      = new StringBuilder();
        Connection        conn     = null;
        PreparedStatement st       = null;
        ResultSet         rs       = null;
        conn = conectaAgora(ip);
        sql.append("SELECT * FROM admindb.db_backup_config");
        st = conn.prepareStatement(sql.toString());
        rs = st.executeQuery();
        if (rs.next()){
            sql = new StringBuilder();
            sql.append("UPDATE admindb.db_backup_config");
            sql.append("   SET dbcfg_usuariobd          = ?,");
            sql.append("       dbcfg_senhabd            = ?,");
            sql.append("       dbcfg_database           = ?,");
            sql.append("       dbcfg_host               = ?,");
            sql.append("       dbcfg_port               = ?,");
            sql.append("       dbcfg_pathcaminho        = ?,");
            sql.append("       dbcfg_caminhojava        = ?,");
            sql.append("       dbcfg_caminhopgdump      = ?,");
            sql.append("       dbcfg_caminhosendhostjar = ?,");
            sql.append("       dbcfg_horaexecucaobackup = ?,");
            sql.append("       dbcfg_tpservidor         = ?,");
            sql.append("       dbcfg_hostnamenuvem      = ?,");
            sql.append("       dbcfg_nomediretorionuvem = ?,");
            sql.append("       dbcfg_qtdiasbackupnuvem  = ?");            
        }else{
            sql = new StringBuilder();
            sql.append("INSERT INTO admindb.db_backup_config(dbcfg_usuariobd, dbcfg_senhabd, dbcfg_database, dbcfg_host, dbcfg_port, dbcfg_pathcaminho, ");
            sql.append("                          dbcfg_caminhojava, dbcfg_caminhopgdump, dbcfg_caminhosendhostjar, dbcfg_horaexecucaobackup, ");
            sql.append("                          dbcfg_tpservidor, dbcfg_hostnamenuvem, dbcfg_nomediretorionuvem, dbcfg_qtdiasbackupnuvem) ");
            sql.append("     VALUES (?, ?, ?, ?, ?, ?, ");
            sql.append("            ?, ?, ?, ?,");
            sql.append("            ?, ?, ?, ?);");
        }
        st = conn.prepareStatement(sql.toString());        
        st.setString(1, backup.getUsuarioBD());
        st.setString(2, backup.getSenhaBD());
        st.setString(3, backup.getDatabase());
        st.setString(4, backup.getHost());
        st.setInt(5, backup.getPort());
        st.setString(6, backup.getPathCaminho());
        st.setString(7, backup.getCaminhoJava());
        st.setString(8, backup.getCaminhoPGDUMP());
        st.setString(9, backup.getCaminhoJar());
        st.setTime(10, new Time(backup.getHoraExecucaoBackup().getTime()));
        st.setInt(11, backup.getTpServidor());
        st.setString(12, backup.getHostNameNuvem());
        st.setString(13, backup.getNomeDiretorioNuvem());
        st.setInt(14, backup.getQtdDiasBackupNuvem());        
        int result = st.executeUpdate();
        ConnectionManager.closeAll(conn, st, rs);
        return result == 1;
    }

    public Connection conectaAgora(String ip) {
        String url = "jdbc:postgresql://" + ip + ":5432/comercial";
        String usuario = "postgres";
        String senha = "j147f963x";
        try {
            Class.forName("org.postgresql.Driver").newInstance();
            Connection conn = DriverManager.getConnection(url, usuario, senha);
            return conn;
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return null;
        } catch (Exception e) {
            System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
            return null;
        }
    }
}
