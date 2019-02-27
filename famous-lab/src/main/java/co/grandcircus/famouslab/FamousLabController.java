package co.grandcircus.famouslab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FamousLabController {

	@Autowired
	private ApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView FamousLab() {
		List<Tiny> tinyList = apiService.getTinyResponse();
		return new ModelAndView("index", "Tiny", tinyList );
	}
	
	
	@RequestMapping("/complete")
	public ModelAndView complete() {
		List<Complete> completeList = apiService.getCompleteResponse();
		return new ModelAndView("complete", "Complete", completeList);
	}
}
