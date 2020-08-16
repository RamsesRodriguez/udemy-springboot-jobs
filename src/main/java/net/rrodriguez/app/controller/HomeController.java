package net.rrodriguez.app.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/list")
	public String getJobList(Model model) {
		List<String> list = new LinkedList<String>();
		list.add("Ingeniero de Sistemas");
		list.add("Auxiliar de Contabilidad");
		list.add("Vendedor");
		list.add("Arquitecto");

		model.addAttribute("jobs", list);

		return "jobList";
	}

	@GetMapping("/")
	public String getHome(Model model) {

		String name = "Auxiliar de Contabilidad";
		Date publicationDate = new Date();
		double salary = 9000.0;
		boolean prevailing = true;

		model.addAttribute("name", name);
		model.addAttribute("publicationDate", publicationDate);
		model.addAttribute("salary", salary);
		model.addAttribute("prevailing", prevailing);

		return "home";

	}

}
