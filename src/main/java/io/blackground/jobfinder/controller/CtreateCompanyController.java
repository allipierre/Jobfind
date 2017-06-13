/**
 * 
 */
package io.blackground.jobfinder.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import io.blackground.jobfinder.models.Company;
import io.blackground.jobfinder.models.Industry;
import io.blackground.jobfinder.models.User;
import io.blackground.jobfinder.services.CompanyService;
import io.blackground.jobfinder.services.CompanySizeService;
import io.blackground.jobfinder.services.CountriesService;
import io.blackground.jobfinder.services.IndustryService;
import io.blackground.jobfinder.services.UserServiceImpl;

/**
 * @author yotti
 *
 */
@Controller
public class CtreateCompanyController {
	
	
	@Autowired
	private CountriesService countriesservice;
	
	@Autowired
	private CompanySizeService companySizesservice;

	@Autowired
	private CompanyService companyservice;
	
	@Autowired
    private UserServiceImpl userService;

	@Autowired
	private IndustryService industryService;

	@PostMapping("/save-company")
	public String saveTask(@ModelAttribute Company company, BindingResult bindingResult, HttpServletRequest request) {


		 Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	        
	        User user = userService.findByUsername(authentication.getName());
	        Company oldCompany = companyservice.findCompany(user);
	        company.setUser(user);
	        if (oldCompany != null) {
	            company.setCompanyId(oldCompany.getCompanyId());
	        }
	        companyservice.save(company);
	        return "createcompany";
	    }
	
	
	@GetMapping("/createcompagny")
	public String createCompany(HttpServletRequest request) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		
		if (authentication == null || authentication.getName().isEmpty()) {
            return "403_forbidden";
        }
		User user = userService.findByUsername(authentication.getName());
        Company userCompany = companyservice.findCompany(user);
        System.out.println("Company found is " + userCompany);
        if (userCompany == null) {
            userCompany = new Company();
            userCompany.setUser(user);
        }
        userCompany.setIndustry(industryService.findById(userCompany.getIndustryid()));
		request.setAttribute("countries", countriesservice.findAll());
		request.setAttribute("companySize", companySizesservice.findAll());
		request.setAttribute("company", userCompany);
		request.setAttribute("industry", industryService.findAll());
		 
		return "createcompagny";
	}

	}
