package Proyecto;

/**
 * Clase Arbol. 
 * 
 * Contiene información del producto árbol.
 * 
 * Es hija de la clase Producto.
 * 
 * @see Clase Producto.
 * @author Ismael, Pilar y Christian.
 *
 */
public class Arbol extends Producto{

	//Atributos
	/**
	 * altura del objeto árbol.
	 */
	private double altura;
	
	//Constructores
	/**
	 * Constructor con 3 parámetros.
	 * @param nombre tipo de árbol.
	 * @param precio precio del árbol.
	 * @param altura altura del árbol.
	 */
	public Arbol(String nombre, double precio, double altura) {
		super(nombre, precio);
		this.altura = altura;
	}

	//Getters
	public double getAltura() {
		return altura;
	}

	//Setters
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * información del objeto árbol con sus atributos.
	 */
	@Override
	public String toString() {
		return "(id:" + super.getIdProducto() + ") Arbol | Nombre: " + super.getNombre() + " | Precio: " + super.getPrecio() + "€ | Altura: " + this.altura + "cm";
	}

}

