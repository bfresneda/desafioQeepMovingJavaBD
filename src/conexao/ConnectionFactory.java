package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConexao() {
		try {
		final String url = "jdbc:postgresql://localhost:5432/DbDesafioJava";
		final String usuario = "postgres";
		final String senha = "bruno123";
		
		return DriverManager.getConnection(url, usuario, senha);
	} catch (SQLException e) {
			throw new RuntimeException(e);
	}

		}
}
	
//
//
//public class ConnectionFactory {
//	
//	public static void main(String[] args) {
//        String driver = "org.postgresql.Driver";
//        String user = "postgres";
//        String senha = "bruno123";
//        String url = "jdbc:postgresql://localhost:5432/postgres";
//
//        try {
//            Class.forName(driver);
//            Connection con = null;
//
//            con = (Connection) DriverManager.getConnection(url, user, senha);
//
//            JOptionPane.showMessageDialog(null, "Conexão realizada com Sucesso!");
//
//            con.close();
//        } catch (ClassNotFoundException ex) {
//            System.err.print(ex.getMessage());
//        } catch (SQLException e) {
//            System.err.print(e.getMessage());
//        }
//    }

	
//}
