package service.impl;

import java.util.ArrayList;
import java.util.List;

import dao.impl.GenereDAO;
import model.Genere;
import service.IGenereService;

public class GenereService implements IGenereService {
	
	GenereDAO genereDAO = new GenereDAO();
	List<Genere> genere = new ArrayList<>();

	@Override
	public void createGenere(Genere genere) {
		/*genere=genereDAO.getAllGeneri();
		for(Genere g : genere)
			if(g != genereDAO.getAllGeneri())*/	
		genereDAO.createGenere(genere);
	}

	@Override
	public void updateGenere(Genere genere) {
			genereDAO.updateGenere(genere);
	}

	@Override
	public void deleteGenere(int id) {
		genereDAO.deleteGenere(id);
	}

	@Override
	public List<Genere> getAll() {
		// TODO Auto-generated method stub
		return genereDAO.getAllGeneri();
	}

	@Override
	public Genere getGenere(int id) {
		// TODO Auto-generated method stub
		return genereDAO.getGenere(id);
	}

	
	
}
