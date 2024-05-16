package fr.voxi.admin;

public class Biographie extends Oeuvre {
	
	private String personnage;

	public Biographie(int numero, String titre, int nbAudioBooks, String personnage) {
		super(numero, titre, nbAudioBooks);
		this.personnage = personnage;
	}
	
	public Biographie(int numero, String titre, String personnage) {
		super(numero, titre);
		this.personnage = personnage;
	}

	public String getPersonnage() {
		return personnage;
	}

	public void setPersonnage(String personnage) {
		this.personnage = personnage;
	}
	
	public String toString() {
		return "Biographie ["+ super.toString() + "," + personnage + "]";
	}

	public String toHtml() {
		String html = new String();
		if (this.getNbAudioBooks() < NB_AUDIOBOOKS_MAX) {
			html += "<div>\n";
			html +="\t" + this.getNumero() + " (" + this.getNbAudioBooks() + ")\n";
			html +="\t" + this.personnage + "\n";
			html +="\t" + this.getTitre() + "\n";
			html +="</div>";
		}
		else {
			html += "<div>\n";
			html +="\t" + this.getNumero() + " (<strong>Production bloquée<\strong>)\n";
			html +="\t" + this.personnage + "\n";
			html +="\t" + this.getTitre() + "\n";
			html +="</div>";
		}
		return html;
	}
}