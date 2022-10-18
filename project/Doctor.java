package project;

public class Doctor {
	private int doctorid;
	private String fname;
	private String lname;
	private String address;
	private String pincode;
	private String mobileno;
	private String qualification;
	private String designation;
	private String specialization;
	private String currentstatus;
	
	public int getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getCurrentstatus() {
		return currentstatus;
	}
	public void setCurrentstatus(String currentstatus) {
		this.currentstatus = currentstatus;
	}
	
	public Doctor(){}
	public Doctor(int doctorid,String fname, String lname, String address, String pincode, String mobileno, String qualification, String designation, String specialization, String currentstatus ){
		this.doctorid=doctorid;
		this.fname=fname;
		this.lname=lname;
		this.address=address;
		this.pincode=pincode;
		this.mobileno=mobileno;
		this.qualification=qualification;
		this.designation=designation;
		this.specialization=specialization;
		this.currentstatus=currentstatus;
}


}
