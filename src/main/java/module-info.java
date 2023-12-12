module org.ale.gui_futbol {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.ale.gui_futbol to javafx.fxml;
    exports org.ale.gui_futbol;
    exports org.ale.gui_futbol.Views;
    opens org.ale.gui_futbol.Views to javafx.fxml;
}