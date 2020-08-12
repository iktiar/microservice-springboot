package iktiar.com.moviecatalogservice.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import iktiar.com.moviecatalogservice.models.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCataglogResource {
	
	//make function takes userId and returns 
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId")  String userId) {
		
		return Collections.singletonList(
				new CatalogItem("item one",  "test",  4)
				);
	}

}
