import greenfoot.*; 

/**
 * Clase para mostrar Creditos
 */
public class Win extends Actor
{
    private String userName;
    RecordsManager guardaArchivo = new RecordsManager();
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
    public void work() 
    {
        Greenfoot.delay​(50);
        if(userName == null){
          userName = Greenfoot.ask("Captura el nombre: ");   
        }
        guardaArchivo.guardaArchivo(userName, Nivel.score);
        Greenfoot.setWorld(new Credits());
    } 
}
