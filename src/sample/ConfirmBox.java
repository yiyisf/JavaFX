package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by liuzhe on 16/9/13.
 */
public class ConfirmBox {

    static boolean answer;

    public static Boolean display(String title, String message){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(200);
        window.setMinHeight(100);
        Label msg = new Label(message);

        Button yesBtn = new Button("Yes");
        Button noBtn = new Button("No");

        yesBtn.setOnMouseClicked(event -> {
            answer = true;
            window.close();
        });

        noBtn.setOnMouseClicked(event -> {
            answer = false;
            window.close();
        });

        VBox layout = new VBox();
        layout.getChildren().addAll(msg, yesBtn, noBtn);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

        return answer;
    }
}
