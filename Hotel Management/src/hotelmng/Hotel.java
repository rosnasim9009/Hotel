package hotelmng;

public class Hotel {

	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofId;
	static int registerId=0;
	
	public Hotel(String name,String address,String contactNumber,String email,String proofType,String proofId){
		this.name=name;
		this.address=address;
		this.contactNumber=contactNumber;
		this.email=email;
		this.proofType=proofType;
		this.proofId=proofId;
	}
	public void register(String name,String address,String contactNumber,String email,String proofType,String proofId){
		System.out.println("\nYour Details are....\n");
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.contactNumber);
		System.out.println(this.email);
		System.out.println(this.proofType);
		System.out.println(this.proofId);
		System.out.println("Thanks for Registering!!!!\tYour ID is "+ ++registerId);
	}

}

