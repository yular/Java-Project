package com.xcc.ui;

import javax.swing.*;
import javax.sql.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainInterface extends JFrame{
	
	private ImageIcon userPict = new ImageIcon("images/profile.png");
	private JTabbedPane mainJTab = new JTabbedPane();
	private JPanel activity;
	private JPanel profile;
	private JPanel statistics;
	private JPanel chat;
	private JPanel merchantInfo;
	private JPanel notification;
	private JLabel titleWords = new JLabel("Welcome");
	private JButton logout = new JButton("Log Out");
	
	private JScrollPane scrollpane;
	
	private Box userTitle = Box.createHorizontalBox();
	private Box mainTab = Box.createHorizontalBox();
	
	public MainInterface(){
		userTitle.add(new JLabel(userPict));
		userTitle.add(Box.createHorizontalStrut(650));
		userTitle.add(titleWords);
		userTitle.add(Box.createHorizontalStrut(20));
		userTitle.add(logout);
		
		activity = createActivityPanel();
		mainJTab.addTab("Activities", activity);
		profile = createInnerPanel("profiles");
		mainJTab.addTab("Profile", profile);
		statistics = createInnerPanel("statistics");
		mainJTab.addTab("Statistics", statistics);
		chat = createInnerPanel("chat");
		mainJTab.addTab("Chat", chat);
		merchantInfo = createInnerPanel("merchantInfo");
		mainJTab.addTab("MerchantInfo", merchantInfo);
		notification = createInnerPanel("notification");
		mainJTab.addTab("Notification", notification);
		
		mainTab.add(mainJTab);
		
		setLayout(null);
		
		add(userTitle);
		add(mainTab);
		
		userTitle.setBounds(10, 10, 900, 50);
		mainTab.setBounds(10, 70, 900, 500);
	}
	
	protected JPanel createInnerPanel(String text) {
		JPanel jplPanel = new JPanel();
		JLabel jlbDisplay = new JLabel(text);
		jlbDisplay.setHorizontalAlignment(JLabel.CENTER);
		jplPanel.setLayout(new GridLayout(1, 1));
		jplPanel.add(jlbDisplay);
		return jplPanel;
	}
	
	protected JPanel createActivityPanel() {
		JPanel jplPanel = new JPanel();
		JLabel jlbDisplay = new JLabel("					Hello World!");
		jlbDisplay.setSize(890, 490);
		scrollpane = new JScrollPane(jlbDisplay,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jplPanel.setLayout(new GridLayout(1, 1));
		jplPanel.add(scrollpane);
		
		return jplPanel;
	}
	
	
}
