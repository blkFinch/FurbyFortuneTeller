/*
 * This class generates a random fortune from
    seperate text files. the text files can be modified without
    changing the function of this class
 */
package javafinal;

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
 * @author galen
 */
public class Fortune {
    
    private String fortune;
    private String subjects = "src/text/subjects.txt";
    private String verbs = "src/text/verbs.txt";
    private String times = "src/text/times.txt";

    public String getFortune() {
        return fortune;
    }

    public void setFortune(String fortune) {
        this.fortune = fortune;
    }

    public Fortune() {
        this.fortune = RandomFortune();
    }
    
    @Override
    public String toString() {
        return fortune;
    }

    private String RandomLine(String filename) {
        //scans all lines in given file
        Scanner sc = null;
        try {
            sc = new Scanner(new File(filename));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fortune.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //creates an array list of lines from the file
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine() + " " );
        }
        
        //randomizes the order and returns the first line
        Collections.shuffle(lines);
        return lines.get(0);
    }

    //TODO: this is where the buttons should change the seeding of the fortune
    //somehow
    private String RandomFortune() {
        return RandomLine(subjects) + RandomLine(verbs) + RandomLine(times);
    }   
    
}
