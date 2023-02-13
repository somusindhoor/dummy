package com.jsp.dheeyantra.serviceimpl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.dheeyantra.exception.ResourceNotFoundException;
import com.jsp.dheeyantra.model.DheeYantra;
import com.jsp.dheeyantra.repo.DheeYantraRepoJpa;
import com.jsp.dheeyantra.service.DheeYantraService;

@Service
public class DheeYantraServiceImpl implements DheeYantraService{

	@Autowired
	DheeYantraRepoJpa repo;
	
	@Override
	public DheeYantra saveDheeYantra(DheeYantra dheeYantra) {
		repo.save(dheeYantra);
		return dheeYantra;
	}

	@Override
	public List<DheeYantra> getDheeYantra() {
		List<DheeYantra> list=repo.findAll();
		return list;
	}

	@Override
	public DheeYantra getById(int id) {
		Optional<DheeYantra> dheeYantra = repo.findById(id);
		if(dheeYantra.isPresent()) {
			return dheeYantra.get();	
		}
		 throw new ResourceNotFoundException("DheeYantra","Id",id);
	}

	@Override
	public DheeYantra updateDheeYantra(DheeYantra dheeYantra, int id) {
		DheeYantra dheeYantra2=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("DheeYantra","Id",id));
		dheeYantra2.setNote(dheeYantra.getNote());
		dheeYantra2.setColor(dheeYantra.getColor());
		return dheeYantra2;
	}

	@Override
	public String deleteDheeYantra(int id) {
		DheeYantra dheeYantra=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("DheeYantra","Id",id));
		 repo.delete(dheeYantra);
		 return "dheeYantra Deleted";
	}

	@Override
	public List<DheeYantra> getByColor() {
		return repo.getByColor();
	}

	@Override
	public List<DheeYantra> getByNote() {
	 return repo.getByNote();
	}

}
