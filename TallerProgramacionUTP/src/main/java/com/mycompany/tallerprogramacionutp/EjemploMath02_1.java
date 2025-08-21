/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerprogramacionutp;
import java.util.Scanner;
/**
 *
 * @author Luis Mendoza U24301701
 */
public class EjemploMath02_1 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("\n Ingrese un numero para calcular su valor absoluto: ");
        double numero = scanner.nextDouble();
        double valorabsoluto = Math.abs(numero);
        System.out.println("Ingrese un numero " + numero + " es: " + valorabsoluto);
        scanner.close();
    }
}
