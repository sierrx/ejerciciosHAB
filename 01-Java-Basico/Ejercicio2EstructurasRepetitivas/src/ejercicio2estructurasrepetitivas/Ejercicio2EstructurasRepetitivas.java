package ejercicio2estructurasrepetitivas;

import java.util.Scanner;


public class Ejercicio2EstructurasRepetitivas {


    public static void main(String[] args) {
        
        float c=0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del articulo :");
        float precio = teclado.nextFloat();
        
        while(precio>0){
            
            c=c+precio;
            System.out.println("Si desea terminar de ingresar precio para saber el total ingrese 0 o un numero negativo");
            System.out.println("Ingrese el precio del articulo  :");
            precio = teclado.nextFloat();
        
        }
        
        System.out.println("El total de su compra es de :"+ c +" $ ");
    }
    
}
