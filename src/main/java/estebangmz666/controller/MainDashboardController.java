package estebangmz666.controller;

import estebangmz666.util.ExpressionEvaluator;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainDashboardController {

    @FXML
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    @FXML
    private Button btnAddition, btnDivision, btnEqual, btnMultiplication, btnPoint, btnSubstraction;
    @FXML
    private TextField tfOperation;

    private final StringBuilder currentExpression = new StringBuilder();
    private final ExpressionEvaluator evaluator = new ExpressionEvaluator(); // Instancia del evaluador

    @FXML
    public void initialize() {
        configureNumberButtons();
        configureOperatorButtons();
        btnEqual.setOnAction(e -> calculateResult());
    }

    private void configureNumberButtons() {
        setupButton(btn0, "0");
        setupButton(btn1, "1");
        setupButton(btn2, "2");
        setupButton(btn3, "3");
        setupButton(btn4, "4");
        setupButton(btn5, "5");
        setupButton(btn6, "6");
        setupButton(btn7, "7");
        setupButton(btn8, "8");
        setupButton(btn9, "9");
    }

    private void configureOperatorButtons() {
        setupButton(btnAddition, "+");
        setupButton(btnSubstraction, "-");
        setupButton(btnMultiplication, "*");
        setupButton(btnDivision, "/");
        setupButton(btnPoint, ".");
    }

    private void setupButton(Button button, String value) {
        button.setOnAction(e -> appendToExpression(value));
    }

    private void appendToExpression(String value) {
        currentExpression.append(value);
        tfOperation.setText(currentExpression.toString());
    }

    private void calculateResult() {
        try {
            String expression = currentExpression.toString().replace("÷", "/").replace("x", "*");
            double result = evaluator.evaluate(expression);
            tfOperation.setText(String.valueOf(result));
            currentExpression.setLength(0);
        } catch (Exception e) {
            tfOperation.setText("Error");
            currentExpression.setLength(0);
        }
    }
}