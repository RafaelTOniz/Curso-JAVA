/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author casa
 */
public class ExercicioRepita {

    public static void main(String[] args) {
        int n, s = 0;
        
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                "<html>Informe um número: <br><em><font size=2 color=FFAA22>(Valor 0 interrompe)</font></em></html>"));
            s += n;
         }while(n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <br><hr> " +
                "<br>Somatório <font color=AA00FF>"+ s +"</font></html>");
        
        
    }
}
