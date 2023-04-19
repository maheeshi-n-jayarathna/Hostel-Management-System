import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        URL resource = this.getClass().getResource("/view/LoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setTitle("Login");
        stage.getIcons().add(new Image("assets/logo.png"));
        Scene scene = new Scene(load);
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
}
