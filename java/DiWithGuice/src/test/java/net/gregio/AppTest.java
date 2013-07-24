package net.gregio;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class AppTest {

	@Test
	public void testApp() {
		Injector injector = Guice.createInjector();

		LivroController livroController = new LivroController(
				injector.getInstance(ILivroService.class));

		Livro livro = new Livro();
		assertEquals(1, livroController.addLivro(livro));
		assertEquals(2, livroController.udateLivro(livro));
		assertEquals(3, livroController.excluirLivro(1L));
		assertEquals(null, livroController.findLivros());
	}
}
