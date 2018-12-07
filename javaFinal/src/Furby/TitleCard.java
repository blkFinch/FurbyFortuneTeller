/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Furby;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 *
 * @author Finch
 */
public class TitleCard extends Pane{
 
    public TitleCard(){
        Image cool1 = new Image("/Furby/furbyDark.png");
        
        ImageView furby = new ImageView();
        furby.setImage(cool1);
        
        this.getChildren().add(furby);
    }
}
