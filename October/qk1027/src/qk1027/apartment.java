package qk1027;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="apartment")
@Entity
public class apartment {

	@Id
	@Column(name="id")
	private int id;
	@Column(name="building")
	private int building;
	@Column(name="floor")
	private int floor;
	@Column(name="room")
	private int room;
	@Column(name="bed")
	private int bed;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBuilding() {
		return building;
	}
	public void setBuilding(int building) {
		this.building = building;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public int getBed() {
		return bed;
	}
	public void setBed(int bed) {
		this.bed = bed;
	}
	
	
	@Override
	public String toString() {
		
		return "[id="+id+",building="+building+",floor="+floor+",room="+room+",bed="+bed+"]";
	}
	
}
