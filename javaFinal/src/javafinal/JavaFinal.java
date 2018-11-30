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
        GridPane border = new GridPane();
        border.setVgap(20);
        border.add(hb,0,0);
        border.add(furby,0,1);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //generates and returns fortune
                Fortune fortune = new Fortune();
                System.out.println(fortune.toString());
                
                fortuneLabel.setText(fortune.toString());
                
                border.add(furby2,0,1);
            }
        });
        
        
        
        root.getChildren().add(border);
        
        Scene scene = new Scene(root, 500, 400);
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
