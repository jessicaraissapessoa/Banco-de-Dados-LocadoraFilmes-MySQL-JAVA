package Deletando;
import java.util.Scanner;
import FilmesDAO.FilmesDAO;

public class DeletandoFilmes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		FilmesDAO.mostrarFilmes();
		
		System.out.println("Selecione o ID do filme que você deseja deletar: ");
		int idDelFilm = sc.nextInt();
		
		FilmesDAO.apagarFilmes(idDelFilm);
		
		System.out.println("Filme apagado com sucesso!\n");
				

	}

}
