
package ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
         System.out.println("");
        Scanner entrada = new Scanner (System.in);
        int Mi[][],filas,columnas;
        int aux;
        
        System.out.print("Ingrese el número de filas de la matriz: ");
        filas = entrada.nextInt();
        System.out.println("");
        System.out.print("Ingrese el número de columnas de la matriz: ");
        columnas = entrada.nextInt();
        if (filas==columnas){
            
        Mi = new int [filas][columnas];
        
        aux = 0;
        
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                System.out.print("Fila ["+(i+1)+"] Columna ["+(j+1)+"]: ");
                Mi[i][j] = entrada.nextInt();
                
            }
        }   
         System.out.println("");
        
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                System.out.print(Mi[i][j]+" ");
                
            }
            System.out.println("");
        }   
         System.out.println("");
        
          for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){               
                if(i==j){
                    if (Mi[i][j]!=1){
                        aux = 1;     
                    }                  
                }
                else{               
                    if (Mi[i][j]!=0){                
                        aux = 1;                       
                    }                   
                }
            }
        }   
           
        if (aux==0){   
          System.out.println("Es una matriz indentidad");
        }  
        else{
           System.out.println("No es una matriz indentidad");
        }
        }else {
            System.out.println("La matriz no es identidad por no ser cuadrada");
        }

    }
    
}
