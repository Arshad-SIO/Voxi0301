package fr.voxi.admin;

public class Auditeur extends Membre{
	
	private String languePref;
	private int nbOeuvres;
	
	public Auditeur(int numero, String nom, String email, String compte, String languePref, int nbOeuvres) {
		super(numero, nom, email, compte);
		this.languePref = languePref;
		this.nbOeuvres = nbOeuvres;
	}

	public String getLanguePref() {
		return languePref;
	}

	public void setLanguePref(String languePref) {
		this.languePref = languePref;
	}

	public int getNbOeuvres() {
		return nbOeuvres;
	}

	public void setNbOeuvres(int nbOeuvres) {
		this.nbOeuvres = nbOeuvres;
	}
	
	public String toHtml() {
		String html = new String();
		html +="<span id=" + this.getNumero() + " class=auditeur>\n";
		html +="\t" + this.getNom() + "(<em>" + this.languePref + "</em>)\n";
		html +="</span>";
		return html;
	}
}