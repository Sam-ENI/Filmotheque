package fr.eni.demo.filmotheque.bo;

import java.util.ArrayList;

public class Genre {

	private String genreDuFilm;
	private int genreId;

	public Genre() {

	}

	public Genre(String genreDuFilm, int genreId) {
		super();
		this.genreDuFilm = genreDuFilm;
		this.genreId = genreId;
	}

	public Genre(String genreDuFilm) {
		super();
		this.genreDuFilm = genreDuFilm;
	}

	public String getGenreDuFilm() {
		return genreDuFilm;
	}

	public void setGenreDuFilm(String genreDuFilm) {
		this.genreDuFilm = genreDuFilm;
	}

	public int getGenreId() {
		return genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}

	@Override
	public String toString() {
		return "Genre [genreDuFilm=" + genreDuFilm + ", genreId=" + genreId + "]";
	}

}
