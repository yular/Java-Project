package com.xcc.ui;

import javax.swing.*;
import javax.sql.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends JFrame{
	
	private JTextArea userName = new JTextArea();
	private JTextArea passWord = new JTextArea();
	private JLabel username = new JLabel("User Name: ");
	private JLabel password = new JLabel("PassWord: ");
	private JButton logIn = new JButton("Log In");
	private JButton sigIn = new JButton("Sign In");
	private ImageIcon companyIcon = new ImageIcon("images/lsicon.png");
	private JPanel mainPanel = new JPanel();
	private Box boxIcon = Box.createHorizontalBox();
	private Box boxUser = Box.createHorizontalBox();
	private Box boxPW = Box.createHorizontalBox();
	private Box boxBtn = Box.createHorizontalBox();
	
	public LogIn(){
		boxIcon.add(new JLabel(companyIcon));
		boxUser.add(username);
		boxUser.add(Box.createHorizontalStrut(20));
		boxUser.add(userName);
		boxPW.add(password);
		boxPW.add(Box.createHorizontalStrut(25));
		boxPW.add(passWord);
		boxBtn.add(logIn);
		boxBtn.add(Box.createHorizontalStrut(100));
		boxBtn.add(sigIn);
		
		setLayout(null);
		
		add(boxIcon);
		add(boxUser);
		add(boxPW);
		add(boxBtn);
		
		boxIcon.setBounds(70, 20, 500, 180);
		boxUser.setBounds(50, 260, 320, 20);
		boxPW.setBounds(50, 300, 320, 20);
		boxBtn.setBounds(100, 330, 500, 50);
		
		logIn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		sigIn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
}
