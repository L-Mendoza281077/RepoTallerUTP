/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.lmendoza;
import java.util.Scanner;
/**
 *
 * @author Luis Mendoza U24301701
 */
public class PA01Ejer02 {
    public static void main(String[] args) {
        // Crear Scanner
        Scanner sc = new Scanner(System.in);

        // Se ingresan los datos
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese sus apellidos: ");
        String apellidos = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese su peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("¿Es estudiante? (S/N): ");
        boolean esEstudiante = sc.nextBoolean();

        // Mostrar la información
        System.out.println("\n--- Información del Usuario ---");
        System.out.println("Nombre completo: " + nombre + " " + apellidos);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Estudiante:" + esEstudiante );

        // Cerrar Scanner
        sc.close();
}
}