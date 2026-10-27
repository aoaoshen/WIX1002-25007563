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
public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sales volume: ");
        double sales = input.nextDouble();
        double rate;
        if(sales < 0){
            System.out.println("Sales volume cannot be negative.");
        }
        else{
            if(sales <= 100)
                rate = 0.05;
            else if(sales <= 500)
                rate = 0.075;
            else if(sales <= 1000)
                rate = 0.10;
            else
                rate = 0.125;
            double comm = sales * rate;
            System.out.printf("Commission: %.2f\n", comm);
        }
    }
}
