package Editando;
import java.util.Scanner;

import AluguelDAO.AluguelDAO;
import ClientesDAO.ClientesDAO;
import FilmesDAO.FilmesDAO;
import Modelos.Aluguel;
public class EditandoAluguel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		AluguelDAO.mostrarAluguel();
		
		Aluguel al1 = new Aluguel();
		
		System.out.println("Informe o ID do aluguel que você deseja editar: ");
		int idal = sc.nextInt();
		al1.setIdaluguel(idal);
		
		ClientesDAO.mostrarClientes();
		System.out.println("Informe o novo ID do cliente que você deseja inserir: ");
		int idcl1 = sc.nextInt();
		al1.setIdCl(idcl1);
		
		FilmesDAO.mostrarFilmes();
		System.out.println("Agora informe o novo ID do filme que deseja inserir: ");
		int idfm1 = sc.nextInt();
		al1.setIdFilm(idfm1);
		
		AluguelDAO.editarAluguel(al1);
		
		System.out.println("Dados do aluguel " + idal + " modificados com sucesso!\n");

	}

}
