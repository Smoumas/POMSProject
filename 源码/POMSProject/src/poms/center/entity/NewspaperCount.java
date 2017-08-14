package poms.center.entity;

public class NewspaperCount {
	
	private String  stationName;
	private String newspaperName;
	private int sum;


	public String getStationID() {
		return stationName;
	}

	public void setStationID(String stationID) {
		this.stationName = stationID;
	}

	public String getNewspaperID() {
		return newspaperName;
	}

	public void setNewspaperID(String newspaperID) {
		this.newspaperName = newspaperID;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
}
