package fr.voxi.admin;

public class Oeuvre{
	
	private int numero;
	private String titre;
	private int nbAudioBooks;
	
	public static final int NB_AUDIOBOOKS_MAX = 5;
	
	public Oeuvre(int numero, String titre, int nbAudioBooks) {
		this.numero = numero;
		this.titre = titre;
		this.nbAudioBooks = nbAudioBooks;
	}
	
	public Oeuvre(int numero, String titre) {
		this.numero = numero;
		this.titre = titre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getNbAudioBooks() {
		return nbAudioBooks;
	}

	public void setNbAudioBooks(int nbAudioBooks) {
		this.nbAudioBooks = nbAudioBooks;
	}

	public String toString() {
		return "Oeuvre [" + numero + "," + titre + "," + nbAudioBooks + "]";
	}
	
	public String toHtml() {
		String html = new String();
		if (nbAudioBooks < NB_AUDIOBOOKS_MAX) {
			html += "<div>\n";
			html +="\t" + this.numero + " (" + this.nbAudioBooks + ")\n";
			html +="\t" + this.titre + "\n";
			html +="</div>";
		}
		else {
			html += "<div>\n";
			html +="\t" + this.numero + " (<strong>Production bloquée<\strong>)\n";
			html +="\t" + this.titre + "\n";
			html +="</div>";
		}
		return html;
	}
}