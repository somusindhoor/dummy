package com.jsp.dheeyantra.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jsp.dheeyantra.model.DheeYantra;
import com.jsp.dheeyantra.service.DheeYantraService;

@RestController
public class DheeYantraController {

	@Autowired
	DheeYantraService service;
	
	@PostMapping("notes")
	public ResponseEntity<DheeYantra> saveDheeYantra(@RequestBody DheeYantra dheeYantra){
		return new ResponseEntity<DheeYantra>(service.saveDheeYantra(dheeYantra),HttpStatus.CREATED);
	}

	@GetMapping("notes")
	public List<DheeYantra> getDheeYantra(){
		return service.getDheeYantra();
	}

	@GetMapping("DheeYantra/{id}")
	public ResponseEntity<DheeYantra> getById(@PathVariable("id") int id){
		return new ResponseEntity<DheeYantra>(service.getById(id),HttpStatus.OK);
	}

	@PutMapping("update/{id}")
	public ResponseEntity<DheeYantra> updateDheeYantra(@RequestBody DheeYantra dheeYantra,@PathVariable("id") int id){
		return new ResponseEntity<DheeYantra>(service.updateDheeYantra(dheeYantra,id),HttpStatus.OK);
	}

	@DeleteMapping("delete/{id}")
	public String deleteDheeYantra(@PathVariable("id") int id){
		return service.deleteDheeYantra(id);
	}
	
	@GetMapping("Color/red")
	public List<DheeYantra> getByColor(){
		return service.getByColor();
	}
	
	@GetMapping("Person/name")
	public List<DheeYantra> getByNote(){
		return service.getByNote();
	}
}
