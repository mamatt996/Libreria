package dao;

import java.util.List;
import model.Recensione;

public interface IRecensioneDAO {
	List<Recensione> getAllRecensioni();
    Recensione getRecensione(int id );
    boolean createRecensione(Recensione recensione);
    boolean updateRecensione(int id);
    boolean deleteRecensione(int id);
}

