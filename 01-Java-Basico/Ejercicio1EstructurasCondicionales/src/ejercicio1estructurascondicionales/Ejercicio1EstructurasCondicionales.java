
package ejercicio1estructurascondicionales;

import java.util.Scanner;


public class Ejercicio1EstructurasCondicionales {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Para el acceso al Evento requiero que ingrese su edad :");
        int edad = teclado.nextInt();
        
        if (edad < 18){
            System.out.println("Usted no es mayor de edad no puede ingresar al evento");
            System.out.println("Regrese dentro de " + (18-edad) +" Años en la futura edicion del evento");
        }
        else{
            System.out.println("Usted es mayor de edad puede entrar al evento");
        }
    }
    
}
