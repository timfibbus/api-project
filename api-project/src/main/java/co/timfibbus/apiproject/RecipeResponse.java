package co.timfibbus.apiproject;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecipeResponse {

	@JsonProperty("hits")
	private List<Hit> hits;

	public List<Hit> getHits() {
		return hits;
	}

	public void setHit(List<Hit> hits) {
		this.hits = hits;
	}

}
