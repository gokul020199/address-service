package com.springrestapi.address.addressservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponse {

	private int id;

	private String city;
	
	private String state;

	private String zipcode;
}
