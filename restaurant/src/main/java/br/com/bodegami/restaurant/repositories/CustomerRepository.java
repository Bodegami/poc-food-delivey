package br.com.bodegami.restaurant.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bodegami.restaurant.customer.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	public Optional<Customer> findByCpf(String cpf);

}
