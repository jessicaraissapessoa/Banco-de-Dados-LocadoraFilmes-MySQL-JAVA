package Cadastrar;
import java.util.Scanner;

import AluguelDAO.AluguelDAO;
import ClientesDAO.ClientesDAO;
import FilmesDAO.FilmesDAO;
import Modelos.Aluguel;

public class CadastrarAluguel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aluguel alg = new Aluguel();
		
		ClientesDAO.mostrarClientes();
		
		System.out.println("Informe o ID do cliente que deseja realizar o aluguel: ");
		int idcl = sc.nextInt();
		alg.setIdCl(idcl);
		
		FilmesDAO.mostrarFilmes();
		System.out.println("Agora informe o ID do filme que ele deseja Alugar:\n ");
		int idfm = sc.nextInt();
		alg.setIdFilm(idfm);
		
		AluguelDAO.cadastrarAluguel(alg);
		
		System.out.println("Aluguel realizado com sucesso!\n");

	}

}
