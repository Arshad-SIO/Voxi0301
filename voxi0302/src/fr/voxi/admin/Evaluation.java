package fr.voxi.admin;

public class Evaluation {
	
	private int numero;
	private int note;
	private String commentaire;
	private int nb_JAime;
	private boolean validee = true;
	
	public Evaluation( int numero, int note, String commentaire, int nb_JAime, boolean validee) {
		this.numero = numero ;
		this.note = note ;
		this.commentaire = commentaire ;
		this.nb_JAime = nb_JAime ;
		this.validee = validee ;
	}	
	
	public Evaluation(int numero, int note, String commentaire) {
		this.numero = numero ;
		this.note = note ;
		this.commentaire = commentaire ;
	}
	
	public Evaluation() {
	}
	
	public int Augm_JAime() {
		return this.nb_JAime = nb_JAime + 1 ;
	}
	
	public int setJAime() {
		return nb_JAime ;
	}
	
	public String toString() {
		return "Evaluation[" + numero + "," + note + "," + commentaire + "," + nb_JAime + "," + validee + "]" ;
	}
	
}
