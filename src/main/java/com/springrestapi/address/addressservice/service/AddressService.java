package com.springrestapi.address.addressservice.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrestapi.address.addressservice.entity.Address;
import com.springrestapi.address.addressservice.entity.AddressRequest;
import com.springrestapi.address.addressservice.entity.AddressResponse;
import com.springrestapi.address.addressservice.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private ModelMapper mapper;
	
	
//	public AddressResponse getAddByEmpId(int empid) {
//		Address ad=addressRepository.findAddressByEmployeeId(empid);
//		return mapper.map(ad,AddressResponse.class);
//	}


	public void saveAddress(Integer id, AddressRequest addressRequest) {
		Address add=Address.builder()
					.city(addressRequest.getCity())
					.state(addressRequest.getState())
					.zipcode(addressRequest.getZipcode())
					.empid(id)
					.build();
		addressRepository.save(add);
			
		
		
	}
}
