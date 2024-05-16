package fr.voxi.admin;

public class AppAdmin {

	public static void main(String[] args) {
		Oeuvre oeuvre103 = new Oeuvre( 103, "Le Crepuscule et L'Aube") ;
		System.out.println( oeuvre103 ) ;
		System.out.println(Oeuvre.getNbOeuvres());
		
		Oeuvre oeuvre302 = new Oeuvre(302, "Nature Humaine") ;
		System.out.println( oeuvre302 )	;
		System.out.println( Oeuvre.getNbOeuvres()) ;
		
		Oeuvre oeuvre318 = new Oeuvre(318, "L Anomalie") ;
		System.out.println( oeuvre318 )	;
		System.out.println( Oeuvre.getNbOeuvres()) ;
		
		
	}

}
