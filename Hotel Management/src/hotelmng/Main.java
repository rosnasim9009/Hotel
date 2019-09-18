package hotelmng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String ans="yes";
		while(true) {
			
		System.out.println("\nEnter your Details....\n");
		String name=br.readLine();
		String address=br.readLine();
		String contactNumber=br.readLine();
		String email=br.readLine();
		String proofType=br.readLine();
		String proofId=br.readLine();
		
		Hotel customer=new Hotel(name,address,contactNumber,email,proofType,proofId);
		customer.register(name,address,contactNumber,email,proofType,proofId);
		System.out.println("\nDo you want to continue? yes/no: ");
		ans=br.readLine();
		if(ans.equals("no")) {
			break;
		}
	}
	
	while(true) {	
	System.out.println("\nBooking: ");
	System.out.println("Please choose the services required..");
	System.out.println("Ac/Non-Ac(Ac/nAc)");
	String ac=br.readLine();
	System.out.println("Cot(Single/Double)");
	String cot=br.readLine();
	System.out.println("With Cable connection/Without Cable Connection(C/nC)");
	String cable=br.readLine();
	System.out.println("Wi-Fi needed or not(W/nW)");
	String wifi=br.readLine();
	System.out.println("Laundry service needed or not(L/nL)");
	String lan=br.readLine();
	System.out.println("Date: ");
	String date=br.readLine();
	
	Room r=new Room(ac,cot,cable,wifi,lan,date);
	r.book(ac, cot, cable, wifi, lan,date);
	System.out.println("\nDo you want to proceed? (yes/no): ");
	ans=br.readLine();
	if(ans.equals("yes")) {
		System.out.println("\nThank you for booking. Your room number is "+r.roomId);
		break;
	}
	}
   }
}
