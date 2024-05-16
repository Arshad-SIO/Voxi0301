package fr.voxi.admin;

import java.time.LocalDate;

public class Candidature{
	
	private int numero ;
	private LocalDate datedeDepot ;
	private LocalDate datedeReponse ;
	
	public static final int EN_ATTENTE = 1 ;
	public static final int ETUDIEE = 2 ;
	public static final int ANNULEE = 3 ;
	public static final int ACCEPTEE = 4 ;
	public static final int REJETEE = 5 ;
	
	private int etat = EN_ATTENTE ;
	
	public Candidature( int numero, LocalDate datedeDepot, LocalDate datedeReponse, int etat) {
		this.numero= numero ;
		this.datedeDepot= datedeDepot ;
		this.datedeReponse= datedeReponse ;
		this.etat= etat ;
	}
	
	public Candidature( int numero, LocalDate datedeDepot) {
		this.numero= numero ;
		this.datedeDepot= datedeDepot ;
		this.etat= EN_ATTENTE ;
	}
	
	public void etudier() {
		if( this.etat == EN_ATTENTE) {
			this.etat= ETUDIEE ;
		}
	}
	
	public void annuler() {
		if( this.etat == EN_ATTENTE) {
			this.etat= ANNULEE ;
		}
	}
	
	public void rejetee() {
		if( this.etat == ETUDIEE) {
			this.etat= REJETEE ;
		}
	}
	
	public void acceptee() {
		if( this.etat == ETUDIEE) {
			this.etat= ACCEPTEE ;
		}
	}

	public int getEtat() {
		return etat;
	}
	
	public String toString() {
		return "Candidature[" + numero + "," + datedeDepot + "," + datedeReponse + "," + etat + "]" ;
	}
}