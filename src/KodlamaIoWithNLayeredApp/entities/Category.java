package KodlamaIoWithNLayeredApp.entities;

public class Category {
	private int ctgryId;
	private String ctgryName;

	public Category(int ctgryId, String ctgryName) {
		super();
		this.ctgryId = ctgryId;
		this.ctgryName = ctgryName;
	}

	public int getCtgryId() {
		return ctgryId;
	}

	public void setCtgryId(int ctgryId) {
		this.ctgryId = ctgryId;
	}

	public String getCtgryName() {
		return ctgryName;
	}

	public void setCtgryName(String ctgryName) {
		this.ctgryName = ctgryName;
	}

}
