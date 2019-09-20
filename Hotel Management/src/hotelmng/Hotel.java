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
		System.out.println("\nYour Details are....");
		System.out.println("Name			:"+this.name);
		System.out.println("Address			:"+this.address);
		System.out.println("Phone Number		:"+this.contactNumber);
		System.out.println("Email			:"+this.email);
		System.out.println("Proof Type		:"+this.proofType);
		System.out.println("Proof ID		:"+this.proofId);
		System.out.println("\nThanks for Registering!!!!\tYour ID is "+ ++registerId);
		//System.out.println("--------------------------------------------------------------------");
	}

}

