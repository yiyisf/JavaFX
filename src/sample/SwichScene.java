package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * 两个Scene间切换
 * Created by liuzhe on 16/9/13.
 */
public class SwichScene extends Application {

    Stage window;
    Scene scene1;
    Scene scene2;
    Button btn1, btn2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Label wel1 = new Label("welcome to screen 1");
        btn1 = new Button("Go to s2");

        VBox layout1 = new VBox();
        layout1.getChildren().addAll(wel1, btn1);
        layout1.setAlignment(Pos.TOP_CENTER);
        btn1.setOnMouseClicked(e -> {
            window.setScene(scene2);
            window.setTitle("welcome to s2");
        });
        scene1 = new Scene(layout1, 400, 300, Color.BLACK);

        Label wel2 = new Label("welcome to screen 2");
        btn2 = new Button("Go to s1");

        VBox layout2 = new VBox();
        layout2.getChildren().addAll(wel2, btn2);
        btn2.setOnMouseClicked(e -> {
            window.setScene(scene1);
            window.setTitle("welcome to s1");
        });
        scene2 = new Scene(layout2, 400, 300, Color.GREEN);

        window.setTitle("welcome to s1");
        window.setScene(scene1);
        window.show();
    }
}
