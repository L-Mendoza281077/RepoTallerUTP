/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerprogramacionutp;

/**
 *
 * @author Luis Mendoza U24301701
 */
public class Sem02_S01 {
    public static void main(String[] args){
    //creamos una array del 1 al 5
    int[] nums = {1, 2, 3, 4, 5};  
    //Declaramos una variable con valor cero
    int result = 0;                
    //Bucle for desde i=0 hasta i<nums.lenght, es decir hasta el último
    //nums.length = 5, así que i toma los valores 0, 1, 2, 3, 4    
    for (int i= 0; i < nums.length; i ++) {   
        //Verifica si el índice i es par (% es el operador módulo, que da el residuo de la división).
        //Ejemplo: 0 % 2 = 0 (par), 1 % 2 = 1 (impar).
        if (i % 2 == 0) {          // 
            //Si el índice es par, suma el valor en esa posición al acumulador result.
            //Ejemplo: cuando i = 0, suma nums[0] que es 1          
            result += nums[i];
        }else {
            //Si el índice es impar, resta el valor en esa posición.
            //Ejemplo: cuando i = 1, resta nums[1] que es 2.
            result -= nums[i];
        }
    }
    //Imprime en consola el valor final de result.
    System.out.println(result);
    //Ejecución paso a paso con {1,2,3,4,5}
    //i = 0 (par)   → result =  0 + 1 =  1
    //i = 1 (impar) → result =  1 - 2 = -1
    //i = 2 (par)   → result = -1 + 3 =  2
    //i = 3 (impar) → result =  2 - 4 = -2
    //i = 4 (par)   → result = -2 + 5 =  3
    //Al final debe imprime: 3
  
}
}