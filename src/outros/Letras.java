package outros;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Letras extends PlainDocument {

    //"[^a-z|^A-Z]" para aceitar somente letras de A a Z maiusculas e minusculas
    //"[^a-z|^A-Z|^ ]" para aceitar letras de A a Z maiusculas, minusculas e espaço
    //"[^0-9]" para aceitar somente numeros
    //"[^0-9|^,]" para aceitar numeros e virgulas
//-------------------------Nomes--------------------//-----------------------///---------------------//--------------
    @Override
    public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException {
        super.insertString(offset, str.toUpperCase().replaceAll("[^a-z|^A-Z|^  ,._ÉÃÇÕÁÍÓÚ*-|^0-9]", ""), attr);
    }

    public void replace(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException {
        super.insertString(offset, str.toUpperCase().replaceAll("[^a-z|^A-Z|^ ]", ""), attr);
    }
}