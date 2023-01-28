package com.ty.hospital.dao;
import java.util.List;
import com.ty.hospital.dto.Address;

public interface AddressDao {
	
	public Address saveAddress(int bid,Address address);
	public boolean deleteAddressById(int aid);
	public Address updateAddressById(int aid,Address address);
	public Address getAddressById(int aid);
	public List<Address> getAllAddress();
	
}
