/**
 * 
 */
package io.blackground.jobfinder.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.blackground.jobfinder.services.CompanyService;
import io.blackground.jobfinder.services.JobService;




/**
 * @author yotti
 *
 */
@Controller
public class MainController {
	
	@Autowired
	private JobService jobservice;
	
	@Autowired
	private CompanyService companyservice;

	@GetMapping("/")
	public String hello() {
		return "index";
	}
	
	@GetMapping("/allejob")
	public String alleJob(HttpServletRequest request) {
		request.setAttribute("taskse", companyservice.findAll());
		return "allejob";
	}
	
	
	

	



}
