package fiedore.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label threeHas;
    public Label oneShop;
    public Label oneHas;
    public TextField oneAmount;

    public void buyAll(ActionEvent actionEvent) {
        int amount = Integer.parseInt(oneAmount.getText());
        int current = Integer.parseInt(oneHas.getText());
        oneHas.setText(String.valueOf(current + amount));
    }
}
