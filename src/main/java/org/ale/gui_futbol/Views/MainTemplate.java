package org.ale.gui_futbol.Views;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.VBox;
import org.ale.gui_futbol.App;
import org.ale.gui_futbol.SceneName;

import java.util.regex.Pattern;

public abstract class MainTemplate extends VBox {
    protected SceneName name;
    protected App app;
    protected Scene scene;
    protected Button backBtn = new Button("Atrás");
    public MainTemplate(App app) {
        this.app = app;
        this.scene = new Scene(this,800,600);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(15);
    }
    abstract boolean areFieldsEmpty();

    protected boolean isValidUsername(String password) {
        return Pattern.compile(".{6,}").matcher(password).matches();
    }
    protected boolean isValidPassword(String password) {
        return Pattern.compile(".{7,}").matcher(password).matches();
    }

    protected boolean isValidPhoneNumber(String str) {
        return Pattern.compile(".{9,}").matcher(str).matches();
    }

    protected boolean isValidName(String str) {
        return Pattern.compile("[a-zA-Z]+").matcher(str).matches();
    }
}
