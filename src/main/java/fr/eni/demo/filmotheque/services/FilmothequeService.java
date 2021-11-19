package fr.eni.demo.filmotheque.services;

import org.springframework.stereotype.Service;

import fr.eni.demo.filmotheque.bo.Film;

@Service
public interface FilmothequeService {
	public Film afficherFilm();
}
