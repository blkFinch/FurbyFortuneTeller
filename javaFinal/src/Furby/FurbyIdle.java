/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Furby;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

/**
 *
 * @author galen
 */
public class FurbyIdle extends Pane{
   
    public FurbyIdle(){
        
    
        Image idle1 = new Image("/Furby/furbyBasic.png");
        Image idle2 = new Image("/Furby/furbyBlink.png");
   
        ImageView furby = new ImageView();
        furby.setImage(idle1);
        
        this.getChildren().add(furby);
        
         Timeline furbyIdle = new Timeline(
                new KeyFrame(Duration.millis(1000), (ActionEvent x) -> {
                    furby.setImage(idle1);           
            }),
                new KeyFrame(Duration.millis(1150), (ActionEvent x) -> {
                    furby.setImage(idle2);

            }),
                new KeyFrame(Duration.millis(1300), (ActionEvent x) -> {
                   furby.setImage(idle1);
            })
        );
         
       furbyIdle.setCycleCount(Timeline.INDEFINITE);
       furbyIdle.play();
        
    }
}
