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
public class Q8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(101);
        System.out.println("n = " + n);
        System.out.print("First " + n + " prime numbers: ");
        
        int found = 0;
        int checkNum = 2;
        
        while (found < n) {
            boolean isPrime = true;
            
            for (int j = 2; j < checkNum; j++) {
                if (checkNum % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(checkNum + " ");
                found++;
            }
            checkNum++;
        }
    }
}
