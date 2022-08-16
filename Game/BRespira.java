import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Botón para redirigir al usuario al espacio de calma.
 */
public class BRespira extends Actor
{
    World link;//Guarda el dato para usarlo luego
    BRespira (World w1){
        GreenfootImage imagen = getImage(); //Reduce tres veces el tamaño de la imágen del objeto.
        imagen.scale(imagen.getWidth() / 2, imagen.getHeight() / 2);
        this.link=w1;
    }
    /**
     * Act - do whatever the BRespira wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(this.link);
        }  
    }
}
