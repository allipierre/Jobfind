/**
 * 
 */
package io.blackground.jobfinder.services;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.blackground.jobfinder.Repository.CompanyRepository;
import io.blackground.jobfinder.models.Company;
import io.blackground.jobfinder.models.User;
import io.blackground.jobfinder.utils.HibernateUtil;

/**
 * @author yotti
 *
 */
@Service
@Transactional
public class CompanyService {
	@PersistenceContext
	private EntityManager em;
	
	 private final SessionFactory sf;

	private final CompanyRepository companyRepository;

	/**
	 * @param taskRepository
	 */
	@Autowired
	public CompanyService(CompanyRepository companyRepository,SessionFactory sf) {
		super();
		this.companyRepository = companyRepository;
		this.sf=sf;
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

	

	public void delete(int id) {
		companyRepository.delete(id);
	}

	public Company findCompany(int id) {
		return companyRepository.findOne(id);
	}
	
	public Company findCompany(User user) {
		Company company = null;
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Company.class);
		criteria.add(Restrictions.eq("user", user));
		company = (Company) criteria.uniqueResult();
		session.getTransaction().commit();

		return company;
	}


}
