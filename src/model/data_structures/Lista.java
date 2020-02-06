package model.data_structures;

import java.util.Iterator;
import java.util.List;

import com.sun.java.swing.action.NewAction;
import java.io.IOException;
import java.io.StringReader;
import java.net.MalformedURLException;

// código basado en libro Algorithms
public class Lista <T> implements Iterator{
	
	// Atributos 
	
	private Nodo<T> cabeza;
	private int tamLista; 
	
	public Lista () {
		cabeza=null;
	}
	public Lista(T nuevo ) {
		cabeza= new Nodo<T> (nuevo);
		tamLista=1;
	}
	public void agregarPrincipio(T elemento) {
		Nodo<T> nuevo =new Nodo<T>(elemento);
		nuevo.cambiarSiguiente(cabeza);
		cabeza=nuevo; 
		tamLista++;
	}
	public void agregarPosicion(T nodo, int posicion)	{
		Nodo <T> nuevo  = new Nodo<T>(nodo);
		if(cabeza==null)
			cabeza=nuevo;
		else{
			Nodo <T> actual = cabeza;
			int contador=0; 
			while (actual.darSiguente() !=null && contador<posicion-1)
			{
				actual=actual.darSiguente();
				contador ++;
			}
			nuevo.cambiarSiguiente(actual);
			actual=nuevo;
		}
		tamLista++;
	}
	public void agregarFinal (T nodo) {
		Nodo <T> nuevo  = new Nodo<T>(nodo);
		
		if(cabeza==null)
			cabeza=nuevo;
		else{
			Nodo <T> actual = cabeza;
			while (actual.darSiguente() !=null)
			{
				actual=actual.darSiguente();
			}
			actual.cambiarSiguiente(nuevo);
		}
		tamLista++;
	}
	public Nodo<T> eliminarElementos(int pos)
	{
		if(cabeza!=null) {
			int contador=0; 
			Nodo <T> actual = cabeza;
			while(actual.darSiguente()!=null && contador<pos-1) {
				contador++;
				actual=actual.darSiguente();
			}
			Nodo <T> eliminado =actual.darSiguente().darSiguente() ;
			actual.cambiarSiguiente(eliminado);
			eliminado.cambiarSiguiente(null);
			tamLista--;
		}
	}
	
//	public void eliminar (N)000
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(tamLista==0)
		return false;
		if (cabeza.darSiguente()!=null)
			return true;
	}
	@Override
	public Nodo<T> next() {
		// TODO Auto-generated method stub
		if(cabeza!=null) 
		return cabeza.darSiguente();
		
		else 
			return null;
	}
	public Nodo<T> buscar (String obj)
	{
		if(cabeza!=null)
		{
			boolean encontrado; 
			Nodo <T> actual = cabeza;
			while(actual.darSiguente()!=null && !encontrado) {
				actual.darElemento().
				actual= actual.darSiguente();
			}
		}
	}
}
