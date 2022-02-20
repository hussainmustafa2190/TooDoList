package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.tooDoList;
import repository.tooDoListRepo;

@Service
public class tooDoListServiceImpl implements tooDoListService<tooDoList, String> {

	@Autowired
	private tooDoListRepo tdp; 
	
	@Override
	public Collection<tooDoList> getAll() {
		 Collection<tooDoList> ls=  tdp.findAll();
		 return ls;
	}
	
	
	@Override
	public tooDoList getById(String key) {
		
		tooDoList td =  tdp.getById(key);
		return td;
	}
	

	@Override
	public tooDoList add(tooDoList t) {
		
		tooDoList td =  tdp.save(t);
		return td;
	}
	

	@Override
	public tooDoList deleteById(String key) {
		tooDoList td = getById(key);
		tdp.deleteById(key);
		return td;
	}

	@Override
	public tooDoList update(tooDoList t) {
		String id = t.getNoteId();
		String nt = t.getNote();
		String np = t.getNotePriority();
		String st = t.getNoteStatus();
		
		tdp.updateTooDoList(id, nt, np, st);
		
		return null;
	}


	@Override
	public void delAll() {
	    tdp.deleteAll();
		
	}
	



	

	

}
