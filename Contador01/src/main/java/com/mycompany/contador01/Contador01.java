/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.contador01;

/**
 *
 * @author casa
 */
public class Contador01 {

    public static void main(String[] args) {
        /*int cc = 0;// se começar com 1
        while (cc<4){// cc<=4
            System.out.println("Cambalhota " + cc);// cambalhota de 1 a 4
            cc++;
        }      */  
        
        int cc = 0;
        while (cc<10){
            cc++;
            if (cc == 2 || cc == 3 || cc == 4){
                continue;
            }
            if (cc == 7){
                break;
            }
            
            System.out.println("Cambalhhota " + cc);
        }
    }
}
