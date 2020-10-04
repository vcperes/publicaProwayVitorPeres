package Testes;


import org.junit.Before;
import org.junit.Test;

import Classes.Janela;

public class JanelaTeste {

	Janela janela;
	@Before
	public void setUp() throws Exception {
		janela = new Janela();
	}

	@Test
	public final void testInicializaJanela() {
		janela.inicializaJanela();
	}

	@Test
	public final void testInicializaBotoes() {
		janela.inicializaBotoes();
	}

}
