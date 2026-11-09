/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.turorial4;
import java.util.Scanner;
/**
 *
 * @author chenao
 */
public class Q2 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, total = 0;

        System.out.print("Enter an integer n: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            int sum = 0;
            for(int j = 1; j <= i; j++){
                sum = sum + j;
            }
            total = total + sum;
        }
        System.out.println("Sum of the series: " + total);
        sc.close();
    }
}