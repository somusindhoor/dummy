package com.jsp.dheeyantra.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jsp.dheeyantra.model.DheeYantra;

public interface DheeYantraRepoJpa extends JpaRepository<DheeYantra, Integer>{

	@Query(value="select * from dhee_yantra where color='red'",nativeQuery = true)
	List<DheeYantra> getByColor();

	@Query(value="select * from dhee_yantra order by note",nativeQuery = true)
	List<DheeYantra> getByNote();

}
