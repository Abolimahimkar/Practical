package Encapsulation_Eg;
class Movie {//encapluation class 
	//private data member
	private int Movie;
	private String Start ,End ;
	private float Ticket;
	public int getMovie() {
		return Movie;
	}
	public void setMovie(int movie) {
		Movie = movie;
	}
	public String getStart() {
		return Start;
	}
	public void setStart(String start) {
		Start = start;
	}
	public String getEnd() {
		return End;
	}
	public void setEnd(String end) {
		End = end;
	}
	public float getTicket() {
		return Ticket;
	}
	public void setTicket(float ticket) {
		Ticket = ticket;
	}
	//public getter & setter method
	
}
	


public class Theater {//class to test the encryption
 public static void main(String args[]) {
	Movie m= new Movie();//creating object of setter
	 //setting the value through setter method
	m.setMovie("KGF2");
	m.setEnd(3.00);
	m.setStart(1.00);
	m.setTicket(250);
	
	System.out.println(m.getMovie()+" "+m.getStart()+" "+m.getEnd()+" "+m.getTicket());
 }

	

	}


