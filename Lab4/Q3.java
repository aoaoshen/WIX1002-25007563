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
public class Q3 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, sumSquare = 0, count = 0;
        int min, max, score;

        System.out.print("Enter a score [negative score to quit]: ");
        score = sc.nextInt();
        min = score;
        max = score;

        while(score >= 0){
            sum = sum + score;
            sumSquare = sumSquare + score * score;
            count++;

            if(score < min) min = score;
            if(score > max) max = score;

            System.out.print("Enter a score [negative score to quit]: ");
            score = sc.nextInt();
        }

        double avg = (double)sum / count;
        double temp = (sumSquare - (double)sum * sum / count) / (count - 1);
        double sd = Math.sqrt(temp);

        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.printf("Average Score: %.2f\n", avg);
        System.out.printf("Standard Deviation: %.2f\n", sd);
        sc.close();
    }
}
