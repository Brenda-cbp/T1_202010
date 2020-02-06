package test.data_structures;

import model.data_structures.Lista;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLista {

	private Lista lista;
	private static int TAMANO=100;
	
	@Before
	public void setUp1() {
		lista= new Lista();
	}

	public void setUp2() {
		for(int i =0; i< TAMANO*2; i++){
			lista.agregar(""+i);
		}
	}

	@Test
	public void testAgregarFinal() {
		// TODO
	}
	public void testAgregarPosicion() {
		// TODO
	}
	public void testAgregarPrincipio() {
		// TODO
	}
	public void testBuscar() {
		// TODO
	}
	public void testEliminar() {
		// TODO
	}

	@Test
	public void testDarElemento() {
		setUp2();
		// TODO
	}

}
