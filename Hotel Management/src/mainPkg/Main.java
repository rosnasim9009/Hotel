package mainPkg;
import java.util.*;
import customer.Customer;
import register.Registration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import booking.Booking;

public class Main {

	static int i=0,j=0,id=0,k=0,m=0;
	 //static String cname[]=new String[100];
	
	static ArrayList<String> cname=new ArrayList<String>();
	
	//static int cId[]=new int[100];
	static ArrayList<Integer> cId=new ArrayList<Integer>();
	//static int rId[]=new int[100];
	static ArrayList<Integer> rId=new ArrayList<Integer>();
//	static int rdate[]=new int[100];
	static ArrayList<Integer> rdate=new ArrayList<Integer>();

	public static void main(String[] args) throws IOException {
		
		Registration reg=new Registration();
		Booking b=new Booking();
		Customer c=new Customer();

		String ans;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String ans1="yes";
do{
	System.out.println("\n***********Welcome to HOTEL TAJ!!!!!***************");
	System.out.println("\n\t````````````````````");
	System.out.println("\t\tMENU");
	System.out.println("\t````````````````````");
	System.out.println("\t1. Register");
	System.out.println("\t2. Book");
	System.out.println("\t3. Check Status");
	System.out.println("\t4. Email");
	System.out.println("\t5. All Bookings");
	System.out.println("\t6. All Customers");
	System.out.println("\t7. Exit");
	System.out.println("\t````````````````````");
	System.out.print("Enter Your Choice		: ");
	int choice=Integer.parseInt(br.readLine());
	switch(choice) {
	case 1:
		
		do{
			System.out.println("\nRegistration Form");
			System.out.println("````````````````````````````");
			System.out.print("\nEnter your First Name	: ");
			String fname=br.readLine();
			System.out.print("Enter your Middle Name	: ");
			String mname=br.readLine();
			System.out.print("Enter your Last Name	: ");
			String lname=br.readLine();
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
			++id;
			
			reg.register(fname, mname, lname, address, contactNumber, email,proofType,proofId);
			
			System.out.println("\nThanks for Registering!!!!\tYour ID is "+id);
			
			cId.add(j++,id);
			//System.out.println(cId[j]);
			
			cname.add(i++,fname);
			//System.out.println(cname[i]);
			
			System.out.print("\nDo you want one more Registration ? (yes/no) : ");
			ans1=br.readLine();
			if(ans1.equalsIgnoreCase("no"))
				break;
		}while(ans1.equalsIgnoreCase("yes"));
		break;

	case 2:		
		if(cId.size()==0) System.out.println("Before Booking, Go back to Registration!!!\n");
		else {
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
				System.out.print("Enter the Date			: ");
				int date=Integer.parseInt(br.readLine());
	
				b.book(ac, cot, cable, wifi, lan, date);
				
				rdate.add(m++,date);
				
				System.out.print("\nDo you want to proceed? (yes/no)	: ");
				ans=br.readLine();
				if(ans.equalsIgnoreCase("yes")) {
					
					System.out.println("\nThank you for booking. Your room number is "+b.roomId);
					rId.add(k++,b.roomId);

					break;
				}
				
				
		}while(true);
		}
		break;
		
	case 3:
		
		System.out.println("`````````````````````````");
		System.out.println("\tChecking Room Status..");
		System.out.println("\t`````````````````````````");
		if(k==0) System.out.println("All Rooms are Available!!!");
		else {
		System.out.print("Enter room number		: ");
		int roomId=Integer.parseInt(br.readLine());
		b.CheckStatus(roomId);
		}
		break;
		
	case 4:
		if(cId.size()==0) System.out.println("No Updation is Available!!!");
		else {
		System.out.println("\nUpdate Email");
		System.out.print("Enter the customer ID : ");
		id=Integer.parseInt(br.readLine());
		System.out.print("Enter the new Email ID : ");
		String newEmail=br.readLine();
		reg.UpdateEmail(id, newEmail);
		System.out.println("Email updated!!!");
		}
		break;
		
	case 5:
		if(rdate.size()==0)
			System.out.println("Currently there are no Bookings!!!!\n\n");
		else {
		System.out.println("\n\tView all bookings");
		System.out.println("\t``````````````````````");
		System.out.print("\nEnter the start date	: ");
		int startDate=Integer.parseInt(br.readLine());
		System.out.print("Enter the end date	: ");
		int endDate=Integer.parseInt(br.readLine());
		System.out.println("The bookings made from "+startDate+" to "+endDate+" are");
		
		b.ViewBookings(startDate,endDate,rId,cId,rdate,m,j);
		}
		break;
		
	case 6:
		c.ViewCustomers(cId,cname,j);
		break;
		
	case 7:
		
		System.out.println("\n!!!!!THANK YOU!!!!!");
		System.exit(0);
		
	default:
		
		System.out.println("Invalid Input!!!!!Press [1-7] ");
		
	}
	}while(true);
	}
}
