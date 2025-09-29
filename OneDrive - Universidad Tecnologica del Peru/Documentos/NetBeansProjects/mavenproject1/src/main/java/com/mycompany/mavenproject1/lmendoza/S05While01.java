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
public class S05While01 {
  public static void main(String[] args) {
    int edad = -1;
Scanner lector = new Scanner(System.in);
while (edad < 0) {
System.out.print("Ingrese su edad: ");
edad = lector.nextInt();
lector.nextLine();
}
System.out.println("Edad ingresada: " + edad); 
}
}