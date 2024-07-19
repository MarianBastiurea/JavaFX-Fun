module org.example.javafxfun {
    requires javafx.controls;
    requires javafx.fxml;


    opens org to javafx.graphics, javafx.fxml;
}