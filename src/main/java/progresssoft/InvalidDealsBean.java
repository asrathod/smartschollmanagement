package progresssoft;

import java.util.Date;

public class InvalidDealsBean {

	private long id;
	private String fromCurrecncy;
	private String toCurrecncy;
	private String amount;
	private String fileName;
	private Date date;
	private String reason;
	
	// Constructor
	public InvalidDealsBean() {
	
	}
	// Parameterized Constructor
	public InvalidDealsBean(long id) {
		this.id = id;
	}
	
	// Getters and Setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFromCurrecncy() {
		return fromCurrecncy;
	}
	public void setFromCurrecncy(String fromCurrecncy) {
		this.fromCurrecncy = fromCurrecncy;
	}
	public String getToCurrecncy() {
		return toCurrecncy;
	}
	public void setToCurrecncy(String toCurrecncy) {
		this.toCurrecncy = toCurrecncy;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
}
