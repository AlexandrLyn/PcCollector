package com.example.myfirstapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BudgetController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonBack;

    @FXML
    private Button buttonClose;

    @FXML
    private Button buttonNext;

    @FXML
    private Label labelError;

    @FXML
    private TextField textBudget;

    private int budgetPC;
    Scene scene1;

    public int getBudgetPC() {
        return budgetPC;
    }

    @FXML
    void goBack() {
        scene1 = HelloApplication.scene1;
        HelloApplication.stage1.setScene(scene1);
        HelloApplication.stage1.show();
        goClose();

    }

    @FXML
    void goClose() {
        Stage stage = (Stage) buttonClose.getScene().getWindow();
        stage.close();
    }

    @FXML
    void goNext() {
        String total = textBudget.getText();
        try {
            if((total != null)) {
                budgetPC = Integer.parseInt(total);
                if(budgetPC < 5000) {
                    labelError.setText("Budget less than the min price PC");
                } else {
                    TransitiionButton transitiionButton = new TransitiionButton();
                    transitiionButton.transitiionWithoutEvent(buttonNext, "Assembly.fxml", "Pc collector");
                }
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
            labelError.setText("Error, it's not a number");
        }
    }

}


