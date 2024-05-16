package fr.voxi.admin;

import java.time.LocalDate;
import java.util.ArrayList;

public class AppAdmin {

	public static void main(String[] args) {
			Auteur aut115 = new Auteur(115, "SAND", "Georges") ;
			System.out.println(aut115) ;
			System.out.println(aut115.getNom()) ;
			
			System.out.println(" ") ;
			
			Oeuvre oeuv35 = new Oeuvre(35, "Indiana", aut115) ;
			System.out.println(oeuv35) ;
			System.out.println(oeuv35.getTitre()) ;
			System.out.println(oeuv35.getAuteur()) ;
			System.out.println(oeuv35.getAuteur().getNom()) ;
			
			System.out.println(" ") ;
			
			AudioBook audio235 = new AudioBook(235, "francais", oeuv35) ;
			System.out.println(audio235) ;
			System.out.println(audio235.getOeuvre()) ;
			System.out.println(audio235.getOeuvre().getTitre()) ;
			System.out.println(audio235.getOeuvre().getAuteur()) ;
			System.out.println(audio235.getOeuvre().getAuteur().getNom()) ;
			
			System.out.println(" ") ;
			
			ArrayList<Auteur> auteurs = new ArrayList<Auteur>() ;
			auteurs.add(new Auteur(111, "MAUPASSANT", "Guy")) ;
			auteurs.add(new Auteur(112, "DUMAS", "Alexandre")) ;
			auteurs.add(new Auteur(113, "CANBUS", "Albert")) ;
			auteurs.add(new Auteur(114, "BARJAVEL", "René")) ;
			for ( Auteur unAuteur : auteurs ) {
				System.out.println( unAuteur.getNom() + " " + unAuteur.getPrenom() ) ;
			}
			System.out.println("Le nom et le prénom de l'auteur identifié par le numéro 113 : " + auteurs.get(2).getNom()) ;
			
			System.out.println(" ") ;
			
			ArrayList<Oeuvre> oeuvres = new ArrayList<Oeuvre>() ;
			oeuvres.add(new Oeuvre(28, "La Reine Margot", auteurs.get(1))) ;
			oeuvres.add(new Oeuvre(31, "Bel Ami", auteurs.get(0))) ;
			oeuvres.add(new Oeuvre(32, "Chanson de Roland")) ;
			oeuvres.add(new Oeuvre(33, "Pauline", auteurs.get(1))) ;
			int cpt = 0 ;
			for ( Oeuvre uneOeuvre : oeuvres ) {
				if ( uneOeuvre.getAuteur() == null) {
					cpt = cpt + 1 ;
				}
			}
			System.out.println("Nombre d'oeuvres dont l'auteur est inconnu : " + cpt);
			for ( Oeuvre uneOeuvre : oeuvres ) {
				if ( uneOeuvre.getAuteur() == null) {
					System.out.println(uneOeuvre.getTitre()) ;
				}
				else {
				System.out.println(uneOeuvre.getTitre() + " de l'auteur, " + uneOeuvre.getAuteur().getNom());
				}
			}
			int cptt = 0 ;
			for ( int i = 0 ; i < oeuvres.size() ; i = i + 1) {
				if ( oeuvres.get(i).getAuteur() != null ) {
					if (oeuvres.get(i).getAuteur().getNom() == "DUMAS") {
						cptt = cptt + 1 ;
					}
				}
			}
			System.out.println("Nombre d'oeuvres d'Alexandre DUMAS : " + cptt);
			
			System.out.println(" ") ;
			
			ArrayList<AudioBook> audios  = new ArrayList<AudioBook>() ;
			audios.add(new AudioBook(223, "francais", oeuvres.get(2)));
			audios.add(new AudioBook(224, "anglais", oeuvres.get(0)));
			audios.add(new AudioBook(225, "francais", oeuvres.get(0)));
			audios.add(new AudioBook(228, "anglais", oeuvres.get(3)));
			audios.add(new AudioBook(229, "francais", oeuvres.get(1)));
			for ( AudioBook unAudio : audios ) {
				if (unAudio.getOeuvre().getAuteur() != null) {
					System.out.println(unAudio.getOeuvre().getAuteur().getNom() + " " + unAudio.getOeuvre().getAuteur().getPrenom());
				}
			}
			
			System.out.println(" ") ;
			
			ArrayList<Ecoute> ecoutes = new ArrayList<Ecoute>();
			ecoutes.add(new Ecoute(503, LocalDate.of(2021, 2, 28), audios.get(1)));
			ecoutes.add(new Ecoute(504, LocalDate.of(2021, 2, 28), audios.get(2)));
			ecoutes.add(new Ecoute(505, LocalDate.of(2021, 2, 28), audios.get(1)));
			ecoutes.add(new Ecoute(510, LocalDate.of(2021, 2, 28), audios.get(4)));
			ecoutes.add(new Ecoute(511, LocalDate.of(2021, 3, 01), audios.get(3)));
			System.out.println(ecoutes.get(ecoutes.size()-1).getNumero());
			for ( Ecoute unEcoute : ecoutes ) {
				if ( unEcoute.getAudio().getOeuvre().getAuteur() != null ) {
					System.out.println(unEcoute.getAudio().getOeuvre().getAuteur().getNom() + " " + unEcoute.getAudio().getOeuvre().getAuteur().getPrenom());
				}
			}
			int cpttt = 0 ;
			for ( Ecoute unEcoute : ecoutes ) {
				if ( unEcoute.getAudio().getOeuvre().getAuteur() != null ) {
					if ( unEcoute.getAudio().getOeuvre().getAuteur().getPrenom() == "Guy"  ) {
						cpttt = cpttt + 1 ;
					}
				}
			}
			System.out.println("Nombre d'écoutes des œuvres de Guy de Maupassant : " + cpttt);
	}

}
