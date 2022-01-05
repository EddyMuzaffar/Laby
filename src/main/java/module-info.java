module com.example.laby {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.laby to javafx.fxml;
    exports com.example.laby;
}