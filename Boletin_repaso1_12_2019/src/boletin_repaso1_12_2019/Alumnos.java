/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_repaso1_12_2019;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Alumnos {

    double notas;
    double numero_alumnos = 0;
    boolean a = true;
    double notas_totales = 0;
    String clave="SI";

    Scanner ler = new Scanner(System.in);

    public Alumnos(double notas) {
        this.notas = notas;
    }

    public Alumnos() {
    }

    public void calcular_nota_media() {

        while (a) {

            System.out.println("Quieres continuar \n Si o No");

           String respuesta = ler.next();

            if (clave.equalsIgnoreCase(respuesta)==true) {
                
                System.out.println("Introduce notas");
                
                double notas = ler.nextInt();

                notas_totales += notas;
                numero_alumnos++;

                double operacion = notas_totales / numero_alumnos;

                System.out.println("La media de las notas de los alumnos es : " + operacion + "\nNumero de alumnos calculados en esta media = " + numero_alumnos);

            }else{
                
                double operacion = notas_totales / numero_alumnos;

                System.out.println("La media de las notas de los alumnos es : " + operacion + "\nNumero de alumnos calculados en esta media = " + numero_alumnos);
                a=false;
                
            }
        }

    }

}
