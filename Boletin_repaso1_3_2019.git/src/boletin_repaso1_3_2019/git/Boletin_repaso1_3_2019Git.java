/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_repaso1_3_2019.git;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Boletin_repaso1_3_2019Git {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       List<Integer> lista = new ArrayList<Integer>();
        
          Scanner ler = new Scanner(System.in);
        int num;
       

      
        
        do{
        
      
        num = ler.nextInt();
      
       lista.add(num);
        
        
       
         
        
       
        }while(num!=0);

       

        System.out.println(lista);
        
       
    }
    
}
