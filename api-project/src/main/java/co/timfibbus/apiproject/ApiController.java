package co.timfibbus.apiproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@Autowired
	RecipeService recipeApi;
	@Autowired
	FavoritesDao dao;
	
	@GetMapping("/recipes/")
	public List<Hit> search(@RequestParam("search") String search){
		return recipeApi.searchRecipe(search);
	}
	
	@GetMapping("/recipes/calories")
	public List<Hit> searchCalories(@RequestParam("search") String search, @RequestParam("calories") int calories){
		return recipeApi.searchByMaxCalories(search, calories);
	}
	
	@GetMapping("/recipes/diet/")
	public List<Hit> searchDiet(@RequestParam("restrictions") List<String> restrictions, @RequestParam("search") String search, @RequestParam("calories") int calories){
		return recipeApi.searchByDiet(restrictions, search, calories);
	}

}
