module com.example.class2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.class2 to javafx.fxml;
    exports com.example.class2;
}