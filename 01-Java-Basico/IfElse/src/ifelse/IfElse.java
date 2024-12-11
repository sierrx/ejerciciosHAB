package ifelse;

import java.util.Scanner;


public class IfElse {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("BIENVENIDO AL PARQUE DE DIVERSIONES");
        System.out.println("la politica del parque tiene un limite de 100 kg");
        System.out.println("INGRESE SU PESO EN KG: ");
        float peso = teclado.nextFloat();
        
        if (100 >= peso) {
            System.out.println("USTED PUEDE SUBIRSE A LA ACTRACCION");
        }
        else{
            System.out.println("USTED NO PUEDE SUBIR A LA ATRACION");
            float dife = peso - 100;
            System.out.println("DEBIDO A QUE EXCEDE EL PESO POR : "+ dife+ " KG");
        }
        
        System.out.println("Gracias por su visita");
    }

    private static void If(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
