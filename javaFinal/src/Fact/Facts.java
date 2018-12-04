/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fact;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hobbydobbie
 */
public class Facts {
    
        
    private String fact;
    private String black = "src/factText/black.txt";
    private String green = "src/factText/green.txt";
    private String blue = "src/factText/blue.txt";
 
    
    
    
    public String getFact() {
        return fact;
    }

    public void setFact(String fortune) {
        this.fact = fact;
    }

    public Facts() {
        this.fact = RandomFactBlack();
        this.fact = RandomFactGreen();
        this.fact = RandomFactBlue();
    }

    private String RandomFact(String filename) {
        //scans all lines in given file
        Scanner stan = null;
        try {
            stan = new Scanner(new File(filename));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Facts.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //creates an array list of lines from the file
        List<String> lines = new ArrayList<String>();
        while (stan.hasNextLine()) {
            lines.add(stan.nextLine() + " " );
        }
        
        //randomizes the order and returns the first line
        Collections.shuffle(lines);
        return lines.get(0);
    }

    public String RandomFactBlack() {
        return RandomFact(black);
        
    }   
    public String RandomFactGreen() {
        return RandomFact(green);
    }
    public String RandomFactBlue() {
        return RandomFact(blue);
    } 
}









