package org.ale.gui_futbol.Views;

import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import org.ale.gui_futbol.App;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.ale.gui_futbol.Exceptions.FieldsEmptyException;
import org.ale.gui_futbol.Exceptions.InvalidField;
import org.ale.gui_futbol.SceneName;

public class RegisterScene extends MainTemplate {
    private ComboBox<String> career = new ComboBox<>();
    private ComboBox<String> team = new ComboBox<>();
    private TextField usernameTxt = new TextField();
    private TextField passwordTxt = new TextField();
    private TextField phoneNumber = new TextField();
    private TextField firstName = new TextField();
    private TextField lastName = new TextField();
    private Button saveBtn = new Button("Guardar");
    private Label title = new Label("Registrar");
    private void handleRegisterEvent(ActionEvent actionEvent) throws FieldsEmptyException,InvalidField {
        if (!areFieldsEmpty()) {
            if (!isValidName(firstName.getText()) || !isValidName(lastName.getText())) {
                throw new InvalidField("Los nombres no deberían contener carácteres especiales");
            }
            if (!isValidPassword(passwordTxt.getText())) {
                throw new InvalidField("Contraseña inválida");
            }
            if (!isValidPhoneNumber(phoneNumber.getText())) {
                throw new InvalidField("Número de teléfono inválido");
            }
            if (
                    isValidUsername(usernameTxt.getText()) && isValidPassword(passwordTxt.getText()) &&
                    isValidPhoneNumber(phoneNumber.getText()) && isValidName(firstName.getText()) &&
                            isValidName(lastName.getText())
            ) {
                var alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("buh?");
                alert.setContentText("buh?");
                alert.show();
            }
        } else {
            throw new FieldsEmptyException("Todos los campos deben de estar llenos");
        }
    }

    private EventHandler<ActionEvent> registerEvent = actionEvent -> {
        try {
            handleRegisterEvent(actionEvent);
        } catch (Exception e) {
            var alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText(e.getMessage());
            alert.show();
        }
    };
    private EventHandler<ActionEvent> backEvent = actionEvent -> app.switchScene(SceneName.LOGIN);

    public RegisterScene(App app) {
        super(app);
        this.name = SceneName.REGISTER;
        backBtn.setOnAction(backEvent);
        saveBtn.setOnAction(registerEvent);
        firstName.setPromptText("Ingresa tu nombre");
        lastName.setPromptText("Ingresa tu apellido");
        phoneNumber.setPromptText("Ingresa tu número de teléfono");
        usernameTxt.setPromptText("Ingresa tu matrícula");
        passwordTxt.setPromptText("Ingresa tu matrícula");
        career.setPromptText("Carrera");
        team.setPromptText("Equipo");
        var hbox = new HBox(saveBtn,backBtn);
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.CENTER);
        this.getChildren().addAll(
                title,firstName,lastName,phoneNumber,usernameTxt,passwordTxt,career,team,hbox
        );
    }

    @Override
    boolean areFieldsEmpty() {
        return firstName.getText().isEmpty() || lastName.getText().isEmpty() || phoneNumber.getText().isEmpty()
                || usernameTxt.getText().isEmpty() || passwordTxt.getText().isEmpty();
    }
}
