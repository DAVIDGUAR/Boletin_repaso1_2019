/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_repaso1_10_2019;

/**
 *
 * @author david
 */
public class Alumno {
    
   double asignatura1,asignatura2,asignatura3,asignatura4,asignatura5,asignatura6, nota_media;

    public Alumno(double asignatura1, double asignatura2, double asignatura4, double asignatura5, double asignatura6) {
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura4 = asignatura4;
        this.asignatura5 = asignatura5;
        this.asignatura6 = asignatura6;
    }
    
    
    public void nota_media(){
        
        nota_media=(asignatura1+asignatura2+asignatura3+asignatura4+asignatura5+asignatura6)/6; 
        
        System.out.println("La nota media = "+ nota_media);
        
        
    }
    
}
