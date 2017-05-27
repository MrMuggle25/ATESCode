package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the businessunit database table.
 * 
 */
@Entity
@NamedQuery(name="Businessunit.findAll", query="SELECT b FROM Businessunit b")
public class Businessunit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int buid;

	private String buname;

	//bi-directional many-to-one association to Useraccount
	@ManyToOne
	@JoinColumn(name="fk_buhead")
	private Useraccount useraccount;

	//bi-directional many-to-one association to Useraccount
	@OneToMany(mappedBy="businessunit")
	private List<Useraccount> useraccounts;

	public Businessunit() {
	}

	public int getBuid() {
		return this.buid;
	}

	public void setBuid(int buid) {
		this.buid = buid;
	}

	public String getBuname() {
		return this.buname;
	}

	public void setBuname(String buname) {
		this.buname = buname;
	}

	public Useraccount getUseraccount() {
		return this.useraccount;
	}

	public void setUseraccount(Useraccount useraccount) {
		this.useraccount = useraccount;
	}

	public List<Useraccount> getUseraccounts() {
		return this.useraccounts;
	}

	public void setUseraccounts(List<Useraccount> useraccounts) {
		this.useraccounts = useraccounts;
	}

	public Useraccount addUseraccount(Useraccount useraccount) {
		getUseraccounts().add(useraccount);
		useraccount.setBusinessunit(this);

		return useraccount;
	}

	public Useraccount removeUseraccount(Useraccount useraccount) {
		getUseraccounts().remove(useraccount);
		useraccount.setBusinessunit(null);

		return useraccount;
	}

}