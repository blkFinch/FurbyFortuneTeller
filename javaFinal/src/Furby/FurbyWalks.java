/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Furby;

import javafx.animation.PathTransition;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

/**
 *
 * @author hobbydobbie
 */
public class FurbyWalks {
    ImageView image1 = new ImageView(getClass().getResource("furbyWalk.png").toExternalForm());

    public void furbyPath(){
        Circle circle = new Circle(50);
        PathTransition furbyPath = new PathTransition();
        
        furbyPath.setNode(image1);
        furbyPath.setCycleCount(1);
        furbyPath.setPath(circle);
        furbyPath.play();
        
    }
    
    
}
