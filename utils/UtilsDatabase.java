package utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UtilsDatabase {
	
	public static void compruebaSiExisteId(Connection conn, 
			int id, String tableName) throws SQLException {
		
		Statement s = (Statement) conn.createStatement(); 

		
		ResultSet rs = s.executeQuery("select * from " + tableName + " where id = '" + id + "'");
		if(!rs.next()) {
			System.out.println("No existe registro con el ID introducido");
		}
		
		s.close();
		rs.close();
		
	}
	
	

}
