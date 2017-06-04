/**
 * 
 */
package io.blackground.jobfinder.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

/**
 * @author yotti
 *
 */
@Getter
@Setter
@Entity
public class Countries {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	
	
	@OneToMany( targetEntity=Company.class )
    private List companyList;

}
