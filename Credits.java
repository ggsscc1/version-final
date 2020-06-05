import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.*;
/**
 * Clase para mostrar creditos en pantalla.
 */
public class Credits extends World
{
    readFile obtieneListaArchivo = new readFile(); 
    
    List<Record> lista = new ArrayList<>();
    /**
     * Constructor for objects of class Credits.
     * 
     */
    public Credits()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        //
        
        prepare();
    }
    /**
     * Metodo que prepara al mundo.
     */
    private void prepare()
    {
        obtieneListaArchivo.leeArchivo();
        int creditPositionY = 75;
        lista = obtieneListaArchivo.getList();
        //System.out.println(lista.get(0).getName());
        for(int i = 0; i < 10; i ++){
           
            creditPositionY += 25;
            showText(lista.get(i).getName()+lista.get(i).getScore(), 100, creditPositionY);
           
        }
        Greenfoot.stop();
    }
}
