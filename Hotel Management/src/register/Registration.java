package register;

import customer.Customer;

public class Registration
{
	Customer c=new Customer();
	
	public void register(String fname,String mname,String lname,String address,String contactNumber,String email,String proofType,String proofId){
		
		c.setFname(fname);
		c.setMname(mname);
		c.setLname(lname);
		c.setAddress(address);
		c.setContactNumber(contactNumber);
		c.setEmail(email);
		c.setProofType(proofType);
		c.setProofId(proofId);
		System.out.println("\nYour Details are....");
		this.display(c);
	}
	
	public void display(Customer c) {
		
		System.out.println("\nFirst Name		:"+c.getFname());
		System.out.println("Middle Name		:"+c.getMname());
		System.out.println("Last Name           	:"+c.getLname());
		System.out.println("Address			:"+c.getAddress());
		System.out.println("Phone Number		:"+c.getContactNumber());
		System.out.println("Email			:"+c.getEmail());
		System.out.println("Proof Type		:"+c.getProofType());
		System.out.println("Proof ID		:"+c.getProofId());
		System.out.println("----------------------------------------------------\n");
	}
	
	public void UpdateEmail(int customerID, String newEmail) {
		c.setEmail(newEmail);
		this.display(c);
		
		
	}
	
}
