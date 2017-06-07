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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Setter
@Entity
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String position;

	private String description;
	private int minimumExperienceYears;
	private String category;

	private String minimumDegree;
	private int slots;
	private int companyid;
	/**
	 * @return the companyid
	 */
	public int getCompanyid() {
		return companyid;
	}

	/**
	 * @param companyid the companyid to set
	 */
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}

	private Date published;

	private Company company;

	

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
	@JoinColumn(name = "companyid", referencedColumnName = "companyId", insertable = false, updatable = false)
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
