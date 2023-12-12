package org.ale.gui_futbol.Views;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.ale.gui_futbol.App;
import org.ale.gui_futbol.SceneName;

public class LoginScene extends MainTemplate {
    protected TextField usernameTxt = new TextField();
    protected TextField passwordTxt = new TextField();
    protected Button saveBtn = new Button("Login");
    protected Label title = new Label("Título de la aplicación");
    private EventHandler<ActionEvent> loginEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            if (!areFieldsEmpty()) {
                // logica para autentificar en la base de datos
                var alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Auth");
                alert.setContentText("Login?");
                alert.show();
            }
        }
    };
    public LoginScene(App app) {
        super(app);
        this.name = SceneName.LOGIN;
        saveBtn.setOnAction(loginEvent);
        this.getChildren().addAll(title,usernameTxt,passwordTxt,saveBtn);
    }

    @Override
    boolean areFieldsEmpty() {
        return usernameTxt.getText().isEmpty() || passwordTxt.getText().isEmpty();
    }

}
