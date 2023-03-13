package Proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
/**
 * Clase Archivo
 * 
 * Contiene los métodos necesarios para guardar un ticket y leer un ticket.
 * @author Ismael, Pilar y Christian.
 *
 */

public class Archivo {
	
	//Método guardar ticket
	/**
	 * Método para imprimir un ticket con una lista de productos.
	 * @param ticket ticket con la venta para imprimir.
	 * @param nombreTicket nombre del ticket.
	 */
    static void guardarTicket(List<Producto> ticket, String nombreTicket) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try {
            fichero = new FileWriter(nombreTicket);
            pw = new PrintWriter(fichero);

            for(Producto p: ticket) {
                pw.println(p);
            }

            //System.out.println("Ticket impreso");

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
           try {
               if (fichero != null)  fichero.close();
           } catch (Exception e2) {
               System.out.println(e2.getMessage());
           }
        }
    }
	
	//Leer ticket
    /**
     * Método para encontrar un ticket y leerlo.
     * @param path ticket a leer.
     */
	static void leerTicket(String path) {
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;

	    try {
	    	archivo = new File(path);
	    	fr = new FileReader (archivo);
	        br = new BufferedReader(fr);
	        
	         // Lectura del fitxer
	         String linea;
	         while((linea=br.readLine())!=null) {
	        	System.out.println(linea);
	         }
	    	
	    }catch(Exception e) {
	    	e.printStackTrace();
	    } 
	}
	
	
	
}
