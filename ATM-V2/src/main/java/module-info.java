module com.example.atmv2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.atmv2 to javafx.fxml;
    exports com.example.atmv2;
}