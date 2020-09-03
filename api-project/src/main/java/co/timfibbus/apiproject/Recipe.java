package co.timfibbus.apiproject;

import java.util.List;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Recipe {

	private String uri;
	private String label;
	private String url;
	private String image;
	private String source;
	private String shareAs;
	private List<String> ingredientLines;
	private List<String> healthLabels;
	private Double calories;
	private TotalNutrients totalNutrients;
	private int yield; 
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public List<String> getHealthLabels() {
		return healthLabels;
	}
	public void setHealthLabels(List<String> healthLabels) {
		this.healthLabels = healthLabels;
	}
	public TotalNutrients getTotalNutrients() {
		return totalNutrients;
	}
	public void setTotalNutrients(TotalNutrients totalNutrients) {
		this.totalNutrients = totalNutrients;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Double getCalories() {
		return calories;
	}
	public void setCalories(Double calories) {
		this.calories = calories;
	}
	public int getYield() {
		return yield;
	}
	public void setYield(int yield) {
		this.yield = yield;
	}
	public String getShareAs() {
		return shareAs;
	}
	public void setShareAs(String shareAs) {
		this.shareAs = shareAs;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public List<String> getIngredientLines() {
		return ingredientLines;
	}
	public void setIngredientLines(List<String> ingredientLines) {
		this.ingredientLines = ingredientLines;
	}
			
}
