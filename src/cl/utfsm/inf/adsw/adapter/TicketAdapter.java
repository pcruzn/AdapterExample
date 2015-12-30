package cl.utfsm.inf.adsw.adapter;

import cl.utfsm.inf.adsw.issuetrackersystem.Issue;
import cl.utfsm.inf.adsw.tickettrackingsystem.Ticket;

public class TicketAdapter extends Issue {
	// the adapter extends the class we are adapting to
	public TicketAdapter(Ticket ticket) {
		// this is the adaptation step
		// here the adapter is actually "being" an Issue with 
		// openDate = ticket.getStartDate() and
		// closeDate = ticket.getEndDate()
		// (see the Issue class)
		super(ticket.getStartDate(), ticket.getEndDate());
	}
}
