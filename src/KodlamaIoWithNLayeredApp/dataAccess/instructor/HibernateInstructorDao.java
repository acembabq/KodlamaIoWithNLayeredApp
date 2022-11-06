package KodlamaIoWithNLayeredApp.dataAccess.instructor;

import KodlamaIoWithNLayeredApp.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {


	@Override
	public void getInstructors(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			System.out.println("Hibernate ile eğitmen: " + instructor.getInstrctrName() + " getirildi.");
		}
	}

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile eklendi :"+instructor);
		
	}

}
