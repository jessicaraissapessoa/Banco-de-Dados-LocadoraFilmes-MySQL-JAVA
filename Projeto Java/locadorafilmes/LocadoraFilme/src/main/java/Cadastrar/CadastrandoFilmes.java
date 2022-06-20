package Cadastrar;

import java.util.Scanner;

import FilmesDAO.FilmesDAO;
import Modelos.Filmes;

public class CadastrandoFilmes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Filmes filme = new Filmes();
		
		System.out.println("Informe qual filme você deseja adicionar: ");
		String novofilme = sc.nextLine();
		filme.setNomeFilme(novofilme);
		
		System.out.println("Agora informe o ano em que o filme foi lançado: ");
		int anolanc = sc.nextInt();
		filme.setAnoFilme(anolanc);
		
		System.out.println("Para finalizar, informe o gênero do filme em questão: ");
		sc.nextLine();
		String genfilm = sc.nextLine();
		filme.setGenero(genfilm);
		
		FilmesDAO.AdicionarFilmes(filme);
		
		System.out.println("Filme : " + novofilme + " Adicionado com sucesso!\n");

	}

}
