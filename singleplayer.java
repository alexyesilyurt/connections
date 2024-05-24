import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class singleplayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class singleplayer extends World
{

    /**
     * Constructor for objects of class singleplayer.
     * 
     */
    public singleplayer()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public void prepare() {
        showText("Create groups of four by words that are related.", 300, 30); 
    }
}
