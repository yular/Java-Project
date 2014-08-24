package com.xcc.onlinecomputation;

import java.io.*;
import java.util.*;

import com.xcc.dataunit.DataUnit;
<<<<<<< HEAD
=======

public class Computation {
  
  	public double dailyStaticsComputation(ArrayList LifeData, String Date){
		double tot = 0;
		for(int i = 0; i < LifeData.size(); i ++){
			DataUnit dunit = (DataUnit)LifeData.get(i);
			if(dunit.getPurchaseTime(0).compareTo(Date) == 0){
				tot += dunit.getTotPrice();
			}else if(dunit.getPurchaseTime(0).compareTo(Date) > 0)
				break;
		}
		return tot;
	}
	
	public double weeklyStaticsComputation(ArrayList LifeData, String startDate,
			String endDate){
		double tot = 0;
		for(int i = 0; i < LifeData.size(); i ++){
			DataUnit dunit = (DataUnit)LifeData.get(i);
			if(dunit.getPurchaseTime(0).compareTo(startDate) >= 0 && dunit.getPurchaseTime(0).compareTo(endDate) <= 0 ){
				tot += dunit.getTotPrice();
			}else if(dunit.getPurchaseTime(0).compareTo(endDate) > 0)
				break;
		}
		return tot;
	}
	
	public double monthlyStaticsComputation(ArrayList LifeData, String startDate,
			String endDate){
		double tot = 0;
		for(int i = 0; i < LifeData.size(); i ++){
			DataUnit dunit = (DataUnit)LifeData.get(i);
			if(dunit.getPurchaseTime(0).compareTo(startDate) >= 0 && dunit.getPurchaseTime(0).compareTo(endDate) <= 0 ){
				tot += dunit.getTotPrice();
			}else if(dunit.getPurchaseTime(0).compareTo(endDate) > 0)
				break;
		}
		return tot;
	}
	
	public double yearlyStaticsComputation(ArrayList LifeData, String startDate,
			String endDate){
		double tot = 0;
		for(int i = 0; i < LifeData.size(); i ++){
			DataUnit dunit = (DataUnit)LifeData.get(i);
			if(dunit.getPurchaseTime(0).compareTo(startDate) >= 0 && dunit.getPurchaseTime(0).compareTo(endDate) <= 0 ){
				tot += dunit.getTotPrice();
			}else if(dunit.getPurchaseTime(0).compareTo(endDate) > 0)
				break;
		}
		return tot;
	}
>>>>>>> 7359e485c97d3fe425c8ae5818ff8580c004fbca

public class Computation {
	
	public double dailyStaticsComputation(ArrayList LifeData, String Date){
		double tot = 0;
		for(int i = 0; i < LifeData.size(); i ++){
			DataUnit dunit = (DataUnit)LifeData.get(i);
			if(dunit.getPurchaseTime(0).compareTo(Date) == 0){
				tot += dunit.getTotPrice();
			}else if(dunit.getPurchaseTime(0).compareTo(Date) > 0)
				break;
		}
		return tot;
	}
	
	public double weeklyStaticsComputation(ArrayList LifeData, String startDate,
			String endDate){
		double tot = 0;
		for(int i = 0; i < LifeData.size(); i ++){
			DataUnit dunit = (DataUnit)LifeData.get(i);
			if(dunit.getPurchaseTime(0).compareTo(startDate) >= 0 && dunit.getPurchaseTime(0).compareTo(endDate) <= 0 ){
				tot += dunit.getTotPrice();
			}else if(dunit.getPurchaseTime(0).compareTo(endDate) > 0)
				break;
		}
		return tot;
	}
	
	public double monthlyStaticsComputation(ArrayList LifeData, String startDate,
			String endDate){
		double tot = 0;
		for(int i = 0; i < LifeData.size(); i ++){
			DataUnit dunit = (DataUnit)LifeData.get(i);
			if(dunit.getPurchaseTime(0).compareTo(startDate) >= 0 && dunit.getPurchaseTime(0).compareTo(endDate) <= 0 ){
				tot += dunit.getTotPrice();
			}else if(dunit.getPurchaseTime(0).compareTo(endDate) > 0)
				break;
		}
		return tot;
	}
	
	public double yearlyStaticsComputation(ArrayList LifeData, String startDate,
			String endDate){
		double tot = 0;
		for(int i = 0; i < LifeData.size(); i ++){
			DataUnit dunit = (DataUnit)LifeData.get(i);
			if(dunit.getPurchaseTime(0).compareTo(startDate) >= 0 && dunit.getPurchaseTime(0).compareTo(endDate) <= 0 ){
				tot += dunit.getTotPrice();
			}else if(dunit.getPurchaseTime(0).compareTo(endDate) > 0)
				break;
		}
		return tot;
	}
	
}
