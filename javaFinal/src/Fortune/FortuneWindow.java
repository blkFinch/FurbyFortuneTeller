/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fortune;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import Fact.Facts;
import java.util.Arrays;
import javafx.scene.control.Label;


/**
 *
 * @author galen
 */
public class FortuneWindow extends Stage{
    private String textToDisplay;
    private String eyeColor;
    private String birthDay;
    private String[] validColors = new String[6];

    //these are colors that we know our program can handle
    //should match the file names of the files in the factText folder
    
   
    private void populateValidColors(){
        validColors[0] = "black";
        validColors[1] = "green";
        validColors[2] = "blue";
        validColors[3] = "brown";
        validColors[4] = "hazel";
        validColors[5] = "yellow";
    }
    
    private boolean checkValidColor(String inputStr) {
        return Arrays.stream(this.validColors).parallel().anyMatch(inputStr::contains);
    }
    
    public String GenerateText(){
        Fortune fortune = new Fortune();
        String fortuneText = fortune.toString();
        Facts fact = new Facts(this.eyeColor);
        String factText = fact.getFact();
        
        return birthDay +"\n" + fortuneText + "\n\n\n" + factText;
    }
    
    public FortuneWindow(String eyeColor, String month, String day){
        populateValidColors();
        
        if(checkValidColor(eyeColor)){
            this.eyeColor = eyeColor;
        } else{
   
            this.eyeColor = "black";
            
        }
        
        this.birthDay = month + " " + day;
        this.textToDisplay = GenerateText();
        this.setTitle("Your Fortune");
        
        StackPane root = new StackPane();
        
        Label stringOut = new Label(this.textToDisplay);
        
        TextFlow textPane = new TextFlow(stringOut);
        root.getChildren().add(textPane);
        Scene scene = new Scene(root, 300,300);
        scene.getStylesheets().add(this.getClass().getResource("style.css").toExternalForm());
        
        this.setScene(scene);
        this.setX(300);
        root.getStyleClass().clear();
        root.getStyleClass().add(eyeColor);
        this.show();
    }
}
