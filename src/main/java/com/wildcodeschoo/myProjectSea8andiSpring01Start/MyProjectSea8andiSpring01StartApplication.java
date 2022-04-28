package com.wildcodeschoo.myProjectSea8andiSpring01Start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// ANDI Creates a Spring project, and transforms the application into a controller.
@Controller
@SpringBootApplication
public class MyProjectSea8andiSpring01StartApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectSea8andiSpring01StartApplication.class, args);
	}

	// Übersicht
	// the root / returns a list of urls for which you have provided mappings, in the form of HTML links 
	// -- think of the tags <ul> and <li> to contain your tags <a>
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "Dr Liste" +
			"<ul>" +
				"<li><a href='/doctor/1'>First Doctor</a></li>" +
				"<li><a href='/doctor/10'>Tenth Doctor</a></li>" +
				"<li><a href='/doctor/13'>Thirteenth Doctor</a></li>" +
				"<li><a href='/doctor/3'>Third Doctor</a></li>" +
			"</ul>";
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String first() {
		return "William Hartnell";
	}

	@RequestMapping("/doctor/10")
	@ResponseBody
	public String tenth() {
		return "David Tennant";
	}

	@RequestMapping("/doctor/13")
	@ResponseBody
	public String thirteenth() {
		return "Jodie Whittaker";
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String third() {
		return "Jon Pertwee";
	}


}
