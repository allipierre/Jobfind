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
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
@NamedNativeQuery(name = "Company.findByidIs", query = "SELECT id,name,website,about,city,location,industry_id,numbere FROM Company t", resultClass = Company.class)
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;
	private String website;
	private String about;
	private String city;
	private int location;
	private int industry_id;

	private int numbere;

	@ManyToOne
    @JoinColumn(name = "industry_id")
	private Industry industry;

	// private byte[] logo;

}