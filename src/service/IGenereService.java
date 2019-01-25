package service;

import java.util.List;

import model.Genere;

public interface IGenereService {
	void createGenere(Genere genere);
    void updateGenere(Genere genere);
    void deleteGenere(int id);
    Genere getGenere(int id);
    List<Genere> getAll();
    
}
