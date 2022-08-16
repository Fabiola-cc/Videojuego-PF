import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Espacio de calma, el usuario registra un momento 
 * de calma en el que respira profundamente.
 */
public class ECalma extends World
{
    /**
     * Recibe un enlace para retornar al mundo anterior.
     * Reproduce música tranquila de fondo.
     * 
     * Cuenta con un objeto de botón para retornar al mundo anterior.
     * 
     */
    public ECalma(World link) 
    {    
        super(1000, 600, 1); 
        
        Greenfoot.playSound("S2.mp3");
        
        Atras b = new Atras(link);
        addObject (b,942,555);
    }
    
}
