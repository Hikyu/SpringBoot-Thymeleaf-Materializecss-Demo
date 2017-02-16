package space.kyu.server.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import space.kyu.server.Application;

@Controller
@RequestMapping("/web")
public class DemoController {
	private static Logger logger = Logger.getLogger(DemoController.class);

	@RequestMapping("/demo")
	public String demo(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
		logger.info("access demo: " + name);
		model.addAttribute("name", name);
		return "demo";
	}

}
