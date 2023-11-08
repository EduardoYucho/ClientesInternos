package model;

import vo.alteracoesVO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class alteracoesMODEL extends AbstractTableModel {

    private List<alteracoesVO> lista = null;

    private String[] colunas = {"Cidade", "Técnico", "Alteração", "Data", "Alteração"};

    public alteracoesMODEL(List<alteracoesVO> lista) {
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
        alteracoesVO p = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return p.getCd_cadastro();
            case 1:
                return p.getNm_tecnico();
            case 2:
                return p.getDs_alteracao();
            case 3:
                return p.getDt_data();
            case 4:
                return p.getCd_alteracao();

        }
        return null;
    }

}
