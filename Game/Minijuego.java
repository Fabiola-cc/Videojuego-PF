import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Minijuego para distracción
 * El objetivo es recolectar comida y evitar rocas y ramas.
 * 
 * @author Fabiola Contreras
 * @version no.1
 */
public class Minijuego extends World
{
    
    /**
     * Constructor for objects of class Minijuego.
     * Recibe como parámetros, el nombre de la mascota y un enlace al mundo anterior.
     * 
     * Muestra a la mascota a la izquierda y permite su movimiento.
     * Llama al método randomobj para colocar la comida y obstáculos alrededor del espacio.
     */
    public static int comida = 0;
    
    Minijuego(String nombre, World link, int food)
    {    
        super(1000, 600, 1); 
        
        Pet mascota = new Pet(nombre, true, link, food);
        addObject (mascota, 110, 300);
        
        randomobj(food);
        
    }
    
    /**
     * Act - Es llamado cada vez que el botón "run o act" es presionado.
     * Registra el dato de comida recolectada y lo guarda también en home.
     */
    public void act(){
        showText("Comida recolectada: " + comida, 200,50);
    }
    
    /**
     * randomobj- llamado por el constructor
     * Crea objetos de rama, roca y comida para el minijuego, colocandolos aleatoriamente en el espacio.
     */
    public void randomobj(int food)
    {
        for(int i=0; i<3; i++) { //un rango de tres elementos.
            int x = Greenfoot.getRandomNumber(getWidth()+20); //Posición x aleatoria, evitando que se encuentre en las primeras 20 unidades.
            int y = Greenfoot.getRandomNumber(getHeight()); //Posición Y aleatoria.
            Rama r = new Rama(); //Se crea el objeto.
            addObject(r, x, y);
        }
        for(int i=0; i<3; i++) {
            int x = Greenfoot.getRandomNumber(getWidth()+20);
            int y = Greenfoot.getRandomNumber(getHeight());
            Roca p = new Roca();
            addObject(p, x, y);
        }
        for(int i=0; i<10; i++) {
            int x = Greenfoot.getRandomNumber(getWidth()+20);
            int y = Greenfoot.getRandomNumber(getHeight());
            Comida c = new Comida(food);
            addObject(c, x, y);
        }
        
    }
}
