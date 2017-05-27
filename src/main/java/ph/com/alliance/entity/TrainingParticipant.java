package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the training_participant database table.
 * 
 */
@Entity
@Table(name="training_participant")
@NamedQuery(name="TrainingParticipant.findAll", query="SELECT t FROM TrainingParticipant t")
public class TrainingParticipant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int participantid;

	//bi-directional many-to-one association to Attendance
	@OneToMany(mappedBy="trainingParticipant")
	private List<Attendance> attendances;

	//bi-directional many-to-one association to Useraccount
	@ManyToOne
	@JoinColumn(name="fk_userid")
	private Useraccount useraccount1;

	//bi-directional many-to-one association to Training
	@ManyToOne
	@JoinColumn(name="fk_trainingid")
	private Training training;

	//bi-directional many-to-one association to Useraccount
	@ManyToOne
	@JoinColumn(name="fk_supervisor")
	private Useraccount useraccount2;

	public TrainingParticipant() {
	}

	public int getParticipantid() {
		return this.participantid;
	}

	public void setParticipantid(int participantid) {
		this.participantid = participantid;
	}

	public List<Attendance> getAttendances() {
		return this.attendances;
	}

	public void setAttendances(List<Attendance> attendances) {
		this.attendances = attendances;
	}

	public Attendance addAttendance(Attendance attendance) {
		getAttendances().add(attendance);
		attendance.setTrainingParticipant(this);

		return attendance;
	}

	public Attendance removeAttendance(Attendance attendance) {
		getAttendances().remove(attendance);
		attendance.setTrainingParticipant(null);

		return attendance;
	}

	public Useraccount getUseraccount1() {
		return this.useraccount1;
	}

	public void setUseraccount1(Useraccount useraccount1) {
		this.useraccount1 = useraccount1;
	}

	public Training getTraining() {
		return this.training;
	}

	public void setTraining(Training training) {
		this.training = training;
	}

	public Useraccount getUseraccount2() {
		return this.useraccount2;
	}

	public void setUseraccount2(Useraccount useraccount2) {
		this.useraccount2 = useraccount2;
	}

}