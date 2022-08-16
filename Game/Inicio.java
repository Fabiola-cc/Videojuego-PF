import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pantalla de inicio al juego.
 * 
 * @author Fabiola Contreras
 * @version 2
 */
public class Inicio extends World {
    Home h;
    /**
     * Constructor for objects of class MyWorld.
     * Muestra la imagen principal en el tamaño especificado.
     * 
     * Permite al usuario seleccionar la mascota que desea y registra ese dato
     * Al seleccionar la mascota se dirige a Home, con las características de
     * esa mascota.
     */

    public Inicio() {
        super(1000, 600, 1);
        h.add="inicio";

        PetB gato = new PetB(1, new Home(1));
        PetB perro1 = new PetB(2, new Home(2));
        PetB conejo = new PetB(3, new Home(3));
        PetB pollito = new PetB(4, new Home(4));
        PetB perro2 = new PetB(5, new Home(5));
        PetB tortuga = new PetB(6, new Home(6));

        addObject(gato, 81, 415);
        addObject(perro1, 213, 415);
        addObject(conejo, 349, 415);
        addObject(pollito, 862, 415);
        addObject(perro2, 478, 415);
        addObject(tortuga, 668, 415);

    }

}
