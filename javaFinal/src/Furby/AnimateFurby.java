//furby animated! uses a sequence of images to create an animation.
//images included are for testing--will update later.
package Furby;

import java.awt.geom.Rectangle2D;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.TimelineBuilder;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;
/**
 *
 * @author hobbydobbie
 */

public class AnimateFurby extends Stage {
    HBox hb = new HBox();
    
    public AnimateFurby(){      
        //set stage, pane, scene
        this.setScene(new Scene(hb, 500, 350));   
        

        javafx.geometry.Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
 
        //set Stage boundaries to the lower right corner of the visible bounds of the main screen
        this.setX(primaryScreenBounds.getMinX() + primaryScreenBounds.getWidth() - 400);
        this.setY(primaryScreenBounds.getMinY() + primaryScreenBounds.getHeight() - 300);
        this.show();
        
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
        //ImageView[] furbyArray = {image1, image2, image3, etc.,};
        
        //maybe try implementing a while loop here instead? - gh    
        
        //for now: create animation, use key frames
        TimelineBuilder.create()
        .cycleCount(Animation.INDEFINITE)
        .keyFrames(
            new KeyFrame(Duration.millis(1000), new EventHandler<ActionEvent>(){
               @Override
                public void handle(ActionEvent t) {
                    hb.getChildren().setAll(image1);
                }
            }),
            new KeyFrame(Duration.millis(1150), new EventHandler<ActionEvent>(){
                @Override
                public void handle(ActionEvent t) {
                     hb.getChildren().setAll(image2);
                }
               
            }),
            new KeyFrame(Duration.millis(1300), new EventHandler<ActionEvent>(){
               @Override
                public void handle(ActionEvent t) {
                     hb.getChildren().setAll(image3);
                }
            }),
            new KeyFrame(Duration.millis(1450), new EventHandler<ActionEvent>(){
               @Override
                public void handle(ActionEvent t) {
                     hb.getChildren().setAll(image4);
                }
            }),
            new KeyFrame(Duration.millis(1600), new EventHandler<ActionEvent>(){
               @Override
                public void handle(ActionEvent t) {
                     hb.getChildren().setAll(image5);
                }
            }),
            new KeyFrame(Duration.millis(1750), new EventHandler<ActionEvent>(){
               @Override
                public void handle(ActionEvent t) {
                     hb.getChildren().setAll(image6);
                }
            }),
            new KeyFrame(Duration.millis(1900), new EventHandler<ActionEvent>(){
               @Override
                public void handle(ActionEvent t) {
                     hb.getChildren().setAll(image7);
                }
           }),
            new KeyFrame(Duration.millis(2400), new EventHandler<ActionEvent>(){
               @Override
                public void handle(ActionEvent t) {
                     hb.getChildren().setAll(image8);
                }
           }),
            new KeyFrame(Duration.millis(2200), new EventHandler<ActionEvent>(){
               @Override
                public void handle(ActionEvent t) {
                     hb.getChildren().setAll(image9);
                }
           }),
            new KeyFrame(Duration.millis(700), new EventHandler<ActionEvent>(){
               @Override
                public void handle(ActionEvent t) {
                    hb.getChildren().setAll(image10);
                }
            
            })
        )
        .build().play();  
    
    }
}

