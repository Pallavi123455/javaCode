package com.java.intf;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		getCash2("hdfc");
		getCash2("kotak");
		
		getCash1("hdfc");
		// getCash1("kotak"); CCE
		getCash("kotak");
		//getCash("hdfc"); CCE
	}


	public static void getCash2(String bankType) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		String className="";
		if(bankType.equals("hdfc"))
		{
			className="com.java.intf.HdfcATM";
		}
		else
		{
			className="com.java.intf.KotakATM";
		}
		
		IBankATM atm=(IBankATM) Class.forName(className).newInstance();
		
		atm.retrieveCash();
	
	}

	public static void getCash1(String bankType) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		String className="";
		if(bankType.equals("hdfc"))
		{
			className="com.java.intf.HdfcATM";
		}
		else
		{
			className="com.java.intf.KotakATM";
		}
		
		HdfcATM hdfc=(HdfcATM) Class.forName(className).newInstance();
		
		hdfc.retrieveCash();
	
	}

	public static void getCash(String bankType) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		String className="";
		if(bankType.equals("hdfc"))
		{
			className="com.java.intf.HdfcATM";
		}
		else
		{
			className="com.java.intf.KotakATM";
		}
		
		KotakATM kotak=(KotakATM) Class.forName(className).newInstance();//It will create the object of the class which is loaded.
		
		kotak.retrieveCash();
	
	}
}
