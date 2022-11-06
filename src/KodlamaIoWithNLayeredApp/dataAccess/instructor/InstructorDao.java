package KodlamaIoWithNLayeredApp.dataAccess.instructor;

import KodlamaIoWithNLayeredApp.entities.Instructor;

public interface InstructorDao {
	void getInstructors(Instructor[] instructors);
}
