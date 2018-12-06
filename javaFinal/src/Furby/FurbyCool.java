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
public class FurbyCool extends Pane {
    
    public FurbyCool(){
    
        Image cool1 = new Image("/Furby/furbyBasic.png");
        Image cool2 = new Image("/Furby/furbyBow.png");
        Image cool3 = new Image("/Furby/furbyDeal.png");
   
        ImageView furby = new ImageView();
        furby.setImage(cool1);
        
        this.getChildren().add(furby);
        
         Timeline furbyCool = new Timeline(
                new KeyFrame(Duration.millis(1000), (ActionEvent x) -> {
                    furby.setImage(cool1);           
            }),
                new KeyFrame(Duration.millis(1150), (ActionEvent x) -> {
                    furby.setImage(cool2);

            }),
                new KeyFrame(Duration.millis(1300), (ActionEvent x) -> {
                   furby.setImage(cool3);
            })
        );
         
       furbyCool.setCycleCount(1);
       furbyCool.play();
        
    }
}
