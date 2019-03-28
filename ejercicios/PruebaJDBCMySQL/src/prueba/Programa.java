package prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conectar();
	}

	public static void conectar() {
		// Create a variable for the connection string.
		String connectionUrl = "jdbc:mysql://localhost:3306/northwind";
		// Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// Establish the connection.
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(connectionUrl, "root", "jucagaro");
			// Create and execute an SQL statement that returns some data.
			String SQL = "SELECT * FROM customers LIMIT 2";
			stmt = (Statement) con.createStatement();
			rs = stmt.executeQuery(SQL);
			// Iterate through the data in the result set and display it.
			while (rs.next()) {
				System.out.println(rs.getString("CustomerID") + " - " + rs.getString("CompanyName"));
			}
		}
		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				}
			if (stmt != null)
				try {
					stmt.close();
				} catch (Exception e) {
				}
			if (con != null)
				try {
					con.close();
				} catch (Exception e) {
				}
		}
	}

}
