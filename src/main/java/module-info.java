module estebangmz666 {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires java.scripting;

    opens estebangmz666 to javafx.fxml;
    opens estebangmz666.controller to javafx.fxml;

    exports estebangmz666;
    exports estebangmz666.controller to javafx.fxml;
}