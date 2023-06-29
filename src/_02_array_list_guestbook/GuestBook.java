package _02_array_list_guestbook;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	String a = ("");
	String name = ("");
	String s = "";
	int b = 0;
	ArrayList<String> people = new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook GB = new GuestBook();
		GB.run();
	}
	public GuestBook() {
		
	}
	public void run() {
		frame.add(panel);
		panel.add(button);
		button.setText("Add Name");
		button.addActionListener(this);
		panel.add(button1);
		button1.setText("View Names");
		button1.addActionListener(this);
		panel.setLayout(new GridLayout(2, 1));
		frame.setSize(200, 100);
		frame.setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			//b ++;
			String a = JOptionPane.showInputDialog("Enter a name.");
			people.add(a);
			//people.add("Guest #" + b + ": " + a + "\n");
		}else if(e.getSource() == button1) {
			//name = ("" + people);
			//JOptionPane.showMessageDialog(null, name);
			for(int i = 1; i < people.size(); i ++) {
			s +="Guest #" + i + ": " + people.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, s);
		}
	}
}
