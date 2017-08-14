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
    public String number1 = "";//String of numbers X
    public String number2 = "";//String of numbers Y
    public boolean Start = true;// if start is true then numbers X, if start is false then numbers Y
    public Double result1;//numbers X in Double form
    public Double result2;// numbers Y in Double form
    public Double result3;// numbers X,Y & Operator in Double form

    //Button ID
    @FXML
    private TextField Display; @FXML
    Button Enter; @FXML
    Button One; @FXML
    Button Two; @FXML
    Button Three; @FXML
    Button Four; @FXML
    Button Five; @FXML
    Button Six; @FXML
    Button Seven; @FXML
    Button Eight; @FXML
    Button Nine; @FXML
    Button Zero; @FXML
    Button Plus; @FXML
    Button Minus; @FXML
    Button Multiply; @FXML
    Button Divide; @FXML
    Button Store; @FXML
    Button Recall; @FXML
    Button Point;

    //Open New Stack
    public Controller() { stack = new theStack(); }
//    public String DoubleToString(Double x){
//        String result4 = String.valueOf(result3);
//        return result4;
//
//    }
//
//    private void Display(String result4) {
//        Display(result4);
//    }
//
    //action used for Number1 or X push and convert to Double
    public void actionEnter(ActionEvent event) {
        stack.push(number1);
        System.out.println("Stack size: " + stack.getSize());

        //System.out.println(result1); in this case, result1 was never instantiated in this class (but in the other class it is), hence the null. this print line is not needed.
        Display.clear();

        //Start switches...Switching Number1 X to Number2 Y
//        Start = false;
        number1 = "";
    }//i'm baaaaaaaaaaack

    //Operators +-*/
    @FXML
    public void actionPlus(javafx.event.ActionEvent event) throws IOException {
        //alright, so what does this method need to do?
        //with the way this program is written, you could (for this method) get number1, then get the top number of the stack, and add those two together
        //then push that result into the stack
        //thats basically it i think for this method
        //you could technically do that in one line of codehuh
        //but two lines would be cleaner? maybe. but either way, its very little. can you figure it out?
        //I smell a challenge I'll try. Could I use Peek? No need. remember, pop() will get rid of the top number, but it will also return the top number that was removed
        Double newNumber = stack.pop();
        System.out.println("New number: " + newNumber);
        System.out.println("Number1: " + number1);
        Double result = Double.valueOf(number1) + newNumber; //I think this line will generate an error. right here.
        System.out.println("Result: " + result);
        Display.setText(String.valueOf(stack.push(String.valueOf(result))));
        //there are sooo many comments, brother masterson would be so proud lol

        //huhhh???
        ///that's a quick thought

        System.out.println(stack.getSize());
        //System.out.println(stack.);
        System.out.println(stack.pop());
        // So i
        //if you look at the pop() method, you will see that it it takes the top level of the stack right?
//        stack.push(number1);//huhah
//
//
//
//
//        //result3 = result1 + result2; //null poiner exception right here. which one of these is not initialized? result 2? yup
//        System.out.println(result3);
//        //Start switches...Switching Number2 Y to Number1 X
//        Start = true;
//        //turns Strings back to Null maybe?
//        number1 = "";
//        number2 = "";
    }
    @FXML
    public void actionMinus(javafx.event.ActionEvent event) throws IOException {
        Double newNumber = stack.pop();
        System.out.println("New number: " + newNumber);
        System.out.println("Number1: " + number1);
        Double result = newNumber - Double.valueOf(number1); //I think this line will generate an error. right here.
        System.out.println("Result: " + result);
        Display.setText(String.valueOf(stack.push(String.valueOf(result))));
//        if (event.getSource() == Minus) {
//            stack.push(number2);
//            result3 = result1-result2;
//            System.out.println(result3);
//            //Start switches...Switching Number2 Y to Number1 X
//            Start = true;
//            number1 = "";
//            number2 = "";
//        }
    }
    @FXML
    public void actionMultiply(javafx.event.ActionEvent event) throws IOException {
        Double newNumber = stack.pop();
        System.out.println("New number: " + newNumber);
        System.out.println("Number1: " + number1);
        Double result = Double.valueOf(number1) * newNumber; //I think this line will generate an error. right here.
        System.out.println("Result: " + result);
        Display.setText(String.valueOf(stack.push(String.valueOf(result))));
//        if (event.getSource() == Multiply) {
//            stack.push(number2);
//            result3 = result1*result2;
//            System.out.println(result3);
//            //Start switches...Switching Number2 Y to Number1 X
//            Start = true;
//            number1 = "";
//            number2 = "";
//        }
    }

    @FXML
    public void actionDivide(javafx.event.ActionEvent event) throws IOException {
        Double newNumber = stack.pop();
        System.out.println("New number: " + newNumber);
        System.out.println("Number1: " + number1);
        Double result = newNumber / Double.valueOf(number1); //I think this line will generate an error. right here.
        System.out.println("Result: " + result);
        Display.setText(String.valueOf(stack.push(String.valueOf(result))));
//        if (event.getSource() == Divide) {
//            stack.push(number2);
//            result3 = result1/result2;
//            System.out.println(result3);
//            //Start switches...Switching Number2 Y to Number1 X
//            Start = true;
//            number1 = "";
//            number2 = "";
//        }
    }
// Numbers0-9 If start= true then button = number1,.... Else start= false then button = number2;
    public void actionOne(javafx.event.ActionEvent event){
        if (Start = true){ //Start = true or is it Start == true?oooo good question is it bad if i move my mouse as well. kind of yes lol. but go ahead if you need took
            Display.setText(Display.getText() + "1");
            //System.out.println(event.getSource());
            number1 = number1 + "1";
        }
        else{
            number2 = number2 + "1";
            System.out.println(number2);
        }
    }
    @FXML
    public void actionTwo(javafx.event.ActionEvent event) throws IOException{
        if (event.getSource() == Two) {
            if (Start = true){
            Display.setText(Display.getText() + "2");
            number1 = number1+"2"; }
            else{
                number2 = number2 + "2";
            }
        }
        else{
            System.out.println("Error");
        }
    }
    @FXML
    public void actionThree(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Three) {
            if (Start = true) {
                Display.setText(Display.getText() + "3");
                number1 = number1 + "3";
            } else {
                number2 = number2 + "3";
                System.out.println(number2);
            }
        }
        else{
            System.out.println("Error");
        }
    }
    @FXML
    public void actionFour(javafx.event.ActionEvent event) throws IOException{
        if (event.getSource() == Four) {
            if (Start = true){
                Display.setText(Display.getText() + "4");
                number1 = number1+"4"; }
            else {
                number2 = number2 + "4";
                System.out.println(number2);
            }
        }}
    @FXML
    public void actionFive(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Five) {
            if (Start = true) {
                Display.setText(Display.getText() + "5");
                number1 = number1 + "5";
            } else {
                number2 = number2 + "5";
                System.out.println(number2);
            } }
         else{
                System.out.println("Error");
            }
        }
    @FXML
    public void actionSix(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Six) {
            if (Start = true) {
                Display.setText(Display.getText() + "6");
                number1 = number1 + "6";
            } else {
                number2 = number2 + "6";
                System.out.println(number2);

            } }
        else{
            System.out.println("Error");
        }
    }
    @FXML
    public void actionSeven(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Seven) {
            if (Start = true){
            Display.setText(Display.getText() + "7");
            number1 = number1+"7"; }
        else { number2 = number2 + "7";
        System.out.println(number2);
            }}
    else {
            System.out.println("Error");
        }}
    @FXML
    public void actionEight(javafx.event.ActionEvent event) throws IOException{
        if (event.getSource() == Eight) {
            if (Start = true){
            Display.setText(Display.getText() + "8");
            number1 = number1+"8"; }
            else{
                number2 = number2 + "8";
                System.out.println(number2);
            }}
        else {
            System.out.println("Error");
        }}
    @FXML
    public void actionNine(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Nine) {
            if (Start = true){
            Display.setText(Display.getText() + "9");
            number1 = number1+"9"; }
            else{
                number2 = number2 + "9";
                System.out.println(number2);
            }
        }
        else {
            System.out.println("Error");
        }}
    @FXML
    public void actionZero(javafx.event.ActionEvent event) throws IOException{
        if (event.getSource() == Zero) {
            if (Start = true){
            Display.setText(Display.getText() + "0");
            number1 = number1+"0";
            }
            else{
                number2 = number2 + "0";
                System.out.println(number2);
            }
        }
        else {
            System.out.println("Error");
        }}
    //---->Functions not done yet
    @FXML
    public void actionStore(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Store) {
            Display.setText(Display.getText() + "RS");

            //stack.store();
            number2 ="";}}
    @FXML
    public void actionRecall(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Recall) {
            Display.setText(Display.getText() + "RS");
            //stack.store();
            number2 ="";}}
    @FXML
    public void actionPoint(javafx.event.ActionEvent event) throws IOException {
         if (event.getSource() == Point) {
            Display.setText(Display.getText() + "."); } }
    //<---Functions not done yet
    @Override
    public void setStack(theStack stack) {
        this.stack = stack; }
    @Override
    public void initialize(URL location, ResourceBundle resources) { }
    @Override
    public void start(Stage stage) throws Exception { }
}