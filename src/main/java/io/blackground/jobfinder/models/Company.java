/**
 * 
 */
package io.blackground.jobfinder.models;

/**
 * @author yotti
 *
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;

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
	private Industry industry;

	/**
	 * @return the id
	 */
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
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * @param website
	 *            the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}

	/**
	 * @return the about
	 */
	public String getAbout() {
		return about;
	}

	/**
	 * @param about
	 *            the about to set
	 */
	public void setAbout(String about) {
		this.about = about;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the location
	 */
	public int getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(int location) {
		this.location = location;
	}

	/**
	 * @return the industry_id
	 */
	public int getIndustry_id() {
		return industry_id;
	}

	/**
	 * @param industry_id
	 *            the industry_id to set
	 */
	public void setIndustry_id(int industry_id) {
		this.industry_id = industry_id;
	}

	/**
	 * @return the numbere
	 */
	public int getNumbere() {
		return numbere;
	}

	/**
	 * @param numbere
	 *            the numbere to set
	 */
	public void setNumbere(int numbere) {
		this.numbere = numbere;
	}

	/**
	 * @return the industry
	 */
	@ManyToOne
	@JoinColumn(name = "industry_id")
	public Industry getIndustry() {
		return industry;
	}

	/**
	 * @param industry
	 *            the industry to set
	 */
	public void setIndustry(Industry industry) {
		this.industry = industry;
	}

	// private byte[] logo;

}