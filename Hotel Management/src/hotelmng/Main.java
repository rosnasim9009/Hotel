package hotelmng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Room r=new Room();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String ans="yes";
		do{
		System.out.println("Welcome to HOTEL TAJ!!!!");	
		System.out.println("````````````````````````````");
		System.out.println("Registration Form");
		System.out.print("\nEnter your Name		: ");
		String name=br.readLine();
		System.out.print("Enter your Address	: ");
		String address=br.readLine();
		System.out.print("Enter your Phone Number	: ");
		String contactNumber=br.readLine();
		System.out.print("Enter your Email	: ");
		String email=br.readLine();
		System.out.print("Enter your Proof Type	: ");
		String proofType=br.readLine();
		System.out.print("Enter your Proof ID	: ");
		String proofId=br.readLine();
		
		Hotel customer=new Hotel(name,address,contactNumber,email,proofType,proofId);
		customer.register(name,address,contactNumber,email,proofType,proofId);
		System.out.println("Do you want to continue? (yes/no) : ");
		ans=br.readLine();
	}while(ans.equalsIgnoreCase("yes"));
	
		do{
	System.out.println("\n\t````````````````````");
	System.out.println("\n\tMENU");
	System.out.println("\t1. Book");
	System.out.println("\t2. Check Status");
	System.out.println("\t3. Exit");
	System.out.println("\t````````````````````");
	System.out.print("Enter Your Choice		: ");
	int ch=Integer.parseInt(br.readLine());
	switch(ch) {
	case 1:
		
	
	do {	
	System.out.println("\nBooking: ");
	System.out.println("```````````````````");
	System.out.println("Please choose the services required..");
	System.out.print("Ac/Non-Ac(Ac/nAc)		:");
	String ac=br.readLine();
	System.out.print("Cot(Single/Double)		:");
	String cot=br.readLine();
	System.out.println("\nWith Cable connection/");
	System.out.print("Without Cable Connection(C/nC)	:");
	String cable=br.readLine();
	System.out.print("Wi-Fi needed or not(W/nW)	:");
	String wifi=br.readLine();
	System.out.print("Laundry needed or not(L/nL)	:");
	String lan=br.readLine();
	System.out.print("Date				: ");
	String date=br.readLine();
	
	r.ac=ac;
	r.cot=cot;
	r.cable=cable;
	r.wifi=wifi;
	r.laundry=lan;
	r.date=date;
	r.charge=0;
	r.book(ac, cot, cable, wifi, lan,date);
	System.out.print("\nDo you want to proceed? (yes/no)	: ");
	ans=br.readLine();
	if(ans.equalsIgnoreCase("yes")) {
		
		System.out.println("\nThank you for booking. Your room number is "+r.roomId);
		break;
	}
	}while(true);
	
	break;
	
	case 2:
		System.out.println("`````````````````````````");
		System.out.print("Enter room number	: ");
		int roomId=Integer.parseInt(br.readLine());
		r.CheckStatus(roomId);
		break;
		
	case 3:
		System.out.println("!!!!!THANK YOU!!!!!");
		System.exit(0);
	default:
		System.out.println("Invalid Input!!!");
		
   }
	}while(true);
	}
}
