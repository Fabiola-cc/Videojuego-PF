import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pantalla principal del juego.
 * Presenta distintas opciones a realizar dentro del juego.
 * 
 * @author Fabiola Contreras
 * @version no.1
 */
public class Home extends World
{
    
    String nombre;
    static int comida;
    ECalma c = new ECalma(this);
    Emociones e = new Emociones(this);
    int pet;
    static String add;
    
    /**
     * Constructor para Home.
     * Muestra la imagen de pantalla.
     * Crea una nueva mascota y nuevos mundos para ir.
     * 
     */
    public Home(int pet)
    {    
        super(1000, 600, 1);
        Pet p1 = new Pet(pet);
        this.pet = pet;
        addObject(p1, 372,494); //Añade una mascota a la pantalla.
        
        BEmociones BE = new BEmociones(e);
        addObject (BE, 872, 49);
        
        BRespira BR = new BRespira(c);
        addObject (BR, 796, 49);
        
        Comer c = new Comer();
        addObject (c, 120, 56);
    }
    
    /**
     * Act - Es llamado cada vez que el botón "run o act" es presionado.
     */
    public void act(){
        if (nombre == null){
            String nombre = Greenfoot.ask("¿Qué nombre deseas darle?");
            this.nombre = nombre; //Recibe un dato de nombre para la mascota.
        }
        
        Instrucciones ins = new Instrucciones(new Minijuego(nombre, this, pet));        

        MJ Play = new MJ(ins);
        while (add != "listo"){
            addObject (Play, 946, 49); //Botón para dirigirse al Minijuego.
            add = "listo";
        }
        
        showText("Comida: " + comida, 200,50); //Registra el dato de comida recolectada y lo muestra en pantalla.
        showText(nombre, 200,90); //Muestra el nombre antes guardado en pantalla.
    }

}
