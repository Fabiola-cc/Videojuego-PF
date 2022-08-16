import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Comer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comer extends Actor
{
    Home h;
    /**
     * Act - do whatever the Comer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            if(h.comida > 0){
               h.comida--;; 
            }
        }  
    }
}
