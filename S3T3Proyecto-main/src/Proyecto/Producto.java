package Proyecto;

/**
 * Clase Producto
 * Contiene los atributos ID, nombre y precio.
 * Es padre de las clases, Arbol, Flor y Decoración.
 * @author Ismael, Pilar y Christian.
 * @see Arbol
 * @see Flor
 * @see Decoracion 
 */
public class Producto {

	//Atributos
	/**
	 * Número ID para un producto.
	 */
	private int idProducto;
	/**
	 * Número ID que se utilizará para el "autoincrement" para un producto.
	 */
	private static int idSiguienteProducto = 0;
	/**
	 * nombre o tipo de producto.
	 */
	private String nombre;
	/**
	 * precio del producto.
	 */
	private double precio;
	
	//Constructores
	/**
	 * Constructor con 2 parámetros.
	 * @param nombre nombre o tipo de producto.
	 * @param precio precio del producto.
	 */
	public Producto(String nombre, double precio) {
		this.idSiguienteProducto++;
		this.idProducto = this.idSiguienteProducto;
		this.nombre = nombre;
		this.precio = precio;
	}

	//Getters
	public int getIdProducto() {
		return idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	//Setters
//	public void setIdProducto(int idProducto) {
//		this.idProducto = idProducto;
//	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}

