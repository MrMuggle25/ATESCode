package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the useraccount database table.
 * 
 */
@Entity
@NamedQuery(name="Useraccount.findAll", query="SELECT u FROM Useraccount u")
public class Useraccount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String userid;

	private String barangay;

	private String city;

	private String contactno;

	private int day;

	private String emailad;

	private String fname;

	private String gender;

	private String lname;

	private String mname;

	private int month;

	private String password;

	private String province;

	private int year;

	//bi-directional many-to-one association to Businessunit
	@OneToMany(mappedBy="useraccount")
	private List<Businessunit> businessunits;

	//bi-directional many-to-one association to Tablejob
	@OneToMany(mappedBy="useraccount")
	private List<Tablejob> tablejobs;

	//bi-directional many-to-one association to TrainingFacilitator
	@OneToMany(mappedBy="useraccount")
	private List<TrainingFacilitator> trainingFacilitators;

	//bi-directional many-to-one association to TrainingParticipant
	@OneToMany(mappedBy="useraccount1")
	private List<TrainingParticipant> trainingParticipants1;

	//bi-directional many-to-one association to TrainingParticipant
	@OneToMany(mappedBy="useraccount2")
	private List<TrainingParticipant> trainingParticipants2;

	//bi-directional many-to-one association to Businessunit
	@ManyToOne
	@JoinColumn(name="fk_buid")
	private Businessunit businessunit;

	public Useraccount() {
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getBarangay() {
		return this.barangay;
	}

	public void setBarangay(String barangay) {
		this.barangay = barangay;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContactno() {
		return this.contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getEmailad() {
		return this.emailad;
	}

	public void setEmailad(String emailad) {
		this.emailad = emailad;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMname() {
		return this.mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<Businessunit> getBusinessunits() {
		return this.businessunits;
	}

	public void setBusinessunits(List<Businessunit> businessunits) {
		this.businessunits = businessunits;
	}

	public Businessunit addBusinessunit(Businessunit businessunit) {
		getBusinessunits().add(businessunit);
		businessunit.setUseraccount(this);

		return businessunit;
	}

	public Businessunit removeBusinessunit(Businessunit businessunit) {
		getBusinessunits().remove(businessunit);
		businessunit.setUseraccount(null);

		return businessunit;
	}

	public List<Tablejob> getTablejobs() {
		return this.tablejobs;
	}

	public void setTablejobs(List<Tablejob> tablejobs) {
		this.tablejobs = tablejobs;
	}

	public Tablejob addTablejob(Tablejob tablejob) {
		getTablejobs().add(tablejob);
		tablejob.setUseraccount(this);

		return tablejob;
	}

	public Tablejob removeTablejob(Tablejob tablejob) {
		getTablejobs().remove(tablejob);
		tablejob.setUseraccount(null);

		return tablejob;
	}

	public List<TrainingFacilitator> getTrainingFacilitators() {
		return this.trainingFacilitators;
	}

	public void setTrainingFacilitators(List<TrainingFacilitator> trainingFacilitators) {
		this.trainingFacilitators = trainingFacilitators;
	}

	public TrainingFacilitator addTrainingFacilitator(TrainingFacilitator trainingFacilitator) {
		getTrainingFacilitators().add(trainingFacilitator);
		trainingFacilitator.setUseraccount(this);

		return trainingFacilitator;
	}

	public TrainingFacilitator removeTrainingFacilitator(TrainingFacilitator trainingFacilitator) {
		getTrainingFacilitators().remove(trainingFacilitator);
		trainingFacilitator.setUseraccount(null);

		return trainingFacilitator;
	}

	public List<TrainingParticipant> getTrainingParticipants1() {
		return this.trainingParticipants1;
	}

	public void setTrainingParticipants1(List<TrainingParticipant> trainingParticipants1) {
		this.trainingParticipants1 = trainingParticipants1;
	}

	public TrainingParticipant addTrainingParticipants1(TrainingParticipant trainingParticipants1) {
		getTrainingParticipants1().add(trainingParticipants1);
		trainingParticipants1.setUseraccount1(this);

		return trainingParticipants1;
	}

	public TrainingParticipant removeTrainingParticipants1(TrainingParticipant trainingParticipants1) {
		getTrainingParticipants1().remove(trainingParticipants1);
		trainingParticipants1.setUseraccount1(null);

		return trainingParticipants1;
	}

	public List<TrainingParticipant> getTrainingParticipants2() {
		return this.trainingParticipants2;
	}

	public void setTrainingParticipants2(List<TrainingParticipant> trainingParticipants2) {
		this.trainingParticipants2 = trainingParticipants2;
	}

	public TrainingParticipant addTrainingParticipants2(TrainingParticipant trainingParticipants2) {
		getTrainingParticipants2().add(trainingParticipants2);
		trainingParticipants2.setUseraccount2(this);

		return trainingParticipants2;
	}

	public TrainingParticipant removeTrainingParticipants2(TrainingParticipant trainingParticipants2) {
		getTrainingParticipants2().remove(trainingParticipants2);
		trainingParticipants2.setUseraccount2(null);

		return trainingParticipants2;
	}

	public Businessunit getBusinessunit() {
		return this.businessunit;
	}

	public void setBusinessunit(Businessunit businessunit) {
		this.businessunit = businessunit;
	}

}