/**
 * 
 */
package io.blackground.jobfinder.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import io.blackground.jobfinder.models.Countries;
import io.blackground.jobfinder.services.CountriesService;

/**
 * @author yotti
 *
 */
@Controller
public class CtreateContriesController {

	@Autowired
	private CountriesService countriesService;

	@PostMapping("/save-countries")
	public String saveTask(@ModelAttribute Countries country, BindingResult bindingResult, HttpServletRequest request) {
		// task.setDateCreated(new Date());
		countriesService.save(country);
		//request.setAttribute("tasks", companyservice.findAll());
		//request.setAttribute("mode", "MODE_TASKS");
		return "createcountries";
	}

}
