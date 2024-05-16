package fr.voxi.admin;

public class AppGestion {

	public static void main(String[] args) {
		
		Auditeur aud1 = new Auditeur(289,"Selma","selma.dradri@gmail.com","Auditrice","Anglais",35);
		System.out.println(aud1.toHtml());

	}

}
