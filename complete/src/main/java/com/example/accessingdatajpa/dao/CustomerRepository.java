package com.example.accessingdatajpa.dao;

import com.example.accessingdatajpa.domain.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
//@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);

	List<Customer> findByFirstName(String firstName);

	Customer findById(long id);
}
