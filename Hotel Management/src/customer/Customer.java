package customer;

import java.util.ArrayList;

public class Customer {

	private String fname;
	private String mname;
	private String lname;
	private String address;
	private String contactNumber;
	private String email;
	private String proofType;
	private String proofId;
	
	String ac;
	private String cot;
	private String cable;
	private String wifi;
	private String laundry;
	private int date;
	
	int registerId=0;
	static int i=0,j=0;
	String cname[]=new String[100];
	int cId[]=new int[100];


	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProofType() {
		return proofType;
	}
	public void setProofType(String proofType) {
		this.proofType = proofType;
	}
	public String getProofId() {
		return proofId;
	}
	public void setProofId(String proofId) {
		this.proofId = proofId;
	}
	
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getCot() {
		return cot;
	}
	public void setCot(String cot) {
		this.cot = cot;
	}
	public String getCable() {
		return cable;
	}
	public void setCable(String cable) {
		this.cable = cable;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getLaundry() {
		return laundry;
	}
	public void setLaundry(String laundry) {
		this.laundry = laundry;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	public void ViewCustomers(ArrayList<Integer> cId,ArrayList<String> cname,int j) {
		
		System.out.println("\n\tCustomers List");
		System.out.println("\t`````````````````");
		System.out.println("The registered customers are...");
		System.out.print("\nCustomer ID\t\tCustomer name");
		System.out.println();
		if(cId.size()==0) System.out.println("nil\t\t\tnil");
		else {
		for(int k=0;k<cId.size();k++)
				System.out.println(cId.get(k)+"\t\t\t"+cname.get(k));

		}
	}
		
}

