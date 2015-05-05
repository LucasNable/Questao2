package br.com.globo;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.Test;

public class ConjecturaTeste {

	@Test
	public void conjecturaTimeTeste() {
		Long inicio = Calendar.getInstance().getTimeInMillis();
		Conjectura.processaCollatz(1000000l);
		Long fim = Calendar.getInstance().getTimeInMillis();
		assertTrue(fim - inicio < 5000);
	}

	@Test
	public void conjecturaResultTeste() {
		Long resultado = Conjectura.processaCollatz(1000000l);
		assertTrue(resultado.longValue() == 837799l);
	}
}
