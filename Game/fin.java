import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
   * Este objeto se muestra al final del minijuego.
   * Sirve como botón para volver a home, al final.
   * @author Fabiola Contreras
   * @version no.1
 */
public class fin extends Actor
{
    World link; //Guarda el dato para usarlo luego
    fin (World w1){
        this.link=w1;
    }
    
    public void act() //Al presionar el objeto, se redirige al mundo establecido
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(this.link);
        }   
    }
}
