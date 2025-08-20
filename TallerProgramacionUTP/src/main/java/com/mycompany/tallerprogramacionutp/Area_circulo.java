/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerprogramacionutp;

/**
 *
 * @author Mariana
 */
import java.util.Scanner;

public class Area_circulo {
public static void main(String[] args) {
        final double PI = 3.1416; // Constante
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        double area = PI * radio * radio; // Operadores

        System.out.println("El área del círculo es: " + area);
    }    
}
