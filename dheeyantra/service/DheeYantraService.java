package com.jsp.dheeyantra.service;
import java.util.List;
import com.jsp.dheeyantra.model.DheeYantra;

public interface DheeYantraService {

	DheeYantra saveDheeYantra(DheeYantra dheeYantra);
	
	List<DheeYantra> getDheeYantra();
	
	DheeYantra getById(int id);
	
	DheeYantra updateDheeYantra(DheeYantra dheeYantra,int id);
	
	String deleteDheeYantra(int id);
	
	List<DheeYantra> getByColor();
	
	List<DheeYantra> getByNote();
}
