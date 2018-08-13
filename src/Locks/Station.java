package Locks;

import java.util.*;

public class Station{
	private int stationID;
	private Train current_train;
	private ArrayList<Passenger> passengers;
	
	public Station(int id) {
		// TODO Auto-generated constructor stub
		stationID = id;
                passengers = new ArrayList<Passenger>();
	}
	
	public boolean hasTrain() {
		if(current_train != null) {
			return true;
		}
		return false;
	}
	
	public void addPassenger(Passenger p) {
		passengers.add(p);
	}
	
	public void removePassenger(Passenger p) {
		passengers.remove(p);
	}
	
	public void addTrain(Train t) {
		current_train = t;
	}
	
	public void removeTrain() {
		current_train = null;
	}
	
	public Train getTrain() {
		return current_train;
	}
	
	public int getID() {
		return stationID;
	}
	
	public ArrayList<Passenger> getPassengers(){
		return passengers;
	}
}
