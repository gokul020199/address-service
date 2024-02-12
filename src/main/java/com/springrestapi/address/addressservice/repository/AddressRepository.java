package com.springrestapi.address.addressservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springrestapi.address.addressservice.entity.Address;
import com.springrestapi.address.addressservice.entity.AddressRequest;

public interface AddressRepository extends JpaRepository<Address, Integer> {

	@Query(nativeQuery = true,value ="select a.id,a.city,a.state,a.zipcode from padipu.address a join padipu.employee e on e.id=a.empid where a.empid=:employeeId")
	Address findAddressByEmployeeId(@Param("employeeId") int  employeeId);
	
	

	
}
