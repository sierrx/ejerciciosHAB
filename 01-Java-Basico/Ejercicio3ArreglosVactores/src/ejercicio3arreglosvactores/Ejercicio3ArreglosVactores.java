
package ejercicio3arreglosvactores;

import java.util.Scanner;


public class Ejercicio3ArreglosVactores {


    public static void main(String[] args) {
        
        float temp[]= new float[7];
        float c=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese las 7 temperaturas maximas de la semana:");
        
        for (int i=0;i< temp.length;i++){
            System.out.println("Ingrese las maxima del dia "+(i+1)+" :");
            temp[i]  = teclado.nextFloat();
            
            c=c+temp[i];
            
        }
        
        float prom =c/7;
        
        for (int j=0; j< temp.length;j++){
            
            System.out.println("La temperatura Maxima del dia :"+(j+1)+" es de "+ temp [j]+" °C");
        }
        
        System.out.println("La temperatura promedio de esta semana es de :"+prom+" °C");
        
    }
    
}
