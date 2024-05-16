package fr.voxi.admin;

import java.time.LocalDate;

public class Ecoute {
	
	private int numero ;
	private LocalDate date ;
	private AudioBook audio ;
	
	public Ecoute(int numero, LocalDate date, AudioBook audio) {
		this.numero = numero ;
		this.date = date ;
		this.audio = audio ;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public AudioBook getAudio() {
		return audio;
	}

	public void setAudio(AudioBook audio) {
		this.audio = audio;
	}

	public String toString() {
		return "Ecoute [" + numero + "," + date + "," + audio + "]";
	}
	
}
