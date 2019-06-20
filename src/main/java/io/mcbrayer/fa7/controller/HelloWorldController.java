package io.mcbrayer.fa7.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloWorldController {

	@RequestMapping({ "/hello"})
	public String firstPage() {
		return "Blanketing opinions that are probably regrets soon. Change my mind so much I can't even trust it."
				+ "My mind changed me so much i can't even trust myself.";
		}
}
