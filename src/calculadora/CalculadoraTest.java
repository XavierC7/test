package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	@Before //codigo que se ejecuta antes de la prueba del metodo por ejemplo variables
	public void before(){
		System.out.println("before()");
	}
	
	@Test
	public void testSuma() {
		System.out.println("suma()");
		int resultadoObtenido = Calculadora.suma(2, 3);
		int resultadoEsperado = 5;
		assertEquals(resultadoObtenido,resultadoEsperado);
		
	}

	@Test
	public void testResta() {
		System.out.println("resta()");
		int resultadoObtenido = Calculadora.resta(3, 2);
		int resultadoEsperado = 1;
		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	
	@Test
	public void testSumaMala() {
		System.out.println("sumaMala()");
		int resultadoObtenido = Calculadora.sumaMala(2, 3);
		int resultadoEsperado = 5;
		assertEquals(resultadoObtenido,resultadoEsperado);
		
	}
	
	@After //codigo que se ejecuta despues de la prueba del metodo 
	public void after() {
		System.out.println("after()");
	}
}
