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
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double P = sc.nextDouble();
        System.out.print("Enter interest in %: ");
        double i = sc.nextDouble();
        System.out.print("Enter total number of month(s): ");
        int N = sc.nextInt();
        
        double monthlyRate = i / (12 * 100);
        double M = (P * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -N));
        
        double unpaidBalance = P;
        double totalInterest = 0;
        
        System.out.printf("%-6s%-18s%-12s%-12s%-16s%-12s\n",
                "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");
        
        for (int n = 1; n <= N; n++) {
            double Cn = M * Math.pow(1 + monthlyRate, -(1 + N - n));
            double Ln = M - Cn;
            unpaidBalance = unpaidBalance - Cn;
            totalInterest = totalInterest + Ln;
            
            System.out.printf("%-6d%-18.2f%-12.2f%-12.2f%-16.2f%-12.2f\n",
                    n, M, Cn, Ln, unpaidBalance, totalInterest);
        }
        
        sc.close();
    }
}
