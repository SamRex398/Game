package Game;

public class Reservation {
	public String TicketID = "AD23F5Y73";
	
	public void ShowTicket() {
		System.out.println(TicketID);
	}

	public static void main(String[] args) {
		
		Reservation RSV = new Reservation();
		 
		RSV.ShowTicket();

	}

}
