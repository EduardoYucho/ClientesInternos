/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.regex.Matcher;

/**
 *
 * @author Eduardo
 */
public class Main {
    public static void main(String[] args) {
        String texto = "http://177.2.19.138:8080/gsan/";
//        String[] result = texto.split(Matcher.quoteReplacement("/"));
//        for(String s: result){
//            System.out.println(s);
//        }
        System.out.println(texto.substring(7,  texto.indexOf(Matcher.quoteReplacement(":"), 7)));
        
    }
    
}
