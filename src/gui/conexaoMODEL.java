package gui;


import vo.conexoesVO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class conexaoMODEL extends AbstractTableModel {
 
   private List<conexoesVO> lista = null;
    
    private String[] colunas = {"Febraban", "Cidade", "Contato", "Telefone", "IP", "Senha", "Tipo de Conexão"};
    
    public conexaoMODEL (List<conexoesVO> lista){
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
        conexoesVO p = lista.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getFb_febraban();
            case 1:
                return p.getNm_cidade();
            case 2:
                return p.getCt_contato();
            case 3:
                return p.getTf_telefone();
            case 4:
                return p.getIp_ip();
            case 5:
                return p.getSn_senha();
            case 6:
                return p.getTp_conexao();
            }
        return null;
    }
    
    
}
