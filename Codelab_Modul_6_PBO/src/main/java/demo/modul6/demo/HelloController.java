package demo.modul6.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloController extends Application {

    @Override
    public void start(Stage primaryStage) {
        HelloApplication loginForm = new HelloApplication();
        Scene loginScene = new Scene(loginForm, 300, 200);

        primaryStage.setTitle("Login");
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void onHelloButtonClick(ActionEvent actionEvent) {
    }
}