//Escribe un programa que permita al usuario ingresar números positivos y vaya acumulando la suma de estos. El programa debe detenerse cuando el usuario ingrese un número negativo, y en ese momento debe mostrar la suma total de los números positivos ingresados.
package ejercicioestrucrep1;

import java.util.Scanner;


public class EjercicioEstrucRep1 {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero : ");
        int num = teclado.nextInt();
        int c=0;
        
        while (num >0){
            c=c+num;
            System.out.println("Ingrese un numero : ");
            num = teclado.nextInt();
            
        }
        System.out.println("la suma total es igual a : "+c);
    }
    
}
