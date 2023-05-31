module com.example.tpc_9 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;


    opens com.example.tpc_9 to javafx.fxml;
    exports com.example.tpc_9;
}