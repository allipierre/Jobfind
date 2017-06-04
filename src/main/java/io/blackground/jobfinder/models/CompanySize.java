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

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Getter
@Setter
@Entity
public class CompanySize {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String value;
	
	
	@OneToMany( targetEntity=Company.class )
    private List companyList;
	

}