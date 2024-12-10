package variablesyoperadores;

import java.util.Scanner;

public class VariablesYOperadores {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la longitud de la base del triangulo :");
        float base = teclado.nextFloat();
        System.out.println("Ingrese la longitud de la altura del triangulo :");
        float altura = teclado.nextFloat();
        
        float area = ((base*altura)/2);
        
        System.out.println("El area de tu triangulo es igual a  :" + area);
        
    }
    
}
