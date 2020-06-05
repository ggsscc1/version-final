import greenfoot.*; 
import java.io.*;
import java.nio.*;
import java.util.*;
/**
 * Clase para guardar archivo.
 */
public class RecordsManager 
{
    
   
   
    /**
     * Clase para escribir en archivo.
     */
    public void guardaArchivo(String userName, int score){
        
        String cadena = Integer.toString(score);
        try{
            File archivo = new File("Rtexto.txt");
            
            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write(userName);
            escribir.write(",");
            escribir.write(cadena);
            
            escribir.write("\r\n");
            escribir.close();
        }catch(Exception e){
            System.out.println("Error al escribir");
        }
    }
   
}
