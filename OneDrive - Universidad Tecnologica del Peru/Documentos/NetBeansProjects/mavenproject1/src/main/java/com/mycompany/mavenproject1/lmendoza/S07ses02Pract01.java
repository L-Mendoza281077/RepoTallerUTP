/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.lmendoza;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Luis Mendoza U24301701
 */
public class S07ses02Pract01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        String apellido = "";
        double sueldo = 0.0;
        boolean empleadoIngresado = false;
        boolean sueldoIngresado = false;
        int opcion;
        do {
        String menu="""
                    ##############################
                         MENU DE OPCIONES
                    (1) Ingresar Empleado
                    (2) Ingresar Salario Mensual
                    (3) Emitir Boleta
                    (4) Salir
                    Ingrese una opción: """;
        System.out.print(menu); //Imprimimos el menu
        opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre: ");
                    nombre = sc.nextLine();
                    if (!validarTexto(nombre)) {
                        System.out.println("Nombre inválido. Solo letras.");
                        break;
                    }
                    System.out.print("Ingrese apellido: ");
                    apellido = sc.nextLine();
                    if (!validarTexto(apellido)) {
                        System.out.println("Apellido inválido. Solo letras.");
                        break;
                    }
                    empleadoIngresado = true;
                    System.out.println("Empleado registrado.");
                    break;
                case 2:
                    System.out.print("Ingrese sueldo mensual: ");
                    if (sc.hasNextDouble()) {
                        sueldo = sc.nextDouble();
                        if (sueldo > 0) {
                            sueldoIngresado = true;
                            System.out.println("Sueldo registrado.");
                        } else {
                            System.out.println("Sueldo debe ser mayor a 0.");
                        }
                    } else {
                        System.out.println("Entrada inválida. Debe ser un número.");
                        sc.next();
                    }
                    break;

                case 3:
                    if (empleadoIngresado && sueldoIngresado) {
                        emitirBoleta(nombre, apellido, sueldo);
                    } else {
                        System.out.println("Debe ingresar empleado y sueldo primero.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("❌ Opción no válida.");
            }

        } while (opcion != 4);

        sc.close();
    }

    // Validar con Pattern & Matcher
    public static boolean validarTexto(String texto) {
        Pattern pattern = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$");
        Matcher matcher = pattern.matcher(texto);
        return matcher.matches();
    }

    // Generar boleta ASCII
    public static void emitirBoleta(String nombre, String apellido, double sueldo) {
        double total = sueldo * 12;
        System.out.println("*******************************");
        System.out.println("   RESUMEN DE BOLETAS DE PAGO  ");
        System.out.println("*******************************");
        System.out.println("Nombre del Empleado: " + nombre);
        System.out.println("Apellidos del Empleado: " + apellido);
        System.out.println("Tipo: Contratado");

        String[] meses = {"Ene", "Feb", "Mar", "Abr", "May", "Jun",
                          "Jul", "Ago", "Set", "Oct", "Nov", "Dic"};

        for (int i = 0; i < meses.length; i++) {
            System.out.printf("Salario %s: %.2f\n", meses[i], sueldo);
        }

        System.out.println("-------------------------------");
        System.out.printf("Total: %.2f\n", total);
     }
}

    

