package model.logic;

import model.data_structures.Lista;
import com.google.gson.*;
compile 'com.google.code.gson:gson:2.8.2";

import com.google.gson.stream.JsonReader;
/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo {
	
	/**
	 * Atributos del modelo del mundo
	 */
	private Lista lista;
	//private Multa multa;
	
	public static final String RUTA= "./data/comparendos_dei_2018_small_geojson";
	private String objectid;
	private String fecha_Hora;
	private String medio_dete;
	private String clase_vehi;
	private String tipo_servi;
	private String infraccion;
	private String des_infraccion;
	private String localidad;
	private double[] coordenadas;
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		lista = new Lista();
	}
	
	/**
	 * Constructor del modelo del mundo con capacidad dada
	 * @param tamano
	 */
	public Modelo(int capacidad)
	{
		datos = new ArregloDinamico(capacidad);
		
		//Gson gson= new Gson;
		
	}
	
	public Lista darLista () {
		return lista;
	}
	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return datos.darTamano();
	}

	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 */
	public void agregar(String dato)
	{	
		datos.agregar(dato);
	}
	
	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public String buscar(String obj)
	{
		return lista.buscar(obj);
	}
	
	/**
	 * Requerimiento eliminar dato
	 * @param dato Dato a eliminar
	 * @return dato eliminado
	 */
	public String eliminar(String dato)
	{
		return datos.eliminar(dato);
	}
	public static void main(String [] args) {
		objetoJava();
		
	}
	public static void objetoJava () {
		String userJson="!;";
		Gson gson= new Gson();
		Multa multa =gson.fromJson(userJson, Multa.class);
		JsonReader reader = new JsonReader(new StringReader(RUTA));
		handleObject(reader);
	
	}
	

}
