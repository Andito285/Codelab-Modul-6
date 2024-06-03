module demo.modul6.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens demo.modul6.demo to javafx.fxml;
    exports demo.modul6.demo;
}