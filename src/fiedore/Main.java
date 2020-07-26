package fiedore;

import fiedore.controller.Controller;
import fiedore.model.Model;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view/mainwindow.fxml"));
        Parent root = fxmlLoader.load();
        primaryStage.setTitle("Little Capitalist");
        Scene mainScene = new Scene(root, 800, 600);
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
