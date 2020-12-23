package me.jherng;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    private static Stage historyStage = null;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("views/calculator.fxml"));
        primaryStage.setTitle("Calculator");
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        createHistoryStage();
    }

    public void createHistoryStage() {
        historyStage = new Stage();
        historyStage.setTitle("Calculator History");
        historyStage.setAlwaysOnTop(true);
        historyStage.setResizable(false);
        historyStage.initModality(Modality.APPLICATION_MODAL);
    }

    public static Stage getHistoryStage() {
        return historyStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
