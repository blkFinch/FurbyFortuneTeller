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
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


/**
 *
 * @author galen
 */
public class FortuneWindow extends Stage{
    private String factText;
    private String fortuneText;
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
    
    private void generateFortune(){
        Fortune f = new Fortune();
        this.fortuneText = f.toString();
    }
    
    private void generateFact(){
        Facts fact = new Facts(this.eyeColor);
        this.factText = fact.getFact(); 
    }
    
    public FortuneWindow(String eyeColor, String month, String day){
        populateValidColors();
        
        if(checkValidColor(eyeColor)){
            this.eyeColor = eyeColor;
        } else{
   
            this.eyeColor = validColors[0];
            
        }
        
        this.birthDay = month + " " + day;
        
        generateFact();
        generateFortune();
        this.setTitle("Your Fortune");
        
        StackPane root = new StackPane();
        
        Label fortuneLabel = new Label("Your Fortune:");
        Label fortuneContent = new Label(this.fortuneText);
        fortuneContent.setWrapText(true);
        
        VBox fortuneBox = new VBox(fortuneLabel, fortuneContent);
        
        Label factLabel = new Label("A Fact About You:");
        Label factFact = new Label(this.factText);
        factFact.setWrapText(true);
        
        VBox factBox = new VBox(factLabel, factFact);
        
        VBox vbMain;
        vbMain = new VBox(fortuneBox, factBox);
        vbMain.setSpacing(20);
        
        root.getChildren().add(vbMain);
        Scene scene = new Scene(root, 300,300);
        scene.getStylesheets().add(this.getClass().getResource("style.css").toExternalForm());
        
        this.setScene(scene);
        this.setX(300);
        root.getStyleClass().clear();
        root.getStyleClass().add(eyeColor);
        this.show();
    }
}
