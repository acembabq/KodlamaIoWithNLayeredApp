package KodlamaIoWithNLayeredApp.dataAccess.instructor;

import KodlamaIoWithNLayeredApp.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void getInstructors(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			System.out.println("Jdbc ile eğitmen: " + instructor.getInstrctrName() + " getirildi.");
		}

	}

}
