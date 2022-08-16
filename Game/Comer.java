import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Botón para alimentar a la mascota. Elimina un elemento de comida al 
 * hacer click en este.
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
