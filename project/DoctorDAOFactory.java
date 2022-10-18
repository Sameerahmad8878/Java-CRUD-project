package project;

public class DoctorDAOFactory {
	public static DoctorDAO createDoctorDAO(){
		return(new DoctorDAOImpl());
		
	}

}
