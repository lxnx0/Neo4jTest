package my.domain.test.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Customer {
	
	@Id
	@Column(name="customer_id")
	private int id;
	private String customerName;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
