package hotelmng;

public class Room {

	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	String date;
	int charge=0;
	static int roomId=0;
	static int i=0;
	static int []booked=new int[20];
	
	static int j=0;
	static int j1=5;
	static int j2=10;
	static int j3=15;
	
	//ArrayList<Integer> bookedRooms=new ArrayList<Integer>();
	Room(){}
	
	public Room(String ac,String cot,String cable,String wifi,String laundry,String date)
	{
		
		this.ac=ac;
		this.cot=cot;
		this.cable=cable;
		this.wifi=wifi;
		this.laundry=laundry;
		this.date=date;
	}
	public void book(String ac,String cot,String cable,String wifi,String laundry,String date) {
		charge=0;
		if(this.ac.equalsIgnoreCase("Ac")) charge+=1000;
		else charge+=750;
		if(this.cot.equalsIgnoreCase("Single")) charge+=0;
		else charge+=350;
		if(this.cable.equalsIgnoreCase("C")) charge+=50;
		else charge+=0;
		if(this.wifi.equalsIgnoreCase("W")) charge+=200;
		else charge+=0;
		if(this.laundry.equalsIgnoreCase("L")) charge+=100;
		else charge+=0;
		
		System.out.println("--------------------------------------------------");
		System.out.println("The total charge is "+charge);
		System.out.println("\nThe services choosen are...");
		if(this.cot.equalsIgnoreCase("Single")) System.out.print("Single cot ");
		else System.out.print("Double cot ");
		if(this.ac.equalsIgnoreCase("Ac")) System.out.print("AC Room\n"); 
		else System.out.print("Non-AC Room\n");
		if(this.cable.equalsIgnoreCase("C")) System.out.println("Cable connection Enabled");
		else System.out.println("Cable connection is not Enabled");
		if(this.wifi.equalsIgnoreCase("W")) System.out.println("Wi-Fi Enabled");
		else System.out.println("Wi-Fi is not Enabled");
		if(this.laundry.equalsIgnoreCase("L")) System.out.println("With Laundry Services");
		else System.out.println("Without Laundry Services");
		System.out.println("--------------------------------------------------");
		
		if(this.ac.equalsIgnoreCase("Ac")&&this.cot.equalsIgnoreCase("Single")) {
				roomId=++j;
				booked[i++]=roomId;
				
		}
		else if(this.ac.equalsIgnoreCase("Ac")&&this.cot.equalsIgnoreCase("Double")) {
				roomId=++j1;
				booked[i++]=roomId;
		}
		else if(this.ac.equalsIgnoreCase("nAc")&&this.cot.equalsIgnoreCase("Single")) {
				roomId=++j2;
				booked[i++]=roomId;
		}
		else if(this.ac.equalsIgnoreCase("nAc")&&this.cot.equalsIgnoreCase("Double")) {
				roomId=++j3;
				booked[i++]=roomId;
		}
	
		}
	
	public void CheckStatus(int rID) {

		int flag=0;
		for(int j=0;j<20;j++) {
			if(rID==booked[j]) {
				
				System.out.println("Room number "+rID+" is booked.");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Room number "+rID+" is not booked.");

	}
}