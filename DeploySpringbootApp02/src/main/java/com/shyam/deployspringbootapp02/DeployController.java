package com.shyam.deployspringbootapp02;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployController {

	@RequestMapping("/")
	public String home()
	{
		return "Project Deploy Success";
	}
}
