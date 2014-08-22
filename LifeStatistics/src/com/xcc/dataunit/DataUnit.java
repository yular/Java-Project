package com.xcc.dataunit;

import java.io.*;
import java.util.*;
import java.text.*;
import java.net.*;
import java.beans.*;
import java.lang.*;

public class DataUnit {
	
	private int itemNum;
	private ArrayList itemName;
	private ArrayList purchTime;
	private ArrayList purchPlaces;
	private ArrayList purchMethods;
	private ArrayList priceUnit;
	private ArrayList price;
	private double totPrice;
	
	public DataUnit(){
		itemNum = 0;
		itemName = new ArrayList();
		purchTime = new ArrayList();
		purchPlaces = new ArrayList();
		purchMethods = new ArrayList();
		priceUnit = new ArrayList();
		price = new ArrayList();
		totPrice = 0;
	}
	
	public DataUnit(int num, ArrayList name, ArrayList ptime, ArrayList pplace, 
			ArrayList pmethod, ArrayList prunit, ArrayList pr){
		itemNum = num;
		itemName = new ArrayList();
		purchTime = new ArrayList();
		purchPlaces = new ArrayList();
		purchMethods = new ArrayList();
		priceUnit = new ArrayList();
		price = new ArrayList();
		totPrice = 0;
		
		for(int i = 0; i < num; i ++){
			itemName.add(name.get(i));
			purchTime.add(ptime.get(i));
			purchPlaces.add(pplace.get(i));
			purchMethods.add(pmethod.get(i));
			priceUnit.add(prunit.get(i));
			price.add(pr.get(i));
			totPrice += (double)pr.get(i);
		}
	}
	
	public void addPurchaseRecord(String name, String ptime, String pplace, 
			String pmethod, String prunit, double pr){
		itemNum ++;
		itemName.add(name.toString());
		purchTime.add(ptime.toString());
		purchPlaces.add(pplace.toString());
		purchMethods.add(pmethod.toString());
		priceUnit.add(prunit.toString());
		price.add(pr);
		totPrice += pr;
	}
	
	public void deletePurchaseRecord(int id){
		itemNum --;
		totPrice -= (double)price.get(id);
		itemName.remove(id);
		purchTime.remove(id);
		purchPlaces.remove(id);
		purchMethods.remove(id);
		priceUnit.remove(id);
		price.remove(id);
	}
	
	public void updateItemName(int id,String name){
		itemName.set(id, name.toString());
	}
	
	public void updatePurchaseTime(int id, String ptime){
		purchTime.set(id, ptime.toString());
	}
	
	public void updatePurchasePlaces(int id, String pplace){
		purchPlaces.set(id, pplace.toString());
	}
	
	public void updatePurchaseMethods(int id, String pmethod){
		purchMethods.set(id, pmethod.toString());
	}
	
	public void updatePriceUnit(int id, String prunit){
		priceUnit.set(id, prunit);
	}
	
	public void updatePrice(int id, double pr){
		price.set(id, pr);
	}
	
	public int getItemNum(){
		return itemNum;
	}
	
	public String getItemName(int id){
		return (String)itemName.get(id);
	}
	
	public String getPurchaseTime(int id){
		return (String)purchTime.get(id);
	}
	
	public String getPurchasePlace(int id){
		return (String)purchPlaces.get(id);
	}
	
	public String getPurchaseMethod(int id){
		return (String)purchMethods.get(id);
	}
	
	public String getPriceUnit(int id){
		return (String)priceUnit.get(id);
	}
	
	public double getPrice(int id){
		return (double)price.get(id);
	}
	
	public double getTotPrice(){
		return totPrice;
	}
}
