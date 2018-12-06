//furby animated! uses a sequence of images to create an animation.
//images included are for testing--will update later.
package Furby;

import Fortune.FortuneWindow;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;
/**
 *
 * @author hobbydobbie
 */

public class AnimateFurby extends Application {

    public void start(Stage primaryStage){      

        //main scene
        BorderPane pane2 = new BorderPane();
        primaryStage.setTitle("Furby Fortune Teller");


        
        
        //imports stylesheet from Furby folder 
//        scene.getStylesheets().add(this.getClass().getResource("style.css").toExternalForm());
        
        TextField factField = new TextField();
        factField.setPrefSize(5,5);
        
        Button enter = new Button();//enter app 
        enter.setText("Enter!");
        
        Button btn = new Button();//fortune button
        btn.setText("Get Fortune!");
        
        Button reset = new Button();//fortune button
        reset.setText("New Fortune?");
        
        GridPane controls = new GridPane();
        controls.setHgap(1);
        controls.setVgap(1);
        
        controls.add(btn,2,6);
        
        //setting up control pane
        controls.add(new Label("Enter your birth month:"), 0,3);
        controls.add(new Label("Enter your birth day:"), 0,4);
        controls.add(new Label("Choose your eye color:"), 0,6);
        
        TextField monthField = new TextField();
        TextField dayField = new TextField();
        TextField colorField =new TextField();
        
        controls.add(monthField, 1,3);
        controls.add(dayField, 1,4);
        controls.add(colorField, 1,6);
        
       
        FurbyIdle fi = new FurbyIdle();
       
       
        pane2.getChildren().add(fi);
        pane2.setBottom(controls);
        
        btn.setOnAction((ActionEvent event) -> {
          
            //plays cool furby animation
             FurbyCool fc = new FurbyCool();
             pane2.setCenter(fc);
             pane2.setBottom(reset);
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
            pane2.getChildren().clear();
            pane2.getChildren().add(fi);
            pane2.setBottom(controls);
     
        });
        
        Scene main = new Scene(pane2, 500, 350);
        primaryStage.setScene(main);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}

