/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerciciopainel;


import javax.swing.JOptionPane;
        
/**
 *
 * @author casa
 */
public class ExercicioPainel {

    public static void main(String[] args) {
        int qn = 0, par = 0, imp = 0; 
        int cem = 0, med = 0, m = 0, n;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Digite um numero <br>(Número<font color=AA00FF> 0 </font>finaliza programa)</html>)"));
            System.out.println(n);
            m += n;
            if(n == 0){
              break;  
            }if (n % 2 == 0){
                par++;
                qn++;
                System.out.println("Par " + par);
            }if (n >= 100){
                cem++;
                System.out.println("maior que 100" + cem);
            }if(n %2==1){
                imp++;
                qn++;
                System.out.println("Impar" + imp);
            }else{                
                continue;
            }
            
        }while(n != 0);
        
        med = (m/qn);
     JOptionPane.showMessageDialog(null, "<html>Resultado Final<br><hr>"+
             "<br>Quantidade de numeros Digitados <font size=4 color=AA00FF>"+ qn +
             "</font><br>Total de Pares <font size=4 color=AA00FF>"+ par +
             "</font><br>Total de Impares <font size=4 color=AA00FF>"+imp +
             "</font><br>A cima de 100 <font size=4 color=AA00FF>" +cem +
             "</font><br>Media dos Valores <font size=4 color=AA00FF>"+med+"</font></html>");
    }
}
