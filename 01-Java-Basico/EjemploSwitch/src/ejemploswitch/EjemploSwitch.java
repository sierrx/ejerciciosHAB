package ejemploswitch;

import java.util.Scanner;

public class EjemploSwitch {

    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un numero del 1 al 7 para saber que dia de la semana es :");
        int dia = teclado.nextInt();
        
        switch(dia){
            case 1: System.out.println("Hoy es Lunes");
            break;
            
            case 2: System.out.println("Hoy es Martes");
            break;
            
            case 3: System.out.println("Hoy es Miercoles");
            break;
            
            case 4: System.out.println("Hoy es Jueves");
            break;
            
            case 5: System.out.println("Hoy es Viernes");
            break;
            
            case 6: System.out.println("Hoy es Sabado");
            break;
            
            case 7: System.out.println("Hoy es Domingo");
            break;
            
            default: System.out.println("Ingreso un numero no valido");
            break;
            
        }
        
    }
    
}
