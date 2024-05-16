package fr.voxi.admin;

import java.time.LocalDate;

public class AppAdmin {

	public static void main(String[] args) {
		Abonnement abn1 = new Abonnement( 201, LocalDate.of(2024, 01, 03)) ;
		Abonnement abn2 = new Abonnement( 202, LocalDate.of(2024, 01, 10)) ;
		
		System.out.println(Abonnement.getMonth()) ;
		Abonnement.setMonth(5);
		System.out.println(Abonnement.getMonth()) ;
		
		Abonnement.setMonth(7);
		System.out.println(abn1.getMonth()) ;
		System.out.println(abn2.getMonth()) ;
		System.out.println(Abonnement.getMonth()) ;
	}

}
