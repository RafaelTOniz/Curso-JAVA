/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numeros;

import java.util.Scanner;

/**
 *
 * @author casa
 */
public class Numeros {

    public static void main(String[] args) {
        int n, s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s += n; // s = s + n
            System.out.println("Quer Continuar? [S/N] ");
            resp = teclado.next();
        }while(resp.equals("s"));
        System.out.println("A soma de todos os Valores é " + s);
    }
}
