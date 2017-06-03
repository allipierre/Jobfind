/**
 * 
 */
package io.blackground.jobfinder.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author yotti
 *
 */
@Controller
public class MainController {

	@GetMapping("/")
	public String hello() {
		return "index";
	}
	
	@GetMapping("/allejob")
	public String alleJob() {
		return "allejob";
	}



}
