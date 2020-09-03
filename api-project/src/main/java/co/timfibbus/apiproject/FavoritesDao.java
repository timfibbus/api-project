package co.timfibbus.apiproject;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface FavoritesDao extends JpaRepository<Recipe, Long>{

	List<Recipe> findByLabelContainsIgnoreCase(String label);
}
