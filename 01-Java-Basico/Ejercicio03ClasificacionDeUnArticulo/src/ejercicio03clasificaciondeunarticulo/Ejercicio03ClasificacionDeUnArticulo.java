
package ejercicio03clasificaciondeunarticulo;

import java.util.Scanner;


public class Ejercicio03ClasificacionDeUnArticulo {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del articulo a clasificar :");
        float precio = teclado.nextFloat();
        
        if (precio < 50){
            System.out.println("El articulo es Economico");
        }
        else if (precio > 50 && precio<=100){
            System.out.println("El articulo es Accesible");
        }
        else if (precio > 100 && precio<=200){
            System.out.println("El articulo es Estandar");
        }
        else{
            System.out.println("El articulo es Premiun");
        }
        
        
    }
    
}
