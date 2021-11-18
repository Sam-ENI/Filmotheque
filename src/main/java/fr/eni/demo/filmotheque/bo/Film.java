package fr.eni.demo.filmotheque.bo;

import java.sql.Date;
import java.util.ArrayList;

public class Film {
	private int filmId;
	private String titre;
	private Date anneeDeSortie;
	private int duree;
	private ArrayList<Personne> lstActeurs;
	private Personne realisateur;
	private Genre genre;
	private ArrayList<Avis> lstAvis;

	public Film() {

	}

	public Film(String titre, Date anneeDeSortie, int duree, ArrayList<Personne> lstActeurs, Personne realisateur,
			Genre genre) {
		super();
		this.titre = titre;
		this.anneeDeSortie = anneeDeSortie;
		this.duree = duree;
		this.lstActeurs = lstActeurs;
		this.realisateur = realisateur;
		this.genre = genre;
	}

	public Film(int filmId, String titre, Date anneeDeSortie, int duree, ArrayList<Personne> lstActeurs,
			Personne realisateur, Genre genre, ArrayList<Avis> lstAvis) {
		super();
		this.filmId = filmId;
		this.titre = titre;
		this.anneeDeSortie = anneeDeSortie;
		this.duree = duree;
		this.lstActeurs = lstActeurs;
		this.realisateur = realisateur;
		this.genre = genre;
		this.lstAvis = lstAvis;
	}

	public Film(String titre, Date anneeDeSortie, int duree, ArrayList<Personne> lstActeurs, Personne realisateur,
			Genre genre, ArrayList<Avis> lstAvis) {
		super();
		this.titre = titre;
		this.anneeDeSortie = anneeDeSortie;
		this.duree = duree;
		this.lstActeurs = lstActeurs;
		this.realisateur = realisateur;
		this.genre = genre;
		this.lstAvis = lstAvis;
	}

	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getAnneeDeSortie() {
		return anneeDeSortie;
	}

	public void setAnneeDeSortie(Date anneeDeSortie) {
		this.anneeDeSortie = anneeDeSortie;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public ArrayList<Personne> getLstActeurs() {
		return lstActeurs;
	}

	public void setLstActeurs(ArrayList<Personne> lstActeurs) {
		this.lstActeurs = lstActeurs;
	}

	public Personne getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(Personne realisateur) {
		this.realisateur = realisateur;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public ArrayList<Avis> getLstAvis() {
		return lstAvis;
	}

	public void setLstAvis(ArrayList<Avis> lstAvis) {
		this.lstAvis = lstAvis;
	}

	@Override
	public String toString() {
		return "Film [filmId=" + filmId + ", titre=" + titre + ", anneeDeSortie=" + anneeDeSortie + ", duree=" + duree
				+ ", lstActeurs=" + lstActeurs + ", realisateur=" + realisateur + ", genre=" + genre + ", lstAvis="
				+ lstAvis + "]";
	}

}
