package com.clock;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.Date;

import javax.swing.*;

public class MyWindow extends JFrame
{		
	private JLabel heading;
	
	private JLabel clockLabel;
	
	private Font font=new Font("",Font.BOLD,35);
	
	MyWindow(){
		
		super.setTitle("My Clock");
		
		super.setSize(400,400);
	
		super.setLocation(300,50);
		
		this.createGUI();
		this.startClock();
		super.setVisible(true);
		
	}
	
	public void createGUI() {
		
		heading=new JLabel("MyClock");
		
		clockLabel=new JLabel("Clock");
		
		
		
		heading.setFont(font);
		clockLabel.setFont(font);
		
		this.setLayout(new GridLayout(2,1));
		this.add(heading);
		this.add(clockLabel);
	}
	
	
	public void startClock() {
		
		Timer timer=new Timer(1000,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String dateTime= new Date().toString();
				
//				predefined but deprecated Date().toLocaleString(); as per locality
				
//				String dateTime=new Date().toLocaleString();
				
				
//				Date formatter as we want
//				Date d= new Date();
//				SimpleDateFormat sfd= new SimpleDateFormat("hh : mm : ss a");
//				
//				String dateTime=sfd.format(d);
				
				clockLabel.setText(dateTime);
			}
		});
		
		timer.start();
		
	}
}
