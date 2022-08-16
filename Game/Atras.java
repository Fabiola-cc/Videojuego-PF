import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Utilizado para regresar al mundo home, en los espacios de
 * 
 * 
 * @author Fabiola Contreras
 * @version no.1
 */
public class Atras extends Actor
{
    World link;//Guarda el dato para usarlo luego
    Atras (World w1){
        this.link=w1;
    }
    
    /**
     * Act - do whatever the Botón wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() //Al presionar el objeto, se redirige al mundo establecido
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(this.link);
        }    
    
    }
}
