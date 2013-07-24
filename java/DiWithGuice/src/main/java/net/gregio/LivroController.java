package net.gregio;

import java.util.List;

import com.google.inject.Inject;

public class LivroController {

	private ILivroService service;

	@Inject
	public LivroController(ILivroService service) {
		this.service = service;
	}

	public int addLivro(Livro livro) {
		return service.getDao().save(livro);
	}

	public int udateLivro(Livro livro) {
		return service.getDao().update(livro);
	}

	public int excluirLivro(Long id) {
		return service.getDao().remove(id);
	}

	public List<Livro> findLivros() {
		return service.getDao().findAll();
	}
}
