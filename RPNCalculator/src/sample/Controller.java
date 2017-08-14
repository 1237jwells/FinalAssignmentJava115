package sample;
import java.io.*;
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
    private final String FILE_PATH;
    public String number1 = "";//String of numbers X
    //   public String number2 = "";//String of numbers Y
//    public boolean Start = true;// if start is true then numbers X, if start is false then numbers Y
//    public Double result1;//numbers X in Double form
//    public Double result2;// numbers Y in Double form
//    public Double result3;// numbers X,Y & Operator in Double form

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
    public Controller() {
        stack = new theStack();
        FILE_PATH = "RPNCalculatorStorage.txt";
    }

    public void actionEnter(ActionEvent event) {
        stack.push(number1);
        System.out.println("Stack size: " + stack.getSize());
        System.out.println(stack.peek());
        Display.clear();
        number1 = "";
    }

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
        System.out.println(stack.getSize());
        System.out.println(stack.pop());
    }
    @FXML
    public void actionMinus(javafx.event.ActionEvent event) throws IOException {
        Double newNumber = stack.pop();
        System.out.println("New number: " + newNumber);
        System.out.println("Number1: " + number1);
        Double result = newNumber - Double.valueOf(number1); //I think this line will generate an error. right here.
        System.out.println("Result: " + result);
        Display.setText(String.valueOf(stack.push(String.valueOf(result))));
    }
    @FXML
    public void actionMultiply(javafx.event.ActionEvent event) throws IOException {
        Double newNumber = stack.pop();
        System.out.println("New number: " + newNumber);
        System.out.println("Number1: " + number1);
        Double result = Double.valueOf(number1) * newNumber; //I think this line will generate an error. right here.
        System.out.println("Result: " + result);
        Display.setText(String.valueOf(stack.push(String.valueOf(result))));

    }
    @FXML
    public void actionDivide(javafx.event.ActionEvent event) throws IOException {
        Double newNumber = stack.pop();
        System.out.println("New number: " + newNumber);
        System.out.println("Number1: " + number1);
        Double result = newNumber / Double.valueOf(number1); //I think this line will generate an error. right here.
        System.out.println("Result: " + result);
        Display.setText(String.valueOf(stack.push(String.valueOf(result))));

    }

    // Numbers0-9 If start= true then button = number1,.... Else start= false then button = number2;
    @FXML
    public void actionOne(javafx.event.ActionEvent event){
        if (event.getSource() == One) {
            Display.setText(Display.getText() + "1");
            number1 = number1+"1"; }
        else{
            System.out.println("Error");
        }
    }
    @FXML
    public void actionTwo(javafx.event.ActionEvent event) throws IOException{
        if (event.getSource() == Two) {
            Display.setText(Display.getText() + "2");
            number1 = number1+"2"; }
        else{
            System.out.println("Error");
        }
    }
    @FXML
    public void actionThree(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Three) {
            Display.setText(Display.getText() + "3");
            number1 = number1+"3"; }
        else{
            System.out.println("Error");
        }
    }
    @FXML
    public void actionFour(javafx.event.ActionEvent event) throws IOException{
        if (event.getSource() == Four) {
            Display.setText(Display.getText() + "4");
            number1 = number1+"4"; }
        else{
            System.out.println("Error");
        }
    }
    @FXML
    public void actionFive(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Five) {
            Display.setText(Display.getText() + "5");
            number1 = number1+"5"; }
        else{
            System.out.println("Error");
        }
    }
    @FXML
    public void actionSix(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Six) {
            Display.setText(Display.getText() + "6");
            number1 = number1+"6"; }
        else{
            System.out.println("Error");
        }
    }
    @FXML
    public void actionSeven(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Seven) {
            Display.setText(Display.getText() + "7");
            number1 = number1+"7"; }
        else{
            System.out.println("Error");
        }
    }
    @FXML
    public void actionEight(javafx.event.ActionEvent event) throws IOException{
        if (event.getSource() == Eight) {
            Display.setText(Display.getText() + "8");
            number1 = number1+"8"; }
        else{
            System.out.println("Error");
        }
    }
    @FXML
    public void actionNine(javafx.event.ActionEvent event) throws IOException {
        if (event.getSource() == Nine) {
            Display.setText(Display.getText() + "9");
            number1 = number1+"9"; }
        else{
            System.out.println("Error");
        }
    }
    @FXML
    public void actionZero(javafx.event.ActionEvent event) throws IOException{
        if (event.getSource() == Zero) {
            Display.setText(Display.getText() + "0");
            number1 = number1+"0"; }
        else{
            System.out.println("Error");
        }
    }
    @FXML
    public void actionStore(javafx.event.ActionEvent event) throws IOException {
//        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
//                new FileOutputStream(FILE_PATH), "utf-8"))){
//            writer.write(String.valueOf(stack.peek()));
//            writer.close();
//        }catch(IOException e) {
//            e.printStackTrace();
//            //stack.store()
       }
    @FXML
    public void actionRecall(javafx.event.ActionEvent event) throws IOException {
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH));
//            String line = bufferedReader.readLine();
//            String FILE_PATHZ).setText(line);
//            bufferedReader.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
    @FXML
    public void actionPoint(javafx.event.ActionEvent event) throws IOException {
         if (event.getSource() == Point) {
            Display.setText(Display.getText() + ".");
            number1 = number1+"."; }
        else{
        System.out.println("Error");
    }
}
    @FXML
    public void actionClear(javafx.event.ActionEvent event) throws IOException {
        {stack.clear();
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