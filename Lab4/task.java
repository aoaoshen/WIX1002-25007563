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
public class task {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        System.out.print("Enter the first day of the year (0-6): ");
        int firstDayOfYear = sc.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int febDays = isLeapYear ? 29 : 28;
        int daysBeforeNov = 31 + febDays + 31 + 30 + 31 + 30 + 31 + 31 + 30;
        int firstDayNov = (firstDayOfYear + daysBeforeNov) % 7;

        // 表头：Mon Tue Wed Thu Fri Sat Sun（周一开头，和截图同学输出一致）
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 0; i < firstDayNov; i++){
            System.out.print("    ");
        }
        int day = 1;
        while(day <= 30){
            System.out.printf("%3d ", day);
            if((firstDayNov + day) % 7 == 0){
                System.out.println();
            }
            day++;
        }
        System.out.println();
        sc.close();
    }
}