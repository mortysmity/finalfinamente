/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import javax.swing.JOptionPane;

/**
 *
 * @author Meu Computador
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nu,valor,soma,a;
        nu=1;
        valor=0;
        soma=0;
        valor=0;
         
        while(nu>=1 && nu<=500){
        
        
            if(nu%3==0 && nu%2!=0){
            valor=valor+nu;
             a=valor;
            soma=valor+a;
            
            
            }
             nu++;
         
        }
        JOptionPane.showMessageDialog(null,"a soma de todos os números ímpares que são múltiplos de três: "+soma);
       
    }
    
}
