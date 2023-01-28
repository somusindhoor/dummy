package com.ty.hospital.dao;
import java.util.List;
import com.ty.hospital.dto.Item;

public interface ItemDao {
	
	public Item saveItem(int mid,Item item);
	public boolean deleteItemById(int iId);
	public Item getItemById(int iId);
	public Item getItemByMedOrderId(int iId);
	public List<Item> getAllItem();
		
}
