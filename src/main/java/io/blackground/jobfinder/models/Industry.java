/**
 * 
 */
package io.blackground.jobfinder.models;

/**
 * @author yotti
 *
 */

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Industry {

	private long id;

	private String industryName;

	private Set<Company> company;

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getIndustryName() {
		return industryName;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setIndustryName(String name) {
		this.industryName = name;
	}

	/**
	 * @return the company
	 */
	@OneToMany(mappedBy = "industry", targetEntity = Company.class, cascade = CascadeType.ALL)
	public Set<Company> getCompany() {
		return company;
	}

	/**
	 * @param company
	 *            the company to set
	 */

	public void setCompany(Set<Company> company) {
		this.company = company;
	}

}