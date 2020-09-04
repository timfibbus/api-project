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
	
	@GetMapping("/search/")
	public String query(@RequestParam("search") String search, @RequestParam("calories") int calories, @RequestParam("health") List<String> health, Model model) {
		
		String url = "/recipes/";
		
		if (String.valueOf(calories) != "") {
			url = url+"/calories/";
		}
		if (!health.isEmpty()) {
			url= url+"/health/";
		}
		return url;
	
	}
	
	@GetMapping("/recipes/")
	public String search(@RequestParam("search") String search, Model model){
		List<Hit> hits = recipeApi.searchRecipe(search);
		System.out.println(hits);
		model.addAttribute("hits", hits);
		return "search-results";
	}
	
	@GetMapping("/recipes/calories/")
	public String searchCalories(@RequestParam("search") String search, @RequestParam("calories") int calories, Model model){
		List<Hit> hits = recipeApi.searchByMaxCalories(search, calories);
		model.addAttribute("hits", hits);
		return "search-results";
		
	}
	
	@GetMapping("/recipes/calories/health/")
	public String searchDiet(@RequestParam("search") String search, @RequestParam("calories") int calories, @RequestParam("health") List<String> health, Model model){
		List<Hit> hits = recipeApi.searchByAll(search, calories, health);
		model.addAttribute("hits", hits);
		return "search-results";
	}
	
	@GetMapping("/recipes/health/")
	public String healthOnly(@RequestParam("search") String search, @RequestParam("health") List<String> health, Model model) {
		List<Hit> hits = recipeApi.searchByKeyDiet(search, health);
		model.addAttribute("hits", hits);
		return "search-results";
	}
	

}
