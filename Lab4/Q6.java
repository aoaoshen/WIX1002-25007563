/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.turorial4;
import java.util.Random;
/**
 *
 * @author chenao
 */
public class Q6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(1000000);
        System.out.println("Random number: " + number);
        
        int digits = 0;
        int temp = number;
        
        if (temp == 0) {
            digits = 1;
        } else {
            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }
        }
        
        System.out.println("Number of digits: " + digits);
    }
}