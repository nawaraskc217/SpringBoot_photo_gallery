package com.Images.Images;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImageController {
	
	
	@GetMapping("/")
	public String image() {
		return "images";
	}

}
