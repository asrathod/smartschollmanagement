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
@Table(name="from_accumulative_count")
public class FromAccumulativeCount {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="iso_currency_code")
	private IsoCurrecncyCode isoCurrencyCode;
	
	@Column(name ="count")
	private int count;

	public FromAccumulativeCount() {
		
	}

	public FromAccumulativeCount(long id) {
		super();
		this.id = id;
	}

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
