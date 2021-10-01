module com.mycompany.reto10 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires javafx.base;
    requires javafx.graphics;

    opens com.mycompany.reto10 to javafx.fxml;
    exports com.mycompany.reto10;
}
