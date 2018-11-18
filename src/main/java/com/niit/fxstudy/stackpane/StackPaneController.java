package com.niit.fxstudy.stackpane;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class StackPaneController {
    @FXML
    private StackPane mainPane;
    @FXML
    private AnchorPane primaryPane;
    @FXML
    private AnchorPane successPane;
    @FXML
    private AnchorPane warningPane;

    public void showPrimaryPane() {
        primaryPane.setVisible(true);
        successPane.setVisible(false);
        warningPane.setVisible(false);
    }

    public void showSuccessPane() {
        successPane.setVisible(true);
        primaryPane.setVisible(false);
        warningPane.setVisible(false);
    }

    public void showWarningPane() {
        warningPane.setVisible(true);
        primaryPane.setVisible(false);
        successPane.setVisible(false);
    }
}
