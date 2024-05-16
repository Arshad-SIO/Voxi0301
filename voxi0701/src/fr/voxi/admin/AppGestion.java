package fr.voxi.admin;

public class AppGestion {

	public static void main(String[] args) {
		
		Oeuvre oeuvre1 = new Oeuvre(1,"Au revoir là-haut",2);
		System.out.println(oeuvre1);
		System.out.println(oeuvre1.toHtml());
		
		System.out.println(" ");
		
		Biographie oeuvre2 = new Biographie(2,"Hannibal",5,"Hannibal Barca");
		System.out.println(oeuvre2);
		System.out.println(oeuvre2.toHtml());
	}

}
