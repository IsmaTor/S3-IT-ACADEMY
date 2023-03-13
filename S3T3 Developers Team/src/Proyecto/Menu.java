package Proyecto;

import java.util.Scanner;

/**
 * Clase Menu
 * Se han creado todos los menús y submenús necesarios que serán usados en la aplicación.
 * @author Ismael, Pilar y Christian.
 *
 */
public class Menu {

	/**
	 * Menu de panel de control de floristerías.
	 * @return número de opción relacionado con el menú.
	 * Se convierte una cadena de texto en un número entero para que cualquier carácter sea reconocido como Integer para poder lanzar el error de comando erroneo.
	 */
	public static int menuFloristeria() {
		Scanner entrada = new Scanner(System.in);
		int opcion;

		System.out.println(" \n"
				+ "PANEL DE CONTROL DE FLORISTERIAS: \n" 
				+ "1. Crear floristería. \n" 
				+ "2. Mostrar iformación floristería. \n"
				+ "3. Eliminar floristería. \n"
				+ "4. Opciones de floristería. \n" 
				+ "0. Salir del programa. \n");
		
		opcion = Integer.parseInt(entrada.next());
		
		return opcion;
		
	}
	
	/**
	 * Menu de panel de opciones de floristería.
	 * @return número de opción relacionado con el menú.
	 * Se convierte una cadena de texto en un número entero para que cualquier carácter sea reconocido como Integer para poder lanzar el error de comando erroneo.
	 */
	public static int menuOpcionesFloristeria() {
		Scanner entrada = new Scanner(System.in); 
		
		int opcion;
		
		System.out.println(" \n"
				+ "OPCIONES DE FLORISTERIA \n"
				+ "1.  Realizar pedido. \n"
				+ "2.  Mostrar stock. \n"
				+ "3.  Mostrar cantidades en stock. \n"
				+ "4.  Mostrar valor total de la floristería. \n"
				+ "5.  Ver tickets anteriores. \n"
				+ "6.  Buscar ticket impreso.  \n"
				+ "0.  Volver al Menú. \n");
		
		opcion = Integer.parseInt(entrada.next());
		
		return opcion;
	}
	
	/**
	 * Menu de panel de opciones de productos.
	 * @return número de opción relacionado con el menú.
	 * Se convierte una cadena de texto en un número entero para que cualquier carácter sea reconocido como Integer para poder lanzar el error de comando erroneo.
	 */
	public static int menuProductos() {
		Scanner entrada = new Scanner(System.in);
		
		int opcion;
		
		System.out.println(" \n"
				+ "OPCIONES DE PRODUCTO \n"
				+ "1.  Añadir árbol. \n"
				+ "2.  Retirar árbol.  \n"
				+ "3.  Añadir decoración. \n"
				+ "4.  Retirar decoración. \n"
				+ "5.  Añadir Flor. \n"
				+ "6.  Retirar flor. \n"
				+ "7.  Ver ticket. \n"
				+ "0.  Generar ticket y salir. \n");
		
		opcion = Integer.parseInt(entrada.next());
		
		return opcion;
	}
	
	/**
	 * Menu de panel de opciones de stock de floristería.
	 * @return número de opción relacionado con el menú.
	 * Se convierte una cadena de texto en un número entero para que cualquier carácter sea reconocido como Integer para poder lanzar el error de comando erroneo.
	 */
	public static int menuCantidadesStock() {
		Scanner entrada = new Scanner(System.in);
		
		int opcion;
		
		System.out.println(" \n" 
				+ "OPCIONES DE STOCK \n" 
				+ "1. Mostrar stock de árboles. \n" 
				+ "2. Mostrar stock de flores. \n"
				+ "3. Mostrar stock de decoraciones. \n" 
				+ "4. Mostrar todos los stocks. \n" 
				+ "0. Volver al menú de floristería.");
		
		opcion = Integer.parseInt(entrada.next());
		
		return opcion;
	}
	
	/**
	 * Menu de panel de opciones para mostrar productos de floristería.
	 * @return número de opción relacionado con el menú.
	 * Se convierte una cadena de texto en un número entero para que cualquier carácter sea reconocido como Integer para poder lanzar el error de comando erroneo.
	 */
	public static int menuMostrarStock() {
		Scanner entrada = new Scanner(System.in);
		
		int opcion;
		
		System.out.println(" \n" 
				+ "OPCIONES DE MOSTRAR PRODUCTOS \n" 
				+ "1. Mostrar árboles. \n" 
				+ "2. Mostrar flores. \n"
				+ "3. Mostrar decoraciones. \n" 
				+ "4. Mostrar todos los productos. \n" 
				+ "0. Volver al menú de floristería.");

		opcion = Integer.parseInt(entrada.next());
		
		return opcion;
	}
}