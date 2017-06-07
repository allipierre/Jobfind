/**
 * 
 */
package io.blackground.jobfinder.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import io.blackground.jobfinder.models.Company;
import io.blackground.jobfinder.models.Industry;



/**
 * @author yotti
 *
 */
public interface IndustryRepository extends CrudRepository<Industry, Integer> {
	@Query(value = "SELECT industry_name,id FROM  Industry", nativeQuery = true)
	public List<Industry> findJoin();
}
