package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * Created by liuzhe on 16/9/13.
 */
public class Btn_01 extends Application  {

    Button btn;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("test button");
        btn = new Button("点击我");

//        btn.setOnAction(this);
        //使用内部匿名类
//        btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                System.out.println("按钮内坐标" + event.getX() + ":" + event.getY());
//                System.out.println("界面内坐标" + event.getSceneX() + ":" + event.getSceneY());
//                System.out.println(btn.disableProperty().getValue());
//                btn.disableProperty().set(true);
//            }
//        });
        //使用lambada表达式
        btn.setOnMouseClicked(e ->{
            System.out.println("按钮内坐标" + e.getX() + ":" + e.getY());
            System.out.println("界面内坐标" + e.getSceneX() + ":" + e.getSceneY());
            System.out.println(btn.disableProperty().getValue());
            btn.disableProperty().set(true);
            AlertBox.display("settings", "弹出的信息,请点击close关闭!");
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(btn);
        StackPane.setAlignment(btn, Pos.CENTER);
        System.out.println(btn.backgroundProperty().getName());

        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

//    @Override
//    public void handle(ActionEvent event) {
//        if (event.getSource() == btn) {
//            System.out.println(btn.disableProperty().getValue());
//            btn.disableProperty().set(true);
//        }
//    }
}
