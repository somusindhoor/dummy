package com.ty.hospital.dao;
import java.util.List;
import com.ty.hospital.dto.MedOrder;

public interface MedOrderDao {
	
	public MedOrder saveMedOrder(int eid,MedOrder medOrder);
	public boolean deleteMedOrderById(int mid);
	public MedOrder updateMedOrderById(int mid,MedOrder medOrder);
	public MedOrder getMedOrderById(int mid);
	public List<MedOrder> getAllMedOrderById();
	public MedOrder getMedOrderByDoctorName(String name);
	public MedOrder getMedOrderByDate(String date);
	
}
