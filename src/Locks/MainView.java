package Locks;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joshd
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
public class MainView extends javax.swing.JFrame{
    
    private Controller c;
  
    
    /**
     * Creates new form MainView
     */
    public MainView(Controller c) {
        this.c = c;
        initComponents();
        initDefaultValues();
        setVisible(true);
        
       
    }
    
    public void initDefaultValues(){
        int i;
        passengerIdTxt.setText("1");
        trainIdTxt.setText("1");

    
        for(i = 1; i <= c.retrieveStations().size(); i++){
            arrivalCmb.addItem(Integer.toString(i));
            departureCmb.addItem(Integer.toString(i));
        }
        
    }
    
    public void appendLog(String s){
        caltrainLog.append(s);
    }
    
    public JTable getPassTable1JTable() {
    	return passengersTable1;
    }
    
    public JTable getPassTable2JTable() {
    	return passengersTable2;
    }
    
    public JTable getPassTable3JTable() {
    	return passengersTable3;
    }
    
    public JTable getPassTable4JTable() {
    	return passengersTable4;
    }
    
    public JTable getPassTable5JTable() {
    	return passengersTable5;
    }
    
    public JTable getPassTable6JTable() {
    	return passengersTable6;
    }
    
    public JTable getPassTable7JTable() {
    	return passengersTable7;
    }
    
    public JTable getPassTable8JTable() {
    	return passengersTable8;
    }
    
    public JTable getTrainTable1JTable() {
    	return trainTable1;
    }
    
    public JTable getTrainTable2JTable() {
    	return trainTable2;
    }
    
    public JTable getTrainTable3JTable() {
    	return trainTable3;
    }
    
    public JTable getTrainTable4JTable() {
    	return trainTable4;
    }
    
    public JTable getTrainTable5JTable() {
    	return trainTable5;
    }
    
    public JTable getTrainTable6JTable() {
    	return trainTable6;
    }
    
    public JTable getTrainTable7JTable() {
    	return trainTable7;
    }
    
    public JTable getTrainTable8JTable() {
    	return trainTable8;
    }
    
    
    public DefaultTableModel getPassengerTable1(){
        DefaultTableModel model = (DefaultTableModel)passengersTable1.getModel();
        return model;
    }
    public DefaultTableModel getPassengerTable2(){
        DefaultTableModel model = (DefaultTableModel)passengersTable2.getModel();
        return model;
    }
    public DefaultTableModel getPassengerTable3(){
        DefaultTableModel model = (DefaultTableModel)passengersTable3.getModel();
        return model;
    }
    public DefaultTableModel getPassengerTable4(){
        DefaultTableModel model = (DefaultTableModel)passengersTable4.getModel();
        return model;
    }
    public DefaultTableModel getPassengerTable5(){
        DefaultTableModel model = (DefaultTableModel)passengersTable5.getModel();
        return model;
    }
    public DefaultTableModel getPassengerTable6(){
        DefaultTableModel model = (DefaultTableModel)passengersTable6.getModel();
        return model;
    }
    public DefaultTableModel getPassengerTable7(){
        DefaultTableModel model = (DefaultTableModel)passengersTable7.getModel();
        return model;
    }
    public DefaultTableModel getPassengerTable8(){
        DefaultTableModel model = (DefaultTableModel)passengersTable8.getModel();
        return model;
    }
    
    
    public DefaultTableModel getTrainTable1(){
        DefaultTableModel model = (DefaultTableModel)trainTable1.getModel();
        return model;
    }
    public DefaultTableModel getTrainTable2(){
        DefaultTableModel model = (DefaultTableModel)trainTable2.getModel();
        return model;
    }
    public DefaultTableModel getTrainTable3(){
        DefaultTableModel model = (DefaultTableModel)trainTable3.getModel();
        return model;
    }
    public DefaultTableModel getTrainTable4(){
        DefaultTableModel model = (DefaultTableModel)trainTable4.getModel();
        return model;
    }
    public DefaultTableModel getTrainTable5(){
        DefaultTableModel model = (DefaultTableModel)trainTable5.getModel();
        return model;
    }
    public DefaultTableModel getTrainTable6(){
        DefaultTableModel model = (DefaultTableModel)trainTable6.getModel();
        return model;
    }
    public DefaultTableModel getTrainTable7(){
        DefaultTableModel model = (DefaultTableModel)trainTable7.getModel();
        return model;
    }
    public DefaultTableModel getTrainTable8(){
        DefaultTableModel model = (DefaultTableModel)trainTable8.getModel();
        return model;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        passengersSt4 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        trainSt3 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        passengersSt10 = new javax.swing.JTable();
        jScrollPane19 = new javax.swing.JScrollPane();
        trainSt9 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        bgpanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        addPassengerBtn = new javax.swing.JButton();
        addPassengerTitle = new javax.swing.JLabel();
        departureLbl = new javax.swing.JLabel();
        arrivalLbl = new javax.swing.JLabel();
        passengerIdLbl = new javax.swing.JLabel();
        passengerIdTxt = new javax.swing.JTextField();
        deployTrainsTitle = new javax.swing.JLabel();
        trainIdLbl = new javax.swing.JLabel();
        trainIdTxt = new javax.swing.JTextField();
        addTrainBtn = new javax.swing.JButton();
        departureCmb = new javax.swing.JComboBox<>();
        arrivalCmb = new javax.swing.JComboBox<>();
        trainSeatsLbl = new javax.swing.JLabel();
        trainSeatsTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        caltrainLog = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        trainTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        passengersTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        passengersTable2 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        trainTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        passengersTable3 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        trainTable3 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        passengersTable4 = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        trainTable4 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        passengersTable5 = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        trainTable5 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        passengersTable6 = new javax.swing.JTable();
        jScrollPane15 = new javax.swing.JScrollPane();
        trainTable6 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        passengersTable7 = new javax.swing.JTable();
        jScrollPane17 = new javax.swing.JScrollPane();
        trainTable7 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        passengersTable8 = new javax.swing.JTable();
        jScrollPane21 = new javax.swing.JScrollPane();
        trainTable8 = new javax.swing.JTable();

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel5.setText("Station 1");

        passengersSt4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(passengersSt4);

        trainSt3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(trainSt3);

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel6.setText("Current Train");

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel17.setText("Station 6");

        passengersSt10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane18.setViewportView(passengersSt10);

        trainSt9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane19.setViewportView(trainSt9);

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel18.setText("Current Train");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.LIGHT_GRAY);

        bgpanel.setBackground(Color.LIGHT_GRAY);
        bgpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        menuPanel.setBackground(new java.awt.Color(158, 255, 239));
        menuPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        menuPanel.setOpaque(false);

        addPassengerBtn.setText("Add");
        addPassengerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPassengerBtnActionPerformed(evt);
            }
        });

        addPassengerTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        addPassengerTitle.setText("Add Passengers");

        departureLbl.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        departureLbl.setText("Departure Station");

        arrivalLbl.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        arrivalLbl.setText("Arrival Station");

        passengerIdLbl.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        passengerIdLbl.setText("Passenger ID");

        passengerIdTxt.setEditable(false);
        passengerIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passengerIdTxtActionPerformed(evt);
            }
        });

        deployTrainsTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        deployTrainsTitle.setText("Deploy Trains");

        trainIdLbl.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        trainIdLbl.setText("Train ID");

        trainIdTxt.setEditable(false);

        addTrainBtn.setText("Deploy");
        addTrainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTrainBtnActionPerformed(evt);
            }
        });

        departureCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        arrivalCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        trainSeatsLbl.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        trainSeatsLbl.setText("Seat Capacity");

        caltrainLog.setEditable(false);
        caltrainLog.setColumns(20);
        caltrainLog.setLineWrap(true);
        caltrainLog.setRows(5);
        caltrainLog.setWrapStyleWord(true);
        jScrollPane1.setViewportView(caltrainLog);

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanelLayout.setHorizontalGroup(
        	menuPanelLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(menuPanelLayout.createSequentialGroup()
        			.addGroup(menuPanelLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(menuPanelLayout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(addTrainBtn))
        				.addGroup(menuPanelLayout.createParallelGroup(Alignment.TRAILING)
        					.addGroup(menuPanelLayout.createSequentialGroup()
        						.addGap(0, 215, Short.MAX_VALUE)
        						.addComponent(addPassengerBtn, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
        					.addGroup(menuPanelLayout.createSequentialGroup()
        						.addGap(31)
        						.addGroup(menuPanelLayout.createParallelGroup(Alignment.LEADING)
        							.addGroup(menuPanelLayout.createSequentialGroup()
        								.addComponent(departureLbl)
        								.addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
        								.addComponent(departureCmb, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
        							.addGroup(menuPanelLayout.createSequentialGroup()
        								.addComponent(arrivalLbl)
        								.addPreferredGap(ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
        								.addComponent(arrivalCmb, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
        							.addGroup(menuPanelLayout.createSequentialGroup()
        								.addComponent(passengerIdLbl)
        								.addPreferredGap(ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
        								.addComponent(passengerIdTxt, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
        							.addComponent(deployTrainsTitle)
        							.addGroup(menuPanelLayout.createSequentialGroup()
        								.addComponent(trainIdLbl)
        								.addPreferredGap(ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
        								.addComponent(trainIdTxt, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
        							.addGroup(menuPanelLayout.createSequentialGroup()
        								.addComponent(trainSeatsLbl)
        								.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
        								.addComponent(trainSeatsTxt, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
        							.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)))
        					.addGroup(menuPanelLayout.createSequentialGroup()
        						.addContainerGap(31, Short.MAX_VALUE)
        						.addComponent(addPassengerTitle))))
        			.addGap(41))
        );
        menuPanelLayout.setVerticalGroup(
        	menuPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(menuPanelLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(addPassengerTitle)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(menuPanelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(departureLbl)
        				.addComponent(departureCmb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(menuPanelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(arrivalLbl)
        				.addComponent(arrivalCmb, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(menuPanelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(passengerIdLbl)
        				.addComponent(passengerIdTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(addPassengerBtn)
        			.addGap(18)
        			.addComponent(deployTrainsTitle)
        			.addGap(11)
        			.addGroup(menuPanelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(trainIdLbl)
        				.addComponent(trainIdTxt, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
        			.addGap(4)
        			.addGroup(menuPanelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(trainSeatsLbl)
        				.addComponent(trainSeatsTxt, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
        			.addGap(11)
        			.addComponent(addTrainBtn)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
        			.addGap(32))
        );
        menuPanel.setLayout(menuPanelLayout);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        jPanel2.setOpaque(false);

        trainTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(trainTable1);
        if (trainTable1.getColumnModel().getColumnCount() > 0) {
            trainTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        passengersTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Current Passengers"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(passengersTable1);
        if (passengersTable1.getColumnModel().getColumnCount() > 0) {
            passengersTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel1.setText("Station 1");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel3.setText("Station 2");

        passengersTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Current Passengers"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(passengersTable2);
        if (passengersTable2.getColumnModel().getColumnCount() > 0) {
            passengersTable2.getColumnModel().getColumn(0).setResizable(false);
        }

        trainTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ));
        jScrollPane5.setViewportView(trainTable2);

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel7.setText("Station 3");

        passengersTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Current Passengers"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(passengersTable3);
        if (passengersTable3.getColumnModel().getColumnCount() > 0) {
            passengersTable3.getColumnModel().getColumn(0).setResizable(false);
        }

        trainTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(trainTable3);
        if (trainTable3.getColumnModel().getColumnCount() > 0) {
            trainTable3.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel9.setText("Station 4");

        passengersTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Current Passengers"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(passengersTable4);
        if (passengersTable4.getColumnModel().getColumnCount() > 0) {
            passengersTable4.getColumnModel().getColumn(0).setResizable(false);
        }

        trainTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ));
        jScrollPane11.setViewportView(trainTable4);

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel11.setText("Station 5");

        passengersTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Current Passengers"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(passengersTable5);
        if (passengersTable5.getColumnModel().getColumnCount() > 0) {
            passengersTable5.getColumnModel().getColumn(0).setResizable(false);
        }

        trainTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane13.setViewportView(trainTable5);
        if (trainTable5.getColumnModel().getColumnCount() > 0) {
            trainTable5.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel13.setText("Station 6");

        passengersTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Current Passengers"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane14.setViewportView(passengersTable6);
        if (passengersTable6.getColumnModel().getColumnCount() > 0) {
            passengersTable6.getColumnModel().getColumn(0).setResizable(false);
        }

        trainTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane15.setViewportView(trainTable6);
        if (trainTable6.getColumnModel().getColumnCount() > 0) {
            trainTable6.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel15.setText("Station 7");

        passengersTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Current Passengers"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane16.setViewportView(passengersTable7);
        if (passengersTable7.getColumnModel().getColumnCount() > 0) {
            passengersTable7.getColumnModel().getColumn(0).setResizable(false);
        }

        trainTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane17.setViewportView(trainTable7);
        if (trainTable7.getColumnModel().getColumnCount() > 0) {
            trainTable7.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel19.setText("Station 8");

        passengersTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Current Passengers"
            }
        ));
        jScrollPane20.setViewportView(passengersTable8);

        trainTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane21.setViewportView(trainTable8);
        if (trainTable8.getColumnModel().getColumnCount() > 0) {
            trainTable8.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel1))
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(96, 96, 96)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(90, 90, 90))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel3)
                                .addGap(200, 200, 200)
                                .addComponent(jLabel7)
                                .addContainerGap(110, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                                .addComponent(jLabel19)
                                .addGap(94, 94, 94))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(3, 3, 3)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(14, 14, 14)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout bgpanelLayout = new javax.swing.GroupLayout(bgpanel);
        bgpanel.setLayout(bgpanelLayout);
        bgpanelLayout.setHorizontalGroup(
            bgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgpanelLayout.setVerticalGroup(
            bgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgpanelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(bgpanel, GroupLayout.PREFERRED_SIZE, 1277, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(bgpanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addPassengerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPassengerBtnActionPerformed
        // TODO add your handling code here:
        int tempId = Integer.parseInt(passengerIdTxt.getText());
        int departure = Integer.parseInt((String)departureCmb.getSelectedItem());
        int arrival = Integer.parseInt((String)arrivalCmb.getSelectedItem());
        
        
        
        if(c.addPassenger(departure, arrival)){
            passengerIdTxt.setText(Integer.toString(tempId+1));
            //caltrainLog.append(java.time.LocalTime.now() + ": Passenger " + tempId + " is waiting at Station " + departure + "\n");
        }
    }//GEN-LAST:event_addPassengerBtnActionPerformed

    private void addTrainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTrainBtnActionPerformed
        // TODO add your handling code here:
        int tempId = Integer.parseInt(trainIdTxt.getText());
        int seats = Integer.parseInt(trainSeatsTxt.getText());
        
        //adding seats
        if(tempId < 17){
            trainIdTxt.setText(Integer.toString(tempId + 1));
            /*caltrainLog.append(java.time.LocalTime.now() + ": Train " + tempId + " spawned with " + seats + " seats!\n");
            if(!c.retrieveStations().get(0).hasTrain()){
                caltrainLog.append(java.time.LocalTime.now() + ": Train " + tempId + " has arrived at Station 1!\n");
            }*/
            
            c.addTrain(seats);
        }
        else{
            caltrainLog.append("There are already 16 trains running.");
        }
        //printing to log
        
        trainSeatsTxt.setText("");
    }//GEN-LAST:event_addTrainBtnActionPerformed

    private void passengerIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passengerIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passengerIdTxtActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPassengerBtn;
    private javax.swing.JLabel addPassengerTitle;
    private javax.swing.JButton addTrainBtn;
    private javax.swing.JComboBox<String> arrivalCmb;
    private javax.swing.JLabel arrivalLbl;
    private javax.swing.JPanel bgpanel;
    private javax.swing.JTextArea caltrainLog;
    private javax.swing.JComboBox<String> departureCmb;
    private javax.swing.JLabel departureLbl;
    private javax.swing.JLabel deployTrainsTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel passengerIdLbl;
    private javax.swing.JTextField passengerIdTxt;
    private javax.swing.JTable passengersSt10;
    private javax.swing.JTable passengersSt4;
    private javax.swing.JTable passengersTable1;
    private javax.swing.JTable passengersTable2;
    private javax.swing.JTable passengersTable3;
    private javax.swing.JTable passengersTable4;
    private javax.swing.JTable passengersTable5;
    private javax.swing.JTable passengersTable6;
    private javax.swing.JTable passengersTable7;
    private javax.swing.JTable passengersTable8;
    private javax.swing.JLabel trainIdLbl;
    private javax.swing.JTextField trainIdTxt;
    private javax.swing.JLabel trainSeatsLbl;
    private javax.swing.JTextField trainSeatsTxt;
    private javax.swing.JTable trainSt3;
    private javax.swing.JTable trainSt9;
    private javax.swing.JTable trainTable1;
    private javax.swing.JTable trainTable2;
    private javax.swing.JTable trainTable3;
    private javax.swing.JTable trainTable4;
    private javax.swing.JTable trainTable5;
    private javax.swing.JTable trainTable6;
    private javax.swing.JTable trainTable7;
    private javax.swing.JTable trainTable8;
    // End of variables declaration//GEN-END:variables
}
