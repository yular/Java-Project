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
		login.setSize(500, 430);
		login.setVisible(true);
		login.setLocationRelativeTo(null);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
