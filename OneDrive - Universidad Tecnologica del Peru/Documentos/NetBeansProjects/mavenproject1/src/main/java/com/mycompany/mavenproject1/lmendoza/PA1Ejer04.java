/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.lmendoza;
import java.util.Scanner;
/**
 * @author Luis Mendoza U24301701
 */
public class PA1Ejer04 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 4 que represente el clima:");
        System.out.println("1: Soleado");
        System.out.println("2: Nublado");
        System.out.println("3: Lluvioso");
        System.out.println("4: Tormenta");
        int clima = sc.nextInt();
        switch (clima) {
            case 1:
                System.out.println("¡Dia perfecto para salir!"); // resultado soleado
                break;
            case 2:
                System.out.println("Lleva un abrigo por si acaso."); // resultado nublado
                break;
            case 3:
                System.out.println("¡No olvides tu paraguas!"); // resultado lluvioso
                break;
            case 4:
                System.out.println("Es mejor quedarse en casa."); // resultado tormenta
                break;
            default:
                System.out.println("Opcion no valida. Por favor ingresa un numero del 1 al 4."); // resultado error
        }
        sc.close();
    }  
}
