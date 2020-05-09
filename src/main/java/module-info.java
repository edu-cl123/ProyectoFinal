module com.mycompany.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.mycompany.proyectofinal.controller to javafx.fxml;
    exports com.mycompany.proyectofinal;
}