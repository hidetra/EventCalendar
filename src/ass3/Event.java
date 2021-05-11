package ass3;

import java.time.LocalTime;

public class Event {

	private String eventName;
	private LocalTime startTime;
	private LocalTime endTime;
	public Event(String eventName, LocalTime startTime, LocalTime endTime) {
		super();
		this.eventName = eventName;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	
	public boolean isOverlap(Event e) {
		if (e.getEndTime().isAfter(this.startTime) || e.getStartTime().isBefore(this.endTime))
			return true;
		else 
			return false;
		
	}
}
