package model.data_structures;

public class Nodo <E> {

	//Atributos 

	
	/**
	 * Nodo siguiente al actual 
	 */
	private Nodo<E> sig;
	private E elemento;
	
	public Nodo (E multa) {
		sig=null;
		elemento = multa;
	}
	public Nodo<E> darSiguente(){
		return sig;
	}
	public void cambiarSiguiente(Nodo <E> nuevoNodo)
	{
		sig= nuevoNodo;
	}
	public E darElemento() {
		return elemento; 
	}
	public void cambiarElemento(E element) {
		elemento =element;
	}
}
