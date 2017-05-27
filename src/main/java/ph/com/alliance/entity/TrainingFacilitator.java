package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the training_facilitator database table.
 * 
 */
@Entity
@Table(name="training_facilitator")
@NamedQuery(name="TrainingFacilitator.findAll", query="SELECT t FROM TrainingFacilitator t")
public class TrainingFacilitator implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int facilitatorid;

	//bi-directional many-to-one association to Attendance
	@OneToMany(mappedBy="trainingFacilitator")
	private List<Attendance> attendances;

	//bi-directional many-to-one association to Useraccount
	@ManyToOne
	@JoinColumn(name="fk_userid")
	private Useraccount useraccount;

	//bi-directional many-to-one association to Training
	@ManyToOne
	@JoinColumn(name="fk_trainingid")
	private Training training;

	public TrainingFacilitator() {
	}

	public int getFacilitatorid() {
		return this.facilitatorid;
	}

	public void setFacilitatorid(int facilitatorid) {
		this.facilitatorid = facilitatorid;
	}

	public List<Attendance> getAttendances() {
		return this.attendances;
	}

	public void setAttendances(List<Attendance> attendances) {
		this.attendances = attendances;
	}

	public Attendance addAttendance(Attendance attendance) {
		getAttendances().add(attendance);
		attendance.setTrainingFacilitator(this);

		return attendance;
	}

	public Attendance removeAttendance(Attendance attendance) {
		getAttendances().remove(attendance);
		attendance.setTrainingFacilitator(null);

		return attendance;
	}

	public Useraccount getUseraccount() {
		return this.useraccount;
	}

	public void setUseraccount(Useraccount useraccount) {
		this.useraccount = useraccount;
	}

	public Training getTraining() {
		return this.training;
	}

	public void setTraining(Training training) {
		this.training = training;
	}

}