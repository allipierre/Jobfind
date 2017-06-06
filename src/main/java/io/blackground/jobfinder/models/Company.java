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

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
@NamedNativeQuery(name = "Company.findByidIs", query = "SELECT id,name,website,about,city,location,industry,numbere FROM Company t", resultClass = Company.class)
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;
	private String website;
	private String about;
	private String city;
	private int location;
	private int industry;

	private int numbere;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "industry_id")
	private Industry industries;

	// private byte[] logo;

}