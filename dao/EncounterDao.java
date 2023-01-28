package com.ty.hospital.dao;
import java.util.List;
import com.ty.hospital.dto.Encounter;

public interface EncounterDao {

	public Encounter saveEncounter(int bid,int pid,Encounter encounter);
	public boolean deleteEncounterById(int eid);
	public Encounter updateEncounterById(int eid,Encounter encounter);
	public Encounter getEncounterById(int eid);
	public List<Encounter> getAllEncounter();

}
