/**
 * 
 */
package io.blackground.jobfinder.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.blackground.jobfinder.models.Company;


/**
 * @author yotti
 *
 */

public interface CompanyRepository extends CrudRepository<Company, Integer> {
	@Query("select u from #{#entityName} u where u.lastname = ?1")
	  List<Company> allCompany();
}
