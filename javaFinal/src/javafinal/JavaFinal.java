/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafinal;

import Furby.AnimateFurby;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author hobbydobbie
 */
public class JavaFinal extends Application {
    HBox hb = new HBox();
    Label fortuneLabel = new Label();
    
    @Override
    public void start(Stage primaryStage) {
        
        
        
        //just using this button for testing purposes -gh
        
        Button btn = new Button();
        btn.setText("Get Fortune!");
        
        ImageView furby = new ImageView( new Image("images/furbyBasic.png"));
        ImageView furby2 = new ImageView( new Image("images/furbyBow.png"));
        
        hb.getChildren().addAll(btn, fortuneLabel);
        
        StackPane root = new StackPane();
        BorderPane pane1 = new BorderPane();
        
        pane1.setTop(hb);
        pane1.setCenter(furby);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //generates and returns fortune
                Fortune fortune = new Fortune();
                System.out.println(fortune.toString());
                
                fortuneLabel.setText(fortune.toString());
                
                pane1.setCenter(furby2);
            }
        });
        
        
        
        root.getChildren().add(pane1);
        
        Scene scene = new Scene(root, 800, 650);
//        AnimateFurby furb = new AnimateFurby(root);

        primaryStage.setTitle("Furby Fortune Teller");
        primaryStage.setScene(scene);
        primaryStage.show();
       
        
     
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);     
    }
    
}
