package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.IGenereDAO;
import model.Genere;

public class GenereDAO extends AbstractDAO implements IGenereDAO {
	
	private static final String LIST_QUERY = "SELECT * FROM genere";
	private static final String READ_QUERY = "SELECT id,nome FROM genere WHERE id = ? ";
    private static final String CREATE_QUERY = "INSERT INTO genere (nome) VALUES (?)";
    private static final String UPDATE_QUERY = "UPDATE genere SET nome=? WHERE id = ?";
    private static final String DELETE_QUERY = "DELETE FROM genere WHERE id = ?";

	@Override
	public List<Genere> getAllGeneri() {
		List<Genere> result = new ArrayList<>();
		try (
				Connection c= getConnection();
				PreparedStatement ps = c.prepareStatement(LIST_QUERY);
				ResultSet rs = ps.executeQuery();
				){
			  	while (rs.next()) {
	                Genere g = new Genere(rs.getString("nome"));
	                g.setId(rs.getInt("id"));
	                result.add(g);
			  	}
		} catch (Exception e) {
            e.printStackTrace();
        	}
		return result;
	}

	@Override
	public Genere getGenere(int id) {
		Genere genere = null;
		ResultSet rs = null;
		try (
	              Connection c = getConnection();
	              PreparedStatement ps = c.prepareStatement(READ_QUERY);
	          ) {
			ps.setString(1,"nome");
			rs = ps.executeQuery();
			  if (rs.next() && rs != null) {
				  genere=new Genere(rs.getString("nome"));
			  	}
			  } catch (Exception e) {
				  e.printStackTrace();
			  } try {
				  rs.close();
			  } catch (Exception rse) {
				  rse.printStackTrace();
			  } finally {
				  try {
			          rs.close();
			          } catch (Exception rse) {
			              rse.printStackTrace();
			          }
			  }
			  return genere;
		}

	@Override 
	public void createGenere(Genere genere) {
        try (
                    Connection c = getConnection();
                    PreparedStatement ps = c.prepareStatement(CREATE_QUERY);
                ) {
                ps.setString(1, genere.getNome());
                ps.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
		}

	@Override
	public void updateGenere(Genere genere) {
		try
        (
            Connection c = getConnection();
            PreparedStatement ps = c.prepareStatement(UPDATE_QUERY);
        ){
        ps.setString(1, genere.getNome());
        ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			}

	}

	@Override
	public void deleteGenere(int id) {
		 try (
                 Connection c = getConnection();
                 PreparedStatement ps = c.prepareStatement(DELETE_QUERY);
             ) {
             ps.setInt(1,id);
             ps.executeUpdate();

         } catch (Exception e) {
             e.printStackTrace();
         }
	}

}
