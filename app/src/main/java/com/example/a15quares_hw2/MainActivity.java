/*
 * @author: Eduardo Gonon
 * Date: 2/27/2023
 * HW2: 15 Squares
 */
package com.example.a15quares_hw2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // Creating objects for button
            SquareModel squareModel = new SquareModel();
            SquareView squareView = new SquareView(squareModel);

            // Adding buttons to the array
            squareView.addButton(0,0, findViewById(R.id.b_11));
            squareView.addButton(0,1, findViewById(R.id.b_12));
            squareView.addButton(0,2, findViewById(R.id.b_13));
            squareView.addButton(0,3, findViewById(R.id.b_14));
            squareView.addButton(1,0, findViewById(R.id.b_21));
            squareView.addButton(1,1, findViewById(R.id.b_22));
            squareView.addButton(1,2, findViewById(R.id.b_23));
            squareView.addButton(1,3, findViewById(R.id.b_24));
            squareView.addButton(2,0, findViewById(R.id.b_31));
            squareView.addButton(2,1, findViewById(R.id.b_32));
            squareView.addButton(2,2, findViewById(R.id.b_33));
            squareView.addButton(2,3, findViewById(R.id.b_34));
            squareView.addButton(3,0, findViewById(R.id.b_41));
            squareView.addButton(3,1, findViewById(R.id.b_42));
            squareView.addButton(3,2, findViewById(R.id.b_43));
            squareView.addButton(3,3, findViewById(R.id.b_44));


            // Adding all the methods to the squareView array
            squareView.addResetButton(findViewById(R.id.Reset)); // Check
            squareView.addTextView(findViewById(R.id.Winner));
            squareView.setColor();
            squareView.showButtons();
            squareView.shuffleBoard();
            squareView.setText(squareModel.getWinner());


            // Creating controller object for button
            SquareController controller = new SquareController(squareModel, squareView); // Check
            squareView.setListener(controller);
        }
    }