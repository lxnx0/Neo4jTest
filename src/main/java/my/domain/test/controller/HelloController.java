package my.domain.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import my.domain.test.neo4j.repository.ShopRepository;
import my.domain.test.repository.CustomerRepository;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@Autowired
	ShopRepository shopRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	/*
	 * Customer - JPA
	 */
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
    public ResponseEntity<Long> getCustomer() {
		
		Long countCustomer = customerRepository.count();
		
	return new ResponseEntity<Long>(countCustomer, HttpStatus.OK);
		
	}
	
	/*
	 * Shop - SDN
	 */
	@RequestMapping(value = "/shop", method = RequestMethod.GET)
    public ResponseEntity<Long> getShop() {
		
		Long countShop = shopRepository.count();
		
	return new ResponseEntity<Long>(countShop, HttpStatus.OK);
		
	}

}
