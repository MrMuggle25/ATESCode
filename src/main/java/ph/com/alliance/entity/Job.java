package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the job database table.
 * 
 */
@Entity
@NamedQuery(name="Job.findAll", query="SELECT j FROM Job j")
public class Job implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int jobid;

	private String jobtitle;

	//bi-directional many-to-one association to Tablejob
	@OneToMany(mappedBy="job")
	private List<Tablejob> tablejobs;

	public Job() {
	}

	public int getJobid() {
		return this.jobid;
	}

	public void setJobid(int jobid) {
		this.jobid = jobid;
	}

	public String getJobtitle() {
		return this.jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public List<Tablejob> getTablejobs() {
		return this.tablejobs;
	}

	public void setTablejobs(List<Tablejob> tablejobs) {
		this.tablejobs = tablejobs;
	}

	public Tablejob addTablejob(Tablejob tablejob) {
		getTablejobs().add(tablejob);
		tablejob.setJob(this);

		return tablejob;
	}

	public Tablejob removeTablejob(Tablejob tablejob) {
		getTablejobs().remove(tablejob);
		tablejob.setJob(null);

		return tablejob;
	}

}