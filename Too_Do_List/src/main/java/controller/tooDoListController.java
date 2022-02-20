package controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import entities.tooDoList;
import repository.tooDoListRepo;
import services.tooDoListService;

@RestControllerAdvice
@RequestMapping("/tooDo-api")
public class tooDoListController {

	@Autowired
	private tooDoListService<tooDoList, String>  tdsr;
	@Autowired
	private tooDoListRepo tdrp;
	
	@GetMapping("/getData")
	public tooDoList getData() {
		return new tooDoList("1","starting a project","High","Incomplete");
	}
	 

	@PostMapping("/addData")
	public tooDoList addNewData(@RequestBody tooDoList tdp ) {
		tooDoList t =  tdsr.add(tdp);
		return t;
	}

	@GetMapping("/getAll")
	public Collection<tooDoList> getAll(){
		return tdsr.getAll();
	}
	
	@GetMapping("/getById/{t_id}")
	public tooDoList getById(@PathVariable("t_id") String tid) {
		tooDoList t = tdsr.getById(tid);
		return t;
	}
	
	@DeleteMapping("/deleteById/{del_id}")
	public tooDoList delById(@PathVariable("del_id") String did) {
		tooDoList td = tdsr.deleteById(did);
		return td;
	}
	
	@PutMapping("/update")
	public tooDoList update(@RequestBody tooDoList tdp) {
		tooDoList t =  tdsr.update(tdp);
		return t;
	}
	
	
	@PutMapping("/updateNote/{t_id}/{t_note}")
	public String updateNote(@PathVariable("t_id") String tid, @PathVariable("t_note") String tnote) {
		  tdrp.updateTooDoListNote(tid, tnote);
		return tnote;
	}
	
	@PutMapping("/updatePrio/{t_id}/{t_prio}")
	public String updatePriority(@PathVariable("t_id") String tid, @PathVariable("t_prio") String tprio) {
		  tdrp.updateTooDoListPrio(tid, tprio);
		return tprio;
	}
	
	@PutMapping("/updateStt/{t_id}/{t_stt}")
	public String updateStatus(@PathVariable("t_id") String tid, @PathVariable("t_stt") String tstt) {
	 	 tdrp.updateTooDoListStatus(tid, tstt);
		return tstt;
	}
	
	
	@DeleteMapping("/delAll")
	public String delAll(){
		tdsr.delAll();
		return "Looks CLean";
	}

}
