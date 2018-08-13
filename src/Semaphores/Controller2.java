package Semaphores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shan Lee Kim
 */

import Locks.*;
import java.util.*;

public class Controller2 {
    private Caltrain2 cal;
    private MainView2 view;
    
    public Controller2(){
        cal = new Caltrain2();
        view = new MainView2(this);
        
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
    
    public ArrayList<Station2> retrieveStations(){
      return cal.getStations();
    }
}

