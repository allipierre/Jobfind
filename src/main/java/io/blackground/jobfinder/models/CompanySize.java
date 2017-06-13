/**
 * 
 */
package io.blackground.jobfinder.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * @author yotti
 */

@Getter
@Setter
@Entity(name = "company_size")
public class CompanySize {
	@Id
	@GeneratedValue
	private long id;

	private String value;

	@OneToMany(mappedBy = "companySize")
	private Set<Company> companies;

}