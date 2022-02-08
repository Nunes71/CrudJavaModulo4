package br.com.goviagens.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactoryGoViagens {
	
	public static Connection createConnectionSQLServer() throws Exception {
		Class.forName ("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection connection = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-HB67GAR\\SQLEXPRESSS;databaseName=GoViagens;integratedSecurity=true;"); 
			return connection;
	}
	

	public static void main (String[] args) throws Exception {
		Connection con = createConnectionSQLServer();
		
		if (con != null) {
			System.out.println("Conex�o obtida com sucesso!! " + con);
			con.close();
		}
		
	}
	
}
