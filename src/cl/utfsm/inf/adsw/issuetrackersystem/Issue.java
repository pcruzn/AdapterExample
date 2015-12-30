package cl.utfsm.inf.adsw.issuetrackersystem;

public class Issue {
	private String openDate;
	private String closeDate;
	
	// when "subclassed", the adapter will be an Issue with openDate and closeDate
	// corresponding to the equivalent values from a ticket
	public Issue (String openDate, String closeDate) {
		this.openDate = openDate;
		this.closeDate = closeDate;
	}
	
	// getters and setters...
	public String getOpenDate() {
		return openDate;
	}
	
	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}
	
	public String getCloseDate() {
		return closeDate;
	}
	
	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}
}
