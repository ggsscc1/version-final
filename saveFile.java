import greenfoot.*; 
import java.io.*;
import java.nio.*;
import java.util.*;
/**
 * Clase para guardar archivo.
 */
public class saveFile extends Actor
{
    Nivel mundoActual = (Nivel)getWorld();
    private String userName;
    private int score = mundoActual.score;
    /**
     * Clase para escribir en archivo.
     */
    public void manejaArchivo(String userName){

        String cadena = Integer.toString(score);
        try{
            File archivo = new File("Rtexto.txt");

            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write(userName);
            escribir.write(" ");
            escribir.write(cadena);
            
            escribir.write("\r\n");
            escribir.close();
        }catch(Exception e){
            System.out.println("Error al escribir");
        }
    }

}
