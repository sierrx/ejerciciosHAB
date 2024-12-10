package operacionesdelectura;

import java.util.Scanner;

public class OperacionesDeLectura {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el numero A :");
        int numa = teclado.nextInt();
        System.out.println("Ingrese el numero B :");
        int numb = teclado.nextInt();
        
        
        int suma = (numa + numb);
        int rest = (numa - numb);
        int mult = (numa * numb);
        int divi = (numa / numb);
        
        
        System.out.println("La suma de tus numeros es igual a  :" + suma);
        System.out.println("La suma de tus numeros es igual a  :" + rest);
        System.out.println("La suma de tus numeros es igual a  :" + mult);
        System.out.println("La suma de tus numeros es igual a  :" + divi);
        
    }
    
}
