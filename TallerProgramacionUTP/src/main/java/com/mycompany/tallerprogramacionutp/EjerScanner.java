/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerprogramacionutp;

/**
 *
 * @author Luis Mendoza U24301701
 */
import java.util.Scanner;

public class EjerScanner {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        
        System.out.println("Tu edad es: " + edad);
        scanner.close();    
  }
}