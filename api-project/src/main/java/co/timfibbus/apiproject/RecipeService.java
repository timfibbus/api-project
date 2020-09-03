package co.timfibbus.apiproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class RecipeService {

	private RestTemplate rt;

	@Value("${api-id}")
	String apiId;
	@Value("${api-key}")
	String apiKey;
	
	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "DouglasW");
			return execution.execute(request, body);
		};
		
		rt = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	public List<Hit> findAll(){
		// 1 specify url
		String url = "https://api.edamam.com/search?app_id={apiId}&app_key={apiKey}";
		// 2 call api, return requested shit.
		RecipeResponse response = rt.getForObject(url, RecipeResponse.class, apiId, apiKey);
		return response.getHits();
	}
	
	public List<Hit> searchRecipe(String search){
		// 1 specify url
		String url = "https://api.edamam.com/search?q={search}&app_id={apiId}&app_key={apiKey}";
		// 2 call api, return requested shit.
		RecipeResponse response = rt.getForObject(url, RecipeResponse.class, search, apiId, apiKey);
		return response.getHits();
	}
	
	public List<Hit> searchByMaxCalories(String search, float max){
		String url = "https://api.edamam.com/search?q={search}&calories=0-{max}&app_id={apiId}&app_key={apiKey}";
		RecipeResponse response = rt.getForObject(url, RecipeResponse.class, max, apiId, apiKey);

		return response.getHits();
	}
	
	public List<Hit> searchByDiet(List<String> restrictions){
		String restrictionsList = null;
		for (String s : restrictions) {
			if (restrictionsList != null) {
				restrictionsList=restrictionsList+",";
			}
			restrictionsList=restrictionsList+s;
		}
		String url = "https://api.edamam.com/search?healthLabels={restrictionsList}&app_id={apiId}&app_key={apiKey}";
		RecipeResponse response = rt.getForObject(url, RecipeResponse.class, restrictionsList, apiId, apiKey);
		return response.getHits();
		
	}
}
