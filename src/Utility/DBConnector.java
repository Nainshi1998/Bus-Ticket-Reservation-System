package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	public static Connection provideConnection() {
		Connection con = null  ;
		try {
			 con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_reservation", "root", "#Adventure123!");
		} catch (SQLException e) {
                    // TODO Auto-generated catch block

		}
		return con ;
		
	}
}



