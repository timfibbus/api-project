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
	String apiId = "cae97066";
	@Value("${api-key}")
	String apiKey = "31f1a911efcacdd5593742de99a0c0ba";
	
	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "");
			return execution.execute(request, body);
		};
		
		rt = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	public List<Recipe> searchRecipe(String search){
		// 1 specify url
		String url = "https://api.edamam.com/search?q={search}&app_id={appId}cae97066&app_key={appKey}";
		// 2 call api, return requested shit.
		
		RecipeResponse response = rt.getForObject(url, RecipeResponse.class, search, apiId, apiKey);
		
		return response.getRecipes();
	}
}
