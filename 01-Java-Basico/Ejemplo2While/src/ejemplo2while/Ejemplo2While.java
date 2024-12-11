package ejemplo2while;

import java.util.Scanner;


public class Ejemplo2While {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();
        
        while (edad <=70){
            System.out.println("Ingrese su edad: ");
            edad = teclado.nextInt();
        }
        
        System.out.println("persona encontrada");
    }
    
}
