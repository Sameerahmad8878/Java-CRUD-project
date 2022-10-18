package project;

public interface DoctorDAO {
		String create(Doctor doctor);
		String fetchAll();
		Doctor input();
		String update(Doctor doctor);
		String delete(int doctorid);


}
