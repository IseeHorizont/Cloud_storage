package io;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CloudApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("cloud.fxml"));
        stage.setScene(new Scene(parent));
        stage.setTitle("Cloud");
        stage.setResizable(false);
        stage.setOnCloseRequest(r ->{
            try {
                Network.get().write("/quit");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        stage.show();
    }
}
