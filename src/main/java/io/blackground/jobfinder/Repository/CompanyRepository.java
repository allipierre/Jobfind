/**
 * 
 */
package io.blackground.jobfinder.Repository;

import org.springframework.data.repository.CrudRepository;

import io.blackground.jobfinder.models.Company;


/**
 * @author yotti
 *
 */

public interface CompanyRepository extends CrudRepository<Company, Integer> {

}
