package com.ty.hospital.dao;
import java.util.List;
import com.ty.hospital.dto.Branch;

public interface BranchDao {
	
	public Branch saveBranch(int hid,Branch branch);
	public boolean deleteBranchById(int bid);
	public Branch updateBranchById(int bid,Branch branch);
	public Branch getBranchById(int bid);
	public List<Branch> getAllBranch();
	
}
