/**
 * 
 */
package io.blackground.jobfinder.services;

import java.util.List;
import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import io.blackground.jobfinder.Repository.IndustryRepository;
import io.blackground.jobfinder.models.Industry;


/**
 * @author yotti
 *
 */
@Service
@Transactional
public class IndustryService {

	private final IndustryRepository industryRepository;

	/**
	 * @param taskRepository
	 */
	public IndustryService(IndustryRepository countriesRepository) {
		super();
		this.industryRepository = countriesRepository;
	}

	public List<Industry> findAll() {
		List<Industry> industry = new ArrayList<>();
		for (Industry industr : industryRepository.findAll()) {
			industry.add(industr);
		}
		return industry;

	}



	public void save(Industry industry) {
		industryRepository.save(industry);
	}

	public void delete(int id) {
		industryRepository.delete(id);
	}

	public Industry findCountry(int id) {
		return industryRepository.findOne(id);
	}

}
