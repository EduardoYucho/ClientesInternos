package model;

import vo.sqlVO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class sqlMODEL extends AbstractTableModel {

    private List<sqlVO> lista = null;

    private String[] colunas = {"Código", "Descrição"};

    public sqlMODEL(List<sqlVO> lista) {
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
        sqlVO p = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return p.getCd_codigo();
            case 1:
                return p.getTxt_descricao();

        }
        return null;
    }

}
