package co.timfibbus.apiproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FavoritesApiController {

	@Autowired
	private FavoritesDao dao;

	@GetMapping("/favorites")
	public List<Recipe> listFavorites(@RequestParam(required=false) String label) {
			return dao.findAll();
		}
	}

