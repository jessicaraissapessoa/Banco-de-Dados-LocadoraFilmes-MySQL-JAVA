package Mostrar;

import FilmesDAO.FilmesDAO;

public class MostrarFilmes {

	public static void main(String[] args) {
		
		System.out.println("Aqui está a lista com os filmes disponíveis no momento: \n");
		
		FilmesDAO.mostrarFilmes();
		System.out.println("\n");

	}

}
