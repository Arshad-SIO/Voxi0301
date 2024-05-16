package fr.voxi.admin;

import java.time.LocalDate;

public class Abonnement{
	
	private int numero ;
	private LocalDate dateSouscription ;
	private static int Month = 3 ;
	
	public Abonnement( int numero, LocalDate dateSouscription ) {
		this.numero= numero ;
		this.dateSouscription= dateSouscription ;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalDate getDateSouscription() {
		return dateSouscription;
	}

	public void setDateSouscription(LocalDate dateSouscription) {
		this.dateSouscription = dateSouscription;
	}
	
	public String toString() {
		return "Abonnement[" + numero + "," + dateSouscription +"]" ;
	}

	public static int getMonth() {
		return Month;
	}

	public static void setMonth(int month) {
		Month = month;
	}
}