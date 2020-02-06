package model.logic;

import model.data_structures.Nodo;

public class Multa {


	private String objectid;
	private String fecha_Hora;
	private String medio_dete;
	private String clase_vehi;
	private String tipo_servi;
	private String infraccion;
	private String des_infraccion;
	private String localidad;
	private double[] coordenadas;


	public Multa (String obj, String fecha, String medio, String clase , String tipo, String infrac, String desInfra, String localidad, double coor1, double  coor2, double coor3)
	{
		objectid=obj;
		fecha_Hora= fecha;
		medio_dete=medio;
		clase_vehi=clase;
		tipo_servi=tipo;
		infraccion=infrac;
		des_infraccion=desInfra;
		this.localidad=localidad;
		coordenadas[1]=coor1;
		coordenadas[2]=coor2;
		coordenadas[3]=coor3;
	}

	public void cambiarObje(String obj) {
		objectid=obj;
	}
	public void cambiarFecha(String fecha) {
		fecha_Hora= fecha;
	}
	public void cambiarMedio(String medio) {
		medio_dete=medio;
	}
	public void cambiarClase(String clase) {
		clase_vehi=clase;
	}
	public void cambiarTipo(String tipo) {
		tipo_servi=tipo;
	}
	public void cambiarInfraccionj(String infrac) {
		infraccion=infrac;
	}
	public void cambiardescripcion(String desInfra) {
		des_infraccion=desInfra;
	}
	public void cambiarLocalidad(String localidad) {
		this.localidad=localidad;
	}
	public void cambiarCoord(int pos, double coordenada) {
		if (pos>=3)
			coordenadas[pos]=coordenada;
	}

	public String darObje() {
		return objectid;
	}
	public String darFecha() {
		return fecha_Hora;
	}
	public String darMedio() {
		return medio_dete;
	}
	public String darClase() {
		return clase_vehi;
	}
	public String darTipo() {
		return tipo_servi;
	}
	public String darInfraccionj() {
		return infraccion;
	}
	public String dardescripcion() {
		return des_infraccion;
	}
	public String darLocalidad() {
		return localidad;
	}
	public double darCoord(int pos) {
		if (pos>=3)
			return coordenadas[pos];
		return 0;
	}
	
}

