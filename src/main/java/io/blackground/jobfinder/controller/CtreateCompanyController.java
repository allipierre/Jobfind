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

import io.blackground.jobfinder.models.Company;
import io.blackground.jobfinder.services.CompanyService;

/**
 * @author yotti
 *
 */
@Controller
public class CtreateCompanyController {

	@Autowired
	private CompanyService companyservice;

	@PostMapping("/save-company")
	public String saveTask(@ModelAttribute Company company, BindingResult bindingResult, HttpServletRequest request) {
		// task.setDateCreated(new Date());
		companyservice.save(company);
		//request.setAttribute("tasks", companyservice.findAll());
		//request.setAttribute("mode", "MODE_TASKS");
		return "createcompagny";
	}

}
