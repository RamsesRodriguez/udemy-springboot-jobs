package net.rrodriguez.app.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String getHome(Model model) {

		model.addAttribute("message", "Bienvenidos a Empleos App");
		model.addAttribute("fecha", new Date());

		return "home";
	}

}
