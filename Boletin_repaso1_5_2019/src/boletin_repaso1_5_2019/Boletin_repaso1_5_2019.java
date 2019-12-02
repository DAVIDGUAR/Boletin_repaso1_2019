/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_repaso1_5_2019;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Boletin_repaso1_5_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int suma = 0;

        Scanner ler = new Scanner(System.in);

        int[] mi_array = new int[4];

        int num = 0;

        for (int i = 0; i < mi_array.length; i++) {

            num = ler.nextInt();

            if (num >= 0) {

                mi_array[i] = num;

            } else {
                System.out.println("Numero negativo ERROR");
            }
        }
        for (int a : mi_array) {

            suma += a;

            System.out.print(a + " , ");

            System.out.println("Total suma numeros = " + suma);

        }
        System.out.println("Total suma numeros = " + suma);

    }

}
