package fr.voxi.admin;

public class Oeuvre {
	
	private int numero ;
	private String titre ;
	private static int nbOeuvres = 0 ;
	
	public Oeuvre( int numero, String titre) {
		this.numero=numero ;
		this.titre=titre ;
		nbOeuvres += 1 ;
	}
	
	public String getTitre() {
		return titre ; 
	}
	
	public static int getNbOeuvres() {
		return nbOeuvres ;
	} 

	public String toString() {
		return "Oeuvre[" +  numero + "," + titre + "]" ;
	}
	
}
