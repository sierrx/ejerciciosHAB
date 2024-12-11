package notasuniversidadej02c2;

import java.util.Scanner;

public class NotasUniversidadEJ02C2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la calificación del alumno :");
        double cali = teclado.nextDouble();
        
        if (cali < 60 ){
            System.out.println("el rendimiento es Insuficiente");
        }
        else{
            if (cali > 60 && cali<=80  ){
                
                System.out.println("el rendimiento es Bueno");
                
            }
            else{
                if(cali > 80 && cali<=90){
                    System.out.println("el rendimiento es Notable");
                }
                else{
                    System.out.println("el rendimiento es Excelente");
                }
            }
        }
        
    }
    
}
