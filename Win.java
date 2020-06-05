import greenfoot.*; 

/**
 * Clase para mostrar Creditos
 */
public class Win extends Actor
{
    private String userName;
    saveFile guardaArchivo = new saveFile();
    /**
     * Constructor.
     */
    public Win()
    {
        setImage("Win.png");
        Nivel.score = 0;
        Nivel.life = 3;
    }
    /**
     * Guarda archivo.
     */
    public void act() 
    {
        Greenfoot.delay​(50);
        if(userName == null){
          userName = Greenfoot.ask("Captura el nombre: ");   
        }
        guardaArchivo.manejaArchivo(userName);
        Greenfoot.setWorld(new Credits());
    } 
}
