package Mostrar;

import FilmesDAO.FilmesDAO;

public class MostrarFilmes {

	public static void main(String[] args) {
		
		System.out.println("Aqui est� a lista com os filmes dispon�veis no momento: \n");
		
		FilmesDAO.mostrarFilmes();
		System.out.println("\n");

	}

}
