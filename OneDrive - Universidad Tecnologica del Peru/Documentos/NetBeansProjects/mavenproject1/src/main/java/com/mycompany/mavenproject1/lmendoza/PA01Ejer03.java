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
public class PA01Ejer03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: "); //Ingresar datos
            String nombre = sc.nextLine();
        System.out.print("Ingrese su edad: "); //Ingresamos la edad
            int edad = sc.nextInt();
        if (edad >= 18) { // Condicion para validar la edad
            System.out.println(nombre + ", ¡Bienvenido/a! Puede ingresar.");
        } else {
            System.out.println(nombre + ", Lo sentimos, no puede ingresar.");
        }
        sc.close();
    }
}
