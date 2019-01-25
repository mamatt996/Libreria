package dao;

import java.util.List;
import model.Genere;

public interface IGenereDAO {
	List<Genere> getAllGeneri();
    Genere getGenere(int id );
    void createGenere(Genere genere);
    void updateGenere(Genere genere);
    void deleteGenere(int id);
}
