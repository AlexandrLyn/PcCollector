package com.example.myfirstapp;

import java.net.URL;
import java.util.ResourceBundle;

import UpdateDB.Updater;
import UpdateDB.UpdaterDB;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonClose;

    @FXML
    private Button buttonNext;

    @FXML
    private RadioButton variant1;

    @FXML
    private RadioButton variant2;

    @FXML
    private RadioButton variant3;

    @FXML
    private ToggleGroup variantGroup;

    private String typePc;

    public String getTypePc() {
        return typePc;
    }

    @FXML
    void goExit() {
        Stage stage = (Stage) buttonClose.getScene().getWindow();
        stage.close();
    }

    @FXML
    void goNext() {
        RadioButton selectedRadio = (RadioButton) variantGroup.getSelectedToggle();
        if(selectedRadio != null) {
            typePc = selectedRadio.getText();
            System.out.println(typePc);
            Updater updater = new Updater();
            updater.update(typePc);
            TransitiionButton transitiionButton = new TransitiionButton();
            transitiionButton.transitiionWithoutEvent(buttonNext, "Budget.fxml", "Pc collector");
        }

    }

    @FXML
    void initialize() {

    }

}

























