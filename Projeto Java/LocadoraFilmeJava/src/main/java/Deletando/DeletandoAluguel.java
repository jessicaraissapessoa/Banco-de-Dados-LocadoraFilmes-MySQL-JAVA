package Deletando;

import java.util.Scanner;

import AluguelDAO.AluguelDAO;

public class DeletandoAluguel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Alugu�is cadastrados: \n");
		AluguelDAO.mostrarAluguel();
		
		System.out.println("\nSelecione o ID do aluguel que voc� deseja apagar: ");
		int idDelAl = sc.nextInt();
		
		AluguelDAO.apagarAluguel(idDelAl);
		
		System.out.println("Aluguel apagado com sucesso!\n");

	}

}
