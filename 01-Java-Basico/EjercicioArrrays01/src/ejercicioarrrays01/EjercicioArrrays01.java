package ejercicioarrrays01;

import java.util.Scanner;


public class EjercicioArrrays01 {


    public static void main(String[] args) {
        
        int num[]= new int[15];
        int c=0;
        Scanner teclado = new Scanner(System.in);
        
        for(int i=0;i<15;i++){
            
            System.out.println("ingrese el valor de la posicion "+i);
            num[i]=teclado.nextInt();
            if(num[i]==7){
                c++;
            }
            
            
            
        }
        
        System.out.println("las veces que se ingreso el numero 7 fueron un total de : "+ c);
        
    }
    
}
