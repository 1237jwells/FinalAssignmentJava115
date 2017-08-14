package com.company;
import javafx.application.Application;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.lang.Integer;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;

public class Controller extends Application implements Initializable {
    private theStack<Integer> stack;
    private double number = 0;
    private boolean legalflag = false;
    private double rootX;
    private double rootY;


//public class Controller implements Initializable{

    //    Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    Float data = 0f;
    int operation = -1;
    @FXML
    private TextField Display; Button Enter; Button One; Button Two; Button Three; Button Four; Button Five; Button Six; Button Seven; Button Eight; Button Nine; Button Zero; Button Plus; Button Minus; Button Multiply; Button Divide; Button Store; Button Recall; Button Point;
//    private void Number(int value) {
//        Start = true;
//        if (number < 100_000_000) {
//            number = number * 10 + value;
//            Display.setText(String.valueOf(number));
//        }
//    }


    private void doubleNumber(double value) {
        legalflag = true;
        if (number < 100_000_000) {
            number = number * 10 + value;
            Display.setText(String.valueOf(number));
        }
    }
//    private void XorY (int number){
//        if (true){
//            stack.peek(); = Enter;
//        }
//    }

    //    public Controller(Functions function) throws IOException {
//        this.function = function;
//    }
    @FXML
    public void actionButton(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == One) {
            Display.setText(Display.getText() + "1");
            stack.push(1);
        } else if (event.getSource() == Two) {
            Display.setText(Display.getText() + "2");
            stack.push(2);
        } else if (event.getSource() == Three) {
            Display.setText(Display.getText() + "3");
            stack.push(3);
        } else if (event.getSource() == Divide) {
            Display.setText(Display.getText() + "/");
            data = Float.parseFloat(Display.getText());
            operation = 4; //Division
            Display.setText("");
        } else if (event.getSource() == Four) {
            Display.setText(Display.getText() + "4");
            stack.push(4);
        } else if (event.getSource() == Five) {
            Display.setText(Display.getText() + "5");
            stack.push(5);
        } else if (event.getSource() == Six) {
            Display.setText(Display.getText() + "6");
            stack.push(6);
        } else if (event.getSource() == Multiply) {
            Display.setText(Display.getText() + "X");
            data = Float.parseFloat(Display.getText());
            operation = 3; //Multiplication
            Display.setText("");
        } else if (event.getSource() == Seven) {
            Display.setText(Display.getText() + "7");
            stack.push(7);
        } else if (event.getSource() == Eight) {
            Display.setText(Display.getText() + "8");
            stack.push(8);
        } else if (event.getSource() == Nine) {
            Display.setText(Display.getText() + "9");
            stack.push(9);
        } else if (event.getSource() == Minus) {
            Display.setText(Display.getText() + "-");
            data = Float.parseFloat(Display.getText());
            operation = 2; //Subtraction
            Display.setText("");
        } else if (event.getSource() == Zero) {
            Display.setText(Display.getText() + "0");
        } else if (event.getSource() == Point) {
            Display.setText(Display.getText() + ".");
        } else if (event.getSource() == Plus) {
            Display.setText(Display.getText() + "+");
            data = Float.parseFloat(Display.getText());
            operation = 1; //addition
            Display.setText("");
        } else if (event.getSource() == Store) {
            Display.setText(Display.getText() + "RS");
            legalflag = false;
            //stack.store();
            number = 0;

        } else if (event.getSource() == Recall) {
            Display.setText(Display.getText() + "RC");
            legalflag = false;
//            stack.pop(intNumber());
//            stack.clear();
            number = 0;

        } else if (event.getSource() == Enter) {

            legalflag = false;
            stack.push((int) number);
            number = 0;
        }

        switch (operation) {

            case 1: //Addition
                if (legalflag) {
                    stack.push((int) number);
                }
                legalflag = false;
                number = 0;

                try {
                    Display.setText(String.valueOf(stack.addition()));
                } catch (ArithmeticException ex) {
                    Display.setText("Error");
                }

            case 2: //Subtraction
                if (legalflag) {
                    stack.push((int) number);
                }
                legalflag = false;
                number = 0;

                try {
                    Display.setText(String.valueOf(stack.subtraction()));
                } catch (ArithmeticException ex) {
                    Display.setText("Error");
                }

            case 3: //Multiplcation
                if (legalflag) {
                    stack.push((int) number);
                }
                legalflag = false;
                number = 0;

                try {
                    Display.setText(String.valueOf(stack.multiplication()));
                } catch (ArithmeticException ex) {
                    Display.setText("Error");
                }


            case 4: //Division
                if (legalflag) {
                    stack.push((int) number);
                }
                legalflag = false;
                number = 0;

                try {
                    Display.setText(String.valueOf(stack.division()));
                } catch (ArithmeticException ex) {
                    Display.setText("Error");
                }

        }
    }
    public void setStack(theStack<Integer> stack) {
        this.stack = stack;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
    }
}