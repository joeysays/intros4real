package Semaphores;

import java.util.*;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Passenger2 implements Runnable{
	private int passID;
	private int sStation; //starting station
	private int dStation; //destination
	private Train2 tOnboard;
        private ArrayList<Station2> stations;
        private Thread t;
        //private ReentrantLock lock = new ReentrantLock();
        private Semaphore semaphore = new Semaphore(1);
        private MainView2 view;
        
	
	public Passenger2(int id, int s, int d, ArrayList<Station2> stations, MainView2 v) {
		// TODO Auto-generated constructor stub
		passID = id;
		sStation = s;
		dStation = d;
                this.stations = stations;
                view = v;
	}
	
	public void station_wait_for_train(Station2 s) {
		if(s.hasTrain() && (s.getTrain().getPassengers().size() < s.getTrain().getSeats())) { //ride that train
			tOnboard = s.getTrain();
			s.getTrain().addPassenger(this);
                        
                        if(sStation == 1){
                            view.getPassengerTable1().removeRow(0);
                            view.getTrainTable1().addRow(new Object[]{("Passenger ") + passID});
                        }
                        else if(sStation == 2){
                            view.getPassengerTable2().removeRow(0);
                            view.getTrainTable2().addRow(new Object[]{("Passenger ") + passID});
                        }
                        else if(sStation == 3){
                            view.getPassengerTable3().removeRow(0);
                            view.getTrainTable3().addRow(new Object[]{("Passenger ") + passID});
                        }
                        else if(sStation == 4){
                            view.getPassengerTable4().removeRow(0);
                            view.getTrainTable4().addRow(new Object[]{("Passenger ") + passID});
                        }
                        else if(sStation == 5){
                            view.getPassengerTable5().removeRow(0);
                            view.getTrainTable5().addRow(new Object[]{("Passenger ") + passID});
                        }
                        else if(sStation == 6){
                            view.getPassengerTable6().removeRow(0);
                            view.getTrainTable6().addRow(new Object[]{("Passenger ") + passID});
                        }
                        else if(sStation == 7){
                            view.getPassengerTable7().removeRow(0);
                            view.getTrainTable7().addRow(new Object[]{("Passenger ") + passID});
                        }
                        else if(sStation == 8){
                            view.getPassengerTable8().removeRow(0);
                            view.getTrainTable8().addRow(new Object[]{("Passenger ") + passID});
                        }
                        
                        view.appendLog(java.time.LocalTime.now() + ": Passenger " + passID + " has boarded Train " + s.getTrain().getID() + "\n");
//add this passenger to the train
			s.removePassenger(this); //remove this passenger from the station's waiting list
			station_on_board(s);
		}
		else {
			//wait
		}
	}
	
	public boolean station_on_board(Station2 s) {
		return true; //let train know you're on board
	}
	
	public int getID() {
		return passID;
	}
	
	public int getDestination() {
		return dStation;
	}
        
        public void run(){
            boolean notboarded = true;
            
            while(true){
            
            try{
                semaphore.acquire();
                TimeUnit.SECONDS.sleep(1);
                
                if(notboarded){
                station_wait_for_train(stations.get(sStation-1));
                if(tOnboard != null){
                    
                    notboarded = false;
                    
                    }
                }
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
            semaphore.release();
            
            }
            
        }
        
        public void start(){
            if(t == null){
                t = new Thread(this, "Passenger" + passID);
                System.out.println("Passenger" + passID + " thread is starting");
                t.start();
            }
        }
}
