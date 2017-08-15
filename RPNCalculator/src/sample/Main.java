package sample;
import java.lang.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {
    @Override// Link/Resource,Stage for showing calculator
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setScene(new Scene(root, 300, 275));
        stage.show();
    }
    @Override //Object handles Action Events
    public void handle(ActionEvent event) {

    }
    //Main start program
    public static void main(String[] args) { launch(args);
    }

}
