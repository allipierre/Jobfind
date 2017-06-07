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




//@NamedNativeQuery(name = "Company.findByidIs", query = "SELECT companyId,companyName,website,about,city,location,industry_id,numbere FROM Company t", resultClass = Company.class)
@Entity
public class Company {

	private long companyId;

	private String companyName;
	private String website;
	private String about;
	private String city;
	private int location;
	private int industryid;

	private int numbere;

	private Industry industry;

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getCompanyId() {
		return companyId;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setCompanyId(long id) {
		this.companyId = id;
	}

	/**
	 * @return the name
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setCompanyName(String name) {
		this.companyName = name;
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
	public int getIndustryid() {
		return industryid;
	}

	public void setIndustryId(int industryid) {
		this.industryid = industryid;
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
	public int getLocation() {
		return location;
	}

	/**
	 * @param industry_id
	 *            the industry_id to set
	 */

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
	@ManyToOne(optional = false)
	@JoinColumn(name = "industryid", referencedColumnName = "id")
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