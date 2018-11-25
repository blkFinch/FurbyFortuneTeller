//furby animated! uses a sequence of images to create an animation.
//images included are for testing--will update later.
package Furby;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.TimelineBuilder;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
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
        primaryStage.setTitle("Furby Fortune Teller");
        StackPane pane = new StackPane();
        Scene scene = new Scene(pane, 500, 350);
        
        //get images
        ImageView image1 = new ImageView(getClass().getResource("testFurby1.png").toExternalForm());
        ImageView image2 = new ImageView(getClass().getResource("testFurby2.png").toExternalForm());
        ImageView image3 = new ImageView(getClass().getResource("testFurby3.png").toExternalForm());
        ImageView image4 = new ImageView(getClass().getResource("testFurby4.png").toExternalForm());
        ImageView image5 = new ImageView(getClass().getResource("testFurby5.png").toExternalForm());
        ImageView image6 = new ImageView(getClass().getResource("testFurby6.png").toExternalForm());
        ImageView image7 = new ImageView(getClass().getResource("testFurby7.png").toExternalForm());
        ImageView image8 = new ImageView(getClass().getResource("testFurby8.png").toExternalForm());
        
        
        
        //should be a cleaner way to implement animation...will update.
        //ImageView[] furbyArray = {image1, image2, image3, etc.,};
      
        //for now: create animation, use key frames
        TimelineBuilder.create()
        .cycleCount(Animation.INDEFINITE)
        .keyFrames(
            new KeyFrame(Duration.millis(800), new EventHandler<ActionEvent>(){
               @Override
                public void handle(ActionEvent t) {
                    pane.getChildren().setAll(image1);
                }
            }),
            new KeyFrame(Duration.millis(850), new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent t) {
                     pane.getChildren().setAll(image2);
                }
            }),
            new KeyFrame(Duration.millis(900), new EventHandler<ActionEvent>(){
               @Override
                public void handle(ActionEvent t) {
                     pane.getChildren().setAll(image3);
                }
            }),
            new KeyFrame(Duration.millis(950), new EventHandler<ActionEvent>(){
               @Override
                public void handle(ActionEvent t) {
                     pane.getChildren().setAll(image4);
                }
            }),
            new KeyFrame(Duration.millis(1000), new EventHandler<ActionEvent>(){
               @Override
                public void handle(ActionEvent t) {
                     pane.getChildren().setAll(image5);
                }
            }),
            new KeyFrame(Duration.millis(1050), new EventHandler<ActionEvent>(){
               @Override
                public void handle(ActionEvent t) {
                     pane.getChildren().setAll(image6);
                }
            }),
            new KeyFrame(Duration.millis(1100), new EventHandler<ActionEvent>(){
               @Override
                public void handle(ActionEvent t) {
                     pane.getChildren().setAll(image7);
                }
            }),
            new KeyFrame(Duration.millis(1150), new EventHandler<ActionEvent>(){
               @Override
                public void handle(ActionEvent t) {
                    pane.getChildren().setAll(image8);
                }
            
            })
        )
        .build().play();
        primaryStage.setScene(scene);
        primaryStage.show();

    
   
    
    }
    public static void main(String[] args) {
        launch(args);
    }
}

