import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * El protagonista del juego, pet, pero como botón de selección
 * Al dar click debe permitir adaptar opciones en el juego según la selección.
 * 
 * @author Fabiola Contreras
 * @version no.1
 */
public class PetB extends Actor {

    World link;
    int Select;
    
    PetB(int Select, World link) {
        switch(Select){
            case 1: //Gato
            setImage("1.png");
            break;
            case 2: //Perro Corgi
            setImage("2.png");
            break;
            case 3: //Conejo
            setImage("3.png");
            break;
            case 4: //Pollito
            setImage("4.png");
            break;
            case 5: //Perro rottweiler
            setImage("5.png");
            break;
            case 6: //Tortuga
            setImage("6.png");
            break;
        }
        
        GreenfootImage imagen = getImage();
        imagen.scale(imagen.getWidth() / 4, imagen.getHeight() / 4);
        
        this.link = link;
    }

    /**
     * Act - Es llamado cada vez que el botón "run o act" es presionado.
     * 
     */
    public void act() //Al presionar el objeto, se redirige al mundo establecido
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(this.link);
        }    
    
    }
}