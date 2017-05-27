package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tablejob database table.
 * 
 */
@Entity
@NamedQuery(name="Tablejob.findAll", query="SELECT t FROM Tablejob t")
public class Tablejob implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int tjid;

	//bi-directional many-to-one association to Job
	@ManyToOne
	@JoinColumn(name="fk_jobid")
	private Job job;

	//bi-directional many-to-one association to Useraccount
	@ManyToOne
	@JoinColumn(name="fk_uid")
	private Useraccount useraccount;

	public Tablejob() {
	}

	public int getTjid() {
		return this.tjid;
	}

	public void setTjid(int tjid) {
		this.tjid = tjid;
	}

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Useraccount getUseraccount() {
		return this.useraccount;
	}

	public void setUseraccount(Useraccount useraccount) {
		this.useraccount = useraccount;
	}

}