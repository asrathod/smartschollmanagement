package progresssoft;

public class FileImportedBean {

	private long id;
	private String fileName;
	
	// Constructor
	public FileImportedBean() {
		
	}
	// Parameterized Constructor
	public FileImportedBean(long id) {
		this.id = id;
	}
	
	// Getters and Setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}
