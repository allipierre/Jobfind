/**
 * 
 */
package io.blackground.jobfinder.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/**
 * @author yotti
 *
 */
@Entity
public class Countries {
	private long id;
	private String name;
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
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the company
	 */
	@OneToMany(mappedBy = "countries", targetEntity = Company.class, cascade = CascadeType.ALL)
	public Set<Company> getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(Set<Company> company) {
		this.company = company;
	}
	
	
   

}
