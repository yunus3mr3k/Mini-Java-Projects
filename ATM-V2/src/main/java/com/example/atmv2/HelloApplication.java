package com.example.atmv2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;  // Parent sınıfını kullandık
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ATM-V2.fxml"));
        Parent root = fxmlLoader.load();  // Scene'in root bileşenini yükleyin
        Scene scene = new Scene(root);  // Root bileşen kullanılarak sahne oluşturun, sabit boyut vermeyin

        stage.setTitle("ATM-V2");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
//.color1 {color: #68284d;}
//.color2 {color: #973354;}
//.color3 {color: #d84c56;}
//.color4 {color: #ff8967;}
//.color5 {color: #ffd66b;}