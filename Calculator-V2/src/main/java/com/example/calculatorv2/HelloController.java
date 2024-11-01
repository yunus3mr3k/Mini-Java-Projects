package com.example.calculatorv2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField calculatorScreen;

    private Double evaluateExpression(String expression) {
        Double result = null;
        try {
            String[] tokens;
            if (expression.contains("+")) {
                tokens = expression.split("\\+");
                result = Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[1]);
            } else if (expression.contains("-")) {
                tokens = expression.split("-");
                result = Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[1]);
            } else if (expression.contains("x")) {
                tokens = expression.split("x");
                result = Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[1]);
            } else if (expression.contains("/")) {
                tokens = expression.split("/");
                if (Double.parseDouble(tokens[1]) == 0) {
                    calculatorScreen.setText("Tanımsız");
                    return null;
                }
                result = Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[1]);
            }

        } catch (Exception e) {
            calculatorScreen.setText("Hata!!");
        }
        return result;
    }

    @FXML
    void handleButtonDelete(ActionEvent event) {
        calculatorScreen.setText("");
    }

    @FXML
    void handleButtonDivision(ActionEvent event) {
        calculatorScreen.appendText("/");
    }

    @FXML
    void handleButtonEight(ActionEvent event) {
        calculatorScreen.appendText("8");
    }

    @FXML
    void handleButtonEqulas(ActionEvent event) {
        String expression = calculatorScreen.getText();
        Double result = evaluateExpression(expression);

        if (result != null) { // Sonuç null değilse ekrana yaz
            calculatorScreen.setText(String.valueOf(result));
        }
        // Sonuç null ise, "Tanımsız" mesajı zaten ekranda kalır
    }

    @FXML
    void handleButtonFive(ActionEvent event) {
        calculatorScreen.appendText("5");
    }

    @FXML
    void handleButtonFour(ActionEvent event) {
        calculatorScreen.appendText("4");
    }

    @FXML
    void handleButtonMinus(ActionEvent event) {
        calculatorScreen.appendText("-");
    }

    @FXML
    void handleButtonMultiplication(ActionEvent event) {
        calculatorScreen.appendText("x");
    }

    @FXML
    void handleButtonNine(ActionEvent event) {
        calculatorScreen.appendText("9");
    }

    @FXML
    void handleButtonOne(ActionEvent event) {
        calculatorScreen.appendText("1");
    }

    @FXML
    void handleButtonPlus(ActionEvent event) {
        calculatorScreen.appendText("+");
    }

    @FXML
    void handleButtonSeven(ActionEvent event) {
        calculatorScreen.appendText("7");
    }

    @FXML
    void handleButtonSix(ActionEvent event) {
        calculatorScreen.appendText("6");
    }

    @FXML
    void handleButtonThree(ActionEvent event) {
        calculatorScreen.appendText("3");
    }

    @FXML
    void handleButtonTwo(ActionEvent event) {
        calculatorScreen.appendText("2");
    }

    @FXML
    void handleButtonZero(ActionEvent event) {
        calculatorScreen.appendText("0");
    }

}
