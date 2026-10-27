/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;
import java.util.Random;
/**
 *
 * @author chenao
 */
public class Q4 {
    public static void main(String[] args) {
        Random random = new Random();
        int p11 = random.nextInt(6)+1;
        int p12 = random.nextInt(6)+1;
        int s1 = p11 + p12;
        int p21 = random.nextInt(6)+1;
        int p22 = random.nextInt(6)+1;
        int s2 = p21 + p22;
        System.out.println("Player 1:");
        System.out.println("First roll: " + p11);
        System.out.println("Second roll: " + p12);
        System.out.println("Total score: " + s1);
        System.out.println("Player 2:");
        System.out.println("First roll: " + p21);
        System.out.println("Second roll: " + p22);
        System.out.println("Total score: " + s2);
        if(s1 > s2)
            System.out.println("Player 1 wins!");
        else if(s2 > s1)
            System.out.println("Player 2 wins!");
        else
            System.out.println("It's a tie.");
    }
}