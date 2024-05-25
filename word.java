import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class word here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class word extends Actor
{
    private String s;
    
    public word(String s) {
        this.s = s;
        GreenfootImage image = new GreenfootImage(s + ".png", 10, Color.BLACK, Color.BLUE);
        setImage(image);
    }
    
    /**
     * Act - do whatever the word wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        singleplayer sp = (singleplayer)getWorld();
    }
    
    public void guess() {
        
    }
        
}
