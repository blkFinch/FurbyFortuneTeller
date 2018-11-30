//furby animated! uses a sequence of images to create an animation.
//images included are for testing--will update later.
package Furby;

import javafinal.Fortune;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
/**
 *
 * @author hobbydobbie
 */

public class AnimateFurby extends Application {

    public void start(Stage primaryStage){      
        //set stage, pane, scene
        BorderPane pane = new BorderPane();
        primaryStage.setTitle("Furby Fortune Teller");
        //StackPane pane = new StackPane();
        Scene scene = new Scene(pane, 600, 450);
        
        Button btn = new Button();
        btn.setText("Get Fortune!");
        
        GridPane controls = new GridPane();
        controls.add(btn,0,0);
        
        //get images
        ImageView image1 = new ImageView(getClass().getResource("furbyBasic.png").toExternalForm());
        ImageView image2 = new ImageView(getClass().getResource("furbyBow.png").toExternalForm());
        ImageView image3 = new ImageView(getClass().getResource("furbyBasic.png").toExternalForm());
        ImageView image4 = new ImageView(getClass().getResource("furbyBow.png").toExternalForm());
        ImageView image5 = new ImageView(getClass().getResource("furbyBasic.png").toExternalForm());
        ImageView image6 = new ImageView(getClass().getResource("furbyBow.png").toExternalForm());
        ImageView image7 = new ImageView(getClass().getResource("furbyBasic.png").toExternalForm());
        ImageView image8 = new ImageView(getClass().getResource("furbyTongue.png").toExternalForm());
        ImageView image9 = new ImageView(getClass().getResource("furbyBasic.png").toExternalForm());
        ImageView image10 = new ImageView(getClass().getResource("furbyBlink.png").toExternalForm());
        
        
        
        //should be a cleaner way to implement animation...will update.
        ImageView[] furbyArray = {image1, image2, image3, image4, image5, image6, image7, image8, image9, image10};
      
        //for now: create animation, use key frames
        Timeline timeline = new Timeline(
            new KeyFrame(Duration.millis(1000), (ActionEvent t) -> {
                pane.getChildren().setAll(image1);
                pane.setBottom(controls);
        }),
            new KeyFrame(Duration.millis(1150), (ActionEvent t) -> {
                pane.getChildren().setAll(image2);
                pane.setBottom(controls);
        }),
            new KeyFrame(Duration.millis(1300), (ActionEvent t) -> {
                pane.getChildren().setAll(image3);
                pane.setBottom(controls);
        }),
            new KeyFrame(Duration.millis(1450), (ActionEvent t) -> {
                pane.getChildren().setAll(image4);
                pane.setBottom(controls);
        }),
            new KeyFrame(Duration.millis(1600), (ActionEvent t) -> {
                pane.getChildren().setAll(image5);
                pane.setBottom(controls);
        }),
            new KeyFrame(Duration.millis(1750), (ActionEvent t) -> {
                pane.getChildren().setAll(image6);
                pane.setBottom(controls);
        }),
            new KeyFrame(Duration.millis(1900), (ActionEvent t) -> {
                pane.getChildren().setAll(image7);
                pane.setBottom(controls);
        }),
            new KeyFrame(Duration.millis(2400), (ActionEvent t) -> {
                pane.getChildren().setAll(image8);
                pane.setBottom(controls);
        }),
            new KeyFrame(Duration.millis(2200), (ActionEvent t) -> {
                pane.getChildren().setAll(image9);
                pane.setBottom(controls);
        }),
            new KeyFrame(Duration.millis(700), (ActionEvent t) -> {
                pane.getChildren().setAll(image10);
                pane.setBottom(controls);
        })
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play(); 
            
        
      
        btn.setOnAction((ActionEvent event) -> {
            //generates and returns fortune
            Fortune fortune = new Fortune();
            System.out.println(fortune.toString());
        });
        
        
        primaryStage.setScene(scene);
        primaryStage.show();

    
   
    
    }
    public static void main(String[] args) {
        launch(args);
    }
}

