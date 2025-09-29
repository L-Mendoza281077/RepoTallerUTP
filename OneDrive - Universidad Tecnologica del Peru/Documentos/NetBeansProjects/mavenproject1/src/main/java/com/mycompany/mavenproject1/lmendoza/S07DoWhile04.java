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
public class S07DoWhile04 {
    public static void main(String[] args) {    
    Scanner lector = new Scanner (System.in);
    int opcion = 0;
    String menu ="""
        |===================================|             
        |  Acciones disponibles:
        |  [1] Agregar notas
        |  [2] Ver promedio
        |  [3] Salir
        |===================================|             
    Ingrese una opción: """;
    do {
    System.out.println(menu);
    opcion = lector. nextInt();
    lector. nextLine();
    } while (opcion != 3);
 
}
}
