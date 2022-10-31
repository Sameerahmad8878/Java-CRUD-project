package project;

import java.util.*;
import java.sql.*;

public class DoctorDAOImpl 
implements DoctorDAO{
	private String driver="com.mysql.cj.jdbc.Driver",
			username="root",
			password="",
			dburl="jdbc:mysql://localhost:3306/hospital";
	private Connection con=null;
	
	void createConnection() {
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(dburl,
					username, password);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public String create(Doctor doctor) {
		
		String result="";
		try {
			createConnection(); //calling method of same class
			//con object initialized
			String query="insert into doctor values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, doctor.getDoctorid());
			ps.setString(2, doctor.getFname());
			ps.setString(3, doctor.getLname());
			ps.setString(4, doctor.getAddress());
			ps.setString(5, doctor.getPincode());
			ps.setString(6, doctor.getMobileno());
			ps.setString(7, doctor.getQualification());
			ps.setString(8, doctor.getDesignation());
			ps.setString(9, doctor.getSpecialization());
			ps.setString(10, "active");
			int res=ps.executeUpdate();
			result=res+" record/s inserted in doctor table";
			ps.close();
			con.close();
			
		}
		catch(Exception ex) {
			result=ex.toString();
		}
		return result;
		
	}

	public String fetchAll() {
		
		String result="";
		try {
			createConnection();
			
			String query="select * from doctor "
					        + " where "
					        + " currentstatus='Active' ";
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next()==true) {
				for(int i=1;i<=10;i++) {
					result+=rs.getString(i)+"\t ";
				}
				result+="\n";
			}
			rs.close();
			stmt.close();
		}
		catch(Exception e ) {
			result=e.toString();
		}
		
	   return result;
	}

	public Doctor input() {
		
		Doctor doctor=new Doctor();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter Fname: ");
		doctor.setFname(sc.nextLine());
		
		System.out.print("enter Lname: ");
		doctor.setLname(sc.nextLine());
		
		System.out.print("enter address: ");
		doctor.setAddress(sc.nextLine());
		
		System.out.print("enter Pincode: ");
		doctor.setPincode(sc.nextLine());
		
		System.out.print("enter MobileNo: ");
		doctor.setMobileno(sc.nextLine());
		
		System.out.print("enter Qualification: ");
		doctor.setQualification(sc.nextLine());
		
		System.out.print("enter Designation: ");
		doctor.setDesignation(sc.nextLine());
		
		System.out.print("enter Specialization: ");
		doctor.setSpecialization(sc.nextLine());
		
		System.out.print("enter Doctorid: ");
		doctor.setDoctorid(sc.nextInt());
		
		
		return (doctor);
	}

	public String update(Doctor doctor) {
	String result="";
	try{
		
		String query="update doctor set "
						+ "fname=?, "
						+ "lname=?, "
						+ "address=?, "
						+ "pincode=?, "
						+ "mobileno=?, "
						+ "qualification=?, "
						+ "designation=?, "
						+ "specialization=?, "
						+ "currentstatus=?, "
						+ "where "
						+ "doctorid=?, ";
		createConnection();
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, doctor.getFname());
		ps.setString(2, doctor.getLname());
		ps.setString(3, doctor.getAddress());
		ps.setString(4, doctor.getPincode());
		ps.setString(5, doctor.getMobileno());
		ps.setString(6, doctor.getQualification());
		ps.setString(7, doctor.getDesignation());
		ps.setString(8, doctor.getSpecialization());
		ps.setString(9, "active");
		ps.setInt(10, doctor.getDoctorid());
		
		int res=ps.executeUpdate();
		result=res+" record/s updated in doctor table";
		ps.close();
		con.close();
	}
	catch(Exception e ) {
		result=e.toString();
	}

		return result;
	}

	public String delete(int doctorid) {
		String result="";
		try{
			
			String query="update doctor set " +
					"currentstatus='Close' "+
					"where doctorid=?";
			createConnection();
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, doctorid);
			int res=ps.executeUpdate();
			result=res+" record/s deleted in doctor table";
			ps.close();
			con.close();
		}
		catch(Exception e ) {
			result=e.toString();
		}
							
		
		return result;
	}
	
	public String rejoin(int doctorid) {
		String result="";
		try{
			
			String query="update doctor set " +
					"currentstatus='Close' "+
					"where doctorid=?";
			createConnection();
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, doctorid);
			int res=ps.executeUpdate();
			result=res+" record/s rejoin in doctor table";
			ps.close();
			con.close();
		}
		catch(Exception e ) {
			result=e.toString();
		}
		return result;

}

}

