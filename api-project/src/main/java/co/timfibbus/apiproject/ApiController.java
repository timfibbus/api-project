package co.timfibbus.apiproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ApiController {

	@Autowired
	RecipeService recipeApi;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/recipes/")
	public String search(@RequestParam("search") String search, Model model){
		List<Hit> hits = recipeApi.searchRecipe(search);
		System.out.println(hits);
		model.addAttribute("hits", hits);
		return "search-results";
	}
	
	@GetMapping("/recipes/calories")
	public List<Hit> searchCalories(@RequestParam("search") String search, @RequestParam("calories") int calories){
		return recipeApi.searchByMaxCalories(search, calories);
	}
	
	@GetMapping("/recipes/diet/")
	public String searchDiet(@RequestParam("search") String search, @RequestParam("calories") int calories, @RequestParam("health") List<String> health, Model model){
		List<Hit> hits = recipeApi.searchByDiet(search, calories, health);
		model.addAttribute("hits", hits);
		return "search-results";
	}

}
