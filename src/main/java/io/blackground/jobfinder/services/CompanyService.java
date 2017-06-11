/**
 * 
 */
package io.blackground.jobfinder.services;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.core.EntityInformation;
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
	@PersistenceContext
	private EntityManager em;

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
		for (Company job : companyRepository.findJoin()) {
			jobs.add(job);
		}
		return jobs;

	}

	public void save(Company task) {

		companyRepository.save(task);
	}

	@Transactional
	public Company saven(Company company) {

		return em.merge(company);

	}

	public void delete(int id) {
		companyRepository.delete(id);
	}

	public Company findCompany(int id) {
		return companyRepository.findOne(id);
	}

}
