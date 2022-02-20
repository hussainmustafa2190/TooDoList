package repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import entities.tooDoList;

public interface tooDoListRepo extends JpaRepository<tooDoList, String> {
	@Transactional
	@Modifying
	@Query("update tooDoList td set td.note = :tdp_note where td.noteId = :tdp_Id")
		void updateTooDoListNote(@Param("tdp_Id")String noteId, @Param("tdp_note")String note);
	
	@Transactional
	@Modifying
	@Query("update tooDoList td set td.notePriority = :tdp_notePriority where td.noteId = :tdp_Id")
	void  updateTooDoListPrio(@Param("tdp_Id")String noteId, @Param("tdp_notePriority")String notePriority);
	
	@Transactional
	@Modifying
	@Query("update tooDoList td set td.noteStatus = :tdp_noteStatus where td.noteId = :tdp_Id")
	void  updateTooDoListStatus(@Param("tdp_Id")String noteId, @Param("tdp_noteStatus")String noteStatus);
	
	
	@Transactional
	@Modifying
	@Query("update tooDoList td set td.note = :tdp_note,td.notePriority = :tdp_notePriority, td.noteStatus = :tdp_noteStatus  where td.noteId = :tdp_Id")
	void updateTooDoList(@Param("tdp_Id")String noteId, 
			@Param("tdp_note")String note,
			@Param("tdp_notePriority")String notePriority,
			@Param("tdp_noteStatus")String noteStatus);
	
}
