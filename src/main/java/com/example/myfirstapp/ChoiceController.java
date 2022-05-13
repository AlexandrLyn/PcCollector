package com.example.myfirstapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ChoiceController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonClose;

    @FXML
    private Button buttonExit;

    @FXML
    private void goBack(){

        scene1 = HelloApplication.scene1;
        HelloApplication.stage1.setScene(scene1);
        HelloApplication.stage1.show();
        goExit();

    }

    Scene scene1;

    @FXML
    void goExit() {
        Stage stage = (Stage) buttonExit.getScene().getWindow();
        stage.close();
    }


}
