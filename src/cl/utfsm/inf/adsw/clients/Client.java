/**
 * author: Pablo Cruz Navea
 */
package cl.utfsm.inf.adsw.clients;

import cl.utfsm.inf.adsw.adapter.TicketAdapter;
import cl.utfsm.inf.adsw.tickettrackingsystem.Ticket;

// this client needs to get the open date and close date from a ticket
// the problem is that the ticket tracking system understands tickets with
// start date and end date, but as we know these values are equivalent,
// we can "adapt" these values (allowing this client to work with tickets)
public class Client {
	public static void main(String[] args) {
		// the ticket is created here, but it can arrive to the client in several ways
		// the important aspect here is that this client does not know exactly how to get the open date
		// and the close date of a ticket ...
		Ticket ticket = new Ticket ("20-12-2015", "24-12-2015");
		
		// ... but our client knows that an adapter exists
		// and make use of it by passing it the ticket
		TicketAdapter ticketAdapter = new TicketAdapter (ticket);
		
		// then finally our client requests the open date and close date from the adapter
		// (the client does not even know which methods apply to a "ticket"
		System.out.println("Issue opened on: " + ticketAdapter.getOpenDate());
		System.out.println("Issue closed on: " + ticketAdapter.getCloseDate());

		// and what about adapting message data/format?
	}
}
