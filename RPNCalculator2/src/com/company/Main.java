package com.company;

import java.lang.*;
import java.util.Stack;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler<ActionEvent> {




    @Override
    public void start(Stage stage) throws Exception{

        Stack<Integer> stack = new Stack<Integer>();
        Parent loader = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("RPN Calculator");
        System.out.println("stack: ");
        stage.setScene(new Scene(loader, 300, 275));
        stage.show();

        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(4);
        stack.push(8);
        stack.pop();
        stack.clear();
    }
    @java.lang.Override
    public void handle(ActionEvent event) {

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
