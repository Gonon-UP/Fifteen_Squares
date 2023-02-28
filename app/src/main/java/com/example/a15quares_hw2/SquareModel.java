/*
 * @author: Eduardo Gonon
 * Date: 2/27/2023
 */
package com.example.a15quares_hw2;

public class SquareModel {

    // String to tell the user they won
        private String winner;

        public SquareModel()    {
            winner = "You won!";
        }

        // Getter method
        public String getWinner() {
            return winner;
        }
}