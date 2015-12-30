package cl.utfsm.inf.adsw.tickettrackingsystem;

// this is the class we need to adapt
public class Ticket {
	private String startDate;
	private String endDate;
	
	public Ticket (String startDate, String endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	// getters and setters...
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
}
