package athlete.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import athlete.dao.AthleteDao;
import athlete.model.Athlete;

@Controller
public class MainController {
	
	@Autowired
	AthleteDao athleteDao;

	@RequestMapping(value="/athleteForm", method=RequestMethod.GET)
	public ModelAndView greet() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("athleteForm");
		return modelAndView;
	}
	
	@RequestMapping(value="/showAthletes", method=RequestMethod.GET)
	public ModelAndView showAthletes() {

		List<Athlete> userList = new AthleteDao().getAllAthletes();
		return new ModelAndView("ShowAthletes","athlist",userList);
	}
	
	@RequestMapping(value="/addAthlete", method=RequestMethod.POST)	
	public ModelAndView addAthleteDetails(@ModelAttribute Athlete athlete) {
		athleteDao.addAthlete(athlete);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("athleteAdded");
		return modelAndView;
	}
}
