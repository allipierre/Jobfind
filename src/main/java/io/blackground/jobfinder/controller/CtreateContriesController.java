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

import io.blackground.jobfinder.models.CompanySize;
import io.blackground.jobfinder.models.Countries;
import io.blackground.jobfinder.services.CompanySizeService;
import io.blackground.jobfinder.services.CountriesService;

/**
 * @author yotti
 *
 */
@Controller
public class CtreateContriesController {

	@Autowired
	private CountriesService countriesService;
	
	@Autowired
	private CompanySizeService companySizeService;

	@PostMapping("/save-countries")
	public String newCountry(@ModelAttribute Countries country, HttpServletRequest request) {
		// task.setDateCreated(new Date());
		countriesService.save(country);
		request.setAttribute("country", countriesService.findAll());
		// request.setAttribute("mode", "MODE_TASKS");
		return "createcountries";
	}

	@PostMapping("/save-size")
	public String newCompSize(@ModelAttribute CompanySize compSize, HttpServletRequest request) {
		companySizeService.save(compSize);
		request.setAttribute("compsize", companySizeService.findAll());
		return "createcountries";
	}

}
