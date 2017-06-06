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

	@Query(nativeQuery = true)
	public List<Company> findByidIs();

	@Query(value = "SELECT id,name,website,about,city,location,industry,numbere FROM Company t", nativeQuery = true)
//	@Query(value = "select i.name as industry,c.id"
//			+ " id,c.website as website, c.about as about,"
//			+ " c.city as city, c.location as location"
//			+ ",c.numbere as numbere from industry i "
//			+ "inner join company c "
//			+ "on "
//			+ "i.id=c.industry", nativeQuery = true)
	public List<Company> findJoin();
	
	

}
