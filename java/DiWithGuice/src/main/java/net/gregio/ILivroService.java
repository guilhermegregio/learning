package net.gregio;

import com.google.inject.ImplementedBy;

@ImplementedBy(LivroService.class)
public interface ILivroService {
	Livros getDao();
}
