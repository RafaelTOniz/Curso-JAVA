/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.comparacaostring;

/**
 *
 * @author casa
 */
public class ComparacaoString {

    public static void main(String[] args) {
        String nome1 = "Rafael";
        String nome2 = "Rafael";
        String nome3 = new String ("Rafael");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente"; //equals compara conteudo
        System.out.println(res);
        
    }
}
