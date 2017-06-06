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
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

@NamedNativeQueries({
	@NamedNativeQuery(
	name = "findStockByStockCodeNativeSQL",
	query = "select * from stock s where s.stock_code = :stockCode",
        resultClass = Company.class
	)
})
@Getter
@Setter
@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;
	private String website;
	private String about;
	private String city;
	private String location;

	private String industry;
	private int numbere;

	//private byte[] logo;

}