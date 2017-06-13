/**
 * 
 */
package io.blackground.jobfinder.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import io.blackground.jobfinder.models.Company;
import io.blackground.jobfinder.models.User;
import io.blackground.jobfinder.services.CompanyService;
import io.blackground.jobfinder.services.UserServiceImpl;

/**
 * @author yotti
 *
 */
@Controller
public class CtreateCompanyController {

	@Autowired
	private CompanyService companyservice;
	
	@Autowired
    private UserServiceImpl userService;

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

	}
