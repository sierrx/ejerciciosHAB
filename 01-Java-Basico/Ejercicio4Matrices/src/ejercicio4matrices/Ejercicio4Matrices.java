package ejercicio4matrices;

import java.util.Scanner;


public class Ejercicio4Matrices {

    public static void main(String[] args) {
        
        
        char lugares[][]= new char[5][5];
        int vasl=0;
        int checker=0;
        int cont=0;
        
        Scanner teclado = new Scanner(System.in);
        
        //def primer matriz
        for(int i=0;i<lugares.length;i++){
            for(int j=0;j<lugares.length;j++){
                lugares[i][j]='O';
            }
        }
        
        
        //Imprimir Matriz
        System.out.println("Lugares Disponibles O lugares ocupados X");
        System.out.print("  ");
        for (int h = 0; h < lugares.length; h++) {
            System.out.print((h + 1) + " "); 
        }
        System.out.println(); 

        for (int l = 0; l < lugares.length; l++) {
            System.out.print((l + 1) + " "); 
            for (int h = 0; h < lugares[l].length; h++) {
                System.out.print(lugares[l][h] + " ");
            }
            System.out.println(); 
        }
        //
        
        while(vasl==0){
            

            while(checker==0){
                
                System.out.println("Ingrese a continuacion la fila y luego el asiento que desea");
                int fila  = teclado.nextInt();
                int columna  = teclado.nextInt();
                System.out.println("usted selecciono la fila : "+fila+" y el asiento : "+columna);

                if(fila < 1 || fila >5 || columna < 1 || columna >5){
                    System.out.println("Ha elegido lugares Incorrectos");
                    System.out.println("Ingrese nuevamente la fila y luego el asiento que desea");
                    fila  = teclado.nextInt();
                    columna  = teclado.nextInt();
                    System.out.println("usted selecciono la fila : "+fila+" y el asiento : "+columna);
                }
                else if(lugares[fila-1][columna-1] == 'X'){
                    System.out.println("El lugar elegido esta ocupado");
                    System.out.println("Ingrese nuevamente la fila y luego el asiento que desea");
                    fila  = teclado.nextInt();
                    columna  = teclado.nextInt();
                    System.out.println("usted selecciono la fila : "+fila+" y el asiento : "+columna);
                }
                else{
                    System.out.println("El asiento "+ columna +" en la fila "+fila+" esta disponible");
                    
                    checker=1;
                }
                
                lugares[(fila-1)][(columna-1)]='X';
                System.out.println("Lugares Disponibles O lugares ocupados X");
                System.out.print("  ");
                for (int h = 0; h < lugares.length; h++) {
                    System.out.print((h + 1) + " "); 
                }
                System.out.println(); 

                for (int l = 0; l < lugares.length; l++) {
                    System.out.print((l + 1) + " "); 
                    for (int h = 0; h < lugares[l].length; h++) {
                        System.out.print(lugares[l][h] + " ");
                    }
                    System.out.println(); 
                }
                
                System.out.println("¿Desea volver a elegir otro lugar? 0=si, otro numero=no");
                vasl  = teclado.nextInt();
                if(vasl==0){
                    checker=0;
                }
                else{
                    checker=1;
                }
                
                cont++;



            }
            
            System.out.println("USTED HA COMPRADO UN TOTAL DE : "+cont+"BOLETOS");
            for(int mm=0;mm<lugares.length;mm++){
                for(int nn=0;nn<lugares.length;nn++){
                    
                    System.out.println(lugares[mm][nn]);
                    if(lugares[mm][nn]=='X'){
                        
                        System.out.println("Usted Ha comprado en lugar en la fila "+mm+"asiento"+nn);
                    }
                }
            }
        }
        
        
        
        
                
        
        
        
   
        
         
        
        
    }
    
}
