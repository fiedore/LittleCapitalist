package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("layout.fxml"));
        primaryStage.setTitle("Little Capitalist");
        Scene mainScene = new Scene(root, 800, 600);
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
