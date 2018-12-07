/*
This is our main class. It holds the gui and renders
desired animation pane on button clicks

*/
package Furby;

import Fortune.FortuneWindow;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AnimateFurby extends Application {

    public void start(Stage primaryStage){

        //main scene

        primaryStage.setTitle("Furby Fortune Teller");


        TextField factField = new TextField();
        factField.setPrefSize(5,5);

        Button enter = new Button();//enter app
        enter.setText("Enter!");

        Button btn = new Button();//fortune button
        btn.setText("Get Fortune!");

        Button reset = new Button();//fortune button
        reset.setText("New Fortune?");


        //setting up main control pane
        Label bmLabel = new Label("Enter your birth month:");
        Label bdLabel = new Label("Enter your birth day:");
        Label ecLabel = new Label("Choose your eye color:");

        TextField monthField = new TextField();
        TextField dayField = new TextField();
        TextField colorField =new TextField();

        GridPane cb = new GridPane();
        cb.add(bmLabel, 0, 0);
        cb.add(monthField, 1, 0);
        cb.add(bdLabel, 0, 1);
        cb.add(dayField, 1, 1);
        cb.add(ecLabel, 0, 2);
        cb.add(colorField, 1, 2);
        cb.add(btn, 2,2);

        HBox cbColor = new HBox(cb);

        GridPane controls = new GridPane();
        controls.getChildren().addAll(cbColor);

        //setting up title control
        GridPane enterPane = new GridPane();
        enterPane.add(enter, 1, 1);

        //Title Card
        TitleCard tc = new TitleCard();
       //generates idel furby
        FurbyIdle fi = new FurbyIdle();


        BorderPane pane = new BorderPane();
        pane.getChildren().add(tc);
        pane.setBottom(enterPane);

        btn.setOnAction((ActionEvent event) -> {

            //plays cool furby animation
             FurbyCool fc = new FurbyCool();
             pane.setCenter(fc);
             pane.setBottom(reset);
            //opens a fortune window --
            //fortune logic is inside the window
            FortuneWindow window = new FortuneWindow(
                    colorField.getText(),
                    monthField.getText(),
                    dayField.getText()
            );

        });

         reset.setOnAction((ActionEvent event) -> {

            //resets to idle state
            pane.getChildren().clear();
            pane.getChildren().add(fi);
            pane.setBottom(controls);

        });

         enter.setOnAction((ActionEvent event) -> {


            //resets to idle state
            pane.getChildren().clear();
            pane.getChildren().add(fi);
            pane.setBottom(controls);

        });

        Scene main = new Scene(pane, 500, 350);

         //imports stylesheet from Furby folder
        main.getStylesheets().add(this.getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(main);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

