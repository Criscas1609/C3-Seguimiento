package co.edu.cue.proyectofinalcorte3;

import co.edu.cue.proyectofinalcorte3.controller.LoginViewController;
import co.edu.cue.proyectofinalcorte3.model.Client;
import co.edu.cue.proyectofinalcorte3.model.Person;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class HelloApplication extends Application {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @Override
    public void start(Stage viewStage) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation((getClass().getResource("loginView.fxml")));
            Scene scene = new Scene(fxmlLoader.load(),849,600);
            viewStage.getIcons().add(new Image("https://cdn-icons-png.flaticon.com/512/2809/2809590.png"));
            viewStage.setScene(scene);
            viewStage.setResizable(false);
            LoginViewController controller = fxmlLoader.getController();
            controller.setStage(viewStage);

            viewStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }



    public static void main(String[] args) {
        launch();
    }
}