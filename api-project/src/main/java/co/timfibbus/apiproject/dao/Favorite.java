package co.timfibbus.apiproject.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import co.timfibbus.apiproject.Recipe;

@Entity
public class Favorite {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@JsonProperty("recipe")
	private Recipe recipe;
	
	
}
