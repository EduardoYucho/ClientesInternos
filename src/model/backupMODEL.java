package model;

import vo.BackupVO;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import vo.BackupVO;

public class backupMODEL extends AbstractTableModel {

    private List<BackupVO> lista1 = null;

    private String[] colunas = {"dbcfg_id", "dbcfg_usuariobd", "dbcfg_senhabd", "dbcfg_database", "dbcfg_host", "dbcfg_port", "dbcfg_pathcaminho", "dbcfg_caminhojava",
        "dbcfg_caminhopgdump", "dbcfg_caminhosendhostjar", "dbcfg_horaexecucaobackup", "dbcfg_tpservidor", "dbcfg_hostnamenuvem", "dbcfg_nomediretorionuvem", "dbcfg_qtdiasbackupnuvem"};

    public backupMODEL(List<BackupVO> lista) {
        this.lista1 = lista;
    }
//1

    @Override
    public int getRowCount() {
        return lista1.size();
    }
//2

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
//3

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
//4

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
//        BackupVO p = lista1.get(rowIndex);
//        switch (columnIndex) {
//            case 0:
//                return p.getDbcfg_id();
//            case 1:
//                return p.getDbcfg_usuariobd();
//            case 2:
//                return p.getDbcfg_senhabd();
//            case 3:
//                return p.getDbcfg_database();
//            case 4:
//                return p.getDbcfg_host();
//            case 5:
//                return p.getDbcfg_port();
//            case 6:
//                return p.getDbcfg_pathcaminho();
//            case 7:
//                return p.getDbcfg_caminhojava();
//            case 8:
//                return p.getDbcfg_caminhopgdump();
//            case 9:
//                return p.getDbcfg_caminhosendhostjar();
//            case 10:
//                return p.getDbcfg_horaexecucaobackup();
//            case 11:
//                return p.getDbcfg_tpservidor();
//            case 12:
//                return p.getDbcfg_hostnamenuvem();
//            case 13:
//                return p.getDbcfg_nomediretorionuvem();
//            case 14:
//                return p.getDbcfg_qtdiasbackupnuvem();
//
//        }
        return null;
    }

}
