import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Scanner;
/**
 * Write a description of class Emociones here.
 * 

 */
public class Emociones extends World
{
    /**
     * Constructor for objects of class Emociones.
     * 
     */
    String write;
    public Emociones(World link)
    {    
        super(1000, 600, 1); 
        
        Atras b = new Atras(link);
        addObject (b,942,555);
        
        
    }
    public void act()
    {
        if (write == null){
            Scanner scan = new Scanner(System.in);
            Greenfoot.ask("Tómate tu tiempo y escribe cómo te sientes en este momento.\n**Recuerda, en esta versión nada de lo que escribas será guardado.**");
            
            String write = Greenfoot.ask("¿Quieres escribir algo más? (Si o no)");
            this.write = write; //Recibe un dato de nombre para la mascota.
        }
    }
}
