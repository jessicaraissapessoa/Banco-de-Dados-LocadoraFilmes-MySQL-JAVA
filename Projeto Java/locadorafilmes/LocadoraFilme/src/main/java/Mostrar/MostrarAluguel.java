package Mostrar;

import AluguelDAO.AluguelDAO;

public class MostrarAluguel {

	public static void main(String[] args) {
		
		System.out.println("Aqui estão os alugueis realizados pelos clientes pelo ID de Cada Cliente/Filme: \n");
		AluguelDAO.mostrarAluguel();
		System.out.println("\n");

	}

}
