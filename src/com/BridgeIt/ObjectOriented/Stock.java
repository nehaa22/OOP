package com.BridgeIt.ObjectOriented;

import java.io.Serializable;

public class Stock implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String Stock_Name;
	private int Number_of_Share;
    private double Share_Price;
    
	public String getStock_Name()
	{
		return Stock_Name;
	}
	public void setStock_Name(String stock_Name) 
	{
		Stock_Name = stock_Name;
	}
	public int getNumber_of_Share() 
	{
		return Number_of_Share;
	}
	public void setNumber_of_Share(int number_of_Share) 
	{
		Number_of_Share = number_of_Share;
	}
	public double getShare_Price() 
	{
		return Share_Price;
	}
	public void setShare_Price(double share_Price) 
	{
		Share_Price = share_Price;
	}
	@Override
	public String toString() 
	{
		return "Stock [Stock_Name=" + Stock_Name + ", Number_of_Share=" + Number_of_Share + ", Share_Price="
				+ Share_Price + "]";
	}

}
