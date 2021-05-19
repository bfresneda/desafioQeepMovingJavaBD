package tabelasDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import conexao.ConnectionFactory;

public class TbAluno {

		public static void main(String[] args) throws SQLException{

			Connection conexao = ConnectionFactory.getConexao();
			
			try {
				Statement stmt = conexao.createStatement();
				String sqlDrop = "DROP TABLE TB_ALUNO";
				stmt.execute(sqlDrop);
				
			} catch (Exception e) {
				Statement stmt = conexao.createStatement();
				String sqlCreate = "CREATE TABLE TB_ALUNO("
						+ "CD_ALUNO SERIAL NOT NULL,"
						+ "NOME VARCHAR(100),"
						+ "CPF VARCHAR(12),"
						+ "PRIMARY KEY(CD_ALUNO)"
						+ ")";
				
				stmt.execute(sqlCreate);
				System.out.println("Tabela aluno criada com sucesso");
			}
				
			conexao.close();

	}

}
