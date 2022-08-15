import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Objeto de rama, usado en el minijuego como obstáculo.
 * 
 * @author Fabiola Contreras
 * @version no.1
 */
public class Rama extends Actor {

    Rama(){
        GreenfootImage imagen = getImage();//La imagen que representa a rama reduce 10 veces su tamaño.
        imagen.scale(imagen.getWidth() / 10, imagen.getHeight() / 10);
    }
    
    /**
     * Act - do whatever the Rama wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        setLocation(getX()-3, getY()); //Se mueve tres unidades a la izquierda continuamente mientras está en pantalla. 
        int y = Greenfoot.getRandomNumber(600); //se ubica en un punto y de manera aleatoria, considerando como rango el largo de la pantalla.
        if(getX()== 0){ //al llegar al borde izquierdo de la pantalla reaparece al borde derecho en el punto y.
            setLocation(1000, y);
        }
    }

    
}
