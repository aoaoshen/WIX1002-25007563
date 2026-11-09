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
public class Q4 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, firstDay;
        boolean leap = false;

        System.out.print("Enter the year: ");
        year = sc.nextInt();
        System.out.print("Enter the first day of the year (0=Sunday, 6=Saturday): ");
        firstDay = sc.nextInt();

        if(year % 4 == 0){
            if(year % 100 != 0 || year % 400 == 0){
                leap = true;
            }
        }
        int feb = leap ? 29 : 28;

        int mayFirst = (firstDay + 31 + feb + 31 + 30) % 7;
        System.out.println("\nMay " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for(int i = 0; i < mayFirst; i++){
            System.out.print("    ");
        }
        int d = 1;
        while(d <= 31){
            System.out.printf("%3d ", d);
            if((mayFirst + d) % 7 == 0){
                System.out.println();
            }
            d++;
        }
        System.out.println();

        int augFirst = (firstDay + 31 + feb + 31 + 30 + 31 + 30 + 31) % 7;
        System.out.println("\nAugust " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for(int i = 0; i < augFirst; i++){
            System.out.print("    ");
        }
        d = 1;
        while(d <= 31){
            System.out.printf("%3d ", d);
            if((augFirst + d) % 7 == 0){
                System.out.println();
            }
            d++;
        }
        System.out.println();
        sc.close();
    }
}
