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

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

@Getter
@Setter
@Entity
@NamedNativeQuery(name = "Company.findByidIs", query = "select i.name as industry,"
		+ "c.id id,c.website as website, c.about as about, c.name as name, "
		+ "c.city as city, c.location as location,c.numbere as numbere "
		+ "from industry i inner join company c on i.id=c.industry::integer", resultClass = Company.class)
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;
	private String website;
	private String about;
	private String city;
	private String location;

	private String industry;
	private int numbere;

	// private byte[] logo;

}