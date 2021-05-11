package ass3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class CalendarView extends JFrame {

	Calendar calendar = new Calendar();
	
	public CalendarView() {
		new JFrame("Calendar Event");
		setPreferredSize(new Dimension(800,400));
		setLayout(new BorderLayout());
		
		/*
		 * panel1 for back button, next button and quit button
		 * panel3 for create button and display calendar
		 * panel4 for display date and event on this day
		 */
		JPanel panel1 = new JPanel();
		panel1.setSize(800, 100);
		JPanel panel3 = new JPanel();
		panel3.setSize(400,300);
		panel3.setLayout(new GridLayout(4, 1));
		JPanel panel4 = new JPanel();
		panel4.setSize(400, 300);
		//panel4.setLayout(new GridLayout(3, 1));
		
		//create button back, next and quit
		JButton btnBack = new JButton(" < ");
		btnBack.setBounds(250,10,50,50);
		JButton btnNext = new JButton(" > ");
		btnNext.setBounds(300,10,50,50);
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(event ->
	      {
	    	  dispose();
	      });
		btnQuit.setBounds(750,10,100,50);
		panel1.setLayout(new FlowLayout(0,100,0));
		panel1.add(btnBack);
		panel1.add(btnNext);
		panel1.add(btnQuit);
		
		//create Create event button and display the month		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(event ->{
			JFrame frame = new CreateFrame();
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setVisible(true);
		});
		panel3.add(btnCreate);
		JLabel lblMonth = new JLabel();
		panel3.add(lblMonth);
		JPanel panel31 = new JPanel();
		panel31.setLayout(new GridLayout(1, 7));
		JLabel lblSu = new JLabel("Su");
		panel31.add(lblSu);
		JLabel lblM = new JLabel("M");
		panel31.add(lblM);
		JLabel lblT = new JLabel("T");
		panel31.add(lblT);
		JLabel lblW = new JLabel("W");
		panel31.add(lblW);
		JLabel lblTh = new JLabel("Th");
		panel31.add(lblTh);
		JLabel lblF = new JLabel("F");
		panel31.add(lblF);
		JLabel lblSa = new JLabel("Sa");
		panel31.add(lblSa);
		//display date of the month. each day is a button
		JPanel panel32 = new JPanel();
		panel32.setLayout(new GridLayout(6, 7));
		for (int i = 1; i <= 42; i++) {
			JButton btn = new JButton();
			panel32.add(btn);
		}
		panel3.add(panel31);
		panel3.add(panel32);
		
		//display the day with event
		
		//display the day
//		JLabel lblDay = new JLabel();
//		panel4.add(lblDay);
//		JLabel lblEmplt = new JLabel();
//		panel4.add(lblEmplt);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setSize(400, 300);
		
//		JPanel panel40 = new JPanel();
//		panel40.setLayout(new GridLayout(1, 2));
//
//		JPanel panel41 = new JPanel();
//		panel41.setLayout(new GridLayout(48, 1));
//		for(int i = 0; i<=48; i++) {
//			JLabel lbl1 = new JLabel(i + ":00");
//			JLabel lbl2 = new JLabel();
//			panel41.add(lbl1);
//			panel41.add(lbl2);
//		}
		
//		JPanel panel42 = new JPanel();
//		panel42.setLayout(new GridLayout(48, 1));
//		for(int i = 0; i<=48; i++) {
//			JLabel lbl = new JLabel();
//			panel42.add(lbl);
//		}	
//		panel40.add(panel41);
//		panel40.add(panel42);
//		scrollPane.add(panel40);
		//panel4.add(scrollPane);
		add(panel1,BorderLayout.NORTH);
		add(panel3,BorderLayout.WEST);
		add(panel4,BorderLayout.EAST);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    pack();
	    setVisible(true);
	}//CalendarView
	
	class CreateFrame extends JFrame{
		public CreateFrame() {
			setSize(500,200);
			setLayout(new FlowLayout());
			JTextField txtfName = new JTextField("Untitled Event");
			txtfName.setBounds(0, 0, 500, 100);
			add(txtfName);
			JLabel lblDay = new JLabel();
			//lblDay.setText(calendar.getDay());
			lblDay.setBounds(0,110,100,80);
			add(lblDay);
			JTextField txtfStart = new JTextField();
			txtfStart.setBounds(120,110,100,80);
			add(txtfStart);
			JLabel lblTo = new JLabel("To");
			lblTo.setBounds(230,110,30,80);
			add(lblTo);
			JTextField txtfEnd = new JTextField();
			txtfEnd.setBounds(270,110,100,80);
			add(txtfEnd);
			JButton btnSave = new JButton("Save");
			btnSave.setBounds(380,110,100,80);
			add(btnSave);
		}
	}
	
}
