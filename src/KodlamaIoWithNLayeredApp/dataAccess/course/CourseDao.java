package KodlamaIoWithNLayeredApp.dataAccess.course;

import KodlamaIoWithNLayeredApp.entities.Course;

public interface CourseDao {
	void getCourses(Course[] courses);
}
