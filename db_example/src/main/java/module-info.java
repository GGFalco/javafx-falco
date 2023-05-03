module com.example.db_example {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.db_example to javafx.fxml;
    exports com.example.db_example;
}