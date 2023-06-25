package com.ou_solutions.limitsservice.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ou_solutions.limitsservice.limitsservice.configuration.Configuration;
import com.ou_solutions.limitsservice.limitsservice.entity.Limits;

@RestController
public class LimitsController {
	
	
	@Autowired
	Configuration configuration;
	
	@GetMapping("limits")
	public Limits retriveController()
	{
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}

}
