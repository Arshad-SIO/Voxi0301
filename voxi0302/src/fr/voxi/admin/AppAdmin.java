package fr.voxi.admin;

public class AppAdmin {

	public static void main(String[] args) {
		Evaluation eval1 = new Evaluation( 1, 5, "Execellent !!!", 23, true) ;
		System.out.println( eval1 ) ;
	
		eval1.Augm_JAime() ;
		System.out.println("Nombre de J'aime de l'évaluation numéro 1 : " + eval1.setJAime() ) ;
		
		Evaluation eval2 = eval1 ;
		System.out.println("Evaluation n° 2 : " + eval2 ) ;
		
		System.out.println("Evaluation n° 1 : " + eval1 ) ;
		
		eval2.Augm_JAime() ;
		System.out.println("Evaluation n° 2 : " + eval2 ) ;
		
		System.out.println("Evaluation n° 2 : " + eval1 ) ;
		
		System.out.println( "Réf. Eval. n° 1 : " + eval1.hashCode()) ;
		System.out.println( "Réf. Eval. n° 1 : " + eval2.hashCode()) ;
	}

}
