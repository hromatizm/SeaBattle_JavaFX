module com.example.seafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires kotlinx.coroutines.core.jvm;


    opens com.example.seafx to javafx.fxml;
    exports com.example.seafx;
    exports Cell;
}