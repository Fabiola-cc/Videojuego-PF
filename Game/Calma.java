import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Calma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calma extends Actor
{
    GifImage calm;
    Calma (){
        GifImage myGif = new GifImage("Jugar.gif");
        this.calm = myGif;
    }
    /**
     * Act - do whatever the Calma wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage( calm.getCurrentImage() );
    }
}
