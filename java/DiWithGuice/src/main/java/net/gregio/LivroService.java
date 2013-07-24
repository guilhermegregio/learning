package net.gregio;

import com.google.inject.Inject;

public class LivroService implements ILivroService{
	
	private Livros dao;
	
	@Inject
	public LivroService(Livros dao){
		this.dao = dao;
	}
	
	public Livros getDao(){
		return dao;
	}
}
