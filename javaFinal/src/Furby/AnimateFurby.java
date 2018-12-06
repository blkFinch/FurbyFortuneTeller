//furby animated! uses a sequence of images to create an animation.
//images included are for testing--will update later.
package Furby;

import Fortune.Fortune;
import Fortune.FortuneWindow;
import Fact.Facts;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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
        //set stage, pane, scene
        //main app pane
        BorderPane pane = new BorderPane();
        //open scene
        BorderPane pane2 = new BorderPane();
        primaryStage.setTitle("Furby Fortune Teller");
        //main app scene
        Scene scene = new Scene(pane, 500, 525);
        //open scene
        Scene sceneOpen = new Scene(pane2, 500, 350);
        //imports stylesheet from Furby folder 
        scene.getStylesheets().add(this.getClass().getResource("style.css").toExternalForm());
        
        TextField factField = new TextField();
        factField.setPrefSize(5,5);
        
        Button enter = new Button();//enter app 
        enter.setText("Enter!");
        
        Button btn = new Button();//fortune button
        btn.setText("Get Fortune!");
        
        GridPane controls = new GridPane();
        controls.setHgap(1);
        controls.setVgap(1);
        
        controls.add(btn,0,1);
        
        
        controls.add(new Label("Enter your birth month:"), 0,3);
        controls.add(new Label("Enter your birth day:"), 0,4);
        controls.add(new Label("Choose your eye color:"), 0,6);
        
        TextField monthField = new TextField();
        TextField dayField = new TextField();
        TextField colorField =new TextField();
        
        controls.add(monthField, 1,3);
        controls.add(dayField, 1,4);
        controls.add(colorField, 1,6);
        
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
        ImageView image11 = new ImageView(getClass().getResource("furbyIntro.png").toExternalForm());
        ImageView image12 = new ImageView(getClass().getResource("furbyDark.png").toExternalForm());
       
      
        //create animation, use key frames
        Timeline furbyIntro = new Timeline(
            new KeyFrame(Duration.millis(800), (ActionEvent x) -> {
                pane2.getChildren().setAll(image12);
                pane2.setBottom(enter);
                
        }),
            new KeyFrame(Duration.millis(900), (ActionEvent x) -> {
                pane2.getChildren().setAll(image12);
                pane2.setBottom(enter);
                
        }),
            new KeyFrame(Duration.millis(1000), (ActionEvent x) -> {
                pane2.getChildren().setAll(image12);
                pane2.setBottom(enter);
                
        })
        );
        furbyIntro.setCycleCount(Timeline.INDEFINITE);
        furbyIntro.play();
        
        Timeline furbyIdle = new Timeline(
            new KeyFrame(Duration.millis(1000), (ActionEvent x) -> {
                pane.getChildren().setAll(image1);
                pane.setBottom(controls);
                
        }),
            new KeyFrame(Duration.millis(1150), (ActionEvent x) -> {
                pane.getChildren().setAll(image10);
                pane.setBottom(controls);
                
        }),
            new KeyFrame(Duration.millis(1300), (ActionEvent x) -> {
                pane.getChildren().setAll(image1);
                pane.setBottom(controls);
                
        })
        );
        furbyIdle.setCycleCount(Timeline.INDEFINITE);
        furbyIdle.play();

        
        
        Timeline furbyMotion = new Timeline(    
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
            new KeyFrame(Duration.millis(2050), (ActionEvent t) -> {
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
        furbyMotion.setCycleCount(2);
        
        enter.setOnAction((ActionEvent event) -> {
            furbyIntro.stop();
            primaryStage.setScene(scene);
            furbyIdle.play();

        });
        btn.setOnAction((ActionEvent event) -> {
            furbyIdle.stop();
            furbyMotion.play();
            furbyIdle.play();
            
                   
            //opens a fortune window -- 
            //fortune logic is inside the window
            FortuneWindow window = new FortuneWindow(
                    colorField.getText(),
                    monthField.getText(),
                    dayField.getText()
            );
            
            
        });
        
        
        
        primaryStage.setScene(sceneOpen);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

