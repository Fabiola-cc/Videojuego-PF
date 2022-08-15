import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Objeto de roca, usado en el minijuego como obstáculo.
 * 
 * @author Fabiola Contreras
 * @version no.1
 */
public class Roca extends Actor
{
    Roca(){
        GreenfootImage image = getImage(); //La imagen de roca reduce 10 veces su tamaño.
        image.scale(image.getWidth() / 10, image.getHeight() / 10);
    }
    /**
     * Act - do whatever the Roca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()-3, getY()); //Se mueve tres unidades a la izquierda continuamente mientras está en pantalla. 
        int y = Greenfoot.getRandomNumber(600); //se ubica en un punto y de manera aleatoria
        if(getX()== 0){ //al llegar al borde izquierdo de la pantalla reaparece al borde derecho en el punto y.
            setLocation(1000, y);
        }
    }
}
