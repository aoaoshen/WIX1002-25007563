/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.turorial4;

/**
 *
 * @author chenao
 */
public class Q5 {
    public static void main(String[] args) {
        int p1 = 0, p2 = 0;
        int dice, currentPlayer;
        boolean isOneTurn = true;

        while (p1 <= 100 && p2 <= 100) {
            dice = (int) (Math.random() * 6 + 1);
            currentPlayer = isOneTurn ? 1 : 2;

            if (isOneTurn) {
                p1 += dice;
                isOneTurn = dice == 6;
            } else {
                p2 += dice;
                isOneTurn = dice != 6;
            }
        }

        if (p1 > 100) {
            System.out.println("Player 1 wins");
        } else {
            System.out.println("Player 2 wins");
        }
    }
}
