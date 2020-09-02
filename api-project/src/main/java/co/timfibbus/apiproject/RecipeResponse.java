package co.timfibbus.apiproject;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecipeResponse {

	
	@JsonProperty("hits")
	private List<Recipe> recipes;

	public List<Recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}

	@Override
	public String toString() {
		return "RecipeResponse [recipes=" + recipes + "]";
	}

	
}
