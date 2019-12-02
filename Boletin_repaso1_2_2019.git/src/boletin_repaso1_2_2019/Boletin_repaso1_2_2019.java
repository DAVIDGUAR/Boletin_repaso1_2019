/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_repaso1_2_2019;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Boletin_repaso1_2_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int a , b , c, d , e;
       

        int[] array_numeros = new int[5];

        for (int i = 0; i < 5; i++) {

            array_numeros[i] = ler.nextInt();

        }

        for (int f = 0; f < array_numeros.length; f++) {
            System.out.println(array_numeros[f]);
        }
        
        
        
        
        
        a = ler.nextInt();
        b = ler.nextInt();
        c = ler.nextInt();
        d = ler.nextInt();
        e = ler.nextInt();

        System.out.println(a + " , " + b + " , " + c + " , " + d + " , " + e);

    }

}
