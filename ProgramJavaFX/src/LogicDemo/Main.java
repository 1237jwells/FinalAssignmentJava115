package LogicDemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage AStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("loginView.fxml"));
        AStage.setTitle("You Suck");
        AStage.setScene(new Scene(root, 300, 275));
        AStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
