import java.sql.*;

public class CreateConnection {

	private Connection connection;

	public CreateConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Error loading driver:" + cnfe);
		}

		String host = "jdbc:mysql://localhost:3306/";
		;
		String dbName = "lis";
		String mysqlUrl = host + dbName;

		String userId = "root";
		String password = "pranav2511";
		try {
			connection = DriverManager
					.getConnection(mysqlUrl, userId, password);
		} catch (SQLException e) {
			System.out.println("connection cannot be established:" + e);
			e.printStackTrace();
		}

	}

	/**
	 * @return the connection
	 */
	public Connection getConnection() {
		return connection;
	}

	/**
	 * @param connection
	 *            the connection to set
	 */
	public void setConnection(Connection con) {
		this.connection = con;
	}

	public void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			System.out.println("Error...");
		}
	}
}
