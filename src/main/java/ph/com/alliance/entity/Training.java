package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the training database table.
 * 
 */
@Entity
@NamedQuery(name="Training.findAll", query="SELECT t FROM Training t")
public class Training implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int trainingid;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	@Lob
	private String objective;

	@Lob
	private String outline;

	private String schedule;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	private String title;

	private String venue;

	//bi-directional many-to-one association to TrainingFacilitator
	@OneToMany(mappedBy="training")
	private List<TrainingFacilitator> trainingFacilitators;

	//bi-directional many-to-one association to TrainingParticipant
	@OneToMany(mappedBy="training")
	private List<TrainingParticipant> trainingParticipants;

	public Training() {
	}

	public int getTrainingid() {
		return this.trainingid;
	}

	public void setTrainingid(int trainingid) {
		this.trainingid = trainingid;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getObjective() {
		return this.objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public String getOutline() {
		return this.outline;
	}

	public void setOutline(String outline) {
		this.outline = outline;
	}

	public String getSchedule() {
		return this.schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVenue() {
		return this.venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public List<TrainingFacilitator> getTrainingFacilitators() {
		return this.trainingFacilitators;
	}

	public void setTrainingFacilitators(List<TrainingFacilitator> trainingFacilitators) {
		this.trainingFacilitators = trainingFacilitators;
	}

	public TrainingFacilitator addTrainingFacilitator(TrainingFacilitator trainingFacilitator) {
		getTrainingFacilitators().add(trainingFacilitator);
		trainingFacilitator.setTraining(this);

		return trainingFacilitator;
	}

	public TrainingFacilitator removeTrainingFacilitator(TrainingFacilitator trainingFacilitator) {
		getTrainingFacilitators().remove(trainingFacilitator);
		trainingFacilitator.setTraining(null);

		return trainingFacilitator;
	}

	public List<TrainingParticipant> getTrainingParticipants() {
		return this.trainingParticipants;
	}

	public void setTrainingParticipants(List<TrainingParticipant> trainingParticipants) {
		this.trainingParticipants = trainingParticipants;
	}

	public TrainingParticipant addTrainingParticipant(TrainingParticipant trainingParticipant) {
		getTrainingParticipants().add(trainingParticipant);
		trainingParticipant.setTraining(this);

		return trainingParticipant;
	}

	public TrainingParticipant removeTrainingParticipant(TrainingParticipant trainingParticipant) {
		getTrainingParticipants().remove(trainingParticipant);
		trainingParticipant.setTraining(null);

		return trainingParticipant;
	}

}