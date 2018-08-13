package Semaphores;

import java.util.*;
import java.util.concurrent.Semaphore;

public class Station2{
	private int stationID;
	private Train2 current_train;
	private ArrayList<Passenger2> passengers;
	private Semaphore semaphore = new Semaphore(1);
        
	public Station2(int id) {
		// TODO Auto-generated constructor stub
		stationID = id;
                passengers = new ArrayList<Passenger2>();
	}
	
	public boolean hasTrain() {
		if(current_train != null) {
			return true;
		}
		return false;
	}
	
	public void addPassenger(Passenger2 p) {
		passengers.add(p);
	}
	
	public void removePassenger(Passenger2 p) {
		passengers.remove(p);
	}
	
	public void addTrain(Train2 t) {
		current_train = t;
	}
	
	public void removeTrain() {
		current_train = null;
	}
	
	public Train2 getTrain() {
		return current_train;
	}
	
	public int getID() {
		return stationID;
	}
	
	public ArrayList<Passenger2> getPassengers(){
		return passengers;
	}
}
