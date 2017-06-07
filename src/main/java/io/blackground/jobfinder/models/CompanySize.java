/**
 * 
 */
package io.blackground.jobfinder.models;

import java.util.Set;

import javax.persistence.CascadeType;

/**
 * @author yotti
 *
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class CompanySize {

	
	private long id;

	private String value;
	private Set<Company> company;

	/**
	 * @return the company
	 */
	@OneToMany(mappedBy = "companysize", targetEntity = Company.class, cascade = CascadeType.ALL)
	public Set<Company> getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(Set<Company> company) {
		this.company = company;
	}

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	

}