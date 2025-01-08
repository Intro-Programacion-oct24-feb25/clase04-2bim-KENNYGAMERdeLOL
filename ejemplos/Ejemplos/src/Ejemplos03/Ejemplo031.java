/*
Generar una solucion que permita sumar dos numeros atraves de un metodo, los 
// mismos deben ser ingresados por telado en el metodo main, el metodo que genera la suma debe 
//verificar que los dos numeros sean positivos para realizar la operacion caso
//caso contrario debe devoler 0 
 */
package Ejemplos03;


import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    public static void main(String[] args) {
        int valor1;
        int valor2;
        // 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer valor:");
        valor1 = entrada.nextInt();
        
        System.out.println("Ingrese el segundo valor:");
        valor2 = entrada.nextInt(); 
        int valor = obtenerSuma(valor1, valor2); // se invoca al método 
                                         // obtenerSuma
        System.out.printf("El valor de la suma es: %d\n", valor);
        
        // System.out.printf("El valor de la suma es: %d\n", obtenerSuma(10, 30));
    }
    
    
    public static int obtenerSuma(int a, int b){
        int suma;
        if(a > 0 && b > 0){
            suma = a + b;   
        }else{
        suma = 0 ; 
        }
    
        return suma;
        // return a + b;
    }
    
    
}
