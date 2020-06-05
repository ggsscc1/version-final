import greenfoot.*;  
/**
 * Clase que muestra Game Over.
 */
public class GameOver extends Actor
{
    
    private String userName;
    RecordsManager guardarArchivo = new RecordsManager();
    /**
     * Metodo para configurar imagen.
     */
    public GameOver()
    {
        setImage("game_over.jpg");
        Nivel.score = 0;
        Nivel.life = 3;
    }   
    public void work() 
    {
        
        Greenfoot.delay​(50);
        if(userName == null){
          userName = Greenfoot.ask("Captura el nombre: ");   
        }
        guardarArchivo.guardaArchivo(userName, Nivel.score);
        Greenfoot.setWorld(new Credits());
    } 
}
