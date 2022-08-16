import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Emociones está diseñado para ser un lugar de registro de emociones.
 * Es un diario emocional en el que el usuario pueda desahogarse con sigo mismo.
 * 
 */
public class Emociones extends World
{
    /**
     * Constructor for objects of class Emociones.
     * 
     * Cuenta con un objeto de botón para retornar al mundo anterior.
     */
    String write;
    public Emociones(World link)
    {    
        super(1000, 600, 1); 
        
        Atras b = new Atras(link);
        addObject (b,942,555);
        
        
    }
    public void act()
    { //Al correr el juego se abre un espacio para escribir lo que sea.
        if (write == null){
            Greenfoot.ask("Tómate tu tiempo y escribe cómo te sientes en este momento.\n**Recuerda, en esta versión nada de lo que escribas será guardado.**");
            
            String write = Greenfoot.ask("¿Quieres escribir algo más? (Si o no)");
            this.write = write; //Recibe un dato de nombre para la mascota.
        }
    }
}
