/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fortune;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

/**
 *
 * @author galen
 */
public class FortuneWindow extends Stage{
    private String textToDisplay;
    
    public FortuneWindow(String text){
        this.textToDisplay = text;
        this.setTitle("Your Fortune");
        
        StackPane root = new StackPane();
        
        Text t = new Text(this.textToDisplay);
        
        Font.loadFont(
                Fortune.class.getResource("AMI.ttf").toExternalForm(),
                10
        );
        
        TextFlow textPane = new TextFlow(t);
        root.getChildren().add(textPane);
        Scene scene = new Scene(root, 300,300);
        scene.getStylesheets().add(this.getClass().getResource("style.css").toExternalForm());
        
        this.setScene(scene);
        this.show();
    }
}
