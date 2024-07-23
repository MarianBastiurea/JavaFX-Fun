module org.example.javafxfun {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    exports org;

    opens org to javafx.fxml, javafx.graphics;

}