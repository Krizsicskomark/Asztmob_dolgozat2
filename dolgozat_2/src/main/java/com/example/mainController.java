// Created : Krizsicskó Márk
// Filename: App.java
// II/2/N, 2024.11.14
// github: https://github.com/krizsicskomark

package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private TextField ASideTF;

    @FXML
    private TextField BSideTF;

    @FXML
    private TextField CSideTF;

    @FXML
    private TextField DSideTF;

    @FXML
    private TextField ResultTF;

    @FXML
    void CaclButton(ActionEvent event) {
        StartCalc();
    }

    @FXML
    void CloseButton(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void InfoButton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Info");
        alert.setHeaderText("Hogyan kell használni?");
        alert.setContentText(
                "Írd be a trapéz 4 oldalát a helyes mezőkbe, majd nyomj rá a számít gombra és megjelenik az eredmény.\nKészítette : Krizsicskó Márk, II/2/N, 2024.11.14");
        alert.showAndWait();
    }

    public void StartCalc() {
        double a = Double.parseDouble(ASideTF.getText());
        double b = Double.parseDouble(BSideTF.getText());
        double c = Double.parseDouble(CSideTF.getText());
        double d = Double.parseDouble(DSideTF.getText());

        double result = ((a + c) / (4 * (a - c))) *
                Math.sqrt(((a + b - c + d) * (a - b - c + d) * (a + b - c - d) * (-a + b + c + d)));

        ResultTF.setText(String.valueOf(result));
    }

}
