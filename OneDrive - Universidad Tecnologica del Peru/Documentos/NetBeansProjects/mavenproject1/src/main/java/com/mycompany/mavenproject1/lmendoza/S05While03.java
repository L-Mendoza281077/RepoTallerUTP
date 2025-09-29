/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.lmendoza;
import java.util.Scanner;
/**
 *
 * @author Mariana
 */
public class S05While03 {
   public static void main(String[] args) { 
    int i = 0;
    int conteo = 0;
    int suma = 0;
    System.out.println ("Números pares menores a 20");
    while (i < 20) {
    if (i % 2 == 0) {
    conteo = conteo + 1;
    suma = suma + i;
    System.out.print(i + ", ");
    }
    i = i + 1;
    }
    System.out.println("\nConteo: " + conteo);
    System.out.println("Suma: " + suma);
}
}