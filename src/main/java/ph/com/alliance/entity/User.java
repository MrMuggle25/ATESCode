package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int age;

	@Column(name="birthdate_day")
	private int birthdateDay;

	@Column(name="birthdate_month")
	private int birthdateMonth;

	@Column(name="birthdate_year")
	private int birthdateYear;

	@Column(name="contact_number")
	private String contactNumber;

	@Column(name="email_ad")
	private String emailAd;

	private String firstname;

	private String gender;

	private String lastname;

	private String password;

	@Column(name="user_type")
	private String userType;

	private String username;

	public User() {
	}

	public int getUId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBirthdateDay() {
		return this.birthdateDay;
	}

	public void setBirthdateDay(int birthdateDay) {
		this.birthdateDay = birthdateDay;
	}

	public int getBirthdateMonth() {
		return this.birthdateMonth;
	}

	public void setBirthdateMonth(int birthdateMonth) {
		this.birthdateMonth = birthdateMonth;
	}

	public int getBirthdateYear() {
		return this.birthdateYear;
	}

	public void setBirthdateYear(int birthdateYear) {
		this.birthdateYear = birthdateYear;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailAd() {
		return this.emailAd;
	}

	public void setEmailAd(String emailAd) {
		this.emailAd = emailAd;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}