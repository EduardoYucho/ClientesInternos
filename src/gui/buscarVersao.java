package gui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class buscarVersao {

    public newCadConexoes conexoes;

    public String getPage(URL url) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuffer retorno = new StringBuffer("");
//        BufferedWriter out = new BufferedWriter(new FileWriter(file));

        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            retorno.append(inputLine);

            // Imprime p&aacute;gina no console
            System.out.println(inputLine);

        }
        in.close();
        return retorno.toString();
    }

    String versao = "";

    public String Versao(String urlCliente) {

        URL url = null;
        try {
            //url = new URL("http://187.4.202.174:8080/gsan");

            url = new URL(conexoes.urlCliente);
            String page = new buscarVersao().getPage(url);

            Pattern pattern = Pattern.compile("(\\d\\.\\d{2}\\.\\d{2}\\.\\d{3})");
            Matcher matcher = pattern.matcher(page);
            boolean encontrou = matcher.find();
            if (encontrou) {
                versao = matcher.group(1);
            }

//            \d\.\d\d\.\d\d\.\d\d\d
//            
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ConnectException e) {
            JOptionPane.showMessageDialog(null, "Conexão recusada, verificar se o ip do cliente,\né um ip externo da Logpro");
        } catch (Exception e) {
            e.printStackTrace();

        }
        return versao;

    }
}
