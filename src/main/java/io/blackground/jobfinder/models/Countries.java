/**
 * 
 */
package io.blackground.jobfinder.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;
/**
 * @author yotti
 *
 */
@Entity
@Getter
@Setter
public class Countries {

    @Id
    @GeneratedValue
	private long id;
	private String name;

}
