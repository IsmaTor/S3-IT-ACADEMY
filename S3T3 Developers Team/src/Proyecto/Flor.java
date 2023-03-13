package Proyecto;

/**
 * Clase Flor. 
 * 
 * Contiene información del producto flor.
 * 
 * Es hija de la clase Producto.
 * 
 * @see Clase Producto.
 * @author Ismael, Pilar y Christian.
 *
 */
public class Flor extends Producto{
	
	//Atributos
	/**
	 * color del objeto flor.
	 */
	private String color;
	
	//Constructores
	/**
	 * Constructor con 3 parámetros
	 * @param nombre tipo de flor.
	 * @param precio precio de la flor.
	 * @param color color de la flor.
	 */
	public Flor(String nombre, double precio, String color) {
		super(nombre, precio);
		this.color = color;
	}

	//Getters
	public String getColor() {
		return color;
	}

	//Setters
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * información del objeto flor con sus atributos.
	 */
	@Override
	public String toString() {
		return "(id:" + super.getIdProducto() + ") Flor | Nombre: " + super.getNombre() + " | Precio: " + super.getPrecio() + "€ | Color: " + this.color;
	}
	
}