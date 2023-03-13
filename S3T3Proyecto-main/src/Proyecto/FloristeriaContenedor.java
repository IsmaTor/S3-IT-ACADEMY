package Proyecto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Clase FloristeriaContenedor
 *  
 *  Contiene métodos para crear, mostrar y eliminar floristerías.
 *  
 *  También contiene los métodos para mostrar floristerías y escoger una floristería en la que se desee trabajar.
 *
 * @author Ismael, Pilar y Christian.
 *
 */
public class FloristeriaContenedor {
	
	private Scanner entrada = new Scanner(System.in);
	
	private ArrayList<Floristeria> floristerias = new ArrayList<Floristeria>();
				
	//metodo crear floristería
	/**
	 * Al introducir un nombre para la nueva floristería se comprueba si el nombre ya existe.
	 * Si existe le pedirá al usuario que indique otro nombre.
	 * En cuanto se introduce un nombre no repetido, sale del ciclo y se crea una floristería nueva que es añadida a la array. 
	 */
	public void crearFloristeria() {
		String nombre;
		
		System.out.println("Introducir nombre para la nueva floristería: ");
		nombre = entrada.nextLine();
		
		for ( int i = 0; i < floristerias.size(); i++) {
			
			while(floristerias.get(i).getNombre().equals(nombre)) {
			
				if (floristerias.get(i).getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("El nombre introducido ya existe.");
				
				System.out.println("Introducir el nombre para la nueva floristería: ");
				nombre = entrada.nextLine();
				} 
			}
		}
		
		Floristeria floristeriaCrear = new Floristeria(nombre);
		
		floristerias.add(floristeriaCrear);
		
		System.out.println("La floristería " + floristeriaCrear.getNombre() + " se ha creado correctamente.");
		
	}
	
	/**
	 * Se muestra una floristería elegida por el usuario.
	 * Al usuario se le mostrarán todas las floristerías existentes.
	 * Si no hay floristería creada mostrará un mensaje de tipo error.
	 */
	//método mostrar floristería
	public void mostrarFloristeria() {

        String nombre;
        Floristeria floristeriaMostrada = null;

        if (floristerias.size() == 0) {
            System.out.println("ERROR. No existen floristerías en el sistema.");
        } else {
        	mostrarFloristerias();

        	System.out.println("Introducir la floristería a buscar: ");
        	nombre = entrada.next();

        	for ( int i = 0; i < floristerias.size(); i++) {
        		if (floristerias.get(i).getNombre().equalsIgnoreCase(nombre)) {
        			floristeriaMostrada = floristerias.get(i);
        			System.out.println(floristerias.get(i).toString() + " mostrada correctamente.");
        		}
        	}
        	
        	if (floristeriaMostrada == null) {
        			System.out.println("No se ha encontrado la floristería.");
        	}
        }
	}

	
	/**
	 * Elimina una floristería elegida por el usuario.
	 * Al usuario se le mostrarán todas las floristerías existentes.
	 * Si no hay floristería creada mostrará un mensaje de tipo error.
	 */
	//método eliminar floristería
	public void eliminarFloristeria() {
		
		String nombre = "";
		Floristeria floristeriaEncontrada = null;
		 
		mostrarFloristerias();
		
		if (floristerias.size() > 0) {
			System.out.println(" \n ");
			System.out.println("Introducir nombre de la floristería a eliminar: ");
			nombre = entrada.nextLine();
		
			for ( int i = 0; i < floristerias.size(); i++) {
			
				if (floristerias.get(i).getNombre().equalsIgnoreCase(nombre)) {
				
					floristeriaEncontrada = floristerias.get(i);
					floristerias.remove(i);
					System.out.println("La floristería se ha eliminado correctamente");
				} 
			}
			if (floristeriaEncontrada == null) {
				System.out.println("No se ha encontrado la floristería.");
			}
		}
	}
	
	/**
	 * Muestra todas las floristerías creadas.
	 * Si no hay floristerías creadas mostrará un mensaje de tipo error.
	 */
	//Mostrar floristerias
	public void mostrarFloristerias() {
		if (floristerias.size() > 0)
			for (Floristeria floristeriaVer : floristerias) {
				System.out.println(floristeriaVer.toString());
			}
		else {
			System.out.println("No existen floristerías.");
		}
	}
	
	/**
	 * Se elige una floristería escogida por el usuario en la que trabajar en la aplicación.
	 * 
	 * @return <ul>
	 * 			<li> Devuelve un objeto floristería </li>
	 * 			</ul>
	 * 
	 * Si no hay floristerías creadas mostrará un mensaje de tipo error.
	 */
	//Devuelvefloristeria
	public Floristeria devuelveFloristeria() {
        boolean existe = false;

        if(floristerias.size() > 0) {
            mostrarFloristerias();
            System.out.println("Con qué floristería quiere trabajar?");
            String nombre = entrada.nextLine();

            for (Floristeria f : floristerias) {
                if(f.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Ha escogido la floristería " + f.getNombre() + " correctamente.");
                    existe = true;
                    return f;
                }
            } 
            if (!existe) {
                System.out.println("La floristería indicada no existe");
            }

        }else {
            System.out.println("No existen floristerias");
        }

        return null;
    }

}