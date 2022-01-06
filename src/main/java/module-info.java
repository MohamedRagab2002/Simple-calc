module com.simplecalc {
    requires javafx.controls;

    opens com.simplecalc to javafx.fxml;
    exports com.simplecalc;
}