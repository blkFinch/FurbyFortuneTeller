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
import javafx.scene.layout.HBox;
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
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //generates and returns fortune
                Fortune fortune = new Fortune();
                System.out.println(fortune.toString());
                
                fortuneLabel.setText(fortune.toString());
                
                //opens new furby window
                new AnimateFurby();
            }
        });
        
        hb.getChildren().addAll(btn, fortuneLabel);
        StackPane root = new StackPane();
        root.getChildren().add(hb);
        
        Scene scene = new Scene(root, 500, 350);

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
