/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author Windows
 */
public class Util {
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private static SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm:ss");
    private static SimpleDateFormat sdfBD = new SimpleDateFormat("yyyy-MM-dd");
    

    public static void centralizarTela(JDesktopPane desktop, JInternalFrame frame) {
//        JInternalFrame[] iframes = desktop.getAllFrames();
//        for (JInternalFrame iframe : iframes) {
        if (frame.isVisible()) {
            int lDesk = desktop.getWidth();
            int aDesk = desktop.getHeight();
            int lIFrame = frame.getWidth();
            int aIFrame = frame.getHeight();
            frame.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        }
    }
    
    public static Date converteDate(String data) {
        Date d = new Date();
        try {
            d = sdf.parse(data);
        } catch (Exception e) {
        }
        return d;
    }
    
    public static final String converteDateParaString(Date date) {
        return sdf.format(date);
    }

    public static final String converteDateParaStringBD(String date) {
        return sdfBD.format(converteDate(date));
    }    
    
    public static final Date converteHoraParaDate(String date){
        try {
            return sdfHora.parse(date);
        } catch (ParseException ex) {
            return null;
        }
    }
    public static final String formataData(String data) {
        if (data.replaceAll("/", "").length() > 8) {
            throw new IllegalArgumentException("Insira uma data v⭩da. Formato: dd/MM/yyyy");
        }
        sdf.setLenient(false);
        Calendar c = Calendar.getInstance();
        Date dd = new Date();
        String ano = Integer.toString(c.get(Calendar.YEAR));
        String mes = Integer.toString(c.get(Calendar.MONTH) + 1);
        String d = data.replaceAll("/", "");

        try {
            if (d.length() <= 2) {
                d = d.concat("/").concat(mes).concat("/").concat(ano);
                dd = sdf.parse(d);
                d = sdf.format(dd);
                return d;

            } else if (d.length() >= 2 && d.length() <= 4) {
                String dia_aux = d.substring(0, 2);
                String mes_aux = d.substring(2, d.length());
                if (d.length() == 3 && d.substring(2, 3).equals("0")){
                    d = dia_aux.concat("/1").concat(mes_aux).concat("/").concat(ano);
                }else{
                    d = dia_aux.concat("/").concat(mes_aux).concat("/").concat(ano);
                }
                dd = sdf.parse(d);
                d = sdf.format(dd);
                return d;
            } else if (d.length() >= 4 && d.length() <= 8) {
                String dia = d.substring(0, 2);
                String mes_aux = d.substring(2, 4);
                String ano_aux = d.substring(4, d.length());

                if (ano_aux.length() == 1) {
                    d = dia.concat("/").concat(mes_aux).concat("/").concat("200").concat(ano_aux);
                    dd = sdf.parse(d);
                    d = sdf.format(dd);
                    return d;
                } else if (ano_aux.length() == 2) {
                    d = dia.concat("/").concat(mes_aux).concat("/").concat("20").concat(ano_aux);
                    dd = sdf.parse(d);
                    d = sdf.format(dd);
                    return d;
                } else {
                    d = dia.concat("/").concat(mes_aux).concat("/").concat(ano_aux);
                    dd = sdf.parse(d);
                    d = sdf.format(dd);
                    return d;
                }
            }
        } catch (Exception e) {
            return "";
        }
        return d;
    }
    
     public static String preencherString(String palavra, String separador, int qtd, int lado) {
        int original = qtd;
        qtd = qtd - palavra.length();

        if (!palavra.equals("")) {
            if (!separador.equals("")) {
                if (lado == 1) { //lado direito
                    for (int i = 0; i < qtd; i++) {
                        palavra = palavra.concat(separador);
                    }
                } else if (lado == 2) { //lado esquerdo
                    for (int i = 0; i < qtd; i++) {
                        palavra = separador.concat(palavra);
                    }
                } else if (lado == 3) { //centralizado
                    int aux = (Integer) qtd / 2;
                    for (int i = 0; i < aux; i++) {
                        palavra = palavra.concat(separador);
                    }
                    for (int i = 0; i < aux; i++) {
                        palavra = separador.concat(palavra);
                    }

                    if (palavra.length() < original) {
                        palavra = palavra.concat(separador);
                    }
                } else {
                    throw new IllegalArgumentException("Parâmetro Inválido. Parâmetro lado deve ser prenchido da seguinte Maneira: \n 1 - Direito , 2 - Esquerdo, 3 - Centralizado");
                }
            }
        }
        return palavra;
    }
     
     public static String saveFileBackup(String rel) throws IOException{
        File file = new File("relBackp.txt");
        if (file.exists()){
            file.delete();
        }
        FileWriter fw =  new FileWriter(file);
        BufferedWriter bf = new BufferedWriter(fw);
        bf.write(rel);
        bf.close();
        fw.close();
        return file.getAbsolutePath();
     }
         
}
