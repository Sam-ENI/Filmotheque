package fr.eni.demo.filmotheque.services;


import java.time.LocalDate;
import java.util.ArrayList;


import org.springframework.stereotype.Service;

import fr.eni.demo.filmotheque.bo.Film;
import fr.eni.demo.filmotheque.bo.Genre;
import fr.eni.demo.filmotheque.bo.Personne;

@Service
public class FilmothequeServiceimpl implements FilmothequeService {
	// String titre, Date anneeDeSortie, int duree, ArrayList<Personne> lstActeurs, Personne realisateur,Genre genre
	//clint Eastwood ,Eli Wallach ,Lee Van Cleef , Sergio Leone
	
	
	public Film afficherFilm() {
		
		ArrayList<Personne> lstLebon = new ArrayList<Personne>();
		Personne WallackEli = new Personne("Wallach","Eli");
		Personne EastwoodClint = new Personne("Eastwood","Clint");
		Personne VanCleefLee = new Personne("Van Cleef","Lee");
		Personne realisateur = new Personne ("Leone","Sergio");
		lstLebon.add(WallackEli);
		lstLebon.add(EastwoodClint);
		lstLebon.add(VanCleefLee);
		LocalDate dateLeBon = LocalDate.of(1966, 12, 23);
		Film LeBonLaBruteEtLeTruand = new Film("Le bon la brute et le truand",dateLeBon,179,
		lstLebon,realisateur,new Genre("Western"));
		return LeBonLaBruteEtLeTruand;
	}

}
