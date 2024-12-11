
package ejemploarrays;

import java.util.Scanner;


public class EjemploArrays {


    public static void main(String[] args) {
        
        int numeros[]= new int[5];
        
        System.out.println("ingrese el numero a guardar: ");
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i<=4; i++){
            
            numeros[i]=teclado.nextInt();
            
        }
        
        
    }
    
}
