/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;
import java.util.Scanner;
/**
 *
 * @author chenao
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.print("Enter the operand: ");
        char op = input.next().charAt(0);
        int res = 0;
        if(op == '+')
            res = n1 + n2;
        else if(op == '-')
            res = n1 - n2;
        else if(op == '*')
            res = n1 * n2;
        else if(op == '/')
            res = n1 / n2;
        else if(op == '%')
            res = n1 % n2;
        System.out.println(n1 + " " + op + " " + n2 + " = " + res);
    }
}
