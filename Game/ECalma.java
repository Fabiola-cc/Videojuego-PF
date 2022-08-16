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
    public ECalma(World link)
    {    
        super(1000, 600, 1); 
        
        Greenfoot.playSound("S2.mp3");
        
        Atras b = new Atras(link);
        addObject (b,942,555);
    }
    
    public void act()
    {
        
    }
}
