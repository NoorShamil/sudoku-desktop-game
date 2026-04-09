module com.noor {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.noor to javafx.fxml;
    exports com.noor;
}
