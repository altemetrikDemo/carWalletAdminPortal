/**
 * 
 */
package model;

import javax.persistence.Table;

/**
 * @author SFLDPGUSER-02
 *
 */

@Table
public class Manufacturer {

	private String manufacturerName;
	
	private String id;

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}


	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
