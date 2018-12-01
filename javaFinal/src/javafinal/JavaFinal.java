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
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author hobbydobbie
 */
/**public class JavaFinal extends Application {
    
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
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 500, 350);

        primaryStage.setTitle("Furby Fortune Teller");
        primaryStage.setScene(scene);
        primaryStage.show();
        
                
        Stage furby = new Stage();
        new AnimateFurby().start(furby);
    }

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        launch(args);     
    }
    
    }**/
