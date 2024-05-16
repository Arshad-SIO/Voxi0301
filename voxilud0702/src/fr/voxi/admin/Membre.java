package fr.voxi.admin;

public class Membre{
	
	private int numero;
	private String nom;
	private String email;
	private String compte;
	
	public Membre(int numero, String nom, String email, String compte) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.email = email;
		this.compte = compte;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompte() {
		return compte;
	}

	public void setCompte(String compte) {
		this.compte = compte;
	}
}