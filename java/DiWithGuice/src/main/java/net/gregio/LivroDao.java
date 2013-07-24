package net.gregio;

import java.util.List;

public class LivroDao implements Livros {

	@Override
	public int save(Livro livro) {
		return 1;
	}

	@Override
	public int update(Livro livro) {
		return 2;
	}

	@Override
	public int remove(Long id) {
		return 3;
	}

	@Override
	public List<Livro> findAll() {
		return null;
	}

}
