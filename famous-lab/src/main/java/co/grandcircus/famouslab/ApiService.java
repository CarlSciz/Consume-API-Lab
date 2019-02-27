package co.grandcircus.famouslab;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiService {

	private RestTemplate restTemplate = new RestTemplate();

	public List<Tiny> getTinyResponse() {
	//step 1: get the url
	String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
	//Collections.sort();
	//step 2: Request
	TinyResponse response = restTemplate.getForObject(url,  TinyResponse.class);
	//step 3: Data needed
	return response.getTiny(); 
	}
	
	public List<Complete> getCompleteResponse() {
		//step 1: get the url
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		//step 2: Request
		CompleteResponse response = restTemplate.getForObject(url, CompleteResponse.class);
		//step 3: Data needed
		return response.getComplete();
				}
}