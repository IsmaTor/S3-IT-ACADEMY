package Proyecto;

import java.io.IOException;
import java.util.List;
/**
 * Clase Main
 * Aplicación para crear una o varias floristerías y añadir productos.
 * @author Ismael, Pilar y Christian.
 *
 */
public class Main {

	/**
	 * 
	 * @param args punto de entrada para la ejecución de la aplicación.
	 */
	public static void main(String[] args) {

		/**
		 * Objeto utilizado para la llamada de los objetos de la clase FloristeriaContenedor.
		 */
		FloristeriaContenedor llamadaObjetosFloristeriaContenedor = new FloristeriaContenedor();

		/**
		 * Objeto de la clase Floristeria que sera utilizado para fijar la floristería elegida por el usuario.
		 */
		Floristeria floristeria;
		/**
		 * opciones utilizadas en el menú de la aplicación.
		 */
		int opcion = 0, opcionFloristeria = 0, opcionProductos = 0, opcionStocksCantidades = 0, opcionStocks = 0;

		do {
			try {
				opcion = Menu.menuFloristeria();
				
				switch (opcion) {
				case 1:
					System.out.println("CREAR FLORISTERÍA");
					llamadaObjetosFloristeriaContenedor.crearFloristeria();
					break;
				case 2:
					System.out.println("MOSTRAR INFORMACIÓN FLORISTERÍA");
					llamadaObjetosFloristeriaContenedor.mostrarFloristeria();
					break;
				case 3:
					System.out.println("ELIMINAR FLORISTERÍA");
					llamadaObjetosFloristeriaContenedor.eliminarFloristeria();
					break;
				case 4:
					System.out.println("OPCIONES DE FLORISTERÍA");
					floristeria = llamadaObjetosFloristeriaContenedor.devuelveFloristeria();

					if(floristeria != null) {
						do {
							try {
							opcionFloristeria = Menu.menuOpcionesFloristeria();
							switch (opcionFloristeria) {
								case 1:
									Ticket ticket = new Ticket();
									//Crear los tickets, compra
									do {
										try {
										opcionProductos = Menu.menuProductos();
										switch(opcionProductos) {
											case 1:
												//Añade arboles al ticket y floristeria
												Arbol arbol = floristeria.anadirArbol();
												ticket.arbolesTicket(arbol);
												break;
											case 2:
												//Elimina arbol de floristeria
												Arbol arbol1 = floristeria.eliminarArbol();
												ticket.eliminaArbolTicket(arbol1);
												break;
											case 3:
												//Añade arboles al ticket y floristeria
												Decoracion decoracion = floristeria.anadirDecoracion();
												ticket.decoracionTicket(decoracion);
												break;
											case 4:
												Decoracion decoracion1 = floristeria.eliminarDecoracion();
												ticket.eliminaDecoracionTicket(decoracion1);
												break;
											case 5:
												Flor flor = floristeria.anadirFlor();
												ticket.floresTicket(flor);
												break;
											case 6:
												Flor flor1 = floristeria.eliminarFlor();
												ticket.eliminaFlorTicket(flor1);
												break;
											case 7:
												ticket.verTicket();
												break;
											case 0:
												List <Producto> ticketMain = ticket.getTicket();
												if(ticketMain.size() != 0) {
												floristeria.almacenarTicket(ticketMain);
												
												//Para imprimir el ticket
												try {
													ticket.imprimirTicket(floristeria);
													floristeria.almacenarNombreTicketsImpresos(ticket.getNombreTicket());
												} catch (IOException e) {
													e.printStackTrace();
												}
												}
												break;
											default:
												System.out.println("Opción no válida");
											}
										}catch(Exception ex) {
										System.out.println("ERROR de comando no válido.");
										}
									} while(opcionProductos != 0);
									break;
								case 2:
									do {
										try {
										opcionStocks = Menu.menuMostrarStock();
										
										switch(opcionStocks) {
										
										case 1:
											floristeria.mostrarArboles();
											break;
										case 2:
											floristeria.mostrarFlores();
											break;
										case 3:
											floristeria.mostrarDecoraciones();
											break;
										case 4:
											floristeria.mostrarArboles();
											floristeria.mostrarFlores();
											floristeria.mostrarDecoraciones();
											break;
										case 0:
											break;
										default:
											System.out.println("Opción no válida");
											break;
											}
										}catch(Exception ex) {
											System.out.println("ERROR de comando no válido.");
										}
									} while (opcionStocks != 0);
								break;
									
								case 3:
									do {
										try {
										opcionStocksCantidades = Menu.menuCantidadesStock();
										
										switch(opcionStocksCantidades) {
										
										case 1:
											System.out.println("STOCK DE ÁRBOLES");
											floristeria.cantidadStockArboles();
											break;
										case 2:
											System.out.println("STOCK DE FLORES");
											floristeria.cantidadStockFlores();
											break;
										case 3:
											System.out.println("STOCK DE DECORACIONES");
											floristeria.cantidadStockDecoraciones();
											break;
										case 4:
											floristeria.cantidadStockArboles();
											floristeria.cantidadStockFlores();
											floristeria.cantidadStockDecoraciones();
											break;
										case 0:
											break;
										default:
											System.out.println("Opción no válida");
											break;
											}
										}catch(Exception ex) {
											System.out.println("ERROR de comando no válido.");
										}
	
									} while (opcionStocksCantidades != 0);
								
									break;
								case 4:
									System.out.println("VALOR TOTAL DE LA FLORISTERÍA");
									floristeria.calcularValorTotal();
									break;
								case 5:
									//Mostrar ventas anteriores
									floristeria.verTickets();
									break;
								case 6:
									//Buscar ticket ya impreso
									floristeria.verNombreTicketsImpresos();
									break;
								case 0:
									break;
								default:
									System.out.println("Opción no válida");
								}
							}catch(Exception ex) {
								System.out.println("ERROR de comando no válido.");
							}
						} while (opcionFloristeria != 0);
}
						break;
				case 0:
					System.out.println("Cerrando programa...");
					break;
				default:
					System.out.println("Opción no válida");
				}
			}catch (Exception ex) {
				System.out.println("ERROR comando introducido no valido.");
			}
		} while (opcion != 0);
	}
}