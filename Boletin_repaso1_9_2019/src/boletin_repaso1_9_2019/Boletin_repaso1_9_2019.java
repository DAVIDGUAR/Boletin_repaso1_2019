/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_repaso1_9_2019;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Boletin_repaso1_9_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int suma = 0, num;

        while (suma <= 100) {

            System.out.println("Introduce numeros aleatorios");
            num = ler.nextInt();
            suma += num;

            if (suma > 100) {

                System.out.println(" Suma total = " + suma);

            }
        }

    }

}
