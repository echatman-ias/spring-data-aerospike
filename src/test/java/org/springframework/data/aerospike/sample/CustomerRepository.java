/*
 * Copyright 2012-2021 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 		https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.aerospike.sample;

import org.springframework.data.aerospike.repository.AerospikeRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Oliver Gierke
 */
public interface CustomerRepository extends AerospikeRepository<Customer, String>, CrudRepository<Customer, String> {

    List<Customer> findByLastName(String lastName);

    List<Customer> findByFirstName(String firstName);

    List<Customer> findCustomerByFirstName(String firstName);

    List<Customer> findCustomerByAgeBetween(Integer from, Integer to);

    List<Customer> findCustomerByFirstNameStartingWithIgnoreCase(String firstName);

    List<Customer> findCustomerByLastNameOrderByFirstNameAsc(String lastName);

    List<Customer> findByGroup(char group);
}
