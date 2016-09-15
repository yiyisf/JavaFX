package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 * Created by liuzhe on 16/9/15.
 */
public class Grid extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window = primaryStage;
        window.setTitle("yiyi");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setHgap(10);
        gridPane.setVgap(8);

        //name label
        Label name = new Label("username:");
//        GridPane.setConstraints(name, 0, 0);

        //name input
        TextField inname = new TextField("pls input your name");
//        GridPane.setConstraints(inname, 1, 0);

        //password label
        Label pass = new Label("password:");
//        GridPane.setConstraints(name, 0, 1);

        //password input
        PasswordField inpass = new PasswordField();
//        GridPane.setConstraints(inname, 1, 1);

        Button confirm = new Button("Confirm");

        gridPane.addRow(0, name, inname);
        gridPane.addRow(1, pass, inpass);
        gridPane.addRow(2, confirm);

        Scene scene = new Scene(gridPane, 400, 300);

        window.setScene(scene);

        window.show();
    }
}












