/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerprogramacionutp;

/**
 *
 * @author Mariana
 */
public class Sem02_S01 {
    public static void main(String[] args){
    int[] nums = {1, 2, 3, 4, 5};  
    int result = 0;
    for (int i= 0; i < nums.length; i ++) {
        if (i % 2 == 0) {
          result += nums[i];
        }else {
          result += nums[i];
        }
    }
    System.out.println(result);
}
}