package Proyecto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Clase Floristeria
 * 
 * Contiene métodos añadir, eliminar y mostrar los productos de la floristería (árboles, flores y decoraciones).
 * También contiene métedos para mostrar las cantidades (stock) de los productos y calcular el valor total.
 * Métodos guardar tickets y mostrarlos. 
 * 
 * @author Ismael, Pilar y Christian.
 *
 */
public class Floristeria {

	static Scanner entrada = new Scanner(System.in);
	
	private List<Arbol> arboles = new ArrayList();
	private List<Decoracion> decoraciones = new ArrayList();
	private List<Flor> flores = new ArrayList();
	
	public Map<Integer, List<Producto>> tickets = new HashMap<>();
	private List<String> nombreTickets = new ArrayList();

	//Atributos
	
	/**
	 * Nombre de la floristería.
	 */
	private String nombre;
	/**
	 * Número ID que se utilizará para el "autoincrement" para un ticket.
	 */
	private static int idStatic;
	/**
	 * Número de identificación ID de ticket. 
	 */
	private int idMap;
	
	//Constructores
	/**
	 * Constructor vacío.
	 */
	public Floristeria() {
	}
	/**
	 * Constructor con 1 parámetro.
	 * @param nombre nombre de la floristería.
	 */
	public Floristeria(String nombre) {
		this.nombre = nombre;
	}

	//getters
	public String getNombre() {
		return nombre;
	}


	public List<Decoracion> getDecoraciones() {
		return decoraciones;
	}

	public List<Flor> getFlores() {
		return flores;
	}

	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setArboles(List<Arbol> arboles) {
		this.arboles = arboles;
	}

	public void setDecoraciones(List<Decoracion> decoraciones) {
		this.decoraciones = decoraciones;
	}

	public void setFlores(List<Flor> flores) {
		this.flores = flores;
	}
	
	/**
	 * Método para comprobar que la entrada del usuario sea un double.
	 * @param missatge Pregunta al usuario.
	 * @return retorna un double.
	 */
	public static double leerDouble(String missatge) {
        double num = 0;
        boolean seguir;
            do {
                try {
                    seguir = false;
                    System.out.println(missatge);
                    num = entrada.nextDouble();
                }catch(InputMismatchException e) {
                    System.out.println("Introduzca un número.");
                    entrada.next();
                    seguir = true;
                }
                entrada.nextLine();
            }while(seguir);
        return num;
    }
	
	//Método añadir arbol
	/**
	 * Crea un objeto árbol con sus atributos (nombre, precio y altura).
	 * @return devuelve un objeto árbol.
	 */
	public Arbol anadirArbol() {
		
		System.out.println("Nombre del árbol: ");
		String nombre = entrada.nextLine();
		double precio = leerDouble("Precio del árbol: ");
		double altura = leerDouble("altura del árbol: ");
		
		Arbol arbol = new Arbol(nombre,precio,altura);
		arboles.add(arbol);
		System.out.println("Árbol añadido");
		
		return arbol;
	}
	
	//Método añadir Flor
	/**
	 * Crea un objeto flor con sus atributos (nombre, precio y color).
	 * @return Devuelve un objeto flor.
	 */
	public Flor anadirFlor() {
		
		System.out.println("Nombre de la flor: ");
		String nombre = entrada.nextLine();
		System.out.println("Color de la flor: ");
		String color = entrada.nextLine();
		double precio = leerDouble("Precio de añadir flor: ");
		
		Flor flor = new Flor(nombre,precio, color);
		flores.add(flor);
		System.out.println("Flor añadida");
		return flor;
	}
	
	//Método añadir Decoracion
	/**
	 * Crea un objecto decoración con sus atributos (nombre, precio y material).
	 * Se da a elegir al usuario si desea la decoración en MADERA o PLÁSTICO mediante una clase ENUM.
	 * @return Devuelve un objeto decoración.
	 */
	public Decoracion anadirDecoracion() {
		
		boolean elegido = false;
		System.out.println("Nombre de la decoración: ");
		String nombre = entrada.nextLine();
		
		
		String materiales ="";
		do {
			System.out.println("Elija material (Madera o Plástico) ");
			materiales = entrada.next().toUpperCase();
			if(materiales.equalsIgnoreCase("madera") || materiales.equalsIgnoreCase("plástico")) {
				elegido = true;
			}
			else {
				System.out.println("Opcion no correcta.");
			}
		}while(!elegido);
		
		double precio = leerDouble("Precio de la decoración: ");
		
		Decoracion decoracion = new Decoracion(nombre, precio, materiales);
		decoraciones.add(decoracion);
		System.out.println("Decoración añadida");
		return decoracion;
	}
	

	// método ver árboles
	/**
	 * Muestra todos los objetos árboles.
	 * Si no hay árboles creados mostrará un mensaje de tipo error.
	 */
	public void mostrarArboles() {
		System.out.println("STOCK DE ÁRBOLES");
		
		if (arboles.size() > 0)
			for (Arbol arbolesVer : arboles) {
				System.out.println(arbolesVer.toString());
			}
		else {
			System.out.println("ERROR: No hay árboles en el inventario.");
		}
	}

	// método ver flores
	/**
	 * Muestra todos los objetos flores.
	 * Si no hay flores creadas mostrará un mensaje de tipo error.
	 */
	public void mostrarFlores() {
		System.out.println("STOCK DE FLORES");
		
		if (flores.size() > 0)
			for (Flor floresVer : flores) {
				System.out.println(floresVer.toString());
			}
		else {
			System.out.println("ERROR: No hay flores en el inventario.");
		}
	}

	// método ver decoraciones
	/**
	 * Muestra todos los objetos decoración.
	 * Si no hay decoraciones creadas mostrará un mensaje de tipo error.
	 */
	public void mostrarDecoraciones() {
		System.out.println("STOCK DE DECORACIONES");
		
		if (decoraciones.size() > 0)
			
			for (Decoracion decoracionesVer : decoraciones) {
				System.out.println(decoracionesVer.toString());
			}
		else {
			System.out.println("ERROR: No hay decoraciones en el inventario.");
		}
	}

	//método cantidades árboles
	/**
	 * Muestra la cantidad existente de objetos árbol.
	 */
	public void cantidadStockArboles() {
		
		int cantidadArboles = arboles.size();
		
		System.out.println("Hay: " + cantidadArboles + " árboles.");
	}
	
	//método cantidades flores
	/**
	 * Muestra la cantidad existente de objetos flor.
	 */
	public void cantidadStockFlores() {
		
		int cantidadFlores = flores.size();
		
		System.out.println("Hay: " + cantidadFlores + " flores.");
	}
	
	//método cantidades decoraciones
	/**
	 * Muestra la cantidad existente de objetos decoración.
	 */
	public void cantidadStockDecoraciones() {
		
		int cantidadDecoraciones = decoraciones.size();
		
		System.out.println("Hay: " + cantidadDecoraciones + " decoraciones.");
	}

	//Método eliminar Arbol
	/**
	 * Elimina un objeto árbol mediante una identificación númerica tipo ID.
	 * <ul>
	 * <li> true: se elimina el objeto </li>
	 * <li> false: no se ha eliminado el objeto </li>
	 * </ul>
	 * @return retorna el objeto eliminado.
	 */
	public Arbol eliminarArbol() {
		int idEliminar;
		boolean eliminarHecho = false;
		Arbol arbol = null;
		mostrarArboles();
		if(arboles.size() > 0) {
			System.out.println("Qué ID de Arbol quieres que eliminemos?");
			idEliminar = entrada.nextInt();
			//Buscamos la coincidencia de id y si la hay la marcamos en eliminarHecho
			for(int i = 0; i < arboles.size(); i++) {
				if (arboles.get(i).getIdProducto() == idEliminar){
					arbol = arboles.get(i);
					arboles.remove(i);
					eliminarHecho = true;
				}
			}
			//Variará el mensaje si se ha hecho el eliminar o no
			if(eliminarHecho == true){
				System.out.println("El Arbol se ha eliminado correctamente.");
			}else{
				System.out.println("No se ha podido eliminar el Arbol.");
			}
		}
		return arbol;
	}
	
	//Método eliminar Flor
	/**
	 * Elimina un objeto flor mediante una identificación númerica tipo ID.
	 * <ul>
	 * <li> true: se elimina el objeto </li>
	 * <li> false: no se ha eliminado el objeto </li>
	 * </ul>
	 * @return retorna el objeto eliminado.
	 */
		public Flor eliminarFlor() {
			int idEliminar;
			boolean eliminarHecho = false;
			Flor flor = null;
			mostrarArboles();
			System.out.println("Qué ID de Flor quieres que eliminemos?");
			idEliminar = entrada.nextInt();
					
			for(int i = 0; i < flores.size(); i++) {
				if (flores.get(i).getIdProducto() == idEliminar){
					flores.get(i);
					flores.remove(i);
					eliminarHecho = true;
				}
			}
			
			if(eliminarHecho == true){
				System.out.println("La Flor se ha eliminado correctamente.");
			}else{
				System.out.println("No se ha podido eliminar la Flor.");
			}
			return flor;
		}
		
		//Método eliminar Decoración
		/**
		 * Elimina un objeto decoración mediante una identificación númerica tipo ID.
		 * <ul>
		 * <li> true: se elimina el objeto </li>
		 * <li> false: no se ha eliminado el objeto </li>
		 * </ul>
		 * @return retorna el objeto eliminado.
		 */
		public Decoracion eliminarDecoracion() {
			int idEliminar;
			boolean eliminarHecho = false;
			Decoracion decoracion = null;	
			mostrarArboles();
			System.out.println("Qué ID de Arbol quieres que eliminemos?");
			idEliminar = entrada.nextInt();
					
			for(int i = 0; i < decoraciones.size(); i++) {
				if (decoraciones.get(i).getIdProducto() == idEliminar){
					decoraciones.get(i);
					decoraciones.remove(i);
					eliminarHecho = true;
				}
			}
			
			if(eliminarHecho == true){
				System.out.println("La Decoración se ha eliminado correctamente.");
			}else{
				System.out.println("No se ha podido eliminar la Decoración.");
			}
			return decoracion;
		}


	//Metodos de valores
	/**
	 * Calcula el valor total de los productos de la floristería.
	 * @return Valor total
	 */
	public double calcularValorTotal() {
		double valorTotal = 0,valorTotalArboles = 0, valorTotalFlores = 0, valorTotalDecoraciones = 0;
		
		//Valor en arboles 
		for(int i = 0; i < arboles.size(); i++) {
			valorTotalArboles = valorTotalArboles + arboles.get(i).getPrecio();
		}
		//Valor en flores
		for(int i = 0; i < flores.size(); i++) {
			valorTotalFlores = valorTotalFlores + flores.get(i).getPrecio();
		}
		//Valor en decoraciones
		for(int i = 0; i < decoraciones.size(); i++) {
			valorTotalDecoraciones = valorTotalDecoraciones + decoraciones.get(i).getPrecio();
		}
		//Suma de valores
		valorTotal = valorTotalArboles + valorTotalFlores + valorTotalDecoraciones;
		//Hago los calculos por separado por si modificamos tenerlos ya
		
		System.out.println(nombre + " es de " + valorTotal + "€.");
		
		return valorTotal;
		
		
	}

	/**
	 * Se almacena en un map el arrayList de productos
	 * 
	 * @param producto
	 */
	public void almacenarTicket(List <Producto> productos) {
        idStatic++;
        idMap = idStatic;
        tickets.put(idMap, productos);
    }

	/**
	 * Se recorre el map tickets
	 */
    public void verTickets() {
        if(tickets.size()== 0) {
            System.out.println("No existen tickets guardados");
        }else {
            for(Map.Entry entry: tickets.entrySet()) {
                System.out.println("Ticket " + entry.getKey() +" "+ entry.getValue());
            }
        }
    }
	
    /**
     * Se almacena en un arrayList el nombre de los
     * tickets impresos
     * 
     * @param nombreTicket
     */
    public void almacenarNombreTicketsImpresos(String nombreTicket) {
    	nombreTickets.add(nombreTicket);
    }
    
    /**
     * Lee el archivo .txt que desea el usuario.
     */
    public void verNombreTicketsImpresos() {
		Scanner entrada = new Scanner(System.in);
		
		boolean existe = false;
		
		System.out.println("Qué ticket desea comprobar?");
		
    	nombreTickets.forEach(e-> System.out.println(e));
    	
    	String recogerNombreArchivo = entrada.nextLine();
    	
    	for (int i=0; i < nombreTickets.size();i++) {
    		if(nombreTickets.get(i).equals(recogerNombreArchivo)) {
    			existe = true;
    		}
    	}
    	
    	if(existe) {
    		Archivo.leerTicket(recogerNombreArchivo);
    	}else {
    		System.out.println("El archivo no existe");
    	}
    	
    }
    
    /**
     * Devuelve una cadena que representa al objeto floristería.
     * @return información de la floristería con su único atributo nombre.
     */
	@Override
	public String toString() {
		return "Floristeria: " + this.nombre ;

	}
	
}