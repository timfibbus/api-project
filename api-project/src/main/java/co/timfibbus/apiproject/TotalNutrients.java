package co.timfibbus.apiproject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TotalNutrients {
	
	@JsonProperty("ENERC_KCAL")
	private Energy energy;

	public Energy getEnergy() {
		return energy;
	}

	public void setEnergy(Energy energy) {
		this.energy = energy;
	}

}
