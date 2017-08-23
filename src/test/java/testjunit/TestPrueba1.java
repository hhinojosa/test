package testjunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPrueba1 {

	@Test
	public void ahorroHijo() {
		Hijo hijo = new Hijo();
		assertEquals("El hijo ahorro",hijo.getAhorrosDespuesDePadre() , 20,0);
	}
	@Test
	public void ahorroPadre(){
		Padre padre = new Padre();
		assertEquals("El padre ahorro",padre.getAhorros() , 10,0);

	}
	@Test
	public void ahorroNieto(){
		Nieto nieto = new Nieto();
		assertEquals("El nieto ahorro",nieto.getAhorroFamiliar() , 30,0);
	}
	@Test
	public void ahorrosAbueloDesdeNieto(){
		Nieto nieto = new Nieto();
		assertEquals("El nieto ve al abuelo",nieto.getAhorros() , 10,0);

	}
}
