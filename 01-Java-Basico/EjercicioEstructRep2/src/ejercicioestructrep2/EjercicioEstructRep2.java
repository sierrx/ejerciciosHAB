//Escribe un programa que permita al usuario ingresar un número entero positivo y luego imprima la tabla de multiplicar de ese número del 1 al 10.
package ejercicioestructrep2;

import java.util.Scanner;

public class EjercicioEstructRep2 {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero : ");
        int num = teclado.nextInt();
        
        while (num <= 0 ){
        
            System.out.println("Ingrese un numero : ");
            num = teclado.nextInt();
        }
        
        for (int i=0; i<=10;i++){
            int c =num*i;
            System.out.println(num+" x "+ i +" = "+c);
        }
        
    }
    
}
