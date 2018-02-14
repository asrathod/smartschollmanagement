package progresssoft;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="invalid_deal")
public class InvalidDeals {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="id")
	private long id;
	
	@Column(name ="from_currency")
	private String fromCurrecncy;
	
	@Column(name ="to_currency")
	private String toCurrecncy;
	
	@Column(name ="amount")
	private String amount;
	
	@Column(name ="file_name")
	private String fileName;
	
	@Column(name ="date")
	private Date date;
	
	@Column(name ="reason")
	private String reason;

	// Constructor
	public InvalidDeals() {
		
	}
	// Parameterized Constructor
	public InvalidDeals(long id) {
		super();
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
