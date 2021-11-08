package com.test.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginWindowController {

    @FXML
    private TextField emailAdressField;

    @FXML
    private Button erroeLabel;

    @FXML
    private TextField passwordField;

    @FXML
    void loginButtonAction() {
        System.out.println("Click for reset");
    }
}
