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
    private ArrayList<String> guessList = new ArrayList<>();
    
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
        int xspace = 75;
        int yspace = 100;
        
        for (int i=0; i<groups.length; i++) {
            for (int j=1; j<groups[i].length; j++) {
                word newWord = new word(groups[i][j]);
                addObject(newWord, xspace, yspace);
                xspace += 150;
            }
            xspace = 75;
            yspace += 75;
        }
    }
  
    public void prepare() {
        showText("Create groups of four by words that are related.", 300, 30); 
    }
    
    public void addToGuess(word clicked) {
        if (guessList.size() < 4) {
            guessList.add(clicked.s);
        }
        if (guessList.size() == 4) {
            check();
        }
    }
    
    public void removeFromGuess(word clicked) {
        guessList.remove(clicked.s);
    }
    
    public void check() {
        int counter = 0;
        for (int i=0; i<groups.length; i++) {
            for (int j=1; j<groups[i].length; j++) {
                if (guessList.contains(groups[i][j])) {
                    counter++;
                    if (counter == 4) {
                        showText("Great job! You got a group!", 300, 200); 
                        guessList = new ArrayList<>();
                    }
                }
            }
            counter = 0;
        }
    }
}
