import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Se muestra en home. Permite al usuario ir al minijuego creado.
 * 
 * @author Fabiola Contreras
 * @version no.1
 */
public class MJ extends Actor
{

    World link; //Guarda el dato para usarlo luego
    MJ (World w1){
        GreenfootImage imagen = getImage(); //Reduce tres veces el tamaño de la imágen del objeto.
        imagen.scale(imagen.getWidth() /2, imagen.getHeight() /2);
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
