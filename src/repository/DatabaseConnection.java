package repository;

import java.sql.*;

public class DatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Connection conn=null;
			PreparedStatement s=null;
			ResultSet rs=null;
			try {
				conn=getConnection(conn);
				s=conn.prepareStatement("select* from libro where id=?");
				s.setString(1, "4");
				rs = s.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getString("id")+","+rs.getString("titolo")+","+rs.getString("descrizione"));
				}
			} catch (SQLException | NullPointerException e) {
				e.printStackTrace();
			}
			finally {
		        try {
		            if (conn != null) {
		                conn.close();
		            }
		            if (s != null) {
		                s.close();
		            }
		            if (rs != null) {
		            	rs.close();
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }
		

	}

	private static Connection getConnection(Connection conn) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn= DriverManager.getConnection(
			        "jdbc:mysql://localhost:3306/Libreria?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		 return conn;
	}

}
