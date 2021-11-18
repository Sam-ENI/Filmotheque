package fr.eni.demo.filmotheque;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FilmothequeController {
	
	public FilmothequeController(FilmothequeService Service) {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping({ "/index", "/" })
	public String acceuil() {
		System.out.println("Dans acceuil");
		return "index";
	}
}
