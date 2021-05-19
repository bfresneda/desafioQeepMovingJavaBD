package aplicacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import conexao.ConnectionFactory;
import model.Aluno;

public class Aplicacao {
	
	public static void menuPrincipal() {
	
	Connection conexao = ConnectionFactory.getConexao();
		
	System.out.println();	
	System.out.println(" ______________________________");
	System.out.println("|                              |");
	System.out.println("| Universidade se vira moleque |");
	System.out.println("|______________________________|");
	System.out.println("|                              |");
	System.out.println("|         MENU PRINCIPAL       |");
	System.out.println("|______________________________|");
	System.out.println("|                              |");
	System.out.println("|	1 - Cadastro	       |");
	System.out.println("|	2 - Matricula          |");
	System.out.println("|	3 - Relatorios         |");
	System.out.println("|	4 - SAIR	       |");
	System.out.println("|______________________________|");
	System.out.print("Digite a opção desejada: ");
	}
	
	public static void menuCadastros(Scanner entrada) {
	int menuCadastros = 0;
	System.out.println();	
	System.out.println();	
	System.out.println(" ______________________________");
	System.out.println("|                              |");
	System.out.println("| Universidade se vira moleque |");
	System.out.println("|______________________________|");
	System.out.println("|                              |");
	System.out.println("|        TELA DE CADASTRO      |");
	System.out.println("|______________________________|");
	System.out.println("|                              |");
	System.out.println("|	1 - Alunos	       |");
	System.out.println("|	2 - Professores        |");
	System.out.println("|	3 - Disciplinas        |");
	System.out.println("|	4 - MENU PRINCIPAL     |");
	System.out.println("|______________________________|");
	System.out.print("Digite a opção desejada: ");
		do {
			menuCadastros = entrada.nextInt();
			switch(menuCadastros) {
				case 1:
					menuEdicaoAluno(entrada);
					break;
				case 2:
//					menuEdicaoProfessor();
					System.out.println(" menuEdicaoProfessor ainda nao foi desenvolvido");
					break;
				case 3:
//					menuEdicaoDisciplina();
					System.out.println(" menuEdicaoDisciplina ainda nao foi desenvolvido");
					break;
				case 4:
					menuPrincipal();
					break;
			}
		}while(menuCadastros != 0);
	
	}
	
	public static void menuEdicaoAluno(Scanner entrada) {
		int opcaoMenuEdicao = 4;
		do {			
			System.out.println();	
			System.out.println();	
			System.out.println(" ______________________________");
			System.out.println("|                              |");
			System.out.println("| Universidade se vira moleque |");
			System.out.println("|______________________________|");
			System.out.println("|                              |");
			System.out.println("|     TELA DE EDICAO ALUNO     |");
			System.out.println("|______________________________|");
			System.out.println("|                              |");
			System.out.println("|	1 - Cadastrar	       |");
			System.out.println("|	2 - Alterar            |");
			System.out.println("|	3 - Excluir            |");
			System.out.println("|	4 - Consultar          |");
			System.out.println("|	5 - Listar todos       |");
			System.out.println("|	4 - MENU ANTERIOR      |");
			System.out.println("|______________________________|");
			System.out.print("Digite a opção desejada: ");
			
			opcaoMenuEdicao = entrada.nextInt();
			switch(opcaoMenuEdicao) {
			case 1:
				System.out.println(" ______________________________");
				System.out.println("|                              |");
				System.out.println("|     TELA CADASTRO DE ALUNO   |");
				System.out.println("|______________________________|");
				entrada.nextLine();
				System.out.print("Digite o nome do aluno: ");
				String nome = entrada.nextLine();
				System.out.print("Digite o CPF do aluno: ");
				String cpf = entrada.nextLine();
				
				try {
					Connection conexao = ConnectionFactory.getConexao();
					String sql= "INSERT INTO TB_ALUNO(NOME, CPF) VALUES(?,?)";
					PreparedStatement stmt = conexao.prepareStatement(sql);
					stmt.setString(1,nome);
					stmt.setString(2,cpf);
					stmt.execute();
					conexao.close();
					System.out.printf("Aluno %s inserido com sucesso",nome);
				} catch (Exception e) {
					System.out.println("Deu errado o insert");
					System.out.println(e.getMessage());
				}
				
			}			
			
		}while(opcaoMenuEdicao != 4);
	
	
	}
	
	public static void cadastroAluno() {
		
	}
	
	

	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);	

		int opcaoMenuPrincipal = 4;
		do {
			
			menuPrincipal();
			opcaoMenuPrincipal = entrada.nextInt();
			
			switch(opcaoMenuPrincipal) {
			case 1:
				menuCadastros(entrada);
				break;
			case 2:
				System.out.println(" Matricula opcao ainda nao desenvolvida!!!");
				break;
			case 3:
				System.out.println("Relatório opcao ainda nao desenvolvida!!!");
				break;
			case 4:
				System.out.println(" ______________________________");
				System.out.println("|                              |");
				System.out.println("|    Encerrando o sistema...   |");
				System.out.println("|    Até a proxima!            |");
				System.out.println("|______________________________|");
				break;
			}
			
		}while(opcaoMenuPrincipal != 4);
		

		
		
		entrada.close();
	}

}
