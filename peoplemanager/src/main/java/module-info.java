module com.example.peoplemanager {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.peoplemanager to javafx.fxml;
    exports com.example.peoplemanager;
}