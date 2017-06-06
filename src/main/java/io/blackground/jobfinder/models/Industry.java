/**
 * 
 */
package io.blackground.jobfinder.models;

/**
 * @author yotti
 *
 */
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Industry {

	
	private long ides;
	
	private String namens;
	
	
	private Set<Company> company;
	

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return ides;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.ides = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return namens;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.namens = name;
	}

	/**
	 * @return the company
	 */
	@OneToMany(mappedBy = "industry", cascade = CascadeType.ALL)
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