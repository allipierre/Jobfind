/**
 *
 */
package io.blackground.jobfinder.controller;

import io.blackground.jobfinder.models.Company;
import io.blackground.jobfinder.models.Industry;
import io.blackground.jobfinder.models.User;
import io.blackground.jobfinder.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import sun.plugin.liveconnect.SecurityContextHelper;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author yotti
 */
@Controller
public class CompanyController {

    @Autowired
    private CompanyService companyservice;

    @Autowired
    private CompanyService companyService;

    @Autowired
    private CompanySizeService companySizeService;

    @Autowired
    private CountriesService countriesService;

    @Autowired
    private IndustryService industryService;

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/company")
    public String createCompany(HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication.getName().isEmpty()) {
            return "403_forbidden";
        }

        User user = userService.findByUsername(authentication.getName());
        Company userCompany = companyService.findCompany(user);
        System.out.println("Company found is " + userCompany);
        if (userCompany == null) {
            userCompany = new Company();
            userCompany.setUser(user);
        }
        userCompany.setIndustry(industryService.findById(userCompany.getIndustryId()));
        System.out.println("Company country is " + userCompany.getCountries());
        request.setAttribute("countries", countriesService.findAll());
        request.setAttribute("companySize", companySizeService.findAll());
        request.setAttribute("company", userCompany);
        request.setAttribute("industries", industryService.findAll());
        return "createcompany";
    }

    @PostMapping("/company")
    public String saveTask(@ModelAttribute Company company, BindingResult bindingResult, HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || authentication.getName().isEmpty()) {
            return "403_forbidden";
        }
        // get the old company instance and set the new company id with the old one's id
        User user = userService.findByUsername(authentication.getName());
        Company oldCompany = companyService.findCompany(user);
        company.setUser(user);
        if (oldCompany != null) {
            company.setId(oldCompany.getId());
        }
        companyservice.save(company);
        return "createcompany";
    }

}
