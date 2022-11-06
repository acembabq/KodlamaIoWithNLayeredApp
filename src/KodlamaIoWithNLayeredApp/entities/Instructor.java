package KodlamaIoWithNLayeredApp.entities;

public class Instructor {
	private int instrctrId;
	private String instrctrName;
	private String instrctrDescription;

	public Instructor(int instrctrId, String instrctrName, String instrctrDescription) {
		super();
		this.instrctrId = instrctrId;
		this.instrctrName = instrctrName;
		this.instrctrDescription = instrctrDescription;
	}

	public int getInstrctrId() {
		return instrctrId;
	}

	public void setInstrctrId(int instrctrId) {
		this.instrctrId = instrctrId;
	}

	public String getInstrctrName() {
		return instrctrName;
	}

	public void setInstrctrName(String instrctrName) {
		this.instrctrName = instrctrName;
	}

	public String getInstrctrDescription() {
		return instrctrDescription;
	}

	public void setInstrctrDescription(String instrctrDescription) {
		this.instrctrDescription = instrctrDescription;
	}

}
