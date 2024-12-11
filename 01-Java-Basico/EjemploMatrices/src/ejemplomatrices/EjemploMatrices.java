
package ejemplomatrices;

import java.util.Scanner;

public class EjemploMatrices {

    public static void main(String[] args) {
        
        int edades[][] = new int[3][2];
        
        Scanner teclado = new Scanner(System.in);
        
       for(int f =0;f<edades.length;f++){
           
           //length 0 se usa para dar el largo de la primera fila
           //y length sin nada da la longitud de la columna
           for(int c=0;c<edades[0].length;c++){
            
               System.out.println("ingrese el numero a guardar en la fila : "+ f +"y la columna"+c);
               edades[f][c]=teclado.nextInt();
               

           }
           
       }
       
        System.out.println("el array es: "+edades); 
        
        
    }
    
}
