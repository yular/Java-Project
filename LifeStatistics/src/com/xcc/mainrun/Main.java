package com.xcc.mainrun;

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import javax.sql.*;
import java.text.*;

import com.xcc.ui.*;

public class Main {
	
	public static void main(String[] args){
		LogIn login = new LogIn();
		login.setTitle("Entrance Panel");
		login.setSize(500, 430);
		login.setVisible(true);
		login.setLocationRelativeTo(null);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MainInterface mainInf = new MainInterface();
		mainInf.setTitle("Application MainInterface");
		mainInf.setSize(920, 590);
		mainInf.setVisible(true);
		mainInf.setLocationRelativeTo(null);
		mainInf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
