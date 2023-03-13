package Proyecto;

/**
 * Clase Decoración. 
 * 
 * Contiene información del producto decoración.
 * 
 * Es hija de la clase Producto.
 * 
 * @see Clase Producto.
 * @author Ismael, Pilar y Christian.
 *
 */
public class Decoracion extends Producto{

	//Constructor enum (sin declaraciones de acceso siempre será private) 
	/**
	 * constructor de la clase Enum, sin declaraciones de acceso, con 2 opciones.
	 */
	enum materiales{
		MADERA, PLASTICO
	};
	
	//Atributos
	/**
	 * tipo de material.
	 */
	private String material;
	
	//Constructor
	/**
	 * Constructor con 3 parámetros.
	 * @param nombre tipo de decoración.
	 * @param precio precio de la decoración.
	 * @param materiales tipo de materiales de la decoración.
	 */
	public Decoracion(String nombre, double precio, String materiales) {
		super(nombre, precio);
		this.material = materiales;
	}

	//Getters
	public String getMaterial() {
		return material;
	}

	//Setters
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * información del objeto decoración con sus atributos.
	 */
	@Override
	public String toString() {
		return "(id:" + super.getIdProducto() + ") Decoración | Nombre: " + super.getNombre() + " | Precio: " + super.getPrecio() + "€ | Material: " + this.material;
	}
	
}