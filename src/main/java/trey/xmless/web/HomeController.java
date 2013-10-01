package trey.xmless.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import trey.xmless.service.IPlanetService;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private IPlanetService planetService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(@RequestParam(value = "id", defaultValue = "3") Long planetId) {
		String planetName = planetService.getPlanetName(planetId);
		if (logger.isInfoEnabled()) {
			logger.info("planetId = " + planetId);
			logger.info("planetName = " + planetName);
		}

		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		mav.addObject("planetName", planetName);
		return mav;
	}

}
