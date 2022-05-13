package com.example.myfirstapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class AssemblyController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label blockPowerLabel;

    @FXML
    private Button buttonClose;

    @FXML
    private Label caseLabel;

    @FXML
    private Label coolingLabel;

    @FXML
    private Label cpuLabel;

    @FXML
    private Label gpuLabel;

    @FXML
    private Label hddLabel;

    @FXML
    private Label motherboardLabel;

    @FXML
    private Label ramLabel;

    @FXML
    private Label ssdLabel;

    @FXML
    void goClose() {
        Stage stage = (Stage) buttonClose.getScene().getWindow();
        stage.close();
    }

    @FXML
    void initialize() {
        assert blockPowerLabel != null : "fx:id=\"blockPowerLabel\" was not injected: check your FXML file 'Assembly.fxml'.";
        assert buttonClose != null : "fx:id=\"buttonClose\" was not injected: check your FXML file 'Assembly.fxml'.";
        assert caseLabel != null : "fx:id=\"caseLabel\" was not injected: check your FXML file 'Assembly.fxml'.";
        assert coolingLabel != null : "fx:id=\"coolingLabel\" was not injected: check your FXML file 'Assembly.fxml'.";
        assert cpuLabel != null : "fx:id=\"cpuLabel\" was not injected: check your FXML file 'Assembly.fxml'.";
        assert gpuLabel != null : "fx:id=\"gpuLabel\" was not injected: check your FXML file 'Assembly.fxml'.";
        assert hddLabel != null : "fx:id=\"hddLabel\" was not injected: check your FXML file 'Assembly.fxml'.";
        assert motherboardLabel != null : "fx:id=\"motherboardLabel\" was not injected: check your FXML file 'Assembly.fxml'.";
        assert ramLabel != null : "fx:id=\"ramLabel\" was not injected: check your FXML file 'Assembly.fxml'.";
        assert ssdLabel != null : "fx:id=\"sddLabel\" was not injected: check your FXML file 'Assembly.fxml'.";

    }

}
