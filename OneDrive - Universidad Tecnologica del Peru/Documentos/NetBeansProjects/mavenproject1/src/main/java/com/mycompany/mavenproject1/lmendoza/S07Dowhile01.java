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
public class S07Dowhile01 {
public static void main(String[] args) {
    int numero, i = 1;
Scanner lector = new Scanner (System.in);
System.out.print ("Ingrese un entero entre 1 y 12");
numero = lector. nextInt();
lector. nextLine();
do {
System.out.printf("%d x %2d = %3d\n", numero, i, numero*i); //%d imprime numero, 
} while (++i <= 14);
}
}