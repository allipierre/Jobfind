/**
 * 
 */
package io.blackground.jobfinder.Repository;

import java.util.List;

import javax.persistence.NamedNativeQuery;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.blackground.jobfinder.models.Company;

/**
 * @author yotti
 *
 */

public interface CompanyRepository extends CrudRepository<Company, Integer> {

	@Query(nativeQuery = true)
	public List<Company> findByidIs();

	@Query(value = "SELECT id,name,website,about,city,location,industry,numbere FROM Company t", nativeQuery = true)
	public List<Company> findJoin();

}
