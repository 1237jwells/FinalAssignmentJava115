package sample;
import java.lang.Double;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends Application implements Initializable {
    public theStack stack;//Stack variable
    public storeRecallStack stackStore;//Store variable
    public String number1 = "";//String of numbers1
    public Double result;//result from Operator
    private boolean lastBottonOperator;//Stops error from hitting from last Operator


    //Button ID
    @FXML
    private TextField Display;
    @FXML
    Button Enter;
    @FXML
    Button One;
    @FXML
    Button Two;
    @FXML
    Button Three;
    @FXML
    Button Four;
    @FXML
    Button Five;
    @FXML
    Button Six;
    @FXML
    Button Seven;
    @FXML
    Button Eight;
    @FXML
    Button Nine;
    @FXML
    Button Zero;
    @FXML
    Button Plus;
    @FXML
    Button Minus;
    @FXML
    Button Multiply;
    @FXML
    Button Divide;
    @FXML
    Button Store;
    @FXML
    Button Recall;
    @FXML
    Button Point;

    //Open New Stack
    public Controller() {
        stack = new theStack();
        stackStore = new storeRecallStack();
        lastBottonOperator = false;
    }

    // Enter saves number into the stack
    public void actionEnter(ActionEvent event) {
        if (!lastBottonOperator) {
            stack.push(Double.valueOf(number1));
            Display.clear();
            number1 = "";
        } else {
            stack.push(Double.valueOf(String.valueOf(result)));
            Display.clear();
            number1 = "";
        }
    }
    //number1 + Operators +-*/
    @FXML
    public void actionPlus(javafx.event.ActionEvent event) throws IOException {
        //newNumber is Stack GFEDC(B)A
        //number1 is Stack   GFEDCB(A)
        //result is Stack B operator A FEDCB(resultA)
        Double newNumber = stack.pop();
        System.out.println(number1);
        result = newNumber + Double.valueOf(number1);
        System.out.println(result);
        Display.setText(String.valueOf(stack.push(Double.parseDouble(String.valueOf(result)))));
        lastBottonOperator = true;
        number1 = "";
    }

    @FXML
    public void actionMinus(javafx.event.ActionEvent event) throws IOException {
        Double newNumber = stack.pop();
        result = newNumber - Double.valueOf(number1);
        Display.setText(String.valueOf(stack.push(Double.parseDouble(String.valueOf(result)))));
        lastBottonOperator = true;
        number1 = "";
    }

    @FXML
    public void actionMultiply(javafx.event.ActionEvent event) throws IOException {
        Double newNumber = stack.pop();
        result = newNumber * Double.valueOf(number1);
        Display.setText(String.valueOf(stack.push(Double.parseDouble(String.valueOf(result)))));
        lastBottonOperator = true;
        number1 = "";
    }

    @FXML
    public void actionDivide(javafx.event.ActionEvent event) throws IOException {
        Double newNumber = stack.pop();
        result = newNumber / Double.valueOf(number1);
        Display.setText(String.valueOf(stack.push(Double.parseDouble(String.valueOf(result)))));
        lastBottonOperator = true;
        number1 = "";

    }

    // Numbers0-9;
    // Calls Button adds string button value to variable number1
    @FXML
    public void actionOne(javafx.event.ActionEvent event) {
        if (event.getSource() == One) {
            Display.setText(Display.getText() + "1");
            number1 = number1 + "1";
        } else {
            System.out.println("Error");
        }
    }

    @FXML
    public void actionTwo(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Two) {
            Display.setText(Display.getText() + "2");
            number1 = number1 + "2";
        } else {
            System.out.println("Error");
        }
    }

    @FXML
    public void actionThree(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Three) {
            Display.setText(Display.getText() + "3");
            number1 = number1 + "3";
        } else {
            System.out.println("Error");
        }
    }

    @FXML
    public void actionFour(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Four) {
            Display.setText(Display.getText() + "4");
            number1 = number1 + "4";
        } else {
            System.out.println("Error");
        }
    }

    @FXML
    public void actionFive(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Five) {
            Display.setText(Display.getText() + "5");
            number1 = number1 + "5";
        } else {
            System.out.println("Error");
        }
    }

    @FXML
    public void actionSix(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Six) {
            Display.setText(Display.getText() + "6");
            number1 = number1 + "6";
        } else {
            System.out.println("Error");
        }
    }

    @FXML
    public void actionSeven(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Seven) {
            Display.setText(Display.getText() + "7");
            number1 = number1 + "7";
        } else {
            System.out.println("Error");
        }
    }

    @FXML
    public void actionEight(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Eight) {
            Display.setText(Display.getText() + "8");
            number1 = number1 + "8";
        } else {
            System.out.println("Error");
        }
    }

    @FXML
    public void actionNine(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Nine) {
            Display.setText(Display.getText() + "9");
            number1 = number1 + "9";
        } else {
            System.out.println("Error");
        }
    }

    @FXML
    public void actionZero(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Zero) {
            Display.setText(Display.getText() + "0");
            number1 = number1 + "0";
        } else {
            System.out.println("Error");
        }
    }

    //Store finds top of stack and save to stackStorage
    @FXML
    public void actionStore(javafx.event.ActionEvent event) throws IOException {
        stackStore.pushStore(Double.parseDouble(String.valueOf(result)));
    }
    //Recall finds value from stackStore and puts it back in stack
    @FXML
    public void actionRecall(javafx.event.ActionEvent event1) throws IOException {
        Double Storage = stackStore.popStore();
        number1 = String.valueOf(Storage);
        Display.setText(String.valueOf(stack.push(Double.parseDouble(String.valueOf(number1)))));
    }
    //adds . string number1
    @FXML
    public void actionPoint(javafx.event.ActionEvent event) throws IOException {
         if (event.getSource() == Point) {
            Display.setText(Display.getText() + ".");
            number1 = number1+ "."; }
        else{
        System.out.println("Error");
    }
}
    @FXML
    //clears stack
    public void actionClear(javafx.event.ActionEvent event) throws IOException {
        {stack.clear();
            System.out.println(stack);
        System.out.println(stack.peek());
       number1 = String.valueOf(stack.peek());
            System.out.println(stack);
        Display.clear();
        number1 = "";
        }
    }
    @Override
    public void setStack(theStack stack) {
        this.stack = stack; }
    @Override
    public void initialize(URL location, ResourceBundle resources) { }
    @Override
    public void start(Stage stage) throws Exception { }
}