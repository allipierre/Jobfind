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
	@Query(value = "SELECT company_id,industry_name,company_name,website,about,city,location,industryid,numbere FROM Company join Industry on industryid=id", nativeQuery = true)
	public List<Industry> findJoin();
}
