package co.timfibbus.apiproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.timfibbus.apiproject.Recipe;

@RestController
public class FavoritesApiController {

	@Autowired
	private FavoritesDao dao;

	@GetMapping("/favorites")
	public List<Favorite> listFavorites(@RequestParam(required=false) String label) {
			return dao.findAll();
		}
	
	@GetMapping("/favorites/search")
	public List<Favorite> searchFavorites(@RequestParam(required=false) String label) {
			return dao.findByLabelContainsIgnoreCase(label);
		}
	}
