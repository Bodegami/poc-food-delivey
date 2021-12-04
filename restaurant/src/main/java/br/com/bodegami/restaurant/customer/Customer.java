package br.com.bodegami.restaurant.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String cpf;
	
	@Deprecated
	//HIBERNATE ONLY
	public Customer() {	}
	
	public Customer(String name, String cpf) {
		this.name = name;
		this.cpf = cpf;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}
	
	
	
}
