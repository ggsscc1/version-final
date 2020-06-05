import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.*;

/**
 * Clase para leer archivo.
 */
public class readFile extends Actor
{
    List<String> lista = new ArrayList<>();
    /**
     * Lee el archivo.
     */
    public void act() 
    {
        try (FileReader fr = new FileReader("Rtexto.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String linea = " ";

            while (true) {
                try {
                    if (!((linea = br.readLine()) != null)) break;
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                lista.add(linea);
            }

            Iterator iter = lista.iterator();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    } 
    /**
     * Regresa lista.
     */
    public List<String> getList(){
        return lista;
    }
}
