
package ejercicioarrays02;

import java.util.Scanner;


public class EjercicioArrays02 {

    public static void main(String[] args) {
        
        int calificaciones[][] = new int[4][4];
        
        Scanner teclado = new Scanner(System.in);
        
        for(int f =0;f<calificaciones.length;f++){
           int sum=0;

           for(int c=0;c<(calificaciones[0].length - 1);c++){
            
               System.out.println("Alumno numero :  "+ (f+1) +" ingrese la calificacion numero : "+(c+1));
               calificaciones[f][c]=teclado.nextInt();
               sum=sum + calificaciones[f][c];
               
               

           }
     
           calificaciones[f][3]=sum/3;
           
           
       }
        

        System.out.println("\nCalificaciones y promedios:");
        for (int f = 0; f < calificaciones.length; f++) {
            System.out.print("Alumno " + (f + 1) + ": ");
            for (int c = 0; c < calificaciones.length; c++) {
                if (c == 3) {
                    System.out.print("Promedio = " + calificaciones[f][c]);
                } else {
                    System.out.print(calificaciones[f][c] + " ");
                }
            }
            System.out.println();
        }
        
        
    }
    
}
