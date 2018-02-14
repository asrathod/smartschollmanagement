package progresssoft;

public class ToAccumulativeCountBean {

	private long id;
	private String isoCurrencyCode;
	private int count;
	
	// Constructor
	public ToAccumulativeCountBean() {
		
	}
	// Parameterized Constructor
	public ToAccumulativeCountBean(long id) {
		this.id = id;
	}
	
	// Getters and Setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIsoCurrencyCode() {
		return isoCurrencyCode;
	}
	public void setIsoCurrencyCode(String isoCurrencyCode) {
		this.isoCurrencyCode = isoCurrencyCode;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
