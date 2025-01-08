/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos03;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor1;
        int limite;
        int opcion;
        String mensajeSuma;
        String mensajeSumaDos;
        System.out.println("Ingrese el primer valor");
        valor1 = entrada.nextInt();       
        System.out.println("Ingrese el limite de la tabla");
        limite = entrada.nextInt();     
         System.out.println("Ingrese 1 para generar la tabla de suma");
        opcion = entrada.nextInt();   
         System.out.println("Ingrese 2 para generar la tabla de multiplicaion");
        opcion = entrada.nextInt();
        switch(opcion){
            case 1:
              mensajeSuma = obtenerTablaSumar(limite, valor1);
              System.out.printf("%s\n", mensajeSuma);
              break;
            case 2:
              mensajeSumaDos = obtenerTablaMultiplicar(limite, valor1);
              System.out.printf("%s\n", mensajeSumaDos);
              break;
        } 
        // 
        
        for (int i = 1; i <= 10; i++) {
            mensajeSuma = obtenerTablaSumar(10, i);

            mensajeSumaDos = obtenerTablaMultiplicar(10, i);

            System.out.printf("%s\n", mensajeSuma);
            System.out.printf("%s\n", mensajeSumaDos);
        }

    }

    public static String obtenerTablaSumar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;
    }

    public static String obtenerTablaMultiplicar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;

    }

}
