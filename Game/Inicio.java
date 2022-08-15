import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pantalla de inicio al juego.
 * 
 * @author Fabiola Contreras
 * @version 1 / 12.08.2022
 */
public class Inicio extends World {

    /**
     * Constructor for objects of class MyWorld.
     * Muestra la imagen principal en el tamaño especificado.
     * 
     * Coloca un objeto de botón play, para dirigirse al mundo de home.
     */
    
    public Inicio() {
        super(1000, 600, 1);
    
        Botón Play = new Botón(new Home());
        addObject (Play, 920, 550);
    }
    
    
    
    
    
}
