package Locks;

import java.awt.Image;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
        
public class Train implements Runnable{
	private int trainID;
	private int seats; //max capacity
	private int currentStation; // 0 if just spawned/is in between stations
	private int prevStation; // 0 if just spawned
	private ArrayList<Passenger> passengers;
    private ArrayList<Station> stations;
    private Thread t;
    private ReentrantLock lock = new ReentrantLock();
    private MainView view;
    private Image icon = new ImageIcon("res/train2.png").getImage();
    private TableCellRenderer renderer;
	
	public Train(int id, int c, ArrayList<Station> s, MainView v) {
		// TODO Auto-generated constructor stub
		trainID = id;
		seats = c;
		prevStation = 0; //spawned
		currentStation = 0; //not in any station
        stations = s;
        passengers = new ArrayList<>(c);
        view = v;
        renderer = new TableCellRenderer();
	}

	public void station_load_train(Station s, int count) { //invokes when train has arrived at a station
		//wont return until train is full or all passengers at the station are already on board.
		
	}
        
        public void proceed_next_station(){
                if(currentStation == 0){
                    if(prevStation == 0){ //if the train just spawned
                        if(!stations.get(0).hasTrain()){ //if Station1 doesnt have a train
                            view.appendLog(java.time.LocalTime.now() + ": Train " + trainID + " has arrived at Station 1\n");
                            stations.get(0).addTrain(this);
                            
                        //    station_load_train(stations.get(prevStation), seats-passengers.size());
                            currentStation = 1;
                            prevStation = 1;
                            view.getTrainTable1().addRow(new Object[]{("Train ") + trainID});
                            view.getTrainTable1JTable().getColumnModel().getColumn(0).setCellRenderer(renderer);
                            view.getTrainTable1JTable().setRowHeight(20);
                        } else{
                            try{
                                TimeUnit.SECONDS.sleep(3);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                        }
                    } else if(prevStation > 0 && prevStation != 8){
                        if(!stations.get(prevStation).hasTrain()){
                            stations.get(prevStation).addTrain(this);
                        //    station_load_train(stations.get(prevStation), seats-passengers.size());
                            currentStation = prevStation + 1;
                            prevStation = currentStation;
                            view.appendLog(java.time.LocalTime.now() + ": Train " + trainID + " has arrived at Station "+ currentStation + "\n");
                            
                            if(currentStation == 2){
                                //view.getTrainTable1().removeRow(0);
                                for(int i = view.getTrainTable1().getRowCount()-1; i >= 0; i--){
                                    view.getTrainTable1().removeRow(i);
                                }
                                
                                view.getTrainTable2().addRow(new Object[]{("Train ") + trainID});
//                              view.getTrainTable2().setValueAt(icon, 0, 0);
                                view.getTrainTable2JTable().getColumnModel().getColumn(0).setCellRenderer(renderer);
                                view.getTrainTable2JTable().setRowHeight(20);
                                
                                for(int i = 0; i < passengers.size(); i++){
                                    view.getTrainTable2().addRow(new Object[]{("Passenger" + passengers.get(i).getID())});
                                    
                                }
                            }
                            if(currentStation == 3){
                                for(int i = view.getTrainTable2().getRowCount()-1; i >= 0; i--){
                                    view.getTrainTable2().removeRow(i);
                                }
                                
                                view.getTrainTable3().addRow(new Object[]{("Train ") + trainID});
                                view.getTrainTable3JTable().getColumnModel().getColumn(0).setCellRenderer(renderer);
                                view.getTrainTable3JTable().setRowHeight(20);
                                
                                for(int i = 0; i < passengers.size(); i++){
                                    view.getTrainTable3().addRow(new Object[]{("Passenger" + passengers.get(i).getID())});
                                }
                            }
                            if(currentStation == 4){
                                for(int i = view.getTrainTable3().getRowCount()-1; i >= 0; i--){
                                    view.getTrainTable3().removeRow(i);
                                }
                                
                                view.getTrainTable4().addRow(new Object[]{("Train ") + trainID});
                                view.getTrainTable4JTable().getColumnModel().getColumn(0).setCellRenderer(renderer);
                                view.getTrainTable4JTable().setRowHeight(20);
                                
                                for(int i = 0; i < passengers.size(); i++){
                                    view.getTrainTable4().addRow(new Object[]{("Passenger" + passengers.get(i).getID())});
                                }
                            }
                            if(currentStation == 5){
                                for(int i = view.getTrainTable4().getRowCount()-1; i >= 0; i--){
                                    view.getTrainTable4().removeRow(i);
                                }
                                
                                view.getTrainTable5().addRow(new Object[]{("Train ") + trainID});
                                view.getTrainTable5JTable().getColumnModel().getColumn(0).setCellRenderer(renderer);
                                view.getTrainTable5JTable().setRowHeight(20);
                                
                                for(int i = 0; i < passengers.size(); i++){
                                    view.getTrainTable5().addRow(new Object[]{("Passenger" + passengers.get(i).getID())});
                                }
                            }
                            if(currentStation == 6){
                                for(int i = view.getTrainTable5().getRowCount()-1; i >= 0; i--){
                                    view.getTrainTable5().removeRow(i);
                                }
                                
                                view.getTrainTable6().addRow(new Object[]{("Train ") + trainID});
                                view.getTrainTable6JTable().getColumnModel().getColumn(0).setCellRenderer(renderer);
                                view.getTrainTable6JTable().setRowHeight(20);
                                
                                for(int i = 0; i < passengers.size(); i++){
                                    view.getTrainTable6().addRow(new Object[]{("Passenger" + passengers.get(i).getID())});
                                }
                            }
                            if(currentStation == 7){
                                for(int i = view.getTrainTable6().getRowCount()-1; i >= 0; i--){
                                    view.getTrainTable6().removeRow(i);
                                }
                                
                                view.getTrainTable7().addRow(new Object[]{("Train ") + trainID});
                                view.getTrainTable7JTable().getColumnModel().getColumn(0).setCellRenderer(renderer);
                                view.getTrainTable7JTable().setRowHeight(20);
                                
                                for(int i = 0; i < passengers.size(); i++){
                                    view.getTrainTable7().addRow(new Object[]{("Passenger" + passengers.get(i).getID())});
                                }
                            }
                            if(currentStation == 8){
                                for(int i = view.getTrainTable7().getRowCount()-1; i >= 0; i--){
                                    view.getTrainTable7().removeRow(i);
                                    
                                }
                                
                                view.getTrainTable8().addRow(new Object[]{("Train ") + trainID});
                                view.getTrainTable8JTable().getColumnModel().getColumn(0).setCellRenderer(renderer);
                                view.getTrainTable8JTable().setRowHeight(20);
                                
                                for(int i = 0; i < passengers.size(); i++){
                                    view.getTrainTable8().addRow(new Object[]{("Passenger" + passengers.get(i).getID())});
                                }
                            }
                        } else{
                            try{
                                TimeUnit.SECONDS.sleep(3);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }
                        }
                    } else if (prevStation+1 > 8){
                        if(!stations.get(0).hasTrain()){ //if Station1 doesnt have a train
                                view.appendLog(java.time.LocalTime.now() + ": Train " + trainID + " has arrived at Station 1\n");
                                stations.get(0).addTrain(this);
                        //    station_load_train(stations.get(prevStation), seats-passengers.size());
                                currentStation = 1;
                                prevStation = 1;  
                                if(currentStation == 1){
                                    //view.getTrainTable1().removeRow(0);
                                    for(int i = view.getTrainTable8().getRowCount()-1; i >= 0; i--){
                                        view.getTrainTable8().removeRow(i);
                                    }

                                    view.getTrainTable1().addRow(new Object[]{("Train ") + trainID});
    //                              view.getTrainTable2().setValueAt(icon, 0, 0);
                                    view.getTrainTable1JTable().getColumnModel().getColumn(0).setCellRenderer(renderer);
                                    view.getTrainTable1JTable().setRowHeight(20);

                                    for(int i = 0; i < passengers.size(); i++){
                                        view.getTrainTable1().addRow(new Object[]{("Passenger" + passengers.get(i).getID())});

                                    }
                                }
                            }
                        else{
                        }

                    }
                } else if (currentStation > 0){
                    if(passengers.size() == seats) { //if train is full
			//leave station
                        stations.get(currentStation-1).removeTrain();
                        currentStation = 0;
                    }else if(stations.get(currentStation-1).getPassengers().isEmpty()) { //no more waiting people at station
			//leave station
                        stations.get(currentStation-1).removeTrain();
                        currentStation = 0;
                    }else if(passengers.size() < seats && stations.get(currentStation-1).getPassengers().size() > 0) {
			//continue accepting passengers
                    }
                }
        }
        
        public void check_leaving_passengers() throws InterruptedException{
            for(int i = 0; i< passengers.size(); i++){
                if(passengers.get(i).getDestination() == currentStation){
                    view.appendLog(java.time.LocalTime.now() + ": Passenger " + passengers.get(i).getID() + " got off at Station " + currentStation + "\n");
                    String temp = "Passenger" + passengers.get(i).getID();
                    System.out.println(temp);
                    
                    if(currentStation == 1){
                        for(int j = 1; j < view.getTrainTable1().getRowCount(); j++){
                             if (((String)view.getTrainTable1().getValueAt(j, 0)).equals(temp)) {
                                view.getTrainTable1().removeRow(j);
                                view.getPassengerTable1().addRow(new Object[]{("Passenger" + passengers.get(0).getID())});
                                view.getPassTable1JTable().getColumnModel().getColumn(0).setCellRenderer(renderer);
                                Thread.sleep(500);
                                view.getPassengerTable1().removeRow(0);
                                break;
                            }
                             view.getPassengerTable1().removeRow(0);
                        }
                    }
                    
                    else if(currentStation == 2){
                        for(int j = 0; j < view.getTrainTable2().getRowCount(); j++){
                             if (((String)view.getTrainTable2().getValueAt(j, 0)).equals(temp)) {
                                view.getTrainTable2().removeRow(j);
                                view.getPassengerTable2().addRow(new Object[]{("Passenger" + passengers.get(0).getID())});
                                view.getPassTable2JTable().getColumnModel().getColumn(0).setCellRenderer(renderer);
                            //    view.getPassengerTable2().removeRow(0);
                                Thread.sleep(500);
                                view.getPassengerTable2().removeRow(0);
                                break;
                            }
                            
                        }
                    }
                    
                    else if(currentStation == 3){
                        for(int j = 1; j < view.getTrainTable3().getRowCount(); j++){
                            if (((String)view.getTrainTable3().getValueAt(j, 0)).equals(temp)) {
                                view.getTrainTable3().removeRow(j);
                                view.getPassengerTable3().addRow(new Object[]{("Passenger" + passengers.get(0).getID())});
                                view.getPassTable3JTable().getColumnModel().getColumn(0).setCellRenderer(renderer);
                                Thread.sleep(500);
                                view.getPassengerTable3().removeRow(0);
                                break;
                            }
                        }
                    }
                    
                    else if(currentStation == 4){
                        for(int j = 1; j < view.getTrainTable4().getRowCount(); j++){
                            if (((String)view.getTrainTable4().getValueAt(j, 0)).equals(temp)) {
                                view.getTrainTable4().removeRow(j);
                                view.getPassengerTable4().addRow(new Object[]{("Passenger" + passengers.get(0).getID())});
                                view.getPassTable4JTable().getColumnModel().getColumn(0).setCellRenderer(renderer);
                                Thread.sleep(500);
                                view.getPassengerTable4().removeRow(0);
                                break;
                            }
                        }
                    }
                    
                    else if(currentStation == 5){
                        for(int j = 1; j < view.getTrainTable5().getRowCount(); j++){
                            if (((String)view.getTrainTable5().getValueAt(j, 0)).equals(temp)) {
                                view.getTrainTable5().removeRow(j);
                                view.getPassengerTable5().addRow(new Object[]{("Passenger" + passengers.get(0).getID())});
                                view.getPassTable5JTable().getColumnModel().getColumn(0).setCellRenderer(renderer);
                                Thread.sleep(500);
                                view.getPassengerTable5().removeRow(0);
                                break;
                            }
                        }
                    }
                    
                    else if(currentStation == 6){
                        for(int j = 1; j < view.getTrainTable6().getRowCount(); j++){
                            if (((String)view.getTrainTable6().getValueAt(j, 0)).equals(temp)) {
                                view.getTrainTable6().removeRow(j);
                                view.getPassengerTable6().addRow(new Object[]{("Passenger" + passengers.get(0).getID())});
                                view.getPassTable6JTable().getColumnModel().getColumn(0).setCellRenderer(renderer);
                                Thread.sleep(500);
                                view.getPassengerTable6().removeRow(0);
                                break;
                            }
                        }
                    }
                    
                    else if(currentStation == 7){
                        for(int j = 1; j < view.getTrainTable7().getRowCount(); j++){
                            if (((String)view.getTrainTable7().getValueAt(j, 0)).equals(temp)) {
                                view.getTrainTable7().removeRow(j);
                                view.getPassengerTable7().addRow(new Object[]{("Passenger" + passengers.get(0).getID())});
                                view.getPassTable7JTable().getColumnModel().getColumn(0).setCellRenderer(renderer);
                                Thread.sleep(500);
                                view.getPassengerTable7().removeRow(0);
                                break;
                            }
                        }
                    }
                    
                    else if(currentStation == 8){
                        for(int j = 1; j < view.getTrainTable8().getRowCount(); j++){
                            if (((String)view.getTrainTable8().getValueAt(j, 0)).equals(temp)) {
                                view.getTrainTable8().removeRow(j);
                                view.getPassengerTable8().addRow(new Object[]{("Passenger" + passengers.get(0).getID())});
                                view.getPassTable8JTable().getColumnModel().getColumn(0).setCellRenderer(renderer);
                                Thread.sleep(500);
                                view.getPassengerTable8().removeRow(0);
                                break;
                            }
                        }
                    }
                    passengers.remove(i);
                    i--;
                }
            }
        }
	
	public int getID() {
		return trainID;
	}
	
	public int getSeats() {
		return seats;
	}
	
	public int getCurrentStation() {
		return currentStation;
	}
        
        public ArrayList<Passenger> getPassengers(){
            return passengers;
        }
	
        public void setCurrentStation(int n){
            currentStation = n;
        }
        
	public int getPrevStation() {
		return prevStation;
	}
        
        public void setPrevStation(int n){
            prevStation = n;
        }
	
	public void addPassenger(Passenger p) {
		passengers.add(p);
	}
	
	public void run(){
            
            while(true){
                System.out.println("Train" + trainID + " thread is running.");
            
            lock.lock();
            try{
                TimeUnit.SECONDS.sleep(1);
                check_leaving_passengers();
                proceed_next_station();
            }catch(InterruptedException e){
                e.printStackTrace();
            }finally{
                lock.unlock();
            }

            }
        }
        
        public void start(){
            if(t == null){
                t = new Thread(this, "Train" + trainID);
                System.out.println("Train" + trainID + " thread is starting");
                t.start();
            }
        }
}
    