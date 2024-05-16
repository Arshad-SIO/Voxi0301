package fr.voxi.admin;

public class Lecteur {
	
	private int numero ;
	private String nom ;
	private String prenom ;
	private int nb_audiobooks = 0 ;
	
	public Lecteur( int numero , String nom , String prenom , int nb_audiobooks) {
		this.numero = numero ;
		this.nom = nom ;
		this.prenom = prenom ;
		this.nb_audiobooks = nb_audiobooks ;
	}
	
	public Lecteur( int numero , String nom , String prenom) {
		this.numero = numero ;
		this.nom = nom ;
		this.prenom = prenom ;
	}
	
	public String getNom() {
		return nom ;
	}
	
	public void setNom( String nom ) {
		this.nom = nom ;
	}
	
	public int getAudiobooks() {
		return nb_audiobooks ;
	}
	
	public int produireUnAudioBook() {
		return this.nb_audiobooks= nb_audiobooks + 1 ;
	}
	
	public String toString() {
		return "Lecteur[" + numero + "," + nom + "," + prenom + "," + nb_audiobooks + "]" ;
	}
	
	public boolean estActif() {
		if( nb_audiobooks >= 10 ) {
			return true ;
		}
		else {
			return false ;
		}
	}
	
}
