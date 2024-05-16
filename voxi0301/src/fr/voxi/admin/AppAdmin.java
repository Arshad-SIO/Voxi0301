package fr.voxi.admin;

public class AppAdmin {

	public static void main(String[] args) {
		Lecteur lecteur1 = new Lecteur( 101 , "SANTERRE" , "Jean" , 20) ;
		System.out.println( lecteur1 ) ;
		System.out.println( lecteur1.getNom() ) ;
		
		Lecteur lecteur2 = new Lecteur( 102 , "NONATO" , "Isabella") ;
		System.out.println( lecteur2 ) ;
		System.out.println( lecteur2.getNom() ) ;
		lecteur2.setNom("SANTERRE") ;
		System.out.println( lecteur2 ) ;
		
		if( lecteur1.estActif() ) {
			System.out.println("Lecteur actif") ;
		}
		else {
			System.out.println("Lecteur passif") ;
		}
		
		if( lecteur2.estActif() ) {
			System.out.println("Lecteur actif") ;
		}
		else {
			System.out.println("Lecteur passif") ;
		}
		
		System.out.println( lecteur1.getAudiobooks() ) ;
		lecteur1.produireUnAudioBook() ;
		System.out.println( lecteur1.getAudiobooks() ) ;
	}

}
