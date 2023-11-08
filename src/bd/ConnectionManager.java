package bd;

import gui.conexaoMODEL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import principal.Login;

public class ConnectionManager {
//versao 2.00
    public Login conexaoSistema;

    private static String STR_DRIVER = "org.postgresql.Driver";
    private static String DATABASE = "LogPro";
    private static String IP = Login.IP_SISTEMA;
    private static String STR_CON = "jdbc:postgresql://" + IP + ":5543/" + DATABASE;
    private static String USER = "postgres";
    private static String PASSWORD = "j147f963x";
    private static Connection conn = null;

    public static Connection getConexao() {
        try {
            String IP = Login.IP_SISTEMA;
            String STR_CON = "jdbc:postgresql://" + IP + ":5543/" + DATABASE;
            conn = null;
            Class.forName(STR_DRIVER);
            conn = DriverManager.getConnection(STR_CON, USER, PASSWORD);

            return conn;

        } catch (ClassNotFoundException e) {

            String errorMsg = "Driver não encontrado";
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
            return null;

        } catch (SQLException e) {

            String errorMsg = "Erro ao obter a conexão";
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possível estabelecer a conexão!");

            return null;

        }

    }

    public static void closeAll(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }

        } catch (Exception e) {
            String errorMsg = "Não foi possível fechar a conexão com o banco";
            //System.out.println(errorMsg);
        }
    }

    public static void closeAll(Connection conn, Statement stmt, ResultSet rs) {
        try {
            if (conn != null || stmt != null) {
                closeAll(conn, stmt);
            }
            if (rs != null) {
                rs.close();
            }

        } catch (Exception e) {
            String errorMsg = "Não foi possível fechar a conexão com o banco";
            //System.out.println(errorMsg);
        }
    }

    public static void closeAll(Connection conn, Statement stmt) {
        try {
            if (conn != null) {
                closeAll(conn);
            }
            if (stmt != null) {
                stmt.close();
            }

        } catch (Exception e) {
            String errorMsg = "Não foi possível fechar a conexão com o banco";
            //System.out.println(errorMsg);
        }
    }
}
