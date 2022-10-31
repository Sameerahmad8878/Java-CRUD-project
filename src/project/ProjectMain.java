package project;
import java.util.*;
public class ProjectMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		DoctorDAO doctorDAO=DoctorDAOFactory.createDoctorDAO();
		
		
		while(true) {
			
			try {
				
				int choice;
				System.out.println("1. to create new record");
				System.out.println("2. to fetch all record");
				System.out.println("3. to update an existing record");
				System.out.println("4. to delete record");
				System.out.println("5. to rejoin record");
				System.out.println("6. exit program***");
				
				System.out.print("enter your choice? 1/2/3/4/5/6: ");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					
					Doctor doctor=doctorDAO.input();
					String result=doctorDAO.create(doctor);
					System.out.println(result);
					
					break;
				case 2:
					result=doctorDAO.fetchAll();
					System.out.println(result);
					break;
				case 3:
					System.out.println("enter values of existing record only***");
					doctor=doctorDAO.input();
					result=doctorDAO.update(doctor);
					System.out.println(result);
					break;
				case 4:
					System.out.print("enter existing doctorid id to delete: ");
					int doctorid=sc.nextInt();
					result=doctorDAO.delete(doctorid);
					System.out.println(result);
					break;
				case 5:
					System.out.print("enter existing doctorid id to rejoin: ");
					int doctorids=sc.nextInt();
					result=doctorDAO.rejoin(doctorids);
					System.out.println(result);
					break;
				case 6:
					System.out.println("thanks for using my software***");
					System.exit(0);
					break;
				}
				
			
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
