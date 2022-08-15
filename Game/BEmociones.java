import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BEmociones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BEmociones extends Actor
{
    World link;//Guarda el dato para usarlo luego
    BEmociones (World w1){
        GreenfootImage imagen = getImage(); //Reduce tres veces el tamaño de la imágen del objeto.
        imagen.scale(imagen.getWidth() / 2, imagen.getHeight() / 2);
        this.link=w1;
    }
    /**
     * Act - do whatever the BEmociones wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(this.link);
        }  
    }
}
