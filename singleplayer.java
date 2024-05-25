import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class singleplayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class singleplayer extends World
{
    private static final int guessLength = 4;
    
    private String[][] groups = {{"TAKE ADVANTAGE OF", "EXPLOIT", "LEVERAGE", "MILK", "USE"},
                                {"FINISHED, AS TIME", "DONE", "OVER", "THROUGH", "UP"},
                                {"NEWSPAPER DESKS", "CITY", "COPY", "CULTURE", "SPORTS"},
                                {"WORDS BEGINNING WITH GREETINGS", "HEYDAY", "HIJINKS", "SUPPER", "YOGURT"},
                                };
    
    /**
     * Constructor for objects of class singleplayer.
     * 
     */
    public singleplayer()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        
        for (int i=0; i<groups.length; i++) {
            for (int j=1; j<groups[i].length; j++) {
                word newWord = new word(groups[i][j]);
                addObject(newWord, 0, 0);
            }
        }
    }
    
    public void prepare() {
        showText("Create groups of four by words that are related.", 300, 30); 
    }
    
    public void setCoordinates() {
        
    }
    
    public void addToGuess() {
        
    }
}
