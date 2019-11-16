package com.spring03.thymeleaf;

import org.springframework.ui.Model;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@SpringBootApplication
public class DemoApplication {

	@GetMapping("/doctor")
	public String doctor(Model model,
						@RequestParam(value="name",
								required=false,
								defaultValue="John Smith") String name ,
						@RequestParam(value="number",
								required=false,
								defaultValue="01") int number) 
		// une fois les paramètres de la methode complétés, on ajoute les attributs
		{
			model.addAttribute("name", name);
			model.addAttribute("number", number);
			return "doctor"; // renvoi au template "doctor.html"
		}
		//optionnel
		@GetMapping("/")
			public String index()
			{
				return "index";
			}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
