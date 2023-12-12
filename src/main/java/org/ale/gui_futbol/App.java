package org.ale.gui_futbol;

import javafx.application.Application;
import javafx.stage.Stage;
import org.ale.gui_futbol.Views.LoginScene;
import org.ale.gui_futbol.Views.RegisterScene;

public class App extends Application {
    public final String DB_PATH = "/home/ale/Desktop/sis.db";
    private Stage stage;
    private LoginScene loginScene = new LoginScene(this);
    private RegisterScene registerScene = new RegisterScene(this);
    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        stage.setScene(registerScene.getScene());
        stage.show();
    }

    public void switchScene(SceneName name) {
        switch (name) {
            case LOGIN -> this.stage.setScene(loginScene.getScene());
            case REGISTER -> this.stage.setScene(registerScene.getScene());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
