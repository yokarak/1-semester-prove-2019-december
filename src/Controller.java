import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;


import java.awt.*;
import java.io.FileInputStream;

public class Controller extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello i am darkness, where did you find me :D");

        TextField textField = new TextField();
        HBox hbox = new HBox(textField);
        FileInputStream input = new FileInputStream("src/quiz/juleGran.jpg");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);

        Scene scene = new Scene(hbox,200,100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
