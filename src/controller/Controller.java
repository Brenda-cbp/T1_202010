package controller;

import java.util.Scanner;

import model.logic.Modelo;
import view.View;

public class Controller {

	/* Instancia del Modelo*/
	private Modelo modelo;

	/* Instancia de la Vista*/
	private View view;

	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view= new View();
		modelo= new Modelo();
	}

	public void run() {
		Scanner lector = new Scanner(System.in);

		boolean fin = false;
		Integer respuesta;

		while( !fin ){
			view.printMenu();
			view.printMessage("--------- \nSeleccione la opcion \nDar capacidad inicial del arreglo: ");
			view.printMessage("1.  Realizar la carga de los comparendos de la ciudad de Bogotá para el periodo 2018.");
			view.printMessage("2.  Consultar la información básica de un comparendo dado su OBJECTID");
			try {
				int option = lector.nextInt();
				switch(option){
				case 1:
					modelo.main(null);						
					break;

				case 2:
					fin = true;
					view.printMessage("Ingrese el Objectid a buscar");
					String buscar=lector.next();
					modelo.darLista();
					if(modelo.darLista()!=null) {
						view.printMessage("OBJECTID"+buscar);
					view.printMessage("FECHA_HORA:");
					view.printMessage("INFRACCION:");
					view.printMessage("CLASE_VEHI:");
					view.printMessage("TIPO_SERVI");
					view.printMessage("LOCALIDAD");
					}
					else {
						view.printMessage("No hay un elemento con ese OBJECTID");
					}
				}
			}
			catch (Exception e)
			{
				view.printMessage("Digitar una opción válida");
			}
		}
	}

}	

