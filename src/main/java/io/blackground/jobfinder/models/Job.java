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

    @ManyToOne
    private Company company;

    private String description;
    private int minimumExperienceYears;
    private String category;

    private String minimumDegree;
    private int slots;

    private Date published;

}
