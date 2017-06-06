/**
 * 
 */
package io.blackground.jobfinder.services;

import java.util.List;
import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import io.blackground.jobfinder.Repository.CompanyRepository;
import io.blackground.jobfinder.models.Company;


/**
 * @author yotti
 *
 */
@Service
@Transactional
public class CompanyService {

	private final CompanyRepository companyRepository;

	/**
	 * @param taskRepository
	 */
	public CompanyService(CompanyRepository companyRepository) {
		super();
		this.companyRepository = companyRepository;
	}

	public List<Company> findAll() {
		List<Company> jobs = new ArrayList<>();
		for (Company job : companyRepository.findByIDIs()) {
			jobs.add(job);
		}
		return jobs;

	}

	

	public void save(Company task) {
		companyRepository.save(task);
	}

	public void delete(int id) {
		companyRepository.delete(id);
	}

	public Company findJob(int id) {
		return companyRepository.findOne(id);
	}

}
