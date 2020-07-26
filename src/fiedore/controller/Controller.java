package fiedore.controller;

import fiedore.model.Commodity;
import fiedore.model.Model;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.util.converter.NumberStringConverter;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    public Label threeHas;
    public Label oneShop;
    public Label twoShop;
    public Label threeShop;
    public Label oneHas;
    public TextField oneAmount;
    private final int AMOUNT_OF_COMMODITIES = 3;
    private final String COMM1NAME = "Cars";
    private final String COMM2NAME = "Houses";
    private final String COMM3NAME = "Drugs";

    private final int COMM1PRICE = 100;
    private final int COMM2PRICE = 1000;
    private final int COMM3PRICE = 50;

    private final int COMM1AMOUNT = 50;
    private final int COMM2AMOUNT = 30;
    private final int COMM3AMOUNT = 500;
    public GridPane rooted;

    private List<Commodity> commodities;

    public Controller() {
        commodities = new ArrayList<>();
    }

    @FXML
    public void initialize(){
        initCommodities(AMOUNT_OF_COMMODITIES);
        setInitialValues();
        bindModel();
    }

    public void initCommodities(int amount) {
        for (int i = 0; i < amount; i++) {
            commodities.add(new Commodity());
        }
    }

    private void setInitialValues() {
        commodities.get(0).setName(COMM1NAME);
        commodities.get(0).setPrice(COMM1PRICE);
        commodities.get(0).setAmount(COMM1AMOUNT);

        commodities.get(1).setName(COMM2NAME);
        commodities.get(1).setPrice(COMM2PRICE);
        commodities.get(1).setAmount(COMM2AMOUNT);

        commodities.get(2).setName(COMM3NAME);
        commodities.get(2).setPrice(COMM3PRICE);
        commodities.get(2).setAmount(COMM3AMOUNT);

    }

    private void bindModel() {
        Bindings.bindBidirectional(oneShop.textProperty(), commodities.get(0).amountProperty(), new NumberStringConverter());
        Bindings.bindBidirectional(twoShop.textProperty(), commodities.get(1).amountProperty(), new NumberStringConverter());
        Bindings.bindBidirectional(threeShop.textProperty(), commodities.get(2).amountProperty(), new NumberStringConverter());

        Bindings.bindBidirectional(oneShop.textProperty(), commodities.get(0).amountProperty(), new NumberStringConverter());
        Bindings.bindBidirectional(twoShop.textProperty(), commodities.get(1).amountProperty(), new NumberStringConverter());
        Bindings.bindBidirectional(threeShop.textProperty(), commodities.get(2).amountProperty(), new NumberStringConverter());


    }

    public void buyOne(ActionEvent actionEvent) {
        int amount = Integer.parseInt(oneAmount.getText());
        int current = Integer.parseInt(oneHas.getText());
        int currentShop = Integer.parseInt(oneShop.getText());

        if (currentShop<amount){
            return;
        }

        if (amount <0){
            oneAmount.setText("0");
            amount = 0;
        }

        oneHas.setText(String.valueOf(current + amount));
        oneShop.setText(String.valueOf(currentShop - amount));
        System.out.println(commodities.get(0).amountProperty());
    }

    public void buyTwo(ActionEvent actionEvent) {
    }

    public void buyThree(ActionEvent actionEvent) {

    }
}
