package progresssoft;

public class IsoCurrecncyCodeBean {

	private long id;
	private String nation;
	private String currencyCode;
	
	// Constructor
	public IsoCurrecncyCodeBean() {
	
	}
	// Parameterized Constructor
	public IsoCurrecncyCodeBean(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

}
