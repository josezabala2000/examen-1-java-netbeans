
package ejercicio1;
 import java.util.Scanner;
public class Ejercicio1 {
    
 public static void proceso(String[] args){

       //declaracion de variables
    Scanner entrada = new Scanner (System.in);    
    int matriz1[][],filas, columnas;
    int matriz2[][];
    int matriz3[][],fila3, columna3;
    int suma[][];
    int mul[][],filaM,columnaM;
        
    //ingreso del numero de filas y columnas que tendra la matriz
        System.out.print("Ingrese ingrese el número de filas de la matriz 1: ");
        filas = entrada.nextInt();
        System.out.println("");
        System.out.print("Ingrese el número de columnas de la matriz 1: ");
        columnas = entrada.nextInt();
        
        matriz1 = new int [filas][columnas];
        matriz2 = new int [filas][columnas];
        suma = new int [filas][columnas];
        
    //ingreso de los valores de filas y columnas    
        System.out.println("");
        System.out.println("diga los valores de la Matriz 1");
        
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                System.out.print("Fila ["+(i+1)+"] Columna ["+(j+1)+"]: ");
                matriz1[i][j] = entrada.nextInt();
    
            }
        }
        
        System.out.println("");
        System.out.println("Su Matriz 1 es: ");
        System.out.println("");
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                System.out.print(matriz1[i][j]+" ");   
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("diga los valores de la Matriz 2");
        
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                System.out.print("Fila ["+(i+1)+"] Columna ["+(j+1)+"]: ");
                matriz2[i][j] = entrada.nextInt();
    
            }
        }
        
        System.out.println("");
        System.out.println("Su Matriz 2 es: ");
        System.out.println("");
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                System.out.print(matriz2[i][j]+" ");
                
            }
            
            System.out.println("");
            
        }
        
        System.out.println("");
        System.out.println("La suma de las matricez 1 y 2 es: ");
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
                
            }
        }      
        System.out.println("");
         for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                System.out.print(suma[i][j]+" ");
                
            }
            System.out.println("");
        } 
         System.out.println(""); 
        System.out.print("Ingrese el número de columnas de la matriz (M3): ");
        columna3 = entrada.nextInt();
        matriz3 = new int [columnas][columna3];
        mul = new int [filas][columna3];
        System.out.println(""); 
        System.out.println("diga los valores de la Matriz 3");
        
        for (int i=0;i<columnas;i++){
        for (int j=0;j<columna3;j++){
                
            System.out.print("Fila ["+(i+1)+"] Columna ["+(j+1)+"]: ");
            matriz3[i][j] = entrada.nextInt();
    
            }
        } 
        
        System.out.println("");
        System.out.println("Su Matriz 3 es: ");
        System.out.println("");
        for (int i=0;i<columnas;i++){
        for (int j=0;j<columna3;j++){
                
            System.out.print(matriz3[i][j]+" ");   
            }
            System.out.println("");
            
        }
        
        System.out.println(""); 
        System.out.println("La multiplicación de (Suma x Matriz 3) es: ");
        System.out.println("");
        
        
        for (int cont2=0;cont2<columna3;cont2++){
            for (int cont1=0;cont1<filas;cont1++){
                int aux = 0;
                  for (int i=0;i<columnas;i++){
                
                    aux = ((suma[cont1][i]) * (matriz3[i][cont2])) + aux;
                  }
                   mul[cont1][cont2] = aux;
            }                
        }      
         for (int i=0;i<filas;i++){
            for (int j=0;j<columna3;j++){
                
                System.out.print(mul[i][j]+" ");
            }
            System.out.println("Procesos finalizados");
            String cond="";
            if(cond=="y"){
                    proceso();
            }
         }
         System.out.println("");
         
         
 }

 public static void eje2(String[] args){
        //PREGUNTA 2
        System.out.println("");
        Scanner entrada = new Scanner (System.in);
        int Mxy[][],filas,columnas;
        int X,Y;
        
        System.out.print("Ingrese el número de filas de la matriz: ");
        filas = entrada.nextInt();
        System.out.println("");
        System.out.print("Ingrese el número de columnas de la matriz: ");
        columnas = entrada.nextInt();
        
        Mxy = new int [filas][columnas];
       
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                
                Mxy[i][j] = (2304+10*(i+1))+(2003-3+10*(j+1));
                
            }
        }   
         System.out.println("");
        
        for (int i=0;i<filas;i++)
            for (int j=0;j<columnas;j++){
                
                System.out.print(Mxy[i][j]+" ");
                
            }
            System.out.println("");
        }   
  
}


