/*
 * @author: Eduardo Gonon
 * Date: 2/27/2023
 */
package com.example.a15quares_hw2;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;


public class SquareView {

    // Private + public instance variables
    private SquareModel squareModel;
    private Button resetButton; // for the reset button
    private Random rng; // For shuffling
    public Button[][] buttons; // Creating the board
    public TextView winner; // For telling the winner they won



    public SquareView(SquareModel m) {
        squareModel = m;
        buttons = new Button[4][4];
    }

    //Function to add button to the board
    public void addButton(int row, int col, Button b) {
        buttons[row][col] = b;
    }

    // Function to add reset button
    public void addResetButton(Button b) {
        resetButton = b;
    }

    // Function to add text to the winner message
    public void addTextView(TextView text) {
        winner = text;
    }

    public void setText(String player_Wins) {
        winner.setText(player_Wins);
    }

    // To change the visibility of the buttons
    public void showButtons() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                buttons[i][j].setVisibility(View.VISIBLE);
                if (i == 3 && j == 3) {
                    buttons[i][j].setVisibility(View.INVISIBLE);
                }
            }
        }
    }


    public boolean status() {

        String[] stringArray = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        int result = 0;
        int z = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (!(i == 3 && j == 3) && buttons[i][j].getText().equals(stringArray[z])) {
                    result++;
                }
                z++;
            }
        }
        if (result == 15) {
            return true;
        }
        else {
            return false;
        }
    }

    // When player has won the game
    public void isWinner() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                buttons[i][j].setBackgroundColor(Color.YELLOW);
                buttons[i][j].setTextColor(Color.BLACK);
            }
        }
    }


    // Shuffles the board buttons
    public void shuffleBoard() {

        rng = new Random();
        int ran_1;
        int ran_2;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ran_1 = rng.nextInt(4);
                ran_2 = rng.nextInt(4);

                if (ran_1 == 3 && ran_2 == 3) {
                    ran_1 -= rng.nextInt(2) + 1;
                    ran_2 -= rng.nextInt(2) + 1;
                }

                String num1 = (String) buttons[ran_1][ran_2].getText();
                String num2 = (String) buttons[i][j].getText();

                if(!(i == 3 && j == 3)) {
                    buttons[ran_1][ran_2].setText(num2);
                    buttons[i][j].setText(num1);
                }
                else if(i == 3 && j == 3) {
                    buttons[ran_1][ran_2].setText(num1);
                }
            }
        }
    }


    // Sets the button color to blue and text color to white
    public void setColor() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                buttons[i][j].setBackgroundColor(Color.BLUE);
                buttons[i][j].setTextColor(Color.WHITE);
            }
        }
    }

    // Sets the click for all buttons
    public void setListener(View.OnClickListener _click)
    {
        for(int i = 0; i < 4; i++)  {
            for(int j = 0; j < 4; j++)  {
                buttons[i][j].setOnClickListener(_click);
            }
        }
        resetButton.setOnClickListener(_click);
    }
}