package progresssoft;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="to_accumulative_count")
public class ToAccumulativeCount {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="iso_currency_code")
	private IsoCurrecncyCode isoCurrencyCode;
	
	@Column(name ="count")
	private int count;

	// Constructor
	public ToAccumulativeCount() {
		
	}
	// Parameterized Constructor
	public ToAccumulativeCount(long id) {
		this.id = id;
	}

	// Getters and Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public IsoCurrecncyCode getIsoCurrencyCode() {
		return isoCurrencyCode;
	}

	public void setIsoCurrencyCode(IsoCurrecncyCode isoCurrencyCode) {
		this.isoCurrencyCode = isoCurrencyCode;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
