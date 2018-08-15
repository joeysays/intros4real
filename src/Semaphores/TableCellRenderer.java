package Semaphores;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class TableCellRenderer extends DefaultTableCellRenderer{
	
	private ImageIcon icon = new ImageIcon("res/train2.png");
	private ImageIcon passenger =  new ImageIcon("res/passenger.png");
	
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
		
	    //Cells are by default rendered as a JLabel.
	    JLabel l = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

	    //Get the status for the current row.
	    DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
	    	String val = (String) tableModel.getValueAt(row, col);
		    if (val.contains("Train")) {
		      l.setBackground(Color.GREEN);
		      l.setIcon(icon);
		    } else if (val.contains("Passenger")){
		    	System.out.println("Value: " + tableModel.getValueAt(row, col));
		    	l.setBackground(Color.RED);
		    	l.setIcon(passenger);
		      //l.setIcon(icon);
		    }

	  //Return the JLabel which renders the cell.
	  return l;

	}

}
