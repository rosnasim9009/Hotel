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
		if(this.ac.equals("Ac")) charge+=1000;
		else charge+=750;
		if(this.cot.equals("Single")) charge+=0;
		else charge+=350;
		if(this.cable.equals("C")) charge+=50;
		else charge+=0;
		if(this.wifi.equals("W")) charge+=200;
		else charge+=0;
		if(this.laundry.equals("L")) charge+=100;
		else charge+=0;
		System.out.println("The total charge is "+charge);
		System.out.println("\nThe services choosen are...");
		if(this.cot.equals("Single")) System.out.print("Single cot ");
		else System.out.print("Double cot ");
		if(this.ac.equals("Ac")) System.out.print("AC Room\n"); 
		else System.out.print("Non-AC Room\n");
		if(this.cable.equals("C")) System.out.println("Cable connection Enabled");
		else System.out.println("Cable connection is not Enabled");
		if(this.wifi.equals("W")) System.out.println("Wi-Fi Enabled");
		else System.out.println("Wi-Fi is not Enabled");
		if(this.laundry.equals("L")) System.out.println("With Laundry Services");
		else System.out.println("Without Laundry Services");
		++roomId;
		
	}

}

