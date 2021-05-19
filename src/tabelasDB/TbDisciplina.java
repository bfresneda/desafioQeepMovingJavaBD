package tabelasDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import conexao.ConnectionFactory;

public class TbDisciplina {
	
	public static void main(String[] args) throws SQLException{
		
		Connection conexao = ConnectionFactory.getConexao();
		

		try {
			Statement stmt = conexao.createStatement();
			String sqlDrop = "DROP TABLE TB_DISCIPLINA";
			stmt.execute(sqlDrop);
			
		} catch (Exception e) {
			Statement stmt = conexao.createStatement();
			String sqlCreate = "CREATE TABLE TB_DISCIPLINA("
					+ "CD_DISCIPLINA SERIAL NOT NULL,"
					+ "NOME_DISCIPLINA VARCHAR(200),"
					+ "CARGA_HORARIA INT,"
					+ "CD_PROFESSOR INT NOT NULL,"
					+ "PRIMARY KEY (CD_DISCIPLINA),"
					+ "CONSTRAINT fk_professor"
					+ "      FOREIGN KEY(CD_PROFESSOR)"
					+ "	  REFERENCES TB_PROFESSOR(CD_PROFESSOR)"
					+ ")";
			
			stmt.execute(sqlCreate);
			System.out.println("Tabela disciplina criada com sucesso.");
		}
		
			
		conexao.close();
		}

}
