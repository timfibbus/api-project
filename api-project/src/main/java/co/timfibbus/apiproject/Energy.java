package co.timfibbus.apiproject;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Energy {

	@JsonProperty("quantity")
	private int calories;
	@JsonProperty("unit")
	private String unit;
		
	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}


	public String getUnit() {
		return unit;
	}


	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Energy [calories=" + calories + ", unit=" + unit + "]";
	}

	
	
	
}
