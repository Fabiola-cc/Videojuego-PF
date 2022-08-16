import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Instrucciones del minijuego para dar claridad de lo que ocurre.
 */
public class Instrucciones extends World
{

    /**
     * Cuenta con un botón que redirige al juego, finalmente.
     * 
     */

    public Instrucciones(World game)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        Botón play = new Botón(game);
        addObject (play,942,555);
    }
}
