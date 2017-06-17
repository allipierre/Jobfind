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
import java.util.Date;

@Entity
public class Job {

	private long id;

	private String position;

	private String description;
	private int minimumExperienceYears;
	private String category;

	private String minimumDegree;
	private int slots;
	private int companyid;
	private String title;
	private String contrat;
	private String city;
	private String country;
	private Date published;

	private Company company;

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the contrat
	 */
	public String getContrat() {
		return contrat;
	}

	/**
	 * @param contrat
	 *            the contrat to set
	 */
	public void setContrat(String contrat) {
		this.contrat = contrat;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the companyid
	 */
	public int getCompanyid() {
		return companyid;
	}

	/**
	 * @param companyid
	 *            the companyid to set
	 */
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}

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
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position
	 *            the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the minimumExperienceYears
	 */
	public int getMinimumExperienceYears() {
		return minimumExperienceYears;
	}

	/**
	 * @param minimumExperienceYears
	 *            the minimumExperienceYears to set
	 */
	public void setMinimumExperienceYears(int minimumExperienceYears) {
		this.minimumExperienceYears = minimumExperienceYears;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the minimumDegree
	 */
	public String getMinimumDegree() {
		return minimumDegree;
	}

	/**
	 * @param minimumDegree
	 *            the minimumDegree to set
	 */
	public void setMinimumDegree(String minimumDegree) {
		this.minimumDegree = minimumDegree;
	}

	/**
	 * @return the slots
	 */
	public int getSlots() {
		return slots;
	}

	/**
	 * @param slots
	 *            the slots to set
	 */
	public void setSlots(int slots) {
		this.slots = slots;
	}

	/**
	 * @return the published
	 */
	public Date getPublished() {
		return published;
	}

	/**
	 * @param published
	 *            the published to set
	 */
	public void setPublished(Date published) {
		this.published = published;
	}

	/**
	 * @return the company
	 */

	@ManyToOne(optional = false)
	@JoinColumn(name = "companyid", referencedColumnName = "id", insertable = false, updatable = false)
	public Company getCompany() {
		return company;
	}

	/**
	 * @param company
	 *            the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

}
