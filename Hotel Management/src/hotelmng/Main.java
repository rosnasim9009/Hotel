package hotelmng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String ans="yes";
		while(true) {
			
		System.out.println("Enter your Details....\n");
		String name=br.readLine();
		String address=br.readLine();
		String contactNumber=br.readLine();
		String email=br.readLine();
		String proofType=br.readLine();
		String proofId=br.readLine();
		
		Hotel customer=new Hotel(name,address,contactNumber,email,proofType,proofId);
		customer.register(name,address,contactNumber,email,proofType,proofId);
		System.out.println("Do you want to continue? yes/no: ");
		ans=br.readLine();
		if(ans.equals("no")) {
			break;
		}
	}
	
   }
}
