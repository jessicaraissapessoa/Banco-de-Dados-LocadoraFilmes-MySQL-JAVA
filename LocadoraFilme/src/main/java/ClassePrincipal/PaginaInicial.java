package ClassePrincipal;
import java.util.Scanner;

import Cadastrar.CadastrandoClientes;
import Cadastrar.CadastrandoFilmes;
import Cadastrar.CadastrarAluguel;
import Deletando.DeletandoAluguel;
import Deletando.DeletandoClientes;
import Deletando.DeletandoFilmes;
import Editando.EditandoAluguel;
import Editando.EditandoClientes;
import Editando.EditandoFilmes;
import Mostrar.MostrarAluguel;
import Mostrar.MostrarClientes;
import Mostrar.MostrarFilmes;

public class PaginaInicial {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Deseja realizar uma operação? 'sim' ou 'não'");
		String opt = sc.nextLine();
		while (opt.equalsIgnoreCase("sim")) {

			System.out.println(
					"1 - Cadastrar Clientes \n2 - Cadastrar filmes \n3 - Cadastrar Aluguel \n4 - Editar registro de cliente "
							+ "\n5 - Editar registro de filme \n6 - Editar registro de Aluguel \n7 - Visualizar tabela de clientes \n8 - Visualizar tabela de filmes "
							+ "\n9 - Visualizar tabela de aluguéis "
							+ "\n10 - Excluir registro de cliente \n11 - Excluir registro de filme \n12 - Excluir registro de aluguel");

			int opcao = sc.nextInt();

			if (opcao == 1) {
				CadastrandoClientes.main(args);
			} else if (opcao == 2) {
				CadastrandoFilmes.main(args);
			} else if (opcao == 3) {
				CadastrarAluguel.main(args);
			} else if (opcao == 4) {
				EditandoClientes.main(args);
			} else if (opcao == 5) {
				EditandoFilmes.main(args);
			} else if (opcao == 6) {
				EditandoAluguel.main(args);
			} else if (opcao == 7) {
				MostrarClientes.main(args);
			} else if (opcao == 8) {
				MostrarFilmes.main(args);
			} else if (opcao == 9) {
				MostrarAluguel.main(args);
			} else if (opcao == 10) {
				DeletandoClientes.main(args);
			} else if (opcao == 11) {
				DeletandoFilmes.main(args);
			} else if (opcao == 12) {
				DeletandoAluguel.main(args);
			} else {
				System.out.println("Opção inválida!!!");
			}

		}
		System.out.println("Até a próxima pequeno gafanhoto!!!");
	}
}
