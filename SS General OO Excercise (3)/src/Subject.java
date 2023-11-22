
public class Subject implements Delivery{

	private String name;
	private String description;
	private String tutor;
	private String room;

	
	public int getCredit(int credit) {
		return credit;
	}
	public String getName(String name) {
		return name; 
	}
	public String getDescription(String description) {
		return description;
	}
	public Subject(String name, String description){
		
		
	}
	
	// overriding the interfaces methods...
	
	public String getTutor() {
		return tutor;
	}
	public String getRoom() {
		return room;
	}                                         // Getter methods
	@Override
	public void setTutor(String tutor) {
		// TODO Auto-generated method stub
		
		this.tutor = tutor;
	}
	@Override
	public void setRoom(String room) {
		// TODO Auto-generated method stub
		
		 this.room = room;
	}                                         // Setter methods
}
