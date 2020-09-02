package co.timfibbus.apiproject;

import java.util.List;

public class Recipe {

	private List<String> healthLabels;
	private TotalNutrients totalNutrients;
	private String uri;
	private String label;
	
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
		
	
}
