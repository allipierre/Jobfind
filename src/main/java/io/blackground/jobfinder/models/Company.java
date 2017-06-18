package io.blackground.jobfinder.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


/**
 * @author yotti
 */

@Getter
@Setter
@Entity
public class Company {

    @Id
    @GeneratedValue
	private long id;

    @Column(name = "company_name")
	private String companyName;
	private String website;
	private String about;
	private String city;
	private int location;
	@Column(name = "industry_id")
	private long industryId;
	private long countryId;
	private int numbere;

	private transient Industry industry;
	private transient Countries countries;

	@ManyToOne
	@JoinColumn(name = "company_size")
	private CompanySize companySize;

	@OneToOne
	private User user;
}