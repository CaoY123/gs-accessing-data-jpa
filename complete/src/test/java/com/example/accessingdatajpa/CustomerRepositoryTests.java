/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.accessingdatajpa;

import com.example.accessingdatajpa.dao.CustomerRepository;
import com.example.accessingdatajpa.domain.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

//@DataJpaTest
@SpringBootTest
public class CustomerRepositoryTests {
//	@Autowired
//	private TestEntityManager entityManager;

	@Autowired
	private CustomerRepository customerRepository;

	@Test
	public void testFindByLastName() {
		Customer customer = new Customer("first", "last");
//		entityManager.persist(customer);

		List<Customer> findByLastName = customerRepository.findByLastName(customer.getLastName());

		assertThat(findByLastName).extracting(Customer::getLastName).containsOnly(customer.getLastName());
	}

	@Test
	public void testSave() {

		Customer customer = new Customer("李", "四");
		customerRepository.save(customer);
	}

	@Test
	public void testGet() {

		List<Customer> customers = customerRepository.findByFirstName("李");
		customers.forEach(System.out::println);
	}
}
