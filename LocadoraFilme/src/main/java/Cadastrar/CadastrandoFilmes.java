package Cadastrar;

import java.util.Scanner;

import FilmesDAO.FilmesDAO;
import Modelos.Filmes;

public class CadastrandoFilmes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Filmes filme = new Filmes();
		
		System.out.println("Informe qual filme voc� deseja adicionar: ");
		String novofilme = sc.nextLine();
		filme.setNomeFilme(novofilme);
		
		System.out.println("Agora informe o ano em que o filme foi lan�ado: ");
		int anolanc = sc.nextInt();
		filme.setAnoFilme(anolanc);
		
		System.out.println("Para finalizar, informe o g�nero do filme em quest�o: ");
		sc.nextLine();
		String genfilm = sc.nextLine();
		filme.setGenero(genfilm);
		
		FilmesDAO.AdicionarFilmes(filme);
		
		System.out.println("Filme : " + novofilme + " Adicionado com sucesso!\n");

	}

}
