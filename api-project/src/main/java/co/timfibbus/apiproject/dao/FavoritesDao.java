package co.timfibbus.apiproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.timfibbus.apiproject.Recipe;


public interface FavoritesDao extends JpaRepository<Favorite, Long>{

	List<Favorite> findByLabelContainsIgnoreCase(String label);
	
}