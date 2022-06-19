package Modelos;

import java.util.Date;

public class Aluguel {
	
	public int idaluguel;
	public Date dataaluguel;
	public int idCl;
	public int idFilm;
	
	
	
	public int getIdCl() {
		return idCl;
	}

	public void setIdCl(int idCl) {
		this.idCl = idCl;
	}

	public int getIdFilm() {
		return idFilm;
	}

	public void setIdFilm(int idFilm) {
		this.idFilm = idFilm;
	}

	public int getIdaluguel() {
		return idaluguel;
	}

	public void setIdaluguel(int idaluguel) {
		this.idaluguel = idaluguel;
	}
	
	public Date getDataaluguel() {
		return dataaluguel;
	}

	public void setDataaluguel(Date dataaluguel) {
		this.dataaluguel = dataaluguel;
	}
}
