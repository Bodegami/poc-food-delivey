package br.com.bodegami.restaurant.repositories;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.com.bodegami.restaurant.customer.Customer;

@DataJpaTest
public class CustomerRepositoryTest {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	@Test
	public void deveCadastrarUmNovoCliente() {
		
		Customer customer = new Customer("João Paulo", "9695965896");
		
		customerRepository.save(customer);
		
		Optional<Customer> result = customerRepository.findByCpf(customer.getCpf());
		
		assertEquals(customer.getName(), result.get().getName());
		assertTrue(!result.isEmpty());
	}
	
	@Test
	public void deveBuscarUmClientePeloCpf() {
		
		Customer customer = new Customer("Pablo Montana", "256478589");
		
		customerRepository.save(customer);
		
		Optional<Customer> result = customerRepository.findByCpf(customer.getCpf());
		
		assertTrue(result.isPresent());
		
	}
}
