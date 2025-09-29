/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.lmendoza;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 *
 * @author Luis Enrique Mendoza Dianderas U24301701
 */
public class PC1Ejerc01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Pattern regexSi = Pattern.compile("(?i)s[ií]");  // (?i) ignora mayúsculas/minúsculas
        Pattern regexNo = Pattern.compile("(?i)no");     // acepta no, NO, No...
    boolean continuar = true;
    while (continuar) {
        System.out.print("Ingrese un número entre 1 y 100: ");
        int numero = sc.nextInt();
            if (numero >= 1 && numero <= 100) {
                sc.nextLine(); // limpiar buffer
                System.out.print("¿Desea continuar? (Si/No): ");
                String respuesta = sc.nextLine().trim();
                    if (regexSi.matcher(respuesta).matches()) {
                    continuar = true; // sigue el bucle
                    } else 
                        if (regexNo.matcher(respuesta).matches()) {
                        continuar = false; // termina
                        } else {
                        System.out.println("Respuesta no válida. El programa termina.");
                        continuar = false;
                    }
            } else {
            System.out.println("Número fuera de rango. Intente nuevamente.");
        }
    }
    System.out.println("Programa finalizado.");
    sc.close();
}
}
