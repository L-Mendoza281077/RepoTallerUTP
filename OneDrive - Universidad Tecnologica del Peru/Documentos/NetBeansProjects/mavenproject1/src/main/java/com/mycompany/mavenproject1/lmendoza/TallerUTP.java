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
public class TallerUTP {
        public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("\n Ingrese un numero para calcular su raiz cuadrada: ");
        double numero = scanner.nextDouble();
        double raizcuadrada = Math.sqrt(numero);
        System.out.println("La Raiz cuadrada de " + numero + " es: " + raizcuadrada);
        scanner.close();
    }
}
