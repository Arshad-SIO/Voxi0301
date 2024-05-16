package fr.voxi.admin;

public class Lecteur extends Auditeur{
	
	private String langueMat;
	private int matrise;
	
	public Lecteur(int numero, String nom, String email, String compte, String languePref, int nbOeuvres, String langueMat, int matrise) {
		super(numero, nom, email, compte, languePref, nbOeuvres);
		this.langueMat = langueMat;
		this.matrise = matrise;
	}
	
	public String getLangueMat() {
		return langueMat;
	}

	public void setLangueMat(String langueMat) {
		this.langueMat = langueMat;
	}

	public int getMatrise() {
		return matrise;
	}

	public void setMatrise(int matrise) {
		this.matrise = matrise;
	}
	
	public String toHtml() {
		String html = new String();
		html +="<span id=" + this.getNumero() + " class=auditeur>\n";
		html +="\t" + this.getNom() + "(<em>" + this.langueMat + "</em>)\n";
		html +="</span>";
		return html;
	}
	
	public String toHtml( int mode ) {
		String html = new String();
		if(mode == 1) {
			html +="<div id=" + this.getNumero() + "class=lecteur>\n";
			html +="\t" + this.getNom() + "\n";
			html +="\t<br/>\n";
			html +="\tDegre de matrise : " + this.matrise + "\n";
			html +="</div>";
		}
		else if(mode == 2) {
			html +="<div id=" + this.getNumero() + "class=lecteur>\n";
			html +="\t" + this.getNom() + "\n";
			html +="\t<br/>\n";
			html +="\tLangue maternelle : " + this.langueMat + "\n";
			html +="</div>";
		}
		else if(mode == 3) {
			html +="<div id=" + this.getNumero() + "class=lecteur>\n";
			html +="\t" + this.getNom() + "\n";
			html +="\t<br>\n";
			html +="\tDegre de matrise : " + this.matrise + "\n";
			html +="\t<br/>\n";
			html +="\tPreference : " + this.getLanguePref() + "\n";
			html +="</div>";
		}
		return html;
	}
}
