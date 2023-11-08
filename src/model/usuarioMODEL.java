package model;

import vo.usuarioVO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class usuarioMODEL extends AbstractTableModel {

    private List<usuarioVO> lista = null;

    private String[] colunas = {"Código", "Nome", "Tipo de Usuário", "Situação"};

    public usuarioMODEL(List<usuarioVO> lista) {
        this.lista = lista;
    }
//1

    @Override
    public int getRowCount() {
        return lista.size();
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
        usuarioVO p = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return p.getCd_codigo();
            case 1:
                return p.getNm_nome();
            case 2:
                return p.getTp_usuario();
            case 3:
                return p.getSt_situacao();

        }
        return null;
    }

}
