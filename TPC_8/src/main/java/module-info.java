module com.example.tpc_8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tpc_8 to javafx.fxml;
    exports com.example.tpc_8;
}