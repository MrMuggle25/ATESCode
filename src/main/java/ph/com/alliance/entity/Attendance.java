package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the attendance database table.
 * 
 */
@Entity
@NamedQuery(name="Attendance.findAll", query="SELECT a FROM Attendance a")
public class Attendance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int attendanceid;

	@Temporal(TemporalType.DATE)
	private Date dateofchecking;

	private String status;

	private Time timein;

	private Time timeout;

	//bi-directional many-to-one association to TrainingParticipant
	@ManyToOne
	@JoinColumn(name="fk_participant")
	private TrainingParticipant trainingParticipant;

	//bi-directional many-to-one association to TrainingFacilitator
	@ManyToOne
	@JoinColumn(name="fk_supervisor")
	private TrainingFacilitator trainingFacilitator;

	public Attendance() {
	}

	public int getAttendanceid() {
		return this.attendanceid;
	}

	public void setAttendanceid(int attendanceid) {
		this.attendanceid = attendanceid;
	}

	public Date getDateofchecking() {
		return this.dateofchecking;
	}

	public void setDateofchecking(Date dateofchecking) {
		this.dateofchecking = dateofchecking;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Time getTimein() {
		return this.timein;
	}

	public void setTimein(Time timein) {
		this.timein = timein;
	}

	public Time getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Time timeout) {
		this.timeout = timeout;
	}

	public TrainingParticipant getTrainingParticipant() {
		return this.trainingParticipant;
	}

	public void setTrainingParticipant(TrainingParticipant trainingParticipant) {
		this.trainingParticipant = trainingParticipant;
	}

	public TrainingFacilitator getTrainingFacilitator() {
		return this.trainingFacilitator;
	}

	public void setTrainingFacilitator(TrainingFacilitator trainingFacilitator) {
		this.trainingFacilitator = trainingFacilitator;
	}

}