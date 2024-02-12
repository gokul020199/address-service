package com.springrestapi.address.addressservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springrestapi.address.addressservice.entity.Address;
import com.springrestapi.address.addressservice.entity.AddressRequest;
import com.springrestapi.address.addressservice.entity.AddressResponse;
import com.springrestapi.address.addressservice.service.AddressService;

@RestController
@RequestMapping("/api/address")
public class AddressController {

	@Autowired
	private AddressService addressService;
//	@GetMapping("{id}")
//	public ResponseEntity<AddressResponse>getAddByEmpid(@PathVariable("id")int empid){
//		return ResponseEntity.status(HttpStatus.OK).body(addressService.getAddByEmpId(empid));
//	}
	@PostMapping
	public void saveAddress(@RequestParam Integer id,@RequestBody AddressRequest addressRequest){
		
		
		
		addressService.saveAddress(id,addressRequest);
	}
}
