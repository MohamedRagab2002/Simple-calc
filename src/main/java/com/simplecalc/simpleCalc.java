package com.simplecalc;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Box;
import javafx.stage.Stage;


public class simpleCalc extends Application  {
    @Override
    public void start(Stage stage) {
        // Create layout
        VBox root = new VBox();
        GridPane grid = new GridPane();
        // Set up the grid layout
        grid.setHgap(20); // Horizontal gap between columns
        grid.setVgap(15); // Vertical gap between rows
        grid.setMinSize(500, 300); // Set the size of the grid
        grid.setPadding(new Insets(10, 10, 10, 10));

        root.setAlignment(Pos.CENTER);

        // Create scene and place it in the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);

        TextField sumField1 = new TextField();
        TextField sumField2 = new TextField();

        TextField minField1 = new TextField();
        TextField minField2 = new TextField();

        TextField divideField1 = new TextField();
        TextField divideField2 = new TextField();

        TextField mulField1 = new TextField();
        TextField mulField2 = new TextField();


        Label plusLabel = new Label("+");
        Label minusLabel = new Label("-");
        Label mulLabel = new Label("*");
        Label divideLabel = new Label("/");

        Button sumBtn = new Button("=");
        Button minusBtn = new Button("=");
        Button mulBtn = new Button("=");
        Button divBtn = new Button("=");

        Label resSum = new Label();
        Label resMin = new Label();
        Label resMull = new Label();
        Label resDiv = new Label();

        // Me
        Label name = new Label("Mohamed Ragab");
        Label id = new Label("20-00243"); // Your id

        root.getChildren().add(name);
        root.getChildren().add(id);

        // Add the grid to the root
        root.getChildren().add(grid);

        // Set alignment of name and id to the center
        GridPane.setHalignment(name, HPos.CENTER);
        GridPane.setHalignment(id, HPos.CENTER);

        // row 1 sum op
        grid.add(sumField1, 0, 2);
        grid.add(plusLabel, 1, 2);
        grid.add(sumField2, 3, 2);
        grid.add(sumBtn, 4, 2);
        grid.add(resSum, 5, 2);

        // Row 2
        grid.add(minField1, 0, 3);
        grid.add(minusLabel, 1, 3);
        grid.add(minField2, 3, 3);
        grid.add(minusBtn, 4, 3);
        grid.add(resMin, 5, 3);

        // Row 3 multiply op
        grid.add(mulField1, 0, 4);
        grid.add(mulLabel, 1, 4);
        grid.add(mulField2, 3, 4);
        grid.add(mulBtn, 4, 4);
        grid.add(resMull, 5, 4);

        // Row 4 divide op
        grid.add(divideField1, 0, 5);
        grid.add(divideLabel, 1, 5);
        grid.add(divideField2, 3, 5);
        grid.add(divBtn, 4, 5);
        grid.add(resDiv, 5, 5);

        GridPane.setHalignment(sumField1, HPos.CENTER);
        GridPane.setHalignment(sumField2, HPos.CENTER);
        GridPane.setHalignment(minField1, HPos.CENTER);
        GridPane.setHalignment(minField2, HPos.CENTER);
        GridPane.setHalignment(divideField1, HPos.CENTER);
        GridPane.setHalignment(divideField2, HPos.CENTER);
        GridPane.setHalignment(mulField1, HPos.CENTER);
        GridPane.setHalignment(mulField2, HPos.CENTER);

        GridPane.setHalignment(plusLabel, HPos.CENTER);
        GridPane.setHalignment(minusLabel, HPos.CENTER);
        GridPane.setHalignment(mulLabel, HPos.CENTER);
        GridPane.setHalignment(divideLabel, HPos.CENTER);

        GridPane.setHalignment(sumBtn, HPos.CENTER);
        GridPane.setHalignment(minusBtn, HPos.CENTER);
        GridPane.setHalignment(mulBtn, HPos.CENTER);
        GridPane.setHalignment(divBtn, HPos.CENTER);

        // Add actions
        // Sum button
        sumBtn.setOnAction((event) -> {
            try {
                resSum.setText(String.valueOf(
                        Integer.parseInt(sumField1.getText()) +
                                Integer.parseInt(sumField2.getText())));
            } catch (NumberFormatException e) {
                // Show error message
                Helpers.showErrorMessage("Invalid number, please enter a valid number");
            }
        });

        // Minus button
        minusBtn.setOnAction((event) -> {
            try {
                resMin.setText(String.valueOf(
                        Integer.parseInt(minField1.getText()) -
                                Integer.parseInt(minField2.getText())));
            } catch (NumberFormatException e) {
                // Show error message
                Helpers.showErrorMessage("Invalid number, please enter a valid number");
            }
        });

        // Mull button
        mulBtn.setOnAction((event) -> {
            try {
                resMull.setText(String.valueOf(
                        Integer.parseInt(mulField1.getText()) *
                                Integer.parseInt(mulField2.getText())));
            } catch (NumberFormatException e) {
                // Show error message
                Helpers.showErrorMessage("Invalid number, please enter a valid number");
            }
        });

        // Divide button
        divBtn.setOnAction((event) -> {
            try {
                resDiv.setText(String.valueOf(
                        Integer.parseInt(divideField1.getText()) /
                                Integer.parseInt(divideField2.getText())));
            } catch (NumberFormatException e) {
                // Show error message
                Helpers.showErrorMessage("Invalid number, please enter a valid number");
            } catch (ArithmeticException e) {
                Helpers.showErrorMessage("Can't divide by zero!");
            }
        });
        // Helpers.addActionsHandlers(calcNodes);

        // Set ub the main stage
        stage.setTitle("Simple Calculator");
        stage.show();
    }
}
