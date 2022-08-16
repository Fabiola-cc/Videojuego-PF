import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * El protagonista del juego, pet
 * Obtiene un nombre y un lugar en el minijuego para mantenerse activo.
 * Varía según la selección del usuario.
 * 
 * @author Fabiola Contreras
 * @version no.2
 */
public class Pet extends Actor {

    String nombre;
    boolean play= false;
    Minijuego MJ;
    Home h;
    int comida = 0;
    World link;
    
    Pet(int Select) {
        imagen(Select);
        
        //Reduce su tamaño para ser visible más fácilmente
        GreenfootImage imagen = getImage();
        imagen.scale(imagen.getWidth() / 4, imagen.getHeight() / 4);
    }

    /**
     * Pet- constructor con parámetros: nombre, play y world link
     * Al crear un nuevo objeto, guarda cada dato recibido en las variables establecidas en el programa.
     * Además, reduce el tamaño de la imagen del objeto a la mitad.
     */
    Pet(String nombre, boolean play, World link, int Select) {
        imagen(Select);
        
        //Reduce su tamaño para ser visible más fácilmente en el juego
        GreenfootImage imagen = getImage();
        imagen.scale(imagen.getWidth() / 8, imagen.getHeight() / 8);
        
        this.play = play;
        this.nombre = nombre;
        this.link = link;
        
    }
    
    /**
     * Act - Es llamado cada vez que el botón "run o act" es presionado.
     * Se mueve cuando play es verdadera. Recibe y usa los métodos
     * de golpe, recolecta y fin.
     */
    public void act() {
        if (play == true){
            Greenfoot.setSpeed (50);
            mover();  }
        golpe();
        recolecta();
        fin();
    }

    /**
     * mover- llamado por act, cuando la variable play es establecida como verdadera.
     * Cambia la posición continuamente 1 unidad a la derecha.
     * Dependiendo de la tecla presionada, "pet" se mueve dos unidades abajo, arriba, 
     * a la derecha o a la izquierda.
     */
    public void mover() {
        setLocation(getX()+1, getY());
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 2);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 2);
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX()-3, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX()+3, getY());
        }
    }
    
    /**
     * golpe - llamado por act.
     * Recibe objetos de rama y roca.
     * Al intersecarse (pet) con roca el recolector de comida resta 2 y
     * al intersecarse (pet) con rama resta 1 elemento de comida.
     * Además, se quita el objeto roca o rama del juego.
     */
    public void golpe(){
        Actor Rama = getOneIntersectingObject (Rama.class);
        if (Rama != null){
            getWorld().removeObject(Rama);
            MJ.comida --;
            comida--;
            h.comida --;
        }
        Actor Roca = getOneIntersectingObject (Roca.class);
        if (Roca != null){
            getWorld().removeObject(Roca);
            MJ.comida -= 2;
            comida -= 2;
            h.comida -= 2;
        }
    }
    
    /**
     * recolecta - llamado por act.
     * Recibe elementos de Comida
     * Al intersecarse un objeto de comida con pet, se suma 1 al contador de comida recolectada.
     * También se elimina el objeto de comida de la pantalla.
     */
    public void recolecta(){
        Actor Food = getOneIntersectingObject (Comida.class);
        if (Food != null){
            World myWorld = getWorld();
            myWorld.removeObject(Food);
            MJ.comida ++;
            comida++;
            h.comida++;
        }
    }
    
    /**
     * fin- llamado por act.
     * Al llegar "pet" al borde derecho de la pantalla aparece el objeto fin y un contador de elementos de comida.
     * Además establece el enlace en el objeto fin, para retornar a home.
     */
    public void fin() {
        if (getX() == 999){
            getWorld().addObject(new fin(link), 500, 343);
            getWorld().showText ("Comida recolectada: " + comida, 600,300);
            getWorld().removeObject(this);
        }
    }
    
    public void imagen(int Select){
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
    }
}

