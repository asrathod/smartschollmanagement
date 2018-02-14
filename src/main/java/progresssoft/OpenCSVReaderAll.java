package progresssoft;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*import com.opencsv.CSVReader;

public class OpenCSVReaderAll {
	
	public static void main(String[] args) throws IOException {
		CSVReader reader = new CSVReader(new FileReader("D:\\Progress_Soft_Poject_Space\\emp.csv"), ',');
		
		List<EmployeeCsv> emps = new ArrayList<EmployeeCsv>();
		List<String[]> records = reader.readAll();
		Iterator<String[]> iterator = records.iterator();
		
		while(iterator.hasNext()){
			String[] record = iterator.next();
			EmployeeCsv employeeCsv = new EmployeeCsv();
			employeeCsv.setId(record[0]);
			employeeCsv.setName(record[1]);
			employeeCsv.setAge(record[2]);
			employeeCsv.setCountry(record[3]);
			emps.add(employeeCsv);
		}
		
		System.out.println(emps);
		reader.close();
	}

}
*/