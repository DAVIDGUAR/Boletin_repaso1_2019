/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_repaso1_7_2019;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Boletin_repaso1_7_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int lado,area;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Introduce el lado del cuadrado");
        
         lado=ler.nextInt();
        
        if (lado<0){
            
            System.out.println("Error, el lado no puede ser nagativo");
            
        }else{
       
        
              
        area=lado*lado;
        
        System.out.println("El area del cuadrado es : " +area);
    }
    
    }
    
}
