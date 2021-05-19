package tabelasDB;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

import conexao.ConnectionFactory;

public class TbMatricula {

	public static void main(String[] args) throws SQLException {

		Connection conexao = ConnectionFactory.getConexao();
		
		try {
			Statement stmt = conexao.createStatement();
			String sqlDrop = "DROP TABLE TB_MATRICULA CASCADE";
			stmt.execute(sqlDrop);
		} catch (Exception e) {

			String sqlCreate = "CREATE TABLE TB_MATRICULA("
					+ "CD_MATRICULA SERIAL PRIMARY KEY,"
					+ "CD_ALUNO INT NOT NULL,"
					+ "CD_DISCIPLINA INT NOT NULL,"
					+ "CONSTRAINT fk_aluno "
					+ "FOREIGN KEY(CD_ALUNO) "
					+ "REFERENCES TB_ALUNO(CD_ALUNO),"
					+ "CONSTRAINT fk_disciplina "
					+ "FOREIGN KEY(CD_DISCIPLINA) "
					+ "REFERENCES TB_DISCIPLINA(CD_DISCIPLINA)" 
					+ ")";
			
			Statement stmt = conexao.createStatement();
			stmt.execute(sqlCreate);

			System.out.println("Tabela matricula criada com sucesso!");
		
		}
		
		conexao.close();
		
	}

}
