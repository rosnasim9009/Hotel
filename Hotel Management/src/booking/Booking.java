package booking;

import java.util.ArrayList;
import java.util.Iterator;

import customer.Customer;

public class Booking {

	int charge=0;
	public String email;
	public int roomId=0;
	static int i=0;
	static int []booked=new int[20];
	
	static int j=0;
	static int j1=5;
	static int j2=10;
	static int j3=15;
	
	Customer c=new Customer();

	public void book(String ac,String cot,String cable,String wifi,String laundry,int date) {
		c.setAc(ac);
		c.setCot(cot);
		c.setCable(cable);
		c.setWifi(wifi);
		c.setLaundry(laundry);
		c.setDate(date);
			
		
		charge=0;
		if(ac.equalsIgnoreCase("Ac")) charge+=1000;
		else charge+=750;
		if(cot.equalsIgnoreCase("Single")) charge+=0;
		else charge+=350;
		if(cable.equalsIgnoreCase("C")) charge+=50;
		else charge+=0;
		if(wifi.equalsIgnoreCase("W")) charge+=200;
		else charge+=0;
		if(laundry.equalsIgnoreCase("L")) charge+=100;
		else charge+=0;
		
		System.out.println("--------------------------------------------------");
		System.out.println("The total charge is "+charge);
		System.out.println("\nThe services choosen are...");
		if(c.getCot().equalsIgnoreCase("S")) System.out.print("Single cot ");
		if(c.getCot().equalsIgnoreCase("d")) System.out.print("Double cot ");
		
		if(c.getAc().equalsIgnoreCase("Ac")) System.out.print("AC Room\n"); 
		if(c.getAc().equalsIgnoreCase("nac")) System.out.print("Non-AC Room\n");
		
		if(c.getCable().equalsIgnoreCase("C")) System.out.println("Cable connection Enabled");
		if(c.getCable().equalsIgnoreCase("nc")) System.out.println("Cable connection is Disabled");
		
		if(c.getWifi().equalsIgnoreCase("W")) System.out.println("Wi-Fi Enabled");
		if(c.getWifi().equalsIgnoreCase("nW")) System.out.println("Wi-Fi is Disabled");
		
		if(c.getLaundry().equalsIgnoreCase("L")) System.out.println("With Laundry Services");
		if(c.getLaundry().equalsIgnoreCase("nL")) System.out.println("Without Laundry Services");
		System.out.println("--------------------------------------------------");
		
		if(c.getAc().equalsIgnoreCase("Ac")&&c.getCot().equalsIgnoreCase("S")) {
				roomId=++j;
				booked[i++]=roomId;
				
		}
		else if(c.getAc().equalsIgnoreCase("Ac")&&c.getCot().equalsIgnoreCase("D")) {
				roomId=++j1;
				booked[i++]=roomId;
		}
		else if(c.getAc().equalsIgnoreCase("nAc")&&c.getCot().equalsIgnoreCase("S")) {
				roomId=++j2;
				booked[i++]=roomId;
		}
		else if(c.getAc().equalsIgnoreCase("nAc")&&c.getCot().equalsIgnoreCase("D")) {
				roomId=++j3;
				booked[i++]=roomId;
		}
	}
	
	public void CheckStatus(int rID) {

		int flag=0;
		for(int j=0;j<20;j++) {
			if(rID==booked[j]) {
				
				System.out.println("Room number "+rID+" is booked.\n");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Room number "+rID+" is Available.\n");

	}
	
	public void ViewBookings(int startDate, int endDate,ArrayList<Integer> rid,ArrayList<Integer> cid,ArrayList<Integer> rdate,int m,int j){
	
		//Iterator<Integer> itr=cid.iterator();
		//if(itr.hasNext()) 
		//for(int i=0;i<cid.size();i++)
		//{ System.out.println(cid.get(i));}
		int s=-1,e=-1;
		for(int g=0;g<rdate.size();g++) {
			if((rdate.get(g)==startDate) ||(rdate.get(g)>startDate)){
				s=g;
				break;
			}
		}
		for(int g=rdate.size()-1;g>=0;g--) {

			if(s==-1) {
				e=-1;
				break;
			}
			if((rdate.get(g)==endDate)||(rdate.get(g)<endDate)) {
				e=g;
				break;
			}
		}
		System.out.println(s+" "+e);
		System.out.println("\nRoom number\t\tCustomer ID");
		/*if(j==1&&m>1) {
			for(int k=s;k<=e;k++)
				System.out.println(rid[k]+"\t\t\t1");
		}*/
		if(s==-1&&e==-1) System.out.println("nil\t\t\tnil");
		else {
		for(int k=s;k<=e;k++)
				System.out.println(rid.get(k)+"\t\t\t"+cid.get(k));
		}
	}
}
