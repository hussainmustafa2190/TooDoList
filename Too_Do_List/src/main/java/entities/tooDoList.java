package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "too_do_list_master")
@JsonIgnoreProperties("hibernateLazyInitializer")
public class tooDoList {
	@Id
	@Column(name = "note_id")
	private String noteId ;
	
	@Column(name = "note")
	private String note;
	
	@Column(name ="note_priority")
	private String notePriority;
	
	@Column(name = "note_status")
	private String noteStatus;

	public tooDoList() {
		//Empty
	}
	public tooDoList(String noteId, String note, String notePriority, String noteStatus) {
		super();
		this.noteId = noteId;
		this.note = note;
		this.notePriority = notePriority;
		this.noteStatus = noteStatus;
	}
	
	
	public String getNoteId() {
		return noteId;
	}


	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}


	public String getNote() {
		return note;
	}


	public void setNote(String note) {
		this.note = note;
	}


	public String getNotePriority() {
		return notePriority;
	}


	public void setNotePriority(String notePriority) {
		this.notePriority = notePriority;
	}


	public String getNoteStatus() {
		return noteStatus;
	}


	public void setNoteStatus(String noteStatus) {
		this.noteStatus = noteStatus;
	}


	@Override
	public String toString() {
		return "tooDoList [noteId=" + noteId + ", note=" + note + ", notePriority=" + notePriority + ", noteStatus="
				+ noteStatus + "]";
	}


	



}
