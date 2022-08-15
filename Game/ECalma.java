import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ECalma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ECalma extends World
{

    /**
     * Constructor for objects of class ECalma.
     * 
     */
    public ECalma()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        Calma c = new Calma();
        addObject (c,500,300);
        Greenfoot.playSound("S2.mp3");
    }
}
