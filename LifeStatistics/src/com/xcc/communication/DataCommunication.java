package com.xcc.communication;

import java.io.*;
import java.util.*;
import javax.sql.*;

import com.xcc.dataunit.DataUnit;

public class DataCommunication {
	
	private int itemNum;
	private ArrayList itemName;
	private ArrayList purchTime;
	private ArrayList purchPlaces;
	private ArrayList purchMethods;
	private ArrayList priceUnit;
	private ArrayList price;
	private double totPrice;
	
	public void DataIn(ArrayList LifeData) throws FileNotFoundException{
		Scanner scanf = new Scanner(new File("lifestatistics.txt"));
		
		while(scanf.hasNext()){
			itemNum = 0;
			itemName = new ArrayList();
			purchTime = new ArrayList();
			purchPlaces = new ArrayList();
			purchMethods = new ArrayList();
			priceUnit = new ArrayList();
			price = new ArrayList();
			totPrice = 0;
			
			itemNum = scanf.nextInt();
			for(int i = 0; i < itemNum; i ++){
				itemName.add(scanf.next());
				purchTime.add(scanf.next());
				purchPlaces.add(scanf.next());
				purchMethods.add(scanf.next());
				priceUnit.add(scanf.next());
				price.add(scanf.nextDouble());
			}
			totPrice = scanf.nextDouble();
			
			DataUnit dunit = new DataUnit(itemNum,itemName,purchTime,purchPlaces,purchMethods,
					priceUnit,price);
			LifeData.add(dunit);
		}
		
	}
	
	public void DataOut(ArrayList LifeData) throws FileNotFoundException{
		PrintWriter print = new PrintWriter(new File("lifestatistics.txt"));
		
		for(int i = 0; i < LifeData.size(); i ++){
			DataUnit dunit = (DataUnit)LifeData.get(i);
			print.println(dunit.getItemNum());
			for(int j = 0; j < dunit.getItemNum(); j ++){
				print.print(""+dunit.getItemName(j));
				print.print(""+dunit.getPurchaseTime(j));
				print.print(""+dunit.getPurchasePlace(j));
				print.print(""+dunit.getPurchaseMethod(j));
				print.print(""+dunit.getPriceUnit(j));
				print.print(""+dunit.getPrice(i));
			}
			print.println(""+dunit.getTotPrice());
		}
		
	}
}
