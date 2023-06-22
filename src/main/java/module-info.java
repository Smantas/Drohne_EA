module com.example.drohne_ea {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;


    opens com.example.drohne_ea to javafx.fxml;
    exports com.example.drohne_ea;
}