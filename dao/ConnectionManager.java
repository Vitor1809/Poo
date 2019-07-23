package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private static ConnectionManager instance;
	private Connection conexao;
	private String url = "jdbc:MySQL://localhost:3306/GiveAPaway";
	private String username = "root";
	private String password = "Aluno123";

	private ConnectionManager() {
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ConnectionManager getInstance() {
		if (instance == null) {
			instance = new ConnectionManager();
		}
		return instance;
	}

	public Connection getConnection() throws SQLException {

		if (conexao == null || conexao.isClosed()) {
			conexao = DriverManager.getConnection(url, username, password);
		}
		return conexao;
	}

}
