package net.gregio;

import java.util.List;

import com.google.inject.ImplementedBy;

@ImplementedBy(LivroDao.class)
public interface Livros {

	int save(Livro livro);

	int update(Livro livro);

	int remove(Long id);

	List<Livro> findAll();

}
