module com.oksana.cat.dog.oksanacatmew {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.oksana.cat.dog.oksanacatmew to javafx.fxml;
    exports com.oksana.cat.dog.oksanacatmew;
}