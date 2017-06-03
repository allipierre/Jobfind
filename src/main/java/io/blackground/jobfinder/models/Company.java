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
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Entity
public class Company {

	@Id
	@GeneratedValue
	private long id;

	private String name;
	private int city;
	private String Location;

	private String Industry;
	private int numberEmployees;

	private byte[] logo;

}