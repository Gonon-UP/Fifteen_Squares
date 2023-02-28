/*
 * @author: Eduardo Gonon
 * Date: 2/27/2023
 */
package com.example.a15quares_hw2;
import android.view.View;

public class SquareController implements View.OnClickListener {

    private SquareView squareView;
    private SquareModel squareModel;

    public SquareController(SquareModel m, SquareView v) {
        squareView = v;
        squareModel = m;
    }


    // OnClick method checks for valid moves and updates board according if it is valid
    // David Leon helped me with this method
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.b_11:
                if (squareView.buttons[0][1].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[0][0].setVisibility(View.INVISIBLE);
                    squareView.buttons[0][1].setVisibility(View.VISIBLE);
                    String buttonText1 = (String) squareView.buttons[0][0].getText();
                    squareView.buttons[0][1].setText(buttonText1);
                } else if (squareView.buttons[1][0].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[0][0].setVisibility(View.INVISIBLE);
                    squareView.buttons[1][0].setVisibility(View.VISIBLE);
                    String buttonText2 = (String) squareView.buttons[0][0].getText();
                    squareView.buttons[1][0].setText(buttonText2);
                }
                break;
            case R.id.b_12:
                if (squareView.buttons[0][0].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[0][1].setVisibility(View.INVISIBLE);
                    squareView.buttons[0][0].setVisibility(View.VISIBLE);
                    String buttonText3 = (String) squareView.buttons[0][1].getText();
                    squareView.buttons[0][0].setText(buttonText3);
                } else if (squareView.buttons[1][1].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[0][1].setVisibility(View.INVISIBLE);
                    squareView.buttons[1][1].setVisibility(View.VISIBLE);
                    String buttonText4 = (String) squareView.buttons[0][1].getText();
                    squareView.buttons[1][1].setText(buttonText4);
                } else if (squareView.buttons[0][2].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[0][1].setVisibility(View.INVISIBLE);
                    squareView.buttons[0][2].setVisibility(View.VISIBLE);
                    String buttonText5 = (String) squareView.buttons[0][1].getText();
                    squareView.buttons[0][2].setText(buttonText5);
                }
                break;
            case R.id.b_13:
                if (squareView.buttons[0][1].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[0][2].setVisibility(View.INVISIBLE);
                    squareView.buttons[0][1].setVisibility(View.VISIBLE);
                    String buttonText6 = (String) squareView.buttons[0][2].getText();
                    squareView.buttons[0][1].setText(buttonText6);
                } else if (squareView.buttons[1][2].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[0][2].setVisibility(View.INVISIBLE);
                    squareView.buttons[1][2].setVisibility(View.VISIBLE); //move there
                    String buttonText7 = (String) squareView.buttons[0][2].getText();
                    squareView.buttons[1][2].setText(buttonText7);
                } else if (squareView.buttons[0][3].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[0][2].setVisibility(View.INVISIBLE);
                    squareView.buttons[0][3].setVisibility(View.VISIBLE);
                    String buttonText8 = (String) squareView.buttons[0][2].getText();
                    squareView.buttons[0][3].setText(buttonText8);
                }
                break;
            case R.id.b_14:
                if (squareView.buttons[0][2].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[0][3].setVisibility(View.INVISIBLE);
                    squareView.buttons[0][2].setVisibility(View.VISIBLE);
                    String buttonText9 = (String) squareView.buttons[0][3].getText();
                    squareView.buttons[0][2].setText(buttonText9);
                } else if (squareView.buttons[1][3].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[0][3].setVisibility(View.INVISIBLE);
                    squareView.buttons[1][3].setVisibility(View.VISIBLE);
                    String buttonText10 = (String) squareView.buttons[0][3].getText();
                    squareView.buttons[1][3].setText(buttonText10);
                }
                break;
            case R.id.b_21:
                if (squareView.buttons[0][0].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[1][0].setVisibility(View.INVISIBLE);
                    squareView.buttons[0][0].setVisibility(View.VISIBLE);
                    String buttonText11 = (String) squareView.buttons[1][0].getText();
                    squareView.buttons[0][0].setText(buttonText11);
                } else if (squareView.buttons[1][1].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[1][0].setVisibility(View.INVISIBLE);
                    squareView.buttons[1][1].setVisibility(View.VISIBLE);
                    String buttonText12 = (String) squareView.buttons[1][0].getText();
                    squareView.buttons[1][1].setText(buttonText12);
                } else if (squareView.buttons[2][0].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[1][0].setVisibility(View.INVISIBLE);
                    squareView.buttons[2][0].setVisibility(View.VISIBLE);
                    String buttonText13 = (String) squareView.buttons[1][0].getText();
                    squareView.buttons[2][0].setText(buttonText13);
                }
                break;
            case R.id.b_22:
                if (squareView.buttons[1][0].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[1][1].setVisibility(View.INVISIBLE);
                    squareView.buttons[1][0].setVisibility(View.VISIBLE);
                    String buttonText14 = (String) squareView.buttons[1][1].getText();
                    squareView.buttons[1][0].setText(buttonText14);
                } else if (squareView.buttons[0][1].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[1][1].setVisibility(View.INVISIBLE);
                    squareView.buttons[0][1].setVisibility(View.VISIBLE);
                    String buttonText15 = (String) squareView.buttons[1][1].getText();
                    squareView.buttons[0][1].setText(buttonText15);
                } else if (squareView.buttons[2][1].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[1][1].setVisibility(View.INVISIBLE);
                    squareView.buttons[2][1].setVisibility(View.VISIBLE);
                    String buttonText16 = (String) squareView.buttons[1][1].getText();
                    squareView.buttons[2][1].setText(buttonText16);
                } else if (squareView.buttons[1][2].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[1][1].setVisibility(View.INVISIBLE);
                    squareView.buttons[1][2].setVisibility(View.VISIBLE);
                    String buttonText17 = (String) squareView.buttons[1][1].getText();
                    squareView.buttons[1][2].setText(buttonText17);
                }
                break;
            case R.id.b_23:
                if (squareView.buttons[1][1].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[1][2].setVisibility(View.INVISIBLE);
                    squareView.buttons[1][1].setVisibility(View.VISIBLE);
                    String buttonText18 = (String) squareView.buttons[1][2].getText();
                    squareView.buttons[1][1].setText(buttonText18);
                } else if (squareView.buttons[0][2].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[1][2].setVisibility(View.INVISIBLE);
                    squareView.buttons[0][2].setVisibility(View.VISIBLE);
                    String buttonText19 = (String) squareView.buttons[1][2].getText();
                    squareView.buttons[0][2].setText(buttonText19);
                } else if (squareView.buttons[2][2].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[1][2].setVisibility(View.INVISIBLE);
                    squareView.buttons[2][2].setVisibility(View.VISIBLE);
                    String buttonText20 = (String) squareView.buttons[1][2].getText();
                    squareView.buttons[2][2].setText(buttonText20);
                } else if (squareView.buttons[1][3].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[1][2].setVisibility(View.INVISIBLE);
                    squareView.buttons[1][3].setVisibility(View.VISIBLE);
                    String buttonText21 = (String) squareView.buttons[1][2].getText();
                    squareView.buttons[1][3].setText(buttonText21);
                }
                break;
            case R.id.b_24:
                if (squareView.buttons[1][2].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[1][3].setVisibility(View.INVISIBLE);
                    squareView.buttons[1][2].setVisibility(View.VISIBLE);
                    String buttonText22 = (String) squareView.buttons[1][3].getText();
                    squareView.buttons[1][2].setText(buttonText22);
                } else if (squareView.buttons[0][3].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[1][3].setVisibility(View.INVISIBLE);
                    squareView.buttons[0][3].setVisibility(View.VISIBLE);
                    String buttonText23 = (String) squareView.buttons[1][3].getText();
                    squareView.buttons[0][3].setText(buttonText23);
                } else if (squareView.buttons[2][3].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[1][3].setVisibility(View.INVISIBLE);
                    squareView.buttons[2][3].setVisibility(View.VISIBLE);
                    String buttonText24 = (String) squareView.buttons[1][3].getText();
                    squareView.buttons[2][3].setText(buttonText24);
                }
                break;
            case R.id.b_31: // if user clicks button (2,0)
                if (squareView.buttons[1][0].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[2][0].setVisibility(View.INVISIBLE);
                    squareView.buttons[1][0].setVisibility(View.VISIBLE);
                    String buttonText25 = (String) squareView.buttons[2][0].getText();
                    squareView.buttons[1][0].setText(buttonText25);
                } else if (squareView.buttons[2][1].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[2][0].setVisibility(View.INVISIBLE);
                    squareView.buttons[2][1].setVisibility(View.VISIBLE);
                    String buttonText26 = (String) squareView.buttons[2][0].getText();
                    squareView.buttons[2][1].setText(buttonText26);
                } else if (squareView.buttons[3][0].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[2][0].setVisibility(View.INVISIBLE);
                    squareView.buttons[3][0].setVisibility(View.VISIBLE);
                    String buttonText27 = (String) squareView.buttons[2][0].getText();
                    squareView.buttons[3][0].setText(buttonText27);
                }
                break;
            case R.id.b_32: // if user clicks button (2,1)
                if (squareView.buttons[2][0].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[2][1].setVisibility(View.INVISIBLE);
                    squareView.buttons[2][0].setVisibility(View.VISIBLE);
                    String buttonText28 = (String) squareView.buttons[2][1].getText();
                    squareView.buttons[2][0].setText(buttonText28);
                } else if (squareView.buttons[1][1].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[2][1].setVisibility(View.INVISIBLE);
                    squareView.buttons[1][1].setVisibility(View.VISIBLE);
                    String buttonText29 = (String) squareView.buttons[2][1].getText();
                    squareView.buttons[1][1].setText(buttonText29);
                } else if (squareView.buttons[3][1].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[2][1].setVisibility(View.INVISIBLE);
                    squareView.buttons[3][1].setVisibility(View.VISIBLE);
                    String buttonText30 = (String) squareView.buttons[2][1].getText();
                    squareView.buttons[3][1].setText(buttonText30);
                } else if (squareView.buttons[2][2].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[2][1].setVisibility(View.INVISIBLE);
                    squareView.buttons[2][2].setVisibility(View.VISIBLE);
                    String buttonText31 = (String) squareView.buttons[2][1].getText();
                    squareView.buttons[2][2].setText(buttonText31);
                }
                break;
            case R.id.b_33:
                if (squareView.buttons[2][1].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[2][2].setVisibility(View.INVISIBLE);
                    squareView.buttons[2][1].setVisibility(View.VISIBLE);
                    String buttonText32 = (String) squareView.buttons[2][2].getText();
                    squareView.buttons[2][1].setText(buttonText32);
                } else if (squareView.buttons[1][2].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[2][2].setVisibility(View.INVISIBLE);
                    squareView.buttons[1][2].setVisibility(View.VISIBLE);
                    String buttonText33 = (String) squareView.buttons[2][2].getText();
                    squareView.buttons[1][2].setText(buttonText33);
                } else if (squareView.buttons[3][2].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[2][2].setVisibility(View.INVISIBLE);
                    squareView.buttons[3][2].setVisibility(View.VISIBLE);
                    String buttonText34 = (String) squareView.buttons[2][2].getText();
                    squareView.buttons[3][2].setText(buttonText34);
                } else if (squareView.buttons[2][3].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[2][2].setVisibility(View.INVISIBLE);
                    squareView.buttons[2][3].setVisibility(View.VISIBLE);
                    String buttonText35 = (String) squareView.buttons[2][2].getText();
                    squareView.buttons[2][3].setText(buttonText35);
                }
                break;
            case R.id.b_34: // if user clicks button (2,3)
                if (squareView.buttons[1][3].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[2][3].setVisibility(View.INVISIBLE);
                    squareView.buttons[1][3].setVisibility(View.VISIBLE);
                    String buttonText36 = (String) squareView.buttons[2][3].getText();
                    squareView.buttons[1][3].setText(buttonText36);
                } else if (squareView.buttons[2][2].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[2][3].setVisibility(View.INVISIBLE);
                    squareView.buttons[2][2].setVisibility(View.VISIBLE);
                    String buttonText37 = (String) squareView.buttons[2][3].getText();
                    squareView.buttons[2][2].setText(buttonText37);
                } else if (squareView.buttons[3][3].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[2][3].setVisibility(View.INVISIBLE);
                    squareView.buttons[3][3].setVisibility(View.VISIBLE);
                    String buttonText38 = (String) squareView.buttons[2][3].getText();
                    squareView.buttons[3][3].setText(buttonText38);
                }
                break;
            case R.id.b_41: // if user clicks button (3,0)
                if (squareView.buttons[2][0].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[3][0].setVisibility(View.INVISIBLE);
                    squareView.buttons[2][0].setVisibility(View.VISIBLE);
                    String buttonText39 = (String) squareView.buttons[3][0].getText();
                    squareView.buttons[2][0].setText(buttonText39);
                } else if (squareView.buttons[3][1].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[3][0].setVisibility(View.INVISIBLE);
                    squareView.buttons[3][1].setVisibility(View.VISIBLE);
                    String buttonText40 = (String) squareView.buttons[3][0].getText();
                    squareView.buttons[3][1].setText(buttonText40);
                }
                break;
            case R.id.b_42: // if user clicks button (3,1)
                if (squareView.buttons[3][0].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[3][1].setVisibility(View.INVISIBLE);
                    squareView.buttons[3][0].setVisibility(View.VISIBLE);
                    String buttonText41 = (String) squareView.buttons[3][1].getText();
                    squareView.buttons[3][0].setText(buttonText41);
                } else if (squareView.buttons[2][1].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[3][1].setVisibility(View.INVISIBLE);
                    squareView.buttons[2][1].setVisibility(View.VISIBLE);
                    String buttonText42 = (String) squareView.buttons[3][1].getText();
                    squareView.buttons[2][1].setText(buttonText42);
                } else if (squareView.buttons[3][2].getVisibility() == View.INVISIBLE) {

                    squareView.buttons[3][1].setVisibility(View.INVISIBLE);
                    squareView.buttons[3][2].setVisibility(View.VISIBLE);
                    String buttonText43 = (String) squareView.buttons[3][1].getText();
                    squareView.buttons[3][2].setText(buttonText43);
                }
                break;
            case R.id.b_43: // if user clicks button (3,2)
                if (squareView.buttons[3][1].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[3][2].setVisibility(View.INVISIBLE);
                    squareView.buttons[3][1].setVisibility(View.VISIBLE);
                    String buttonText44 = (String) squareView.buttons[3][2].getText();
                    squareView.buttons[3][1].setText(buttonText44);
                } else if (squareView.buttons[2][2].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[3][2].setVisibility(View.INVISIBLE);
                    squareView.buttons[2][2].setVisibility(View.VISIBLE);
                    String buttonText45 = (String) squareView.buttons[3][2].getText();
                    squareView.buttons[2][2].setText(buttonText45);
                } else if (squareView.buttons[3][3].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[3][2].setVisibility(View.INVISIBLE);
                    squareView.buttons[3][3].setVisibility(View.VISIBLE);
                    String buttonText46 = (String) squareView.buttons[3][2].getText();
                    squareView.buttons[3][3].setText(buttonText46);
                }
                break;
            case R.id.b_44:
                if (squareView.buttons[3][2].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[3][3].setVisibility(View.INVISIBLE);
                    squareView.buttons[3][2].setVisibility(View.VISIBLE);
                    String buttonText47 = (String) squareView.buttons[3][3].getText();
                    squareView.buttons[3][2].setText(buttonText47);
                } else if (squareView.buttons[2][3].getVisibility() == View.INVISIBLE) {
                    squareView.buttons[3][3].setVisibility(View.INVISIBLE);
                    squareView.buttons[2][3].setVisibility(View.VISIBLE);
                    String buttonText48 = (String) squareView.buttons[3][3].getText();
                    squareView.buttons[2][3].setText(buttonText48);
                }
        }

        // Checks if the user tapped the reset button
        if (v.getId() == R.id.Reset) {
            squareView.shuffleBoard();
            squareView.setColor();
            squareView.winner.setVisibility(View.INVISIBLE);
        }
        boolean result = squareView.status();

        if (result) {
            squareView.winner.setVisibility(View.VISIBLE);
            squareView.isWinner();
        }
    }
}


