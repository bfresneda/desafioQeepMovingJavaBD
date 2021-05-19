package tabelasDB;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

import conexao.ConnectionFactory;

public class TbProfessor {

	public static void main(String[] args) throws SQLException {

		Connection conexao = ConnectionFactory.getConexao();
		
		try {
			Statement stmt = conexao.createStatement();
			String sqlDrop = "DROP TABLE TB_PROFESSOR CASCADE";
			stmt.execute(sqlDrop);
		} catch (Exception e) {

			Statement stmt = conexao.createStatement();
			String sqlCreate = "CREATE TABLE TB_PROFESSOR("
					+ "CD_PROFESSOR SERIAL PRIMARY KEY,"
					+ "NOME VARCHAR(100),"
					+ "CPF VARCHAR(12)"
					+ ")";
			
			stmt.execute(sqlCreate);
			
		}
		
		System.out.println("Tabela professor criada com sucesso");
		conexao.close();
		
	}

}
