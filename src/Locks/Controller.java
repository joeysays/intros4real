package Locks;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Belle
 */

import java.util.*;

public class Controller {
    private Caltrain cal;
    private MainView view;
    
    public Controller(){
        cal = new Caltrain();
        view = new MainView(this);
        
        cal.setView(view);
    }
    
    public void addTrain(int c){
        cal.addTrain(c);
        view.appendLog(java.time.LocalTime.now() + ": Train " + cal.getTrains().get(cal.getTrains().size()-1).getID() + " has been deployed.\n");
        
    }
    
    public boolean addPassenger(int s, int d){
        boolean temp = cal.addPassenger(s, d);
        
        return temp;
    }
    
    public ArrayList<Station> retrieveStations(){
      return cal.getStations();
    }
}

