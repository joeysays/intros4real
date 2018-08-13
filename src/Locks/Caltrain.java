package Locks;

import java.util.*;

//Model
public class Caltrain {
	private static ArrayList<Station> stations;
	private ArrayList<Train> trains;
	private static int trainID=0;
	private static int passID=0;
	private MainView view;
        
	public Caltrain() {
		// TODO Auto-generated constructor stub
                stations = new ArrayList<>();
                trains = new ArrayList<>();
                station_init();
	}
	
	public static void station_init() { //initialize the stations
		for(int i = 1; i<= 8; i++) {
			Station s = new Station(i);
			stations.add(s);
		}
	}
	
	public void addTrain(int count) {
		if(trainID < 16) {
			trainID++;
			Train t = new Train(trainID, count, stations, view);
                        trains.add(t);
                        t.start();
			System.out.println("Train " + trainID + " spawned with " + count + " seats!");
		} else {
			System.out.println("There are already 16 trains running.");
		}
	}
	
	public boolean addPassenger(int spawn, int destination) {
		if(spawn != destination) {
			passID++;
			Passenger p = new Passenger(passID, spawn, destination, stations, view);
                        
                        
			for(int i=0; i< stations.size(); i++) {
				if(stations.get(i).getID() == spawn) {
					stations.get(i).addPassenger(p);
					System.out.println("Passenger " + passID + " is waiting at Station " + stations.get(i).getID() + " and wants to go to Station " + destination + ".");
                                        view.appendLog(java.time.LocalTime.now() + ": Passenger " + getStations().get(spawn-1).getPassengers().get(getStations().get(spawn-1).getPassengers().size()-1).getID() + " has been deployed and wants to go to Station " + destination + "\n");
                                        if(spawn == 1)
                                            view.getPassengerTable1().addRow(new Object[]{("Passenger" + getStations().get(spawn-1).getPassengers().get(getStations().get(spawn-1).getPassengers().size()-1).getID())});
                                        else if(spawn == 2)
                                            view.getPassengerTable2().addRow(new Object[]{("Passenger" + getStations().get(spawn-1).getPassengers().get(getStations().get(spawn-1).getPassengers().size()-1).getID())});
                                        else if(spawn == 3)
                                            view.getPassengerTable3().addRow(new Object[]{("Passenger" + getStations().get(spawn-1).getPassengers().get(getStations().get(spawn-1).getPassengers().size()-1).getID())});
                                        else if(spawn == 4)
                                            view.getPassengerTable4().addRow(new Object[]{("Passenger" + getStations().get(spawn-1).getPassengers().get(getStations().get(spawn-1).getPassengers().size()-1).getID())});
                                        else if(spawn == 5)
                                            view.getPassengerTable5().addRow(new Object[]{("Passenger" + getStations().get(spawn-1).getPassengers().get(getStations().get(spawn-1).getPassengers().size()-1).getID())});
                                        else if(spawn == 6)
                                            view.getPassengerTable6().addRow(new Object[]{("Passenger" + getStations().get(spawn-1).getPassengers().get(getStations().get(spawn-1).getPassengers().size()-1).getID())});
                                        else if(spawn == 7)
                                            view.getPassengerTable7().addRow(new Object[]{("Passenger" + getStations().get(spawn-1).getPassengers().get(getStations().get(spawn-1).getPassengers().size()-1).getID())});
                                        else if(spawn == 8)
                                            view.getPassengerTable8().addRow(new Object[]{("Passenger" + getStations().get(spawn-1).getPassengers().get(getStations().get(spawn-1).getPassengers().size()-1).getID())});

                                        p.start();
                                        return true;
                                }
			}
		}
                
                return false;
	}
        
        public ArrayList<Station> getStations(){
            return stations;
        }
        
        public ArrayList<Train> getTrains(){
           return trains;
        } 
        
        public void setView(MainView v){
            view = v;
        }
}
